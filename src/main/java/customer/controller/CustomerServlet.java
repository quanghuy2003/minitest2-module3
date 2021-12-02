package customer.controller;

import customer.model.Customer;
import customer.service.CustomerService;
import customer.service.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action= "";
        }
        switch (action){
            default:
                try {
                    showList(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String key = request.getParameter("key");
        if (key==null){
            List<Customer> customerList = customerService.findAll();
            request.setAttribute("customerList",customerList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
            requestDispatcher.forward(request,response);
        }else{
            List<Customer> customerList = customerService.findAllByAge();
            request.setAttribute("customerList",customerList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
            requestDispatcher.forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
