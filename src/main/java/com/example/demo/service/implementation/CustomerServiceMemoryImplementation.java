package com.example.demo.service.implementation;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;
@Service
public class CustomerServiceMemoryImplementation implements CustomerService
{
    static Map<Integer, Customer> DataBase = new HashMap<>();

    static
    {
        DataBase.put(1, new Customer(99, "BOB"));
    }
    @Override
    public void addCustomer(int id, String name) {
        DataBase.put(id, new Customer(id, name));
    }

    @Override
    public Customer getCustomer(int id) {
        return DataBase.get(id);
    }
}
