package io.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(@Qualifier("whatsappMessageService") MessageService messageService){
        this.messageService = messageService;
    }

    public void send(String message){
        messageService.sendMessage(message);
    }
}
