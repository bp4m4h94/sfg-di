package ryan.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {

        return "Hello Ryan --Setter";
    }
}
