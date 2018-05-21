package cn.wilsono.design.patterns.structural.decorator;

import cn.wilsono.design.patterns.structural.bridge.*;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        Phone callPhone = new CallPhone();
        callPhone.feature();

        Phone smsPhone = new SmsPhoneDecorator(callPhone);
        smsPhone.feature();
    }
}
