package com.example.chat.demos.web.qun2;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiImChatScenegroupMemberAddRequest;
import com.dingtalk.api.response.OapiImChatScenegroupMemberAddResponse;
import com.taobao.api.ApiException;

/**
 * @Description: 会话2.0 暂不可用
 * @Author: thog
 * @Date: 2024/8/6 15:12
 */
public class TestAdd {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/im/chat/scenegroup/member/add");
        OapiImChatScenegroupMemberAddRequest req = new OapiImChatScenegroupMemberAddRequest();
        // 创建群的时候会返回该信息
        req.setOpenConversationId("cidDC5xUlGk+9M/HkJ8NaCP8A==");
        req.setUserIds("manager4373");
        OapiImChatScenegroupMemberAddResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
