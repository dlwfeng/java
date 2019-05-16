package design.abstractFactory;

import design.factoryMethod.Sender;

/**
 * @description: 共有接口
 * ===========================================
 * @company: 浙江信电 sumyland
 * @author: dinglw@sunlandgroup.cn
 * @date: 2019-05-16 11:31
 */
public interface Provider {
    public Sender produce();
}
