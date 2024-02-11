package com.example.demo237.registration;


import com.example.demo237.event.RegistrationCompleteEvent;
import com.example.demo237.registration.token.VerifcationTokenRepository;
import com.example.demo237.registration.token.VerificationToken;
import com.example.demo237.user.User;
import com.example.demo237.user.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {

    private final UserService userService;
    private final ApplicationEventPublisher publisher;

    private final VerifcationTokenRepository tokenRepository;

    @PostMapping
    public String registerUser(@RequestBody RegistrationRequest registrationRequest, final HttpServletRequest request){
       User user = userService.registerUser(registrationRequest);

       publisher.publishEvent(new RegistrationCompleteEvent(user, applicationUrl(request)));
       return "Success! Please check your email for to complete your registrqtion";
    }

    @GetMapping("/verifyEmail")
    public String verifyEmail(@RequestParam("token") String token){
        VerificationToken theToken = tokenRepository.findByToken(token);
        if(theToken.getUser().isEnabled()){
            return "this account has already been verify, please login";
        }

        String verificationResult = userService.validateToken(token);
        if(verificationResult.equalsIgnoreCase("valid")){
            return "Email verified successfully. Now you can login to your account";
        }
        return "Invalid verification token";

    }

    public String applicationUrl(HttpServletRequest request){
       return "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    }
}
