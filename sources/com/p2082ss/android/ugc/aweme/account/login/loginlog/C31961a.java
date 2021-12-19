package com.p2082ss.android.ugc.aweme.account.login.loginlog;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.logging.LogManager;

/* renamed from: com.ss.android.ugc.aweme.account.login.loginlog.a */
public final class C31961a {

    /* renamed from: b */
    private static C31961a f76324b;

    /* renamed from: a */
    public ArrayList<LoginLog> f76325a = new ArrayList<>();

    static {
        Covode.recordClassIndex(38706);
    }

    /* renamed from: a */
    public static C31961a m66329a() {
        MethodCollector.m26663i(8228);
        if (f76324b == null) {
            synchronized (LogManager.class) {
                try {
                    if (f76324b == null) {
                        f76324b = new C31961a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8228);
                    throw th;
                }
            }
        }
        C31961a aVar = f76324b;
        MethodCollector.m26664o(8228);
        return aVar;
    }
}
