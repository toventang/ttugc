package com.p2082ss.android.ugc.aweme.net.p3495h.p3498b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.net.interceptor.C61399a;
import java.util.concurrent.TimeUnit;
import okhttp3.C90208y;

/* renamed from: com.ss.android.ugc.aweme.net.h.b.b */
public class C61372b {

    /* renamed from: a */
    private static volatile C90208y f139362a;

    static {
        Covode.recordClassIndex(72005);
    }

    /* renamed from: a */
    static C90208y m111110a(Context context) {
        MethodCollector.m26663i(4240);
        if (f139362a == null) {
            synchronized (C61372b.class) {
                try {
                    if (f139362a == null) {
                        C14711g.f35782a = C61374d.f139365a;
                        C14722o.m26957a(C17867d.f42590n, "34.102.215.99");
                        C14722o.m26949a(context);
                        if (C14722o.f35860i != null) {
                            C90208y.C90210a b = C14722o.f35860i.mo23715a().mo145086b();
                            b.f204935e.clear();
                            b.f204936f.clear();
                            b.mo145096a(new C61399a());
                            b.mo145096a(new C61376f());
                            f139362a = b.mo145100b(new C61371a()).mo145088a(500, TimeUnit.MILLISECONDS).mo145095a(new C61375e()).mo145103d();
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SsOkHttp3Client is not init !!!");
                            MethodCollector.m26664o(4240);
                            throw illegalArgumentException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4240);
                    throw th;
                }
            }
        }
        C90208y yVar = f139362a;
        MethodCollector.m26664o(4240);
        return yVar;
    }
}
