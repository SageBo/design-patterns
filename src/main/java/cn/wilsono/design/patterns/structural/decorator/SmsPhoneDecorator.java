package cn.wilsono.design.patterns.structural.decorator;

/**
 * 具体实现装饰器类
 */
public class SmsPhoneDecorator extends PhoneDecorator {

    public SmsPhoneDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void feature() {
        super.feature();
        System.out.println("can send sms");
    }
}
