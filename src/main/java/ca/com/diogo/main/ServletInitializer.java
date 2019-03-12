package ca.com.diogo.main;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FinanceApplication.class);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
	}

	@Override
	protected WebApplicationContext createRootApplicationContext(ServletContext servletContext) {
		return super.createRootApplicationContext(servletContext);
	}

	@Override
	protected SpringApplicationBuilder createSpringApplicationBuilder() {
		return super.createSpringApplicationBuilder();
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return super.run(application);
	}

	
	
}

