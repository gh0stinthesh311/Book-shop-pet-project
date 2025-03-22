package io.github.gh0stinthesh311;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MainPageController {

    @GetMapping("")
    private String index() {
        return "Welcome to bookstore. This is the main page";
    }
}
