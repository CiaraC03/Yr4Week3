package ie.atu.week3_microservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @NotBlank(message= "Name must not be blank")
    private String name;

    @Email(message = "email should be valid")
    private String email;

    @Positive(message = "age has to be positive")
    private int age;

}
