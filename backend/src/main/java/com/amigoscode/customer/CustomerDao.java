package com.amigoscode.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean existsPersonWithEmail(String email);
    boolean existsPersonWithID(Integer id);
    void deleteCustomerByID(Integer customerID);
    void updateCustomer(Customer update);
    Optional<Customer> selectUserByEmail(String email);
}
