package com.example.projet1.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projet1.domain.Customer;
import com.example.projet1.repository.CustomerRepository;



@Service
public class CustomerService {

	@Autowired
    private CustomerRepository repo;
	
public List<Customer> listAll() {
        return repo.findAll();
    }
    
    public void save(Customer ctr) {
        repo.save(ctr);
    }
    
    public Customer get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
    	 repo.deleteById(id);
}
    
}
