package com.p2082ss.ugc.aweme.performance.core.monitor.p4436e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ScheduledExecutorService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.e.b */
public final class C86677b implements AbstractC86676a {

    /* renamed from: a */
    public static final C86677b f195379a = new C86677b();

    /* renamed from: b */
    private static AbstractC86676a f195380b;

    /* renamed from: c */
    private static ScheduledExecutorService f195381c;

    private C86677b() {
    }

    static {
        Covode.recordClassIndex(101905);
    }

    /* renamed from: a */
    private static ScheduledExecutorService m150151a() {
        return (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(4).mo70028a());
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4436e.AbstractC86676a
    /* renamed from: a */
    public final void mo137953a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        AbstractC86676a aVar = f195380b;
        if (aVar != null) {
            aVar.mo137953a(runnable);
            return;
        }
        if (f195381c == null) {
            f195381c = m150151a();
        }
        ScheduledExecutorService scheduledExecutorService = f195381c;
        if (scheduledExecutorService == null) {
            C89219l.m154707a();
        }
        scheduledExecutorService.submit(runnable);
    }
}
