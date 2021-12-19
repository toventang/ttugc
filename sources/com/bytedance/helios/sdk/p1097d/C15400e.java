package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.helios.sdk.d.e */
public class C15400e {

    /* renamed from: f */
    private static final String[] f37594f = {"start", "end", "sensitive", "tag"};

    /* renamed from: a */
    public final String f37595a;

    /* renamed from: b */
    final int f37596b;

    /* renamed from: c */
    final int f37597c;

    /* renamed from: d */
    public final String f37598d;

    /* renamed from: e */
    public final String f37599e;

    /* renamed from: a */
    public static String m28304a() {
        return "SensitiveApiException";
    }

    static {
        Covode.recordClassIndex(17652);
    }

    public String toString() {
        return "ApiConfig{id=" + this.f37595a + ", type=" + f37594f[this.f37596b] + ", actionId=" + this.f37597c + ", actionName=" + this.f37598d + "}";
    }

    public C15400e(String str, String str2, int i, String str3) {
        this(str, str2, i, str3, 2);
    }

    public C15400e(String str, String str2, int i, String str3, int i2) {
        this.f37595a = str;
        this.f37599e = str2;
        this.f37596b = i2;
        this.f37597c = i;
        this.f37598d = str3;
    }
}
