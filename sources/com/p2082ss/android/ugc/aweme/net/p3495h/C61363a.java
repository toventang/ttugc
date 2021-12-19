package com.p2082ss.android.ugc.aweme.net.p3495h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61367d;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.a */
public final class C61363a implements AbstractC90202u {

    /* renamed from: a */
    public static volatile boolean f139358a;

    /* renamed from: b */
    public static volatile boolean f139359b;

    /* renamed from: c */
    public static Object f139360c = new Object();

    static {
        Covode.recordClassIndex(71996);
    }

    /* renamed from: a */
    private static boolean m111101a(Request request) {
        if (request == null || request.url() == null || !C48331e.m91791a(request.url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        MethodCollector.m26663i(4348);
        long currentTimeMillis = System.currentTimeMillis();
        Request a = aVar.mo144856a();
        if (!f139358a && m111101a(a)) {
            synchronized (f139360c) {
                try {
                    if (!f139358a) {
                        try {
                            f139360c.wait(1000);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            f139358a = true;
                            MethodCollector.m26664o(4348);
                            throw th;
                        }
                        f139358a = true;
                    }
                } catch (Throwable th2) {
                    MethodCollector.m26664o(4348);
                    throw th2;
                }
            }
        }
        System.currentTimeMillis();
        if (C61367d.m111106a(a)) {
            C58945a.C58947b.f134185a.mo96423a("ensure_connection_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        }
        Request a2 = aVar.mo144856a();
        if (f139359b || !m111101a(a2)) {
            C90029ac a3 = aVar.mo144857a(aVar.mo144856a());
            MethodCollector.m26664o(4348);
            return a3;
        }
        C90029ac a4 = C61370b.m111109a(aVar, "preload timeout");
        MethodCollector.m26664o(4348);
        return a4;
    }
}
