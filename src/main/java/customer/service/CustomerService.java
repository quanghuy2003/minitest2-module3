package customer.service;

import customer.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll() throws SQLException;
    List<Customer> findAllByAge() throws SQLException;
    List<Customer> findByName() throws SQLException;
    void add (Customer customer) throws SQLException;
    void edit (Customer customer) throws SQLException;
    void delete (int id) throws SQLException;
    Customer findById(int id) throws SQLException;
}
