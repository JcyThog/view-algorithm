package com.example.chat.demos.web.qun1;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiChatUpdateRequest;
import com.dingtalk.api.response.OapiChatUpdateResponse;
import com.taobao.api.ApiException;

import java.util.Arrays;

/**
 * @Description: 会话1.0 更新群
 * @Author: thog
 * @Date: 2024/8/6 15:37
 */
public class TestUpdate {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/update");
        OapiChatUpdateRequest req = new OapiChatUpdateRequest();
        // 创建群的时候返回该信息
        req.setChatid("chata5898efea7902dd21f8cb478bbdecc92");
        req.setName("群1");
        // 获取用户信息
        req.setOwner("manager4373");
        req.setOwnerType("emp");
        req.setAddUseridlist(Arrays.asList("0118511658678103"));
//        req.setIcon("@mediaId");
        req.setIsBan(true);
        req.setSearchable(0L);
        req.setValidationType(0L);
        req.setMentionAllAuthority(0L);
        req.setManagementType(0L);
        req.setChatBannedType(0L);
        req.setShowHistoryType(0L);
        // 获取token中返回
        OapiChatUpdateResponse rsp = client.execute(req,"f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
