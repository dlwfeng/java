package design.factoryMethod;

/**
 * @description: 实现类mail
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 10:32
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}

