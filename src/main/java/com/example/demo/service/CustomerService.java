package com.example.demo.service;

import com.example.demo.model.Customer;

public interface CustomerService {
    void addCustomer(int id, String name);
    Customer getCustomer(int id);
}
