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
@Table(name = "avertir")
public class Avertir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long avertirId;

    private boolean isBlocked;
//    @OneToOne(mappedBy = "id", cascade = CascadeType.ALL)
//    private User user;
}
