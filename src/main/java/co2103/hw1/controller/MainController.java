package co2103.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    // Handle GET request for "/"
    @GetMapping("/")
    public String showStart() {
        return "start"; // Return the view name "start"
    }

    // Handle POST request for "/"
    @PostMapping("/")
    public String processStart() {
        // Add any processing logic here if needed
        return "start"; // Return the view name "start"
    }
}
