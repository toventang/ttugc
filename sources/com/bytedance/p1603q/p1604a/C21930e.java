package com.bytedance.p1603q.p1604a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.q.a.e */
public final class C21930e extends RuntimeException {

    /* renamed from: a */
    private int f51915a;

    static {
        Covode.recordClassIndex(25596);
    }

    public final int getCode() {
        return this.f51915a;
    }

    public C21930e(String str, Throwable th) {
        super(str, th);
    }

    public C21930e(int i, String str, Throwable th) {
        super(str + ":[code:" + i + "]", th);
        this.f51915a = i;
    }
}
