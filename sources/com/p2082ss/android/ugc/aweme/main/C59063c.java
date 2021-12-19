package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.main.p3429c.C59065b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.main.c */
public class C59063c {

    /* renamed from: c */
    private static C59063c f134454c;

    /* renamed from: a */
    public boolean f134455a;

    /* renamed from: b */
    public boolean f134456b;

    static {
        Covode.recordClassIndex(69409);
    }

    /* renamed from: a */
    public static C59063c m108543a() {
        MethodCollector.m26663i(11430);
        if (f134454c == null) {
            synchronized (C59063c.class) {
                try {
                    if (f134454c == null) {
                        f134454c = new C59063c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11430);
                    throw th;
                }
            }
        }
        C59063c cVar = f134454c;
        MethodCollector.m26664o(11430);
        return cVar;
    }

    /* renamed from: a */
    public final void mo96594a(boolean z) {
        if (this.f134456b != z) {
            this.f134456b = z;
            AbstractC81915c.m141874a(new C59065b());
        }
    }
}
