package computer;


/**
 * 显卡
 * @author: songdewei
 * @date: 2018/8/30
 */
public class VideoCard extends Colleague {

    /**
     * 构造函数
     *
     * @param mediator
     */
    public VideoCard(MainBoard mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     */
    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }

}
