package jay.springframework.didemo.controllers;

import jay.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;
    // or match property name to bean name (not using qualifier)

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
