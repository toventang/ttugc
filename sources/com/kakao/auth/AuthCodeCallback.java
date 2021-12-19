package com.kakao.auth;

import com.bytedance.covode.number.Covode;
import com.kakao.network.ErrorResult;

public abstract class AuthCodeCallback {
    static {
        Covode.recordClassIndex(33803);
    }

    public abstract void onAuthCodeFailure(ErrorResult errorResult);

    public abstract void onAuthCodeReceived(String str);
}
