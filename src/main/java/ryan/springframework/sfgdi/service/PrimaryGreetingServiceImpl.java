package ryan.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {

        return "Hello Ryan --PRIMARY ";
    }
}
