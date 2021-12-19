package com.bytedance.ies.bullet.kit.lynx.p1153b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.b.b */
public final class C16389b {

    /* renamed from: a */
    public String f39376a = "unknown";

    /* renamed from: b */
    public String f39377b;

    /* renamed from: c */
    public final String f39378c;

    /* renamed from: d */
    public final int f39379d;

    static {
        Covode.recordClassIndex(18691);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{\"code\": ").append(this.f39379d).append(",\"msg\": ");
        String str = this.f39378c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(", \"templateLoadFrom\": ").append(this.f39376a).append(", \"templateFilePath\":");
        String str3 = this.f39377b;
        if (str3 != null) {
            str2 = str3;
        }
        return append2.append(str2).append(' ').toString();
    }

    public C16389b(String str, int i) {
        this.f39378c = str;
        this.f39379d = i;
    }
}
