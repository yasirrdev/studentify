package es.fpalanturing.studentify.controller;

import es.fpalanturing.studentify.model.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {

    
    @GetMapping("/api/health")
    public Health ShowHealth() {
        Health health = new Health("success","API is healthy");
        return health;
    }
    
}
