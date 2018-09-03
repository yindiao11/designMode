package state.demo;

/**
 * 抽象状态(State)角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
