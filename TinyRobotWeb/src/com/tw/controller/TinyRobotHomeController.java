package com.tw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TinyRobotHomeController {
	@GetMapping("/tinyrobot")
	public String loadHomePage(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
       System.out.println("load home page");
		model.addAttribute("name", name);
        return "homepage";
    }
}
//src/main/java/hello/GreetingController.java
//src/main/resources/templates/greeting.html