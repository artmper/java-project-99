package hexlet.code.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping
    public ResponseEntity<String> index() {
        String body = "Welcome to Spring!";
        return ResponseEntity.ok(body);
    }
}
