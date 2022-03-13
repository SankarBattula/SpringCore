package io.sb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class WhatsappMessageService implements MessageService {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending message from Whatsapp " + msg);
    }
}
