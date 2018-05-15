package cn.wilsono.design.patterns.structural.adapter;

/**
 * AWS提供的第三方加解密服务
 */
public class AWSKeyManagementService {
    /**
     * 加密
     * @param key
     * @return
     */
    public String encrypt(String key) {
        String encrypt = "use aws kms encrypt key:" +key;
        System.out.println(encrypt);
        return encrypt;
    }

    /**
     * 解密
     * @param key
     * @return
     */
    public String decrypt(String key) {
        String encrypt = "use aws kms decrypt key:" +key;
        System.out.println(encrypt);
        return encrypt;
    }
}
