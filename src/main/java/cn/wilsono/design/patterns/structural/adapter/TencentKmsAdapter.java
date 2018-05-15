package cn.wilsono.design.patterns.structural.adapter;

/**
 * Created by wilson on 2018/5/15.
 */
public class TencentKmsAdapter implements KeyManagementService {
    private TencentKeyManagementService tencentKeyManagementService;

    public TencentKmsAdapter(TencentKeyManagementService tencentKeyManagementService) {
        this.tencentKeyManagementService = tencentKeyManagementService;
    }

    public String encrypt(String key) {
        return tencentKeyManagementService.encrypt(key);
    }

    public String decrypt(String key) {
        return tencentKeyManagementService.decrypt(key);
    }
}
