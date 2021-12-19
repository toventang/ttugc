package com.kakao.auth.common;

import com.bytedance.covode.number.Covode;

public interface MessageSendable {
    static {
        Covode.recordClassIndex(33883);
    }

    String getTargetId();

    String getType();

    boolean isAllowedMsg();
}
