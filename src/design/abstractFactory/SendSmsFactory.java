package design.abstractFactory;

import design.factoryMethod.Sender;

/**
 * @description: ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 11:57
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce(){
        return new SmsSender();
    }
}
