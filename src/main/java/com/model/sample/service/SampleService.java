package com.model.sample.service;

import com.model.sample.model.Sample;
import com.model.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {
    @Autowired
    SampleRepository sampleRepository;


    public List<Sample> getSample(){
        return sampleRepository.findAll();
    }

}
