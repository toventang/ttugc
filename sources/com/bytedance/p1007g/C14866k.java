package com.bytedance.p1007g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.g.k */
public final class C14866k {

    /* renamed from: a */
    static ScheduledExecutorService f36305a;

    static {
        Covode.recordClassIndex(16967);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        f36305a = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static Future m27292a(Runnable runnable) {
        return f36305a.submit(runnable);
    }

    /* renamed from: a */
    public static Future m27293a(Runnable runnable, long j) {
        return f36305a.scheduleWithFixedDelay(runnable, j, 3600000, TimeUnit.MILLISECONDS);
    }
}
