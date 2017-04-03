package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/math/pi")
    public String getMathPi() {
        return String.format("%.15f",Math.PI);
    }
}
