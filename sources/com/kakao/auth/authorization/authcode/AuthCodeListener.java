package com.kakao.auth.authorization.authcode;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.AuthorizationResult;

public interface AuthCodeListener {
    static {
        Covode.recordClassIndex(33858);
    }

    void onAuthCodeReceived(int i, AuthorizationResult authorizationResult);
}
