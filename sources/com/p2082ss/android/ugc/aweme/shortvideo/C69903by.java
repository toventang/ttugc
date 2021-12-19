package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.by */
public final class C69903by {

    /* renamed from: a */
    public static final C69903by f156186a = new C69903by();

    private C69903by() {
    }

    static {
        Covode.recordClassIndex(82312);
    }

    /* renamed from: a */
    public static final long m123467a(C69905c cVar, String str) {
        C89219l.m154721d(cVar, "");
        long b = (long) C63238c.f143581h.mo101542b(str);
        if (cVar.getPresenterDuration() <= 0) {
            return b;
        }
        long presenterDuration = (long) cVar.getPresenterDuration();
        return Math.abs(b - presenterDuration) >= 1000 ? presenterDuration : b;
    }
}
