package cn.wilsono.design.patterns.structural.decorator;

/**
 * 抽象装饰器类
 */
public class PhoneDecorator implements Phone {

    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    public void feature() {
        phone.feature();
    }
}
