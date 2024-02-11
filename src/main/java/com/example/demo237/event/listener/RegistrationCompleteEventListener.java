package com.example.demo237.event.listener;

import com.example.demo237.event.RegistrationCompleteEvent;
import com.example.demo237.user.User;
import com.example.demo237.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    private final UserService userService;

  //  private final JavaMailSender

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        User theUser = event.getUser();

        String verificationToken = UUID.randomUUID().toString();

        userService.saveUserVerificationToken(theUser, verificationToken);

        String url = event.getApplicationUrl()+"/register/verifyEmail?token"+verificationToken;

        log.info("Click the link to verify your registration: {}", url);
    }

//
//    public void SendVerificationEmail(String url){
//        String subject = "Email Verification";
//        String senderName = "User Registration Portal Service";
//
//        String mailContent = "<p> Hi," + theUser.getFirstName()+ ",</p>"+
//                "<a href=\"" +url+ "\">  Verify your email to activate your account </a>"+
//                "<p> Thank you <br> Users Registration Portal Service";
//
//        MineMessage message = mailSender.createMineMessage();
//        var messageHelper = new MimeMessageHelper(message);
//        messageHelper.setFrom("dailycodework@gmail.com", senderName);
//        messageHelper.setTo(thsUser.getEmail());
//        messageHelper.setSubject(subject);
//        messageHelper.seText(mailContent, true);
//        mailSender.send(message);
//    }
}
