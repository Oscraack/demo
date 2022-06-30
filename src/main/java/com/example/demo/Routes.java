// package com.restfull.core.controllers;
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Routes {

	@GetMapping("/")
	@ResponseBody
    public String helloWorld() {
        return "Hello World! nuevo cambio";
    }
}