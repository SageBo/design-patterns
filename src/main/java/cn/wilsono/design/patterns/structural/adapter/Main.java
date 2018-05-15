package cn.wilsono.design.patterns.structural.adapter;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        KeyManagementService kmsAdapter = new AwsKmsAdapter(new AWSKeyManagementService());
        kmsAdapter.encrypt("tokenKey");
        kmsAdapter.decrypt("tokenKey");

        KeyManagementService kmsAdapter1 = new TencentKmsAdapter(new TencentKeyManagementService());
        kmsAdapter1.encrypt("tokenKey");
        kmsAdapter1.decrypt("tokenKey");

    }
}
