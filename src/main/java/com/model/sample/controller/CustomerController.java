package com.model.sample.controller;

import com.model.sample.model.Customer;
import com.model.sample.model.Sample;
import com.model.sample.service.CustomerService;
import com.model.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("customer")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    SampleService sampleService;

    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

//    @RequestMapping("value={sampleNo}")
//    public List<Sample> getSample() {
//        return sampleService.getSample();
//    }

    @PostMapping
    public Boolean addCustomer(@RequestBody Customer customer) {

        try {
            System.out.println("add works");
            customerService.addCustomer(customer);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
