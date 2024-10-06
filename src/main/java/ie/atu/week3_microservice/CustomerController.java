package ie.atu.week3_microservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;
    private NotificationsServiceClient notificationsServiceClient;

    @Autowired
    public CustomerController(CustomerService customerService, NotificationsServiceClient notificationsServiceClient)
    {
        this.customerService = customerService;
        this.notificationsServiceClient = notificationsServiceClient;
    }



    @PostMapping("/customers")
    public String registerCustomer(@Valid @RequestBody Customer customer){
        String confirm = notificationsServiceClient.someDetails(customer);
        String response = confirm + " " + customerService.notificationMessage(customer);
        return response;
    }


}
