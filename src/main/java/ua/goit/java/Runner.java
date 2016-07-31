package ua.goit.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 7 on 28.07.2016.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Runner runner = applicationContext.getBean("runner", Runner.class);

        runner.execute();
    }

    public void execute() {

        Operations.addOperation(new DivideOperation());
        Operations.addOperation(new MultipleOperation());

        Calculate.execution();

    }
}
