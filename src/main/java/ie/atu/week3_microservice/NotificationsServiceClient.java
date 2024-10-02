package ie.atu.week3_microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notifications-service", url = "http://localhost:8081")
public interface NotificationsServiceClient {
    @PostMapping("/notifications")
    String someDetails(@RequestBody Customer customer);
}
