package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XIAOBING
 */
@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(CustomerRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Customer("Xiaobing", "xiaobing@example.com")));
      log.info("Preloading " + repository.save(new Customer("Anna", "anna@example.com")));
    };
  }
}