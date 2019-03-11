package dev.jasonlu.avalon.algorithmserver.controller.algorithm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BiniryTree {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
