package whitetip.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import whitetip.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
