package composite.demo;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Client {

    public static void main(String[] args){
        Composite window = new Composite("print WinForm (WINDOW窗口)");
        Leaf picture = new Leaf("print Picture(Logo图片)");
        Leaf loginButton = new Leaf("print Button(登录)");
        Leaf registerButton = new Leaf("print Button(注册)");
        Composite fream1 = new Composite("print Frame(FRAME1)");
        Leaf userNameLable = new Leaf("print Lable(用户名)");
        Leaf textBox = new Leaf("print TextBox(文本框)");
        Leaf passwordLable = new Leaf("print Lable(密码)");
        Leaf passwordBox = new Leaf("print PasswordBox(密码框)");
        Leaf checkBox = new Leaf("print CheckBox(复选框)");
        Leaf rememberUserNametextBox = new Leaf("print TextBox(记住用户名)");
        Leaf forgetLinkLable = new Leaf("print LinkLable(忘记密码)");

        window.addChild(picture);
        window.addChild(loginButton);
        window.addChild(registerButton);
        window.addChild(fream1);
        fream1.addChild(userNameLable);
        fream1.addChild(textBox);
        fream1.addChild(passwordLable);
        fream1.addChild(passwordBox);
        fream1.addChild(checkBox);
        fream1.addChild(rememberUserNametextBox);
        fream1.addChild(forgetLinkLable);

        String prefix = "  ";
        window.printComponent(prefix);

    }
}
