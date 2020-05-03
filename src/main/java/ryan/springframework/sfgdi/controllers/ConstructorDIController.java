package ryan.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import ryan.springframework.sfgdi.service.GreetingService;

@Controller
public class ConstructorDIController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }

    public ConstructorDIController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
