package factory.bean2;

import factory.bean.IRuleConfigParser;
import factory.bean.XmlRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}