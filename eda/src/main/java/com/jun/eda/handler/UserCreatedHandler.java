package src.main.java.com.jun.eda.handler;

import src.main.java.com.jun.eda.event.UserCreatedEvent;
import src.main.java.com.jun.eda.framework.Event;
import src.main.java.com.jun.eda.framework.Handler;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class UserCreatedHandler implements Handler<UserCreatedEvent> {


    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.println("User "+ event.getUser().getUsername() +" has been created!");
    }
}
