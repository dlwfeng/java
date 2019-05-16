package design.factoryMethod;

/**
 * @description: 实现类sms
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 10:34
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}

