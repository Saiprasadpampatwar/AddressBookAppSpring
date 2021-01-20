package com.saischool.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AddressbookappApplication.class, args);
        log.info("AddressBook App Started in {} environment",context.getEnvironment().getProperty("environment"));
        log.info("AddressBook db user is {} ",context.getEnvironment().getProperty("spring.datasource.username"));

    }

}
