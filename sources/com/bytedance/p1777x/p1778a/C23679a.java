package com.bytedance.p1777x.p1778a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.x.a.a */
public final class C23679a extends Exception {
    public final String url;

    static {
        Covode.recordClassIndex(27781);
    }

    public C23679a(String str, Throwable th) {
        super("fetch failed ".concat(String.valueOf(str)), th);
        this.url = str;
    }
}
