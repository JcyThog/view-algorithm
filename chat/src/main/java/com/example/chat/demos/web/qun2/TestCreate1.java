package com.example.chat.demos.web.qun2;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiImChatScenegroupCreateRequest;
import com.dingtalk.api.response.OapiImChatScenegroupCreateResponse;
import com.taobao.api.ApiException;

/**
 * @Description: 会话2.0 暂时调不通
 * @Author: thog
 * @Date: 2024/8/6 15:27
 */
public class TestCreate1 {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/im/chat/scenegroup/create");
        OapiImChatScenegroupCreateRequest req = new OapiImChatScenegroupCreateRequest();
        req.setTitle("测试群");
        req.setTemplateId("c354***-***-***-b4ea-6f1ab***65");
        req.setOwnerUserId("022*****");
        req.setUserIds("072*****,013*****");
        req.setSubadminIds("072*****,013*****");
        req.setUuid("axcf*-*****-*****-23da*");
        req.setIcon("@lADOADma*****QKA");
        req.setMentionAllAuthority(0L);
        req.setShowHistoryType(0L);
        req.setValidationType(0L);
        req.setSearchable(0L);
        req.setChatBannedType(0L);
        req.setManagementType(0L);
        req.setOnlyAdminCanDing(0L);
        req.setAllMembersCanCreateMcsConf(1L);
        req.setAllMembersCanCreateCalendar(0L);
        req.setGroupEmailDisabled(0L);
        req.setOnlyAdminCanSetMsgTop(0L);
        req.setAddFriendForbidden(0L);
        req.setGroupLiveSwitch(1L);
        req.setMembersToAdminChat(0L);
        OapiImChatScenegroupCreateResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
