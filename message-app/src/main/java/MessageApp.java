import io.sb.MessageController;
import io.sb.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("io.sb");
        MessageController messageController = (MessageController) context.getBean("messageController");
        messageController.send("Hello World");
    }
}
