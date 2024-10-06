package ie.atu.week3_microservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public String notificationMessage(Customer customer){
        String message = "Thank you " + customer.getName() + ", your registration has been completed";
        return message;
    }


}
