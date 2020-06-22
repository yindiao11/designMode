package factory.bean3;

import factory.bean.IRuleConfigParser;
import factory.bean.JsonRuleConfigParser;
import factory.bean.XmlRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
