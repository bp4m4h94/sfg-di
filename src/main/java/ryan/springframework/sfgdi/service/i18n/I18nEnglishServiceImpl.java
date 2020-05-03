package ryan.springframework.sfgdi.service.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ryan.springframework.sfgdi.service.GreetingService;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
