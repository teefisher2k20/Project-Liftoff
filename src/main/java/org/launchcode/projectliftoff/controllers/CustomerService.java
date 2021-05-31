package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.CustomerRepository;
import org.launchcode.projectliftoff.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repo;

    public List<Customer> listAll() {
        return (List<Customer>) repo.findAll();
    }
    public void save(Customer customer) {
        repo.save(customer);
    }
    public Customer get(int id) {
        //Optional<Customer> result = repo.findById(id);
        return repo.findById(id).get();
    }
    public void delete(int id) {
        repo.deleteById(id);
    }
    public List<Customer> search(String keyword) {
        return repo.search(keyword);
    }
}
