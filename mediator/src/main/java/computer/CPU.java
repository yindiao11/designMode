package computer;


/**
 * @author: songdewei
 * @date: 2018/8/30
 */
public class CPU extends Colleague {

    private String videoData = "";
    private String soundData = "";
    /**
     * 构造函数
     *
     * @param mediator
     */
    public CPU(MainBoard mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    /**
     * 处理数据，把数据分成音频和视频的数据
     */
    public void executeData(String data){
        //把数据分解开，前面是视频数据，后面是音频数据
        String[] array = data.split(",");
        this.videoData = array[0];
        this.soundData = array[1];
        //通知主板，CPU完成工作
        getMediator().changed(this);
    }
}
