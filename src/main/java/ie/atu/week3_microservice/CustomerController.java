package ie.atu.week3_microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomerList()
    {
        return customerService.getCustomerList();
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping("/updateCustomers")
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomer(customer);
    }
}
