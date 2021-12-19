package com.bytedance.sdk.bridge.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.sdk.bridge.C22685a;
import com.bytedance.sdk.bridge.C22693b;

public interface BridgeService extends IService {
    static {
        Covode.recordClassIndex(26512);
    }

    C22685a initBridgeConfig();

    C22693b initBridgeLazyConfig();

    void initBridgeSDK();

    void reportErrorInfo(String str, String str2);
}
