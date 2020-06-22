package architect.demo.dialer2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: songdewei
 * @date: 2020/6/15
 */
public class Button {
    private List<ButtonListener> buttonListeners;

    public Button(){
        buttonListeners = new LinkedList<>();
    }


    public void addButtonLister(ButtonListener buttonListener){
        assert buttonListeners != null;
        buttonListeners.add(buttonListener);
    }

    public void press(){
        for(ButtonListener bl : buttonListeners){
            bl.buttonPressed();
        }
    }
}
