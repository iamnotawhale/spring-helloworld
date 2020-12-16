import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanSing1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSing2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanSing1.getMessage());
        System.out.println(beanSing2.getMessage());

        System.out.println(beanSing1 == beanSing2);

        Cat beanProt1 = (Cat) applicationContext.getBean("cat");
        Cat beanProt2 = (Cat) applicationContext.getBean("cat");

        System.out.println(beanProt1.getName());
        System.out.println(beanProt2.getName());

        System.out.println(beanProt1 == beanProt2);
    }
}