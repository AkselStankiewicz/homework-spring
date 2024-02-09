package sda.springbasic.homeworkspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "My Spring App",
                version = "1.0.0"
        )
)
public class HomeworkSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkSpringApplication.class, args);
    }

}
