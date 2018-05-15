package cn.wilsono.design.patterns.structural.adapter;

/**
 * Created by wilson on 2018/5/15.
 */
public class AwsKmsAdapter implements KeyManagementService {
    private AWSKeyManagementService awsKeyManagementService;

    public AwsKmsAdapter(AWSKeyManagementService awsKeyManagementService) {
        this.awsKeyManagementService = awsKeyManagementService;
    }

    public String encrypt(String key) {
        return awsKeyManagementService.encrypt(key);
    }

    public String decrypt(String key) {
        return awsKeyManagementService.decrypt(key);
    }
}
