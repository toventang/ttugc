package com.p2082ss.android.ugc.aweme.p2433ca;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2726da.C40928a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ca.h */
public final class C35351h {

    /* renamed from: a */
    public static boolean f83390a;

    /* renamed from: b */
    public static final C35351h f83391b = new C35351h();

    private C35351h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ca.h$a */
    static final class RunnableC35352a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f83392a;

        static {
            Covode.recordClassIndex(42520);
        }

        RunnableC35352a(Runnable runnable) {
            this.f83392a = runnable;
        }

        public final void run() {
            this.f83392a.run();
        }
    }

    static {
        Covode.recordClassIndex(42519);
    }

    /* renamed from: a */
    public static boolean m72352a() {
        if (!C67214a.m119168r() || f83390a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m72351a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        if (!m72352a() || !C40928a.m82418a(new RunnableC35352a(runnable))) {
            runnable.run();
        }
    }
}
