package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;//wrong
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration // like beans.xml
@ComponentScan(basePackages = "com") //like context:component-scan-tag
//@ComponentScan(basePackages="com") //this is wrong
public class ConfigurationClass {
	@Bean(name = "mgr") //This creates object for manager 
		public  Manager getManagerBean() {
		System.out.println("Obj created by us but maintained by Container");
		return new Manager();
	}

}
