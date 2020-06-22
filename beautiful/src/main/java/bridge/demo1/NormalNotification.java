package bridge.demo1;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
