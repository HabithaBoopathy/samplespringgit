package com.model.sample.controller;

import com.model.sample.model.Customer;
import com.model.sample.model.Sample;
import com.model.sample.repository.SampleRepository;
import com.model.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sample")
@CrossOrigin(origins = "*")
public class SampleController {
    @Autowired
    SampleService sampleService;
    @Autowired
    SampleRepository sampleRepository;

    @GetMapping
    public List<Sample> getSample() {
        return sampleService.getSample();
    }

}