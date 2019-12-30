package src.main.java.com.jun.eda.event;

import src.main.java.com.jun.eda.model.User;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class UserUpdatedEvent extends AbstractEvent {
    private User user;

    public UserUpdatedEvent(User user) {
        this.user =user;
    }

    public User getUser() {
        return user;
    }
}
