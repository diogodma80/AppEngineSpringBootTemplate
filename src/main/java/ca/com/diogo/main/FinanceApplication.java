package ca.com.diogo.main;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHelloWorld() {
		return "<h1>Finance App</h1>";
	}

	@RequestMapping("/time")
	public String getTime() {
		return Calendar.getInstance().getTime().toString();
	}

	@RequestMapping("/name/{name}")
	public String sayHelloName(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}
