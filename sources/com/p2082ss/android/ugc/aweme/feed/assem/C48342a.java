package com.p2082ss.android.ugc.aweme.feed.assem;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21478d;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49533w;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49535x;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.performance.C62845i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.a */
public final class C48342a {

    /* renamed from: a */
    public static boolean f112042a;

    /* renamed from: b */
    public static int f112043b;

    /* renamed from: c */
    static final Runnable f112044c = RunnableC48343a.f112047a;

    /* renamed from: d */
    public static final C48342a f112045d = new C48342a();

    /* renamed from: e */
    private static int f112046e;

    private C48342a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$a */
    static final class RunnableC48343a implements Runnable {

        /* renamed from: a */
        public static final RunnableC48343a f112047a = new RunnableC48343a();

        static {
            Covode.recordClassIndex(57115);
        }

        RunnableC48343a() {
        }

        public final void run() {
            C21478d.f50922d = false;
            C48342a.f112042a = false;
        }
    }

    static {
        Covode.recordClassIndex(57114);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.a$b */
    static final class RunnableC48344b implements Runnable {

        /* renamed from: a */
        public static final RunnableC48344b f112048a = new RunnableC48344b();

        static {
            Covode.recordClassIndex(57116);
        }

        RunnableC48344b() {
        }

        public final void run() {
            long j;
            C21478d.f50922d = true;
            C21478d.f50924f = 0;
            if (C49533w.m92774c()) {
                C58254p.m105190a().removeCallbacks(C48342a.f112044c);
                if (C62845i.m113257a()) {
                    j = 1200;
                } else {
                    j = 800;
                }
                if (C49533w.m92772a() == 3 || C49535x.f113918a) {
                    j += 700;
                }
                C58254p.m105190a().postDelayed(C48342a.f112044c, j);
            }
        }
    }

    /* renamed from: a */
    public static void m91803a() {
        if (f112046e >= 2 && C49533w.m92774c()) {
            C58254p.m105190a().removeCallbacks(f112044c);
            f112042a = true;
            C58254p.m105190a().postAtFrontOfQueue(RunnableC48344b.f112048a);
        }
    }

    /* renamed from: a */
    public static final void m91804a(int i) {
        f112043b = 0;
        f112042a = false;
        f112046e = i;
    }
}
