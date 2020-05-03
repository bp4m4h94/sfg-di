package ryan.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ryan.springframework.sfgdi.service.GreetingService;
import ryan.springframework.sfgdi.service.GreetingServiceImpl;

@Controller
public class PropertiesDIController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingService greetingService;

    public String getGreeting() {
         return greetingService.sayHello();
    }


}

