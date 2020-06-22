package bridge.demo;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public abstract class AlertHandler {
    public AlertHandler(AlertRule rule, Notification notification) {

    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
