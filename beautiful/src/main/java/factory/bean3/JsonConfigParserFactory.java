package factory.bean3;

import factory.bean.IRuleConfigParser;
import factory.bean.JsonRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
