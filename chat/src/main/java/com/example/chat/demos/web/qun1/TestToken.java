package com.example.chat.demos.web.qun1;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenResponse;
import com.aliyun.tea.*;

/**
 * @Description: 获取token 在这之前需要在钉钉开放平台创建应用
 * @Author: thog
 * @Date: 2024/8/6 14:47
 */
public class TestToken {

    /**
     * 使用 Token 初始化账号Client
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dingtalkoauth2_1_0.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkoauth2_1_0.Client(config);
    }

    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.dingtalkoauth2_1_0.Client client = TestToken.createClient();
        // 在钉钉开放平台中获取下列key secret
        com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest getAccessTokenRequest = new com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest()
                .setAppKey("ding91tzqxa4ckfvsjqf")
                .setAppSecret("8QYZYOSBAb8hmtqyUaqKQTxmc3dLfCRIeYcLJaPb78rZOsWPsPp1VzoEkCRWgKDA");
        try {
            GetAccessTokenResponse accessToken = client.getAccessToken(getAccessTokenRequest);
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(accessToken));
            System.out.println(jsonObject.getJSONObject("body").getString("accessToken"));
            System.out.println(jsonObject.getJSONObject("body").getInteger("expireIn"));
        } catch (TeaException err) {
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                // err 中含有 code 和 message 属性，可帮助开发定位问题
            }

        } catch (Exception _err) {
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                // err 中含有 code 和 message 属性，可帮助开发定位问题
            }

        }
    }
}
