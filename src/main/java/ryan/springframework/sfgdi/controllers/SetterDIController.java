package ryan.springframework.sfgdi.controllers;

import ryan.springframework.sfgdi.service.GreetingService;

public class SetterDIController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
