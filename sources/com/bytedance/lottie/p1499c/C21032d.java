package com.bytedance.lottie.p1499c;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C21008n;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.d */
public final class C21032d {

    /* renamed from: a */
    public final List<C21008n> f49908a;

    /* renamed from: b */
    public final double f49909b;

    /* renamed from: c */
    public final double f49910c;

    /* renamed from: d */
    public final String f49911d;

    /* renamed from: e */
    private final char f49912e;

    /* renamed from: f */
    private final String f49913f;

    static {
        Covode.recordClassIndex(24648);
    }

    public final int hashCode() {
        return m39600a(this.f49912e, this.f49913f, this.f49911d);
    }

    /* renamed from: a */
    public static int m39600a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C21032d(List<C21008n> list, char c, double d, double d2, String str, String str2) {
        this.f49908a = list;
        this.f49912e = c;
        this.f49909b = d;
        this.f49910c = d2;
        this.f49911d = str;
        this.f49913f = str2;
    }
}
