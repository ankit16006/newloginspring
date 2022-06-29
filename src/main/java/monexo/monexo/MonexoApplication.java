package monexo.monexo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
@EnableJpaRepositories(basePackages = "com.example.*")
@EntityScan(basePackages = "com.example.*")
public class MonexoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonexoApplication.class, args);
	}

}
