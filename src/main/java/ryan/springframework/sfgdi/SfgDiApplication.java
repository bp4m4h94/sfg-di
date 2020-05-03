package ryan.springframework.sfgdi;

import jdk.nashorn.internal.objects.annotations.Setter;
import ryan.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ryan.springframework.sfgdi.service.PrimaryGreetingServiceImpl;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
//		MyController myController = (MyController) ctx.getBean("myController");
		MyController myController = new MyController(new PrimaryGreetingServiceImpl());
		String greeting = myController.getGreeting();
		System.out.println(greeting);


		System.out.println("------Properties DI-------");


		PropertiesDIController propertiesDIController = (PropertiesDIController) ctx.getBean("propertiesDIController");
		System.out.println(propertiesDIController.getGreeting());

		System.out.println("------Setter DI-------");

		SetterDIController setterDIController = (SetterDIController) ctx.getBean("setterDIController");
		System.out.println(setterDIController.getGreeting());

		System.out.println("------Constructor DI-------");

		//Needn't put @Autowired on constructor if there is only one constructor
		ConstructorDIController constructorDIController = (ConstructorDIController) ctx.getBean("constructorDIController");
		System.out.println(constructorDIController.getGreeting());

		System.out.println("------Spring Profile-------");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());







	}

}
