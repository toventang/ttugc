package com.google.android.gms.internal.p1946e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.e.f */
final class C25733f implements AbstractC25732e {
    static {
        Covode.recordClassIndex(31148);
    }

    private C25733f() {
    }

    @Override // com.google.android.gms.internal.p1946e.AbstractC25732e
    /* renamed from: a */
    public final ScheduledExecutorService mo41964a() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        return Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService) C40780g.m82242a(a.mo70028a()));
    }

    /* synthetic */ C25733f(byte b) {
        this();
    }
}
