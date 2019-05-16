package design.factoryMethod;

/**
 * @description: 多个工厂方法
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 10:53
 */
public class SendFactory2 {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
