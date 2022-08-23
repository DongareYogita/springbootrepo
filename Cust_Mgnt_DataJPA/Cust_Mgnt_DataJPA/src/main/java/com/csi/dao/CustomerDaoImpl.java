package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> getAlldata(){
        return customerRepoImpl.findAll();
    }
    public Optional<Customer> getDataById(long custId){
        return customerRepoImpl.findById(custId);
    }
    public Customer updateData(Customer customer){

        return customerRepoImpl.save(customer);
    }
    public void deleteData(long custId){
        customerRepoImpl.deleteById(custId);
    }
}
