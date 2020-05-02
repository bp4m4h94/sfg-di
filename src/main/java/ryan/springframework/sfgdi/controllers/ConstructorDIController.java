package ryan.springframework.sfgdi.controllers;

import ryan.springframework.sfgdi.service.GreetingService;

public class ConstructorDIController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }

    public ConstructorDIController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
