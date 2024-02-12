package com.example.demo237.service;

import com.example.demo237.model.Maladie;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MaladieService {

    // Save operation
    Maladie saveMaladie(Maladie maladie);

    // Read operation
    List<Maladie> fetchMaladie();
}
