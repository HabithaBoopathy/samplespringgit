package com.model.sample.service;

import com.model.sample.model.Customer;
import com.model.sample.model.Sample;
import com.model.sample.repository.CustomerRepository;
import com.model.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    SampleRepository sampleRepository;

//    public List<Sample> getSample(){
//        return sampleRepository.findAll();
//    }


    public List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer){
        return customerRepository.insert(customer);
    }
    public List<Customer> getCustomer(){return customerRepository.findAll();}
//    public Customer getCustomer(String id){
//        Optional<Customer> optional =customerRepository.findById(id);
//        if(optional.isPresent()){
//            return optional.get();
//        }else{
//            return null;
//        }
//    }
}
