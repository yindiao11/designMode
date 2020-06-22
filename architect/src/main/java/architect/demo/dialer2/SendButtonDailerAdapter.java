package architect.demo.dialer2;

import architect.demo.dialer1.Radio;
import architect.demo.dialer1.Screen;

/**
 * @author: songdewei
 * @date: 2020/6/15
 */
public class SendButtonDailerAdapter implements ButtonListener{

    @Override
    public void buttonPressed() {
        Screen screen = new Screen();
        Radio radio = new Radio();
        Dialer dialer = new Dialer(screen, radio);
        dialer.dial();
    }
}
