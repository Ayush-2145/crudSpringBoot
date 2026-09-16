package in.ayush.crudSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

@ComponentScan(basePackages = "in.ayush.crudSpringBoot")
public class CrudSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}


}
