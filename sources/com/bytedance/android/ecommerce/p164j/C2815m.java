package com.bytedance.android.ecommerce.p164j;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.bytedance.android.ecommerce.p153a.p154a.C2735b;
import com.bytedance.android.ecommerce.p153a.p154a.C2736c;
import com.bytedance.android.ecommerce.p153a.p154a.C2737d;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p153a.p155b.C2741c;
import com.bytedance.android.ecommerce.p153a.p155b.C2742d;
import com.bytedance.android.ecommerce.p157c.AbstractC2766a;
import com.bytedance.android.ecommerce.p157c.AbstractC2770e;
import com.bytedance.android.ecommerce.p157c.AbstractC2771f;
import com.bytedance.android.ecommerce.p158d.C2772a;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.android.ecommerce.j.m */
public final class C2815m implements AbstractC2809h {

    /* renamed from: a */
    private final String f8407a = "RequestService";

    static {
        Covode.recordClassIndex(3241);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2809h
    /* renamed from: a */
    public final void mo7396a(final C2735b bVar, final AbstractC2766a aVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.android.ecommerce.p164j.C2815m.RunnableC28183 */

                static {
                    Covode.recordClassIndex(3244);
                }

                public final void run() {
                    C2815m.m8077b(bVar, aVar);
                }
            });
        } else {
            m8077b(bVar, aVar);
        }
    }

    /* renamed from: b */
    public static void m8078b(C2736c cVar, AbstractC2770e eVar) {
        Throwable th;
        String a = C2772a.m7959a("/payment/v1/pay");
        List<Pair<String, String>> a2 = cVar.mo7319a();
        C2741c cVar2 = new C2741c();
        try {
            C2741c cVar3 = new C2741c(C2778c.f8362a.mo7372d().f8327m.mo21869a(a, a2, cVar.f8156d));
            try {
                eVar.mo7352a(cVar3);
            } catch (Throwable th2) {
                th = th2;
                cVar2 = cVar3;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar2.f8194d = "exception";
            cVar2.f8195e = th.getLocalizedMessage();
            eVar.mo7352a(cVar2);
        }
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2809h
    /* renamed from: a */
    public final void mo7397a(final C2736c cVar, final AbstractC2770e eVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.android.ecommerce.p164j.C2815m.RunnableC28161 */

                static {
                    Covode.recordClassIndex(3242);
                }

                public final void run() {
                    C2815m.m8078b(cVar, eVar);
                }
            });
        } else {
            m8078b(cVar, eVar);
        }
    }

    /* renamed from: b */
    public static void m8079b(C2737d dVar, AbstractC2771f fVar) {
        System.currentTimeMillis();
        try {
            fVar.mo7353a(new C2742d(C2778c.f8362a.mo7372d().f8327m.mo21869a(C2772a.m7959a("/payment/v1/payment_details"), dVar.mo7319a(), dVar.f8156d)));
        } catch (Throwable th) {
            C2742d dVar2 = new C2742d();
            dVar2.f8210f = "exception";
            dVar2.f8211g = th.getLocalizedMessage();
            fVar.mo7353a(dVar2);
        }
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2809h
    /* renamed from: a */
    public final void mo7398a(final C2737d dVar, final AbstractC2771f fVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.android.ecommerce.p164j.C2815m.RunnableC28172 */

                static {
                    Covode.recordClassIndex(3243);
                }

                public final void run() {
                    C2815m.m8079b(dVar, fVar);
                }
            });
        } else {
            m8079b(dVar, fVar);
        }
    }

    /* renamed from: b */
    public static void m8077b(C2735b bVar, AbstractC2766a aVar) {
        MethodCollector.m26663i(3228);
        List<Pair<String, String>> a = bVar.mo7319a();
        Map<String, String> map = bVar.f8156d;
        try {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < a.size(); i++) {
                Pair<String, String> pair = a.get(i);
                sb.append(((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8"));
                if (i < a.size() - 1) {
                    sb.append("&");
                }
            }
            byte[] bytes = sb.toString().getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bytes);
            } catch (Throwable unused) {
            }
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Encoding", "gzip");
            map.put("Accept-Encoding", "gzip");
            aVar.mo7350a(true, "", new C2740b(C2778c.f8362a.mo7372d().f8327m.mo21871a(C2772a.m7959a("/payment/v1/get_bankcard_info_by_ocr"), byteArray, map)));
            MethodCollector.m26664o(3228);
        } catch (Throwable th) {
            th.getMessage();
            Log.getStackTraceString(th);
            aVar.mo7350a(false, th.getMessage(), null);
            MethodCollector.m26664o(3228);
        }
    }
}
