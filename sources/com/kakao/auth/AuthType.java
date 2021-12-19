package com.kakao.auth;

import com.bytedance.covode.number.Covode;

public enum AuthType {
    KAKAO_TALK(0),
    KAKAO_STORY(1),
    KAKAO_ACCOUNT(2),
    KAKAO_LOGIN_ALL(4),
    KAKAO_TALK_ONLY(5);
    
    private final int number;

    public final int getNumber() {
        return this.number;
    }

    static {
        Covode.recordClassIndex(33810);
    }

    public static AuthType valueOf(int i) {
        AuthType authType = KAKAO_TALK;
        if (i == authType.getNumber()) {
            return authType;
        }
        AuthType authType2 = KAKAO_STORY;
        if (i == authType2.getNumber()) {
            return authType2;
        }
        AuthType authType3 = KAKAO_ACCOUNT;
        if (i == authType3.getNumber()) {
            return authType3;
        }
        AuthType authType4 = KAKAO_LOGIN_ALL;
        if (i == authType4.getNumber()) {
            return authType4;
        }
        return null;
    }

    private AuthType(int i) {
        this.number = i;
    }
}
