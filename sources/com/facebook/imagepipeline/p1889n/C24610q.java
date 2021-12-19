package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1870h.C24313b;

/* renamed from: com.facebook.imagepipeline.n.q */
public final class C24610q {
    static {
        Covode.recordClassIndex(28754);
    }

    /* renamed from: a */
    private static int m47100a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            double pow = Math.pow(d, 2.0d);
            Double.isNaN(d);
            Double.isNaN(d);
            if ((1.0d / d) + ((1.0d / (pow - d)) * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: b */
    private static int m47103b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            if (d2 + (0.3333333432674408d * d2) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    private static int m47102a(C24364e eVar, C24456e eVar2) {
        boolean a = eVar.mo40165a();
        boolean z = false;
        if (!a) {
            return 0;
        }
        int d = eVar2.mo40305d();
        if (d == 0 || d == 90 || d == 180 || d == 270) {
            z = true;
        }
        C24091i.m45620a(z);
        return d;
    }

    /* renamed from: a */
    private static float m47099a(C24364e eVar, C24363d dVar, C24456e eVar2) {
        int i;
        int i2;
        C24091i.m45620a(C24456e.m46680c(eVar2));
        if (dVar == null || dVar.f57780b <= 0 || dVar.f57779a <= 0 || eVar2.mo40307f() == 0 || eVar2.mo40308g() == 0) {
            return 1.0f;
        }
        int a = m47102a(eVar, eVar2);
        if (a == 90 || a == 270) {
            i = eVar2.mo40308g();
            i2 = eVar2.mo40307f();
        } else {
            i = eVar2.mo40307f();
            i2 = eVar2.mo40308g();
        }
        float f = ((float) dVar.f57779a) / ((float) i);
        float f2 = ((float) dVar.f57780b) / ((float) i2);
        float max = Math.max(f, f2);
        C24099a.m45644a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f57779a), Integer.valueOf(dVar.f57780b), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    /* renamed from: a */
    public static int m47101a(C24364e eVar, C24363d dVar, C24456e eVar2, int i) {
        int a;
        float f;
        if (!C24456e.m46680c(eVar2)) {
            return 1;
        }
        float a2 = m47099a(eVar, dVar, eVar2);
        if (eVar2.mo40303c() == C24313b.f57651a) {
            a = m47103b(a2);
        } else {
            a = m47100a(a2);
        }
        int max = Math.max(eVar2.mo40308g(), eVar2.mo40307f());
        if (dVar != null) {
            f = dVar.f57781c;
        } else {
            f = (float) i;
        }
        while (((float) (max / a)) > f) {
            if (eVar2.mo40303c() == C24313b.f57651a) {
                a *= 2;
            } else {
                a++;
            }
        }
        return a;
    }
}
