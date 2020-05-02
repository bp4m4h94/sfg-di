package ryan.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ryan.springframework.sfgdi.service.GreetingService;
import ryan.springframework.sfgdi.service.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorDIControllerTest {

    public ConstructorDIController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorDIController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}