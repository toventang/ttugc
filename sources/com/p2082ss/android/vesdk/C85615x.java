package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.x */
public final class C85615x extends RuntimeException {

    /* renamed from: a */
    private int f191932a;

    /* renamed from: b */
    private String f191933b;

    static {
        Covode.recordClassIndex(99799);
    }

    public final String getMsgDes() {
        return this.f191933b;
    }

    public final int getRetCd() {
        return this.f191932a;
    }

    public C85615x(int i, String str) {
        super("VESDK exception ret: " + i + "msg: " + str);
        this.f191932a = i;
        this.f191933b = str;
    }
}
