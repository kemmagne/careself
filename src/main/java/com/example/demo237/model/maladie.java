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
@Table(name = "maladie")
public class maladie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maladid;

    private String description;

    private boolean isActivif;
}
