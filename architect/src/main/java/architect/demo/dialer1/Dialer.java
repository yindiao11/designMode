package architect.demo.dialer1;

/**
 * @author: songdewei
 * @date: 2020/6/14
 */
public class Dialer {
    private Screen screen;
    private Radio radio;
    private Speaker speaker;

    public Dialer(Screen screen, Radio radio, Speaker speaker) {
        this.screen = screen;
        this.radio = radio;
        this.speaker = speaker;
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
