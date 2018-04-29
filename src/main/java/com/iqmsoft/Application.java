package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}


@RestController
class MyController {

    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello From Docker Spring Boot!");
    }

}
