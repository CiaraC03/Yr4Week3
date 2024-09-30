package ie.atu.week3_microservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public Customer addCustomer(@RequestBody Customer customer)
    {
        customerList.add(customer);
        return customer;
    }

    public Customer updateCustomer(Customer customer) {
        for (Customer c : customerList) {

            c.setName(customer.getName());
            c.setEmail(customer.getEmail());
            c.setAge(customer.getAge());
            return c;

        }

        return null;
    }
}
