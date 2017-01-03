package by.dreamteam.sportfirst.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "by.dreamteam.sportfirst.repository")
@EntityScan(basePackages = "by.dreamteam.sportfirst.entity")
@ComponentScan("by.dreamteam.sportfirst")
public class SportFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportFirstApplication.class, args);
    }
}
