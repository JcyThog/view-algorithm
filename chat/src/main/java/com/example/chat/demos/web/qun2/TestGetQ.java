package com.example.chat.demos.web.qun2;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiImChatScenegroupGetRequest;
import com.dingtalk.api.response.OapiImChatScenegroupGetResponse;
import com.taobao.api.ApiException;

/**
 * @Description: 会话2.0 暂不用
 * @Author: thog
 * @Date: 2024/8/6 15:36
 */
public class TestGetQ {
    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/im/chat/scenegroup/get");
        OapiImChatScenegroupGetRequest req = new OapiImChatScenegroupGetRequest();
        req.setOpenConversationId("cidDC5xUlGk+9M/HkJ8NaCP8A==");
        OapiImChatScenegroupGetResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
