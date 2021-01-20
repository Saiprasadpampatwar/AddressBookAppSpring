package com.saischool.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressbookappApplication.class, args);
        log.info("AddressBook App Started");

    }

}
