package src.main.java.com.jun.eda.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vincent Shen on 2019/12/30
 */
public class EventDispatcher {

    private Map<Class<? extends Event>, Handler> handlers;

    public EventDispatcher() {
        handlers = new HashMap<>();
    }

    public void registerHandler(Class eventType, Handler handler) {
        handlers.put(eventType, handler);
    }

    public void dispatch(Event event) {
        Handler handler = handlers.get(event.getClass());
        if (handler != null) {
            handler.onEvent(event);
        }
    }

}
