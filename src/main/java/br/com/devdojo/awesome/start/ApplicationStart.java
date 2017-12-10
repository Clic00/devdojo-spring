package br.com.devdojo.awesome.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.devdojo.awesome.endpoint")
public class ApplicationStart implements CommandLineRunner {
	public static void main(String[] args) {

		SpringApplication.run(ApplicationStart.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
//		Student st1 = new Student("Nicolle");
//		Student st2 = new Student("Juliana");
//		Student st3 = new Student("Luciana");
		
		

	}

}
