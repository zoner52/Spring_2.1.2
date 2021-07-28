import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld"); // Стандартный HelloWorld
        Cat catBean = (Cat) applicationContext.getBean("cat"); // Bean Cat
        HelloWorld anotherBean = (HelloWorld) applicationContext.getBean("helloworld"); // 2-й экз Bean'а HelloWorld
        Cat anotherCat = (Cat) applicationContext.getBean("cat"); // 2-й экз Bean'а Cat
        System.out.println(bean.getMessage());
        System.out.println(catBean.getName());
        System.out.println(anotherBean.getMessage());
        System.out.println(anotherCat.getName());
        System.out.println(bean.equals(anotherBean));
        System.out.println(bean.equals(catBean));
        System.out.println(catBean.equals(anotherCat));
    }
}