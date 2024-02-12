package com.example.demo237.controller;

import com.example.demo237.model.Maladie;
import com.example.demo237.service.MaladieService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaladieController {

    @Autowired
    private MaladieService maladieService;


    // Save maladie
    @PostMapping("/maladie")

    public Maladie saveMaladie(@RequestBody Maladie maladie)
    {
        return  maladieService.saveMaladie(maladie);
    }

    // Read operation
    @GetMapping("/maladies")
    public List<Maladie> fetchMaladieList()
    {
        return maladieService.fetchMaladie();
    }
}
