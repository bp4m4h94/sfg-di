package ryan.springframework.sfgdi.controllers;

import ryan.springframework.sfgdi.service.GreetingService;

public class PropertiesDIController {

    public GreetingService greetingService;

    public String getGreeting() {
         return greetingService.sayHello();
    }


}

