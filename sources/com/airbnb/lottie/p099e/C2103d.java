package com.airbnb.lottie.p099e;

import com.airbnb.lottie.p099e.p101b.C2079n;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.d */
public final class C2103d {

    /* renamed from: a */
    public final List<C2079n> f6352a;

    /* renamed from: b */
    public final double f6353b;

    /* renamed from: c */
    public final double f6354c;

    /* renamed from: d */
    public final String f6355d;

    /* renamed from: e */
    private final char f6356e;

    /* renamed from: f */
    private final String f6357f;

    static {
        Covode.recordClassIndex(2298);
    }

    public final int hashCode() {
        return m6574a(this.f6356e, this.f6357f, this.f6355d);
    }

    /* renamed from: a */
    public static int m6574a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C2103d(List<C2079n> list, char c, double d, double d2, String str, String str2) {
        this.f6352a = list;
        this.f6356e = c;
        this.f6353b = d;
        this.f6354c = d2;
        this.f6355d = str;
        this.f6357f = str2;
    }
}
