package com.example.demo237.model;


import com.example.demo237.user.User;
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
@Table(name = "maladie")
public class Maladie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maladId;

    private String name;
    private String description;

    private boolean isActivif;

    @ManyToOne
    @JoinColumn(name="id")
    private User user;
}
