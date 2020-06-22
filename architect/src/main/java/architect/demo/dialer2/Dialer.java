package architect.demo.dialer2;

import architect.demo.dialer1.Radio;
import architect.demo.dialer1.Screen;
import architect.demo.dialer1.Speaker;

/**
 * @author: songdewei
 * @date: 2020/6/14
 */
public class Dialer {
    private Screen screen;
    private Radio radio;
    private Speaker speaker;

    public Dialer(Screen screen, Speaker speaker) {
        this.screen = screen;
        this.speaker = speaker;
    }
    public Dialer(Screen screen, Radio radio) {
        this.screen = screen;
        this.radio = radio;
    }

    public void enterDigit(int digit){
        screen.display(digit);
        speaker.beep(digit);
    }

    public void dial() {
        screen.display("dialing...");
        radio.connect();
    }
}
