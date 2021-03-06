package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
//		logger.info("User id 10011 -> {}", dao.findById(10011));
//		logger.info("Deleting 10012 -> Number of Rows Deleted - {}", dao.deleteById(10012));
//		logger.info("Inserting 10014 -> {}", dao.insert(new Person(10014, "Benji", "Berlin", new Date())));
//		logger.info("Update 10013 -> {}",
//				dao.update(new Person(10013, "Ben", "Ten", new Date())));
	}
}
