package com.p2082ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.x */
public final class C81890x {

    /* renamed from: a */
    static ExecutorService f183054a;

    /* renamed from: b */
    static Deque<Runnable> f183055b = new LinkedList();

    /* renamed from: c */
    static volatile boolean f183056c = false;

    /* renamed from: d */
    private static volatile int f183057d = 0;

    static {
        Covode.recordClassIndex(95304);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        f183054a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    static synchronized void m141792a() {
        synchronized (C81890x.class) {
            MethodCollector.m26663i(11921);
            if (f183056c) {
                MethodCollector.m26664o(11921);
                return;
            }
            try {
                if (f183057d != 0) {
                    while (f183055b.size() > 0) {
                        f183055b.pop().run();
                    }
                    f183056c = true;
                }
                MethodCollector.m26664o(11921);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                MethodCollector.m26664o(11921);
            }
        }
    }

    /* renamed from: a */
    public static void m141794a(Runnable runnable) {
        f183054a.execute(new RunnableC81891y(runnable));
    }

    /* renamed from: a */
    static void m141793a(int i) {
        f183057d = i;
        if (i == 2 || i == 3) {
            f183054a.execute(RunnableC81892z.f183059a);
        } else if (i == 4) {
            m141792a();
        }
    }
}
