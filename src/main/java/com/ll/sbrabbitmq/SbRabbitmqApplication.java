package com.ll.sbrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SbRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbRabbitmqApplication.class, args);
    }

}
