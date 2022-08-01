package net.suryc.valid8me.demo.service;

import net.suryc.valid8me.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer getById(Long id){
        return repository.findById(id).get();
    }

    public List<Customer> getAll(){
        List<Customer> retval = new LinkedList<>();
        repository.findAll().forEach(retval::add);
        return retval;
    }
}
