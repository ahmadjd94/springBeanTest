package JavaLearn.internal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Application  {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Building a = context.getBean("building", Building.class);

        a.getAddress().setBuildingNumber(500);
        a.getAddress().setStreet("this is a test ");

        System.out.println(a.getAddress().getBuildingNumber());
        System.out.println(a.getAddress().getStreet());

    }
}