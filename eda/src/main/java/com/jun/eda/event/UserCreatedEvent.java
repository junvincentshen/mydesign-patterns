package src.main.java.com.jun.eda.event;

import src.main.java.com.jun.eda.model.User;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class UserCreatedEvent extends AbstractEvent {

    private User user;

    public UserCreatedEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
