package com.example.chat.demos.web.qun1;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiChatCreateRequest;
import com.dingtalk.api.request.OapiV2DepartmentListsubidRequest;
import com.dingtalk.api.request.OapiV2UserListRequest;
import com.dingtalk.api.response.OapiChatCreateResponse;
import com.dingtalk.api.response.OapiV2DepartmentListsubidResponse;
import com.dingtalk.api.response.OapiV2UserListResponse;
import com.taobao.api.ApiException;

import java.util.Arrays;

/**
 * @Description: 会话1.0 创建群
 * @Author: thog
 * @Date: 2024/8/6 14:59
 */
public class TestCreate {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/create");
        OapiChatCreateRequest req = new OapiChatCreateRequest();
        req.setName("全员群");
        // 获取用户信息中返回
        req.setOwner("manager4373");
        // 获取用户信息中返回
        req.setUseridlist(Arrays.asList("manager4373"));
        req.setShowHistoryType(1L);
        req.setSearchable(0L);
        req.setValidationType(0L);
        req.setMentionAllAuthority(0L);
        req.setManagementType(0L);
        req.setChatBannedType(0L);
        // 获取token
        OapiChatCreateResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }


}
