package com.p2082ss.android.ugc.aweme.account;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IPreLoginHandleService;
import com.p2082ss.android.ugc.aweme.app.C33569ac;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.PreLoginHandleService */
public final class PreLoginHandleService implements IPreLoginHandleService {
    static {
        Covode.recordClassIndex(38078);
    }

    /* renamed from: a */
    public static IPreLoginHandleService m65588a() {
        MethodCollector.m26663i(10801);
        Object a = C81908b.m141854a(IPreLoginHandleService.class, false);
        if (a != null) {
            IPreLoginHandleService iPreLoginHandleService = (IPreLoginHandleService) a;
            MethodCollector.m26664o(10801);
            return iPreLoginHandleService;
        }
        if (C81908b.f183416y == null) {
            synchronized (IPreLoginHandleService.class) {
                try {
                    if (C81908b.f183416y == null) {
                        C81908b.f183416y = new PreLoginHandleService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10801);
                    throw th;
                }
            }
        }
        PreLoginHandleService preLoginHandleService = (PreLoginHandleService) C81908b.f183416y;
        MethodCollector.m26664o(10801);
        return preLoginHandleService;
    }

    @Override // com.p2082ss.android.ugc.aweme.IPreLoginHandleService
    /* renamed from: a */
    public final Intent mo57229a(Activity activity, Intent intent, String str) {
        C89219l.m154721d(activity, "");
        return C33569ac.C33570a.m68782a(activity, intent, str);
    }
}
