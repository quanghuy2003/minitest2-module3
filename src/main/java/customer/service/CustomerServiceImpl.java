package customer.service;

import customer.model.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    public CustomerServiceImpl() {
    }
    protected Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo20062?useSSL=false", "root", "123456");
        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List<Customer> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<Customer> findAllByAge() throws SQLException {
        return null;
    }

    @Override
    public List<Customer> findByName() throws SQLException {
        return null;
    }

    @Override
    public void add(Customer customer) throws SQLException {

    }

    @Override
    public void edit(Customer customer) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Customer findById(int id) throws SQLException {
        return null;
    }
}
