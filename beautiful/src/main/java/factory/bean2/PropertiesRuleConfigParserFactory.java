package factory.bean2;

import factory.bean.IRuleConfigParser;
import factory.bean.PropertiesRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
