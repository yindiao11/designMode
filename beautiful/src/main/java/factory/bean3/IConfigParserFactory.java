package factory.bean3;

import factory.bean.IRuleConfigParser;

/**
 * @author: songdewei
 * @date: 2020/3/21
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser(); //此处可以扩展新的parser类型，比如IBizConfigParser
}
