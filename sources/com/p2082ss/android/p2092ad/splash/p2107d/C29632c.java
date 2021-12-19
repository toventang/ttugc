package com.p2082ss.android.p2092ad.splash.p2107d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.AbstractC29536l;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29645h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.d.c */
public class C29632c {

    /* renamed from: a */
    private static volatile C29632c f70693a;

    /* renamed from: b */
    private volatile boolean f70694b;

    static {
        Covode.recordClassIndex(36028);
    }

    private C29632c() {
    }

    /* renamed from: a */
    public static C29632c m59652a() {
        MethodCollector.m26663i(9452);
        if (f70693a == null) {
            synchronized (C29632c.class) {
                try {
                    if (f70693a == null) {
                        f70693a = new C29632c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9452);
                    throw th;
                }
            }
        }
        C29632c cVar = f70693a;
        MethodCollector.m26664o(9452);
        return cVar;
    }

    /* renamed from: b */
    public final void mo51927b() {
        if (C29495h.f70208ae && C29495h.f70192P && C29495h.f70194R != null && C29645h.m59695b(C29495h.f70242r) && !this.f70694b) {
            this.f70694b = true;
            C29654j.m59748d();
            C29654j.m59744c();
            new AbstractC29536l() {
                /* class com.p2082ss.android.p2092ad.splash.p2107d.C29632c.C296331 */

                static {
                    Covode.recordClassIndex(36029);
                }

                @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                /* renamed from: a */
                public final void mo51363a() {
                }

                @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                /* renamed from: b */
                public final void mo51364b() {
                    C29375a.m58829a().mo51357a("service_real_time_request_result", 0, (JSONObject) null);
                }
            };
            this.f70694b = false;
        }
    }
}
