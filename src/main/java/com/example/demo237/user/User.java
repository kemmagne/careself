package com.example.demo237.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;
//    @NaturalId(mutable = true)
    private  String email;

    private String password;

    private String role;
    private boolean isEnabled = false;

    private int age;
    private String nationality;

    private String Contact;

    private boolean isAvalable;

    private String photo;

    private boolean isBocked;


}
