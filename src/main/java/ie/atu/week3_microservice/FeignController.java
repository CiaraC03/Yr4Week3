package ie.atu.week3_microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer- class", url = "http://localhost:8081")
public interface FeignController {
    @GetMapping("/customers")


}
