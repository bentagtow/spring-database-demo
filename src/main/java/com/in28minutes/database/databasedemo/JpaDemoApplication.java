package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
@ComponentScan("com.in28minutes.database.databasedemo.jpa")

public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10011 -> {}", repository.findById(10011));

		repository.deleteById(10002);
		logger.info("Inserting 10014 -> {}", repository.insert(new Person( "Benji", "Berlin", new Date())));
		logger.info("Update 10013 -> {}",
				repository.update(new Person(10013, "Ben", "Ten", new Date())));
		logger.info("All users -> {}", repository.findAll());

	}
}
