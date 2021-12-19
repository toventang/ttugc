package com.bytedance.apm.p788p;

import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.p.c */
public final class C12566c {

    /* renamed from: a */
    private volatile ExecutorService f30568a;

    static {
        Covode.recordClassIndex(14383);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.p.c$a */
    public static class C12568a {

        /* renamed from: a */
        static final C12566c f30570a = new C12566c((byte) 0);

        static {
            Covode.recordClassIndex(14385);
        }
    }

    /* renamed from: a */
    public static C12566c m22611a() {
        if (C12397c.f29933c) {
            return C12568a.f30570a;
        }
        return null;
    }

    private C12566c() {
        ThreadFactoryC125671 r2 = new ThreadFactory() {
            /* class com.bytedance.apm.p788p.C12566c.ThreadFactoryC125671 */

            static {
                Covode.recordClassIndex(14384);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apm_Log_Bypass_Store");
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f30568a = C40780g.m82242a(a.mo70028a());
    }

    /* synthetic */ C12566c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo20395a(Runnable runnable) {
        this.f30568a.submit(runnable);
    }
}
