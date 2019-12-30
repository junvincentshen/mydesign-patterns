package src.main.java.com.jun.eda;

import src.main.java.com.jun.eda.event.UserCreatedEvent;
import src.main.java.com.jun.eda.event.UserUpdatedEvent;
import src.main.java.com.jun.eda.framework.EventDispatcher;
import src.main.java.com.jun.eda.handler.UserCreatedHandler;
import src.main.java.com.jun.eda.handler.UserUpdatedHandler;
import src.main.java.com.jun.eda.model.User;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class App {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedHandler());
        dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedHandler());

        User user = new User("stark");
        dispatcher.dispatch(new UserCreatedEvent(user));
        dispatcher.dispatch(new UserUpdatedEvent(user));

    }
}
