package com.bytedance.android.p126a.p127a.p130c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.c.a */
public final class C2620a {

    /* renamed from: a */
    public static ExecutorService f7870a;

    static {
        Covode.recordClassIndex(3008);
    }

    /* renamed from: a */
    private static ExecutorService m7587a() {
        MethodCollector.m26663i(2978);
        if (f7870a == null) {
            synchronized (C2620a.class) {
                try {
                    if (f7870a == null) {
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                        a.f95505c = 1;
                        f7870a = C40780g.m82242a(a.mo70028a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2978);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f7870a;
        MethodCollector.m26664o(2978);
        return executorService;
    }

    /* renamed from: a */
    public static void m7588a(AbstractRunnableC2622c cVar) {
        m7587a().execute(cVar);
    }
}
