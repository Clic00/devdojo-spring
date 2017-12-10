package br.com.devdojo.awesome.endpoint;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.awesome.model.Student;

@RestController
@RequestMapping(value = "/student")
public class StudentEndpoint {

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Student> listAll() {

		return Arrays.asList(new Student("José"), new Student("Levy"));

	}

}
