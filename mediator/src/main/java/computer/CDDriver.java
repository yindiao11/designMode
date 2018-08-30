package computer;

/**
 * 光驱
 * @author: songdewei
 * @date: 2018/8/30
 */
public class CDDriver extends Colleague {

    private String data = "";

    /**
     * 构造函数
     *
     * @param mediator
     */
    public CDDriver(MainBoard mediator) {
        super(mediator);
    }

    public String getData() {
        return data;
    }

    public void readCD(){
        this.data = "调停者模式,CD开始读取";
        //通知主板自己的状态发生了变化
        getMediator().changed(this);

    }
}
