package architect.demo.dialer2;

import architect.demo.dialer1.Radio;
import architect.demo.dialer1.Screen;
import architect.demo.dialer1.Speaker;

/**
 * @author: songdewei
 * @date: 2020/6/15
 */
public class DigitButtonDailerAdapter implements ButtonListener{
    private int digit;


    public DigitButtonDailerAdapter(int digit) {
        this.digit = digit;
    }

    @Override
    public void buttonPressed() {
        Screen screen = new Screen();
        Speaker speaker = new Speaker();
        Dialer dialer = new Dialer(screen, speaker);
        dialer.enterDigit(digit);
    }
}
