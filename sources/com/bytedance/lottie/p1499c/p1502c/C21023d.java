package com.bytedance.lottie.p1499c.p1502c;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20986j;
import com.bytedance.lottie.p1499c.p1500a.C20987k;
import com.bytedance.lottie.p1499c.p1500a.C20988l;
import com.bytedance.lottie.p1499c.p1501b.AbstractC20993b;
import com.bytedance.lottie.p1499c.p1501b.C20998g;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.lottie.c.c.d */
public final class C21023d {

    /* renamed from: a */
    public final List<AbstractC20993b> f49863a;

    /* renamed from: b */
    public final C21088g f49864b;

    /* renamed from: c */
    public final String f49865c;

    /* renamed from: d */
    public final long f49866d;

    /* renamed from: e */
    public final EnumC21024a f49867e;

    /* renamed from: f */
    public final long f49868f;

    /* renamed from: g */
    public final String f49869g;

    /* renamed from: h */
    public final List<C20998g> f49870h;

    /* renamed from: i */
    public final C20988l f49871i;

    /* renamed from: j */
    public final int f49872j;

    /* renamed from: k */
    public final int f49873k;

    /* renamed from: l */
    public final int f49874l;

    /* renamed from: m */
    public final float f49875m;

    /* renamed from: n */
    final float f49876n;

    /* renamed from: o */
    public final int f49877o;

    /* renamed from: p */
    public final int f49878p;

    /* renamed from: q */
    public final C20986j f49879q;

    /* renamed from: r */
    public final C20987k f49880r;

    /* renamed from: s */
    public final C20978b f49881s;

    /* renamed from: t */
    public final List<C21089a<Float>> f49882t;

    /* renamed from: u */
    public final EnumC21025b f49883u;

    static {
        Covode.recordClassIndex(24639);
    }

    public final String toString() {
        return mo34500a("");
    }

    /* renamed from: com.bytedance.lottie.c.c.d$b */
    public enum EnumC21025b {
        None,
        Add,
        Invert,
        Unknown;

        static {
            Covode.recordClassIndex(24641);
        }
    }

    /* renamed from: com.bytedance.lottie.c.c.d$a */
    public enum EnumC21024a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown;

        static {
            Covode.recordClassIndex(24640);
        }
    }

    /* renamed from: a */
    public final String mo34500a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(this.f49865c).append("\n");
        C21023d a = this.f49864b.mo34560a(this.f49868f);
        if (a != null) {
            sb.append("\t\tParents: ").append(a.f49865c);
            C21023d a2 = this.f49864b.mo34560a(a.f49868f);
            while (a2 != null) {
                sb.append("->").append(a2.f49865c);
                a2 = this.f49864b.mo34560a(a2.f49868f);
            }
            sb.append(str).append("\n");
        }
        if (!this.f49870h.isEmpty()) {
            sb.append(str).append("\tMasks: ").append(this.f49870h.size()).append("\n");
        }
        if (!(this.f49872j == 0 || this.f49873k == 0)) {
            sb.append(str).append("\tBackground: ").append(C1764a.m5929a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f49872j), Integer.valueOf(this.f49873k), Integer.valueOf(this.f49874l)}));
        }
        if (!this.f49863a.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            for (AbstractC20993b bVar : this.f49863a) {
                sb.append(str).append("\t\t").append(bVar).append("\n");
            }
        }
        return sb.toString();
    }

    public C21023d(List<AbstractC20993b> list, C21088g gVar, String str, long j, EnumC21024a aVar, long j2, String str2, List<C20998g> list2, C20988l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C20986j jVar, C20987k kVar, List<C21089a<Float>> list3, EnumC21025b bVar, C20978b bVar2) {
        this.f49863a = list;
        this.f49864b = gVar;
        this.f49865c = str;
        this.f49866d = j;
        this.f49867e = aVar;
        this.f49868f = j2;
        this.f49869g = str2;
        this.f49870h = list2;
        this.f49871i = lVar;
        this.f49872j = i;
        this.f49873k = i2;
        this.f49874l = i3;
        this.f49875m = f;
        this.f49876n = f2;
        this.f49877o = i4;
        this.f49878p = i5;
        this.f49879q = jVar;
        this.f49880r = kVar;
        this.f49882t = list3;
        this.f49883u = bVar;
        this.f49881s = bVar2;
    }
}
