package ryan.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ryan.springframework.sfgdi.service.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertiesDIControllerTest {

    PropertiesDIController propertiesDIController;

    @BeforeEach
    void setUp() {
        propertiesDIController = new PropertiesDIController();
        propertiesDIController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertiesDIController.getGreeting());
    }
}