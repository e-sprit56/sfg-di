package whitetip.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import whitetip.sfgdi.controllers.ConstructorInjectedController;
import whitetip.sfgdi.controllers.MyController;
import whitetip.sfgdi.controllers.PropertyInjectedController;
import whitetip.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        String greetings = myController.sayHello();
        System.out.println(greetings);

        System.out.println("------------proprty-------------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------setter-------------");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------constructor-------------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}
