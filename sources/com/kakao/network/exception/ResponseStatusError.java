package com.kakao.network.exception;

import com.bytedance.covode.number.Covode;

public abstract class ResponseStatusError extends RuntimeException {
    static {
        Covode.recordClassIndex(33946);
    }

    public abstract int getErrorCode();

    public abstract String getErrorMsg();

    public abstract int getHttpStatusCode();

    public ResponseStatusError(String str) {
        super(str);
    }
}
