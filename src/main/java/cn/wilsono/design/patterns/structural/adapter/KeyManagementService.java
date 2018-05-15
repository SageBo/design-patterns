package cn.wilsono.design.patterns.structural.adapter;

/**
 * 加解密服务接口
 */
public interface KeyManagementService {
    /**
     * 加密
     * @param key
     * @return
     */
    String encrypt(String key);

    /**
     * 解密
     * @param key
     * @return
     */
    String decrypt(String key);
}
