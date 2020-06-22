package architect.demo.dialer1;

/**
 * @author: songdewei
 * @date: 2020/6/14
 */
public class Button {
    public final static int SEND_BUTTON = -99;

    private Dialer dialer;
    private int token;

    public Button(Dialer dialer, int token) {
        this.dialer = dialer;
        this.token = token;
    }

    public void press() throws Exception {
        switch (token){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                dialer.enterDigit(token);
                break;
            case SEND_BUTTON:
                dialer.dial();
                break;
            default:
                throw new Exception("不支持的按键:" + token);
        }
    }
}
