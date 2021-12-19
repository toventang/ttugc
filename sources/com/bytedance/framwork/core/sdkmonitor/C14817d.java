package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.d */
public final class C14817d extends Exception {
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(16918);
    }

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C14817d(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
