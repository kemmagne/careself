package com.example.demo237.serviceImpl;


import com.example.demo237.model.Maladie;
import com.example.demo237.repository.MaladieRepository;
import com.example.demo237.service.MaladieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaladieServiceImpl implements MaladieService {

    @Autowired
    private MaladieRepository maladieRepository;

    @Override
    public Maladie saveMaladie(Maladie maladie) {
        return maladieRepository.save(maladie);
    }

    @Override
    public List<Maladie> fetchMaladie() {
       return  maladieRepository.findAll();
    }
}
