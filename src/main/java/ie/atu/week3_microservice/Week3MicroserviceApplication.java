package ie.atu.week3_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week3MicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3MicroserviceApplication.class, args);
    }

}
