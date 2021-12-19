package com.kakao.auth;

import com.bytedance.covode.number.Covode;

public interface ISessionConfig {
    static {
        Covode.recordClassIndex(33817);
    }

    ApprovalType getApprovalType();

    AuthType[] getAuthTypes();

    boolean isSaveFormData();

    boolean isSecureMode();

    boolean isUsingWebviewTimer();
}
