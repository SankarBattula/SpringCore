import io.sb.AdditionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Calculator {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("io.sb");
        AdditionService additionService = (AdditionService) context.getBean("additionService");
        additionService.operate(3,6);
    }
}


