package bridge.demo1;

import java.util.List;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }

}

