package com.facebook.imagepipeline.p1892q;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24085e;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.q.d */
public final class C24651d {

    /* renamed from: a */
    public static final C24085e<Integer> f58569a = C24085e.m45601of(2, 7, 4, 5);

    static {
        Covode.recordClassIndex(28801);
    }

    /* renamed from: a */
    private static int m47161a(C24456e eVar) {
        int d = eVar.mo40305d();
        if (d == 90 || d == 180 || d == 270) {
            return eVar.mo40305d();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m47160a(C24364e eVar, C24456e eVar2) {
        if (!eVar.mo40166b()) {
            return 0;
        }
        int a = m47161a(eVar2);
        if (eVar.mo40165a()) {
            return a;
        }
        return (a + eVar.mo40167c()) % 360;
    }

    /* renamed from: b */
    public static int m47162b(C24364e eVar, C24456e eVar2) {
        int e = eVar2.mo40306e();
        C24085e<Integer> eVar3 = f58569a;
        int indexOf = eVar3.indexOf(Integer.valueOf(e));
        if (indexOf >= 0) {
            int i = 0;
            if (!eVar.mo40165a()) {
                i = eVar.mo40167c();
            }
            return eVar3.get((indexOf + (i / 90)) % eVar3.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: a */
    private static float m47158a(C24363d dVar, int i, int i2) {
        if (dVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) dVar.f57779a) / f, ((float) dVar.f57780b) / f2);
        if (f * max > dVar.f57781c) {
            max = dVar.f57781c / f;
        }
        if (f2 * max > dVar.f57781c) {
            return dVar.f57781c / f2;
        }
        return max;
    }

    /* renamed from: a */
    public static int m47159a(C24364e eVar, C24363d dVar, C24456e eVar2, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || dVar == null) {
            return 8;
        }
        int a = m47160a(eVar, eVar2);
        if (f58569a.contains(Integer.valueOf(eVar2.mo40306e()))) {
            i = m47162b(eVar, eVar2);
        } else {
            i = 0;
        }
        if (a == 90 || a == 270 || i == 5 || i == 7) {
            i2 = eVar2.mo40308g();
            i3 = eVar2.mo40307f();
        } else {
            i2 = eVar2.mo40307f();
            i3 = eVar2.mo40308g();
        }
        int a2 = (int) (dVar.f57782d + (m47158a(dVar, i2, i3) * 8.0f));
        if (a2 > 8) {
            return 8;
        }
        if (a2 <= 0) {
            return 1;
        }
        return a2;
    }
}
