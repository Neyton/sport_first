package project.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "project.repository")
@EntityScan(basePackages = "project/entity")
@ComponentScan(value = "project")
public class SportFirstApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SportFirstApplication.class, args);
	}
}
