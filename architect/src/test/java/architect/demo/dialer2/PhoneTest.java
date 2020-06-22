package architect.demo.dialer2;

/**
 * @author: songdewei
 * @date: 2020/6/15
 */
public class PhoneTest {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();

        phone.sendButton.press();

    }
}
