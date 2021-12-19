package com.airbnb.lottie.p099e.p102c;

import com.C1764a;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2057j;
import com.airbnb.lottie.p099e.p100a.C2058k;
import com.airbnb.lottie.p099e.p100a.C2059l;
import com.airbnb.lottie.p099e.p101b.AbstractC2064b;
import com.airbnb.lottie.p099e.p101b.C2069g;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Locale;

/* renamed from: com.airbnb.lottie.e.c.d */
public final class C2094d {

    /* renamed from: a */
    public final List<AbstractC2064b> f6307a;

    /* renamed from: b */
    public final C2044e f6308b;

    /* renamed from: c */
    public final String f6309c;

    /* renamed from: d */
    public final long f6310d;

    /* renamed from: e */
    public final EnumC2095a f6311e;

    /* renamed from: f */
    public final long f6312f;

    /* renamed from: g */
    public final String f6313g;

    /* renamed from: h */
    public final List<C2069g> f6314h;

    /* renamed from: i */
    public final C2059l f6315i;

    /* renamed from: j */
    public final int f6316j;

    /* renamed from: k */
    public final int f6317k;

    /* renamed from: l */
    public final int f6318l;

    /* renamed from: m */
    public final float f6319m;

    /* renamed from: n */
    public final int f6320n;

    /* renamed from: o */
    public final int f6321o;

    /* renamed from: p */
    public final C2057j f6322p;

    /* renamed from: q */
    public final C2058k f6323q;

    /* renamed from: r */
    public final C2049b f6324r;

    /* renamed from: s */
    public final List<C2202a<Float>> f6325s;

    /* renamed from: t */
    public final EnumC2096b f6326t;

    /* renamed from: u */
    private final float f6327u;

    static {
        Covode.recordClassIndex(2289);
    }

    public final String toString() {
        return mo5973a("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo5972a() {
        return this.f6327u / this.f6308b.mo5945b();
    }

    /* renamed from: com.airbnb.lottie.e.c.d$b */
    public enum EnumC2096b {
        None,
        Add,
        Invert,
        Unknown;

        static {
            Covode.recordClassIndex(2291);
        }
    }

    /* renamed from: com.airbnb.lottie.e.c.d$a */
    public enum EnumC2095a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown;

        static {
            Covode.recordClassIndex(2290);
        }
    }

    /* renamed from: a */
    public final String mo5973a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(this.f6309c).append("\n");
        C2094d a = this.f6308b.mo5942a(this.f6312f);
        if (a != null) {
            sb.append("\t\tParents: ").append(a.f6309c);
            C2094d a2 = this.f6308b.mo5942a(a.f6312f);
            while (a2 != null) {
                sb.append("->").append(a2.f6309c);
                a2 = this.f6308b.mo5942a(a2.f6312f);
            }
            sb.append(str).append("\n");
        }
        if (!this.f6314h.isEmpty()) {
            sb.append(str).append("\tMasks: ").append(this.f6314h.size()).append("\n");
        }
        if (!(this.f6316j == 0 || this.f6317k == 0)) {
            sb.append(str).append("\tBackground: ").append(C1764a.m5929a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f6316j), Integer.valueOf(this.f6317k), Integer.valueOf(this.f6318l)}));
        }
        if (!this.f6307a.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            for (AbstractC2064b bVar : this.f6307a) {
                sb.append(str).append("\t\t").append(bVar).append("\n");
            }
        }
        return sb.toString();
    }

    public C2094d(List<AbstractC2064b> list, C2044e eVar, String str, long j, EnumC2095a aVar, long j2, String str2, List<C2069g> list2, C2059l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C2057j jVar, C2058k kVar, List<C2202a<Float>> list3, EnumC2096b bVar, C2049b bVar2) {
        this.f6307a = list;
        this.f6308b = eVar;
        this.f6309c = str;
        this.f6310d = j;
        this.f6311e = aVar;
        this.f6312f = j2;
        this.f6313g = str2;
        this.f6314h = list2;
        this.f6315i = lVar;
        this.f6316j = i;
        this.f6317k = i2;
        this.f6318l = i3;
        this.f6319m = f;
        this.f6327u = f2;
        this.f6320n = i4;
        this.f6321o = i5;
        this.f6322p = jVar;
        this.f6323q = kVar;
        this.f6325s = list3;
        this.f6326t = bVar;
        this.f6324r = bVar2;
    }
}
