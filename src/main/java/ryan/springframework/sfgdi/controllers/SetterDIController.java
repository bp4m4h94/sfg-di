package ryan.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ryan.springframework.sfgdi.service.GreetingService;

@Controller
public class SetterDIController {

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
