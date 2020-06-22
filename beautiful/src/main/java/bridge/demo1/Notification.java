package bridge.demo1;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}