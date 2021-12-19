package com.google.android.gms.internal.p1947f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.f.c */
final class C25737c implements AbstractC25736b {
    static {
        Covode.recordClassIndex(31152);
    }

    private C25737c() {
    }

    /* synthetic */ C25737c(byte b) {
        this();
    }

    @Override // com.google.android.gms.internal.p1947f.AbstractC25736b
    /* renamed from: a */
    public final ScheduledExecutorService mo41966a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService) C40780g.m82242a(a.mo70028a()));
    }
}
