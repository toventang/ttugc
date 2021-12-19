package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.C24456e;

/* renamed from: com.facebook.imagepipeline.n.bd */
public final class C24581bd {
    static {
        Covode.recordClassIndex(28725);
    }

    /* renamed from: a */
    public static boolean m47017a(C24456e eVar, C24363d dVar) {
        if (eVar == null) {
            return false;
        }
        int d = eVar.mo40305d();
        if (d == 90 || d == 270) {
            return m47016a(eVar.mo40308g(), eVar.mo40307f(), dVar);
        }
        return m47016a(eVar.mo40307f(), eVar.mo40308g(), dVar);
    }

    /* renamed from: a */
    public static boolean m47016a(int i, int i2, C24363d dVar) {
        if (dVar == null) {
            if (((float) ((int) (((float) i) * 1.3333334f))) < 2048.0f || ((int) (((float) i2) * 1.3333334f)) < 2048) {
                return false;
            }
            return true;
        } else if (((int) (((float) i) * 1.3333334f)) < dVar.f57779a || ((int) (((float) i2) * 1.3333334f)) < dVar.f57780b) {
            return false;
        } else {
            return true;
        }
    }
}
