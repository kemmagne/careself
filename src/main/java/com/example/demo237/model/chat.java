package com.example.demo237.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chat")
public class chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatid;

    private String contenue;
}
