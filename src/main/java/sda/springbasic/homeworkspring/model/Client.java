package sda.springbasic.homeworkspring.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
public class Client {
    private int id;

    @Length(min = 2, max = 15)
    private String name;

    @Length(min = 2, max = 20)
    private String surname;

    @Length(min = 9, max = 9)
    private String phoneNumber;
}
