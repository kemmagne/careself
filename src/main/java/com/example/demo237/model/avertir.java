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
@Table(name = "avertir")
public class avertir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blockedid;

    private String blocked;
}
