package SpringDI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person= (Person) context.getBean("person");
        person.print();

        Person person1 = (Person) context.getBean("person2");
        person1.print();

    }
}
