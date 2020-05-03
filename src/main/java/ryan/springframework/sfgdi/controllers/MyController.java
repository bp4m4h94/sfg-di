package ryan.springframework.sfgdi.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import ryan.springframework.sfgdi.service.GreetingService;

//@Controller
public class MyController {
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
