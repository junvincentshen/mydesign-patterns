package src.main.java.com.jun.eda.event;

import src.main.java.com.jun.eda.framework.Event;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public abstract class AbstractEvent implements Event {

    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }
}
