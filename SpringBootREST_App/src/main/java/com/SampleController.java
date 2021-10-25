package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping(value="sayHello",method =RequestMethod.GET)
public String sayHello() {
	return "Welcome To RESTfull Web Service";
}
	@RequestMapping(value="sayHTML",method =RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
public String sayHTML() {
	return "<h2>Welcome To RESTfull Web Service</h2>";
}
	@RequestMapping(value="sayPlain",method =RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
public String sayPlain() {
	return "<h2>Welcome To RESTfull Web Service</h2>";
}	
}
