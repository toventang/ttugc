package com.p2082ss.android.ugc.aweme.app;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.C52928h;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.main.p3430d.C59076b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3060i.C53429a;
import com.p2082ss.android.ugc.aweme.p3060i.RunnableC53431b;
import com.p2082ss.android.ugc.aweme.splash.C75230a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80618c;

/* renamed from: com.ss.android.ugc.aweme.app.o */
public class C33836o {

    /* renamed from: b */
    private static C33836o f80093b;

    /* renamed from: a */
    public C52928h f80094a;

    static {
        Covode.recordClassIndex(40736);
    }

    /* renamed from: a */
    public static C33836o m69201a() {
        MethodCollector.m26663i(5997);
        if (f80093b == null) {
            synchronized (C33836o.class) {
                try {
                    if (f80093b == null) {
                        f80093b = new C33836o();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5997);
                    throw th;
                }
            }
        }
        C33836o oVar = f80093b;
        MethodCollector.m26664o(5997);
        return oVar;
    }

    private C33836o() {
        Application a = C17879g.m33104a();
        if (a != null) {
            this.f80094a = new C52928h(a);
            C40780g.m82245b().execute(new RunnableC53431b(C53429a.m98598c()));
            if (!C58195d.m105111d()) {
                C53429a.m98598c().mo89996a(C80618c.m139773c());
            }
            C53429a.m98598c().mo89996a(C59076b.f134473b);
            this.f80094a.f121707d = C53429a.m98598c();
            this.f80094a.f121708e = C75230a.f169141a;
        }
    }
}
