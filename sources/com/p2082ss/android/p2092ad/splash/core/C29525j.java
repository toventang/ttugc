package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.C29679r;
import com.p2082ss.android.p2092ad.splash.core.p2103h.C29501a;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2094b.C29381b;
import com.p2082ss.android.p2092ad.splash.p2107d.C29632c;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.j */
public final class C29525j {

    /* renamed from: a */
    private static volatile boolean f70334a;

    static {
        Covode.recordClassIndex(35919);
    }

    private C29525j() {
    }

    /* renamed from: a */
    private static ExecutorService m59175a() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    private static Context m59174a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static void m59176a(long j) {
        String str;
        C29644g.m59688b("SDK init duration: ".concat(String.valueOf(j)));
        JSONObject jSONObject = new JSONObject();
        try {
            if (C29495h.f70210ag) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
        C29375a.m58829a().mo51359a("service_sdk_init_duration", jSONObject);
    }

    /* renamed from: a */
    public static void m59177a(Context context, C29679r rVar) {
        MethodCollector.m26663i(12610);
        if (!f70334a) {
            synchronized (C29525j.class) {
                try {
                    if (!f70334a) {
                        long currentTimeMillis = System.currentTimeMillis();
                        m59178b(m59174a(context), rVar);
                        f70334a = true;
                        m59176a(System.currentTimeMillis() - currentTimeMillis);
                    }
                } finally {
                    MethodCollector.m26664o(12610);
                }
            }
            return;
        }
        MethodCollector.m26664o(12610);
    }

    /* renamed from: b */
    private static void m59178b(Context context, C29679r rVar) {
        ExecutorService a;
        ExecutorService a2;
        ExecutorService a3;
        C29495h.m59100a(context);
        if (rVar != null) {
            C29495h.m59101a(rVar.f70802n);
            C29495h.f70223at = C29627w.m59640a(rVar.f70806r);
            C29495h.f70240p = rVar.f70795g;
            if (rVar.f70789a != null) {
                a = rVar.f70789a;
            } else {
                a = m59175a();
            }
            C29495h.f70230f = a;
            if (rVar.f70790b != null) {
                a2 = rVar.f70790b;
            } else {
                a2 = m59175a();
            }
            C29495h.f70232h = a2;
            if (rVar.f70791c != null) {
                a3 = rVar.f70791c;
            } else {
                a3 = m59175a();
            }
            C29495h.f70233i = a3;
            C29501a.m59114a().mo51588a(rVar.f70792d);
            C29495h.f70192P = rVar.f70793e;
            C29495h.f70194R = rVar.f70794f;
            C29495h.f70197U = rVar.f70796h;
            C29495h.f70201Y = rVar.f70797i;
            C29495h.f70207ad = rVar.f70798j;
            C29495h.f70208ae = rVar.f70799k;
            C29495h.f70209af = rVar.f70800l;
            C29495h.f70210ag = rVar.f70801m;
            if (rVar.f70803o) {
                C29495h.m59097a(8);
            }
            C29495h.f70212ai = rVar.f70804p;
            C29495h.f70213aj = rVar.f70805q;
        } else {
            C29495h.f70230f = m59175a();
            C29495h.f70232h = m59175a();
            C29495h.f70233i = m59175a();
        }
        if (C29495h.f70208ae) {
            C29387a.m58870a();
            C29387a.m58871b();
            C29632c.m59652a().mo51927b();
            C29381b.m58846a().mo51365b();
        }
    }
}
