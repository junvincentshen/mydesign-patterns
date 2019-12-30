package src.main.java.com.jun.eda.framework;
/**
 * Created by Vincent Shen on 2019/12/30
 */
public interface Event {
    Class<? extends Event> getType();
}
