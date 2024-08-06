package com.example.chat.demos.web.qun1;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiV2DepartmentListsubidRequest;
import com.dingtalk.api.response.OapiV2DepartmentListsubidResponse;
import com.taobao.api.ApiException;

/**
 * @Description: 会话1.0 获取企业下的所有部门
 * @Author: thog
 * @Date: 2024/8/6 15:16
 */
public class TestDepart {

    public static void main(String[] args) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/department/listsubid");
        OapiV2DepartmentListsubidRequest req = new OapiV2DepartmentListsubidRequest();
        req.setDeptId(1L);
        // 获取token中返回
        OapiV2DepartmentListsubidResponse rsp = client.execute(req, "f9c855de4b613d0a928e18ebdd915ab6");
        System.out.println(rsp.getBody());
    }
}
