package ryan.springframework.sfgdi;

import jdk.nashorn.internal.objects.annotations.Setter;
import ryan.springframework.sfgdi.controllers.ConstructorDIController;
import ryan.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ryan.springframework.sfgdi.controllers.PropertiesDIController;
import ryan.springframework.sfgdi.controllers.SetterDIController;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
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





	}

}
