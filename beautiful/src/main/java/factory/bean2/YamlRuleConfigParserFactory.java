package factory.bean2;

import factory.bean.IRuleConfigParser;
import factory.bean.YamlRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
