package com.bytedance.p890c.p891a.p892a.p893a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.c.a.a.a.e */
public final class C13472e extends Exception {
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(15480);
    }

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C13472e(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
