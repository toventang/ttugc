package com.kakao.auth;

import com.bytedance.covode.number.Covode;

public interface IPushConfig {
    static {
        Covode.recordClassIndex(33814);
    }

    String getDeviceUUID();

    ApiResponseCallback<Integer> getTokenRegisterCallback();
}
