package factory.bean2;

import factory.bean.IRuleConfigParser;
import factory.bean.JsonRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}