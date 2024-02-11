package com.example.demo237.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerifcationTokenRepository extends JpaRepository<VerificationToken, Long>{

    VerificationToken findByToken(String token);
}
