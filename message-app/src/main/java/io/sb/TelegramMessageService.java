package io.sb;

import org.springframework.stereotype.Component;

@Component
public class TelegramMessageService implements MessageService{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending message from Telegram : " + msg);
    }
}
