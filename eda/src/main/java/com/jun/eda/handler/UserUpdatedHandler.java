package src.main.java.com.jun.eda.handler;

import src.main.java.com.jun.eda.event.UserUpdatedEvent;
import src.main.java.com.jun.eda.framework.Handler;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class UserUpdatedHandler implements Handler<UserUpdatedEvent> {
    @Override
    public void onEvent(UserUpdatedEvent event) {
        System.out.println("User " + event.getUser().getUsername() + " has been updated!");
    }
}
