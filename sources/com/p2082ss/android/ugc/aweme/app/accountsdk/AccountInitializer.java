package com.p2082ss.android.ugc.aweme.app.accountsdk;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.IAccountInitializer;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.AccountInitializer */
public final class AccountInitializer implements IAccountInitializer {
    static {
        Covode.recordClassIndex(40460);
    }

    /* renamed from: a */
    public static IAccountInitializer m68784a() {
        MethodCollector.m26663i(4595);
        Object a = C81908b.m141854a(IAccountInitializer.class, false);
        if (a != null) {
            IAccountInitializer iAccountInitializer = (IAccountInitializer) a;
            MethodCollector.m26664o(4595);
            return iAccountInitializer;
        }
        if (C81908b.f183129L == null) {
            synchronized (IAccountInitializer.class) {
                try {
                    if (C81908b.f183129L == null) {
                        C81908b.f183129L = new AccountInitializer();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4595);
                    throw th;
                }
            }
        }
        AccountInitializer accountInitializer = (AccountInitializer) C81908b.f183129L;
        MethodCollector.m26664o(4595);
        return accountInitializer;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountInitializer
    /* renamed from: a */
    public final void mo57063a(Application application) {
        C89219l.m154721d(application, "");
        C33577b bVar = new C33577b();
        C33578c cVar = new C33578c();
        C33587l lVar = new C33587l();
        C89219l.m154716b("api.tiktokv.com", "");
        C33571a aVar = new C33571a();
        C89219l.m154721d(application, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d("", "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d("api.tiktokv.com", "");
        C89219l.m154721d(aVar, "");
        C31291a.f74991a = application;
        C31291a.f74992b = bVar;
        C31291a.f74994d = lVar;
        C31291a.f74993c = cVar;
        C31291a.f74995e = new ConcurrentHashMap<>();
        C31291a.f74996f = aVar;
        C31291a.f74997g = "";
        C31291a.f74998h = "api.tiktokv.com";
    }
}
