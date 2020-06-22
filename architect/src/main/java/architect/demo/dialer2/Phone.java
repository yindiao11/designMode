package architect.demo.dialer2;

/**
 * @author: songdewei
 * @date: 2020/6/15
 */
public class Phone {
    public Button[] digitButtons;
    public Button sendButton;

    public Phone(){
        digitButtons = new Button[10];
        for(int i = 0; i < 10; i++){
            digitButtons[i] = new Button();
            final int digitKey = i;

            digitButtons[i].addButtonLister(new DigitButtonDailerAdapter(digitKey));
        }

        sendButton = new Button();
        sendButton.addButtonLister(new SendButtonDailerAdapter());
    }




}
