package com.kakao.auth.exception;

import com.bytedance.covode.number.Covode;

public class KakaoWebviewException extends Throwable {
    private final String message;

    static {
        Covode.recordClassIndex(33885);
    }

    public String getMessage() {
        return this.message;
    }

    public KakaoWebviewException(int i, String str, String str2) {
        StringBuilder append = new StringBuilder("code = ").append(i);
        if (str != null) {
            append.append(", msg = ").append(str);
        }
        if (str2 != null) {
            append.append(", url = ").append(str2);
        }
        this.message = append.toString();
    }
}
