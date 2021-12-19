package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.p2248g.AbstractC31671a;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.m */
public class C32231m {

    /* renamed from: a */
    public static final Object f76903a = new Object();

    /* renamed from: c */
    private static volatile C32231m f76904c;

    /* renamed from: b */
    public AbstractC31671a f76905b;

    private C32231m() {
    }

    static {
        Covode.recordClassIndex(38996);
    }

    /* renamed from: a */
    public static C32231m m66598a() {
        MethodCollector.m26663i(10085);
        if (f76904c == null) {
            synchronized (C32231m.class) {
                try {
                    if (f76904c == null) {
                        f76904c = new C32231m();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10085);
                    throw th;
                }
            }
        }
        C32231m mVar = f76904c;
        MethodCollector.m26664o(10085);
        return mVar;
    }

    /* renamed from: a */
    public final void mo58245a(C31672b bVar) {
        MethodCollector.m26663i(10248);
        synchronized (f76903a) {
            try {
                AbstractC31671a aVar = this.f76905b;
                if (aVar != null) {
                    aVar.onComplete(bVar);
                    this.f76905b = null;
                }
            } finally {
                MethodCollector.m26664o(10248);
            }
        }
    }
}
