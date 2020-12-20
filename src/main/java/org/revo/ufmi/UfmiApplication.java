package org.revo.ufmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UfmiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UfmiApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "welcome";
    }
}
