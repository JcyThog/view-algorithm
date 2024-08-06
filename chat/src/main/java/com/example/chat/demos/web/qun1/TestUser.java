package com.example.chat.demos.web.qun1;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiV2UserListRequest;
import com.dingtalk.api.response.OapiV2UserListResponse;
import com.taobao.api.ApiException;

/**
 * @Description: 会话1.0 获取企业下的用户
 * @Author: thog
 * @Date: 2024/8/6 15:15
 */
public class TestUser {

    public static void main(String[] args) throws ApiException {
        departmentUserInfo();
    }

    public static void departmentUserInfo() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/user/list");
        OapiV2UserListRequest req = new OapiV2UserListRequest();
        req.setDeptId(1L);
        req.setCursor(0L);
        req.setSize(10L);
        req.setOrderField("modify_desc");
        req.setContainAccessLimit(false);
        req.setLanguage("zh_CN");
        OapiV2UserListResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
