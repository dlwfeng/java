package design.factoryMethod;

/**
 * @description: 静态工厂方法
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 10:55
 */
public class SendFactory3 {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
