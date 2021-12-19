package com.p2082ss.android.ugc.aweme.net.p3495h.p3498b;

import android.content.Context;
import android.util.Log;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.experiment.C46803ct;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3495h.C61363a;
import okhttp3.C90022aa;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.b.c */
public final /* synthetic */ class RunnableC61373c implements Runnable {

    /* renamed from: a */
    private final String f139363a;

    /* renamed from: b */
    private final Context f139364b;

    static {
        Covode.recordClassIndex(72006);
    }

    public RunnableC61373c(String str, Context context) {
        this.f139363a = str;
        this.f139364b = context;
    }

    public final void run() {
        MethodCollector.m26663i(3407);
        String str = this.f139363a;
        Context context = this.f139364b;
        System.currentTimeMillis();
        if (C46803ct.m90142a()) {
            C58945a.C58947b.f134185a.mo96423a("feed_boot_to_ok_pre_connection", System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_pre_connection_duration", false);
            C12397c.m22280a(context);
            try {
                C90022aa.m156235a(C61372b.m111110a(context), new Request.C90016a().mo144691a(str).mo144698a(), false).mo144709b();
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            synchronized (C61363a.f139360c) {
                try {
                    C61363a.f139358a = true;
                    C61363a.f139360c.notifyAll();
                } catch (Throwable th2) {
                    MethodCollector.m26664o(3407);
                    throw th2;
                }
            }
            C58945a.C58947b.f134185a.mo96429b("feed_ok_pre_connection_duration", false);
        }
        System.currentTimeMillis();
        MethodCollector.m26664o(3407);
    }
}
