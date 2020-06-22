package bridge.demo;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class ErrorAlertHandler extends AlertHandler {
    private AlertRule rule;
    //在API监控告警的例子中，我们如下方式来使用Notification类：

    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule, notification);
    }


    @Override
    public void check(ApiStatInfo apiStatInfo) {
//        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
