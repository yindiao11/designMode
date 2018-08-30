package computer;


/**
 * @author: songdewei
 * @date: 2018/8/30
 */
public class SoundCard extends Colleague {
    /**
     * 构造函数
     *
     * @param mediator
     */
    public SoundCard(MainBoard mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     */
    public void soundData(String data){
        System.out.println("画外音：" + data);
    }
}
