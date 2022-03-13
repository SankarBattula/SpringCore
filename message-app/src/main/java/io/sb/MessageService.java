package io.sb;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {

    public void sendMessage(String msg);

}
