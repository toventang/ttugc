package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.toutiao.proxyserver.net.c */
public final class C87360c {

    /* renamed from: a */
    public final String f198014a;

    /* renamed from: b */
    public final String f198015b;

    static {
        Covode.recordClassIndex(103257);
    }

    public final String toString() {
        return "HttpHeader{name='" + this.f198014a + '\'' + ", value='" + this.f198015b + '\'' + '}';
    }

    public C87360c(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() == 0 || trim2.length() == 0) {
            throw new IllegalArgumentException("name and value can't be empty");
        }
        this.f198014a = trim;
        this.f198015b = trim2;
    }
}
