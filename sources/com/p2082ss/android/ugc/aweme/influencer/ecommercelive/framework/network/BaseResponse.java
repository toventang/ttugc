package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse */
public final class BaseResponse<T> {
    @AbstractC27891c(mo46611a = "code")
    private int code = -1;
    @AbstractC27891c(mo46611a = "data")
    private T data;
    @AbstractC27891c(mo46611a = "msg")
    private final String message = "";

    static {
        Covode.recordClassIndex(66498);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(T t) {
        this.data = t;
    }
}
