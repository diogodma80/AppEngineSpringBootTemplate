package ca.com.diogo.main;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	private final JdbcTemplate jdbcTemplate;

	public WebController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@RequestMapping("/getTuples")
	public List<String> getTuples() {
		return this.jdbcTemplate.queryForList("SELECT * FROM users").stream().map((m) -> m.values().toString())
				.collect(Collectors.toList());
	}
	
	@RequestMapping("/getTuples/name/{name}")
	public String sayHelloName(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	
}
