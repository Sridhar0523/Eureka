package in.sridhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class WelcomeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApiApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Practise Eureka";
		
	}

}
