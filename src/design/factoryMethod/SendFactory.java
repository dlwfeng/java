package design.factoryMethod;

/**
 * @description: 工厂方法
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 10:33
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}

