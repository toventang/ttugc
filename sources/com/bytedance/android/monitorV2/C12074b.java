package com.bytedance.android.monitorV2;

import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.monitorV2.p728a.AbstractC12070e;
import com.bytedance.android.monitorV2.p728a.AbstractC12072g;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.p740l.C12135k;
import com.bytedance.android.monitorV2.webview.AbstractC12190b;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.b */
public class C12074b implements AbstractC12070e {

    /* renamed from: b */
    private static final Set<String> f28928b = new HashSet(Arrays.asList("jsbError", "fetchError", "nativeError", "jsbPerf", "custom"));

    /* renamed from: c */
    private static AtomicInteger f28929c = new AtomicInteger(0);

    /* renamed from: d */
    private static AbstractC12190b f28930d;

    /* renamed from: e */
    private static JSONObject f28931e = new JSONObject();

    /* renamed from: f */
    private static String f28932f = "";

    /* renamed from: g */
    private static String f28933g = "";

    /* renamed from: a */
    protected AbstractC12190b f28934a;

    static {
        Covode.recordClassIndex(13803);
    }

    public C12074b(AbstractC12190b bVar) {
        this.f28934a = bVar;
    }

    /* renamed from: a */
    private static String m21491a(String str) {
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500);
    }

    /* renamed from: b */
    private static boolean m21498b(String str) {
        if ("jsbPerf".equals(str) || "custom".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12070e
    /* renamed from: a */
    public final void mo19421a(final AbstractC12072g gVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C12093a.m21522a().submit(new Runnable() {
                /* class com.bytedance.android.monitorV2.C12074b.RunnableC120751 */

                static {
                    Covode.recordClassIndex(13804);
                }

                public final void run() {
                    C12074b.m21492a(gVar, C12074b.this.f28934a);
                }
            });
        } else {
            m21492a(gVar, this.f28934a);
        }
    }

    /* renamed from: a */
    public static void m21493a(C12084d dVar) {
        C12115b.m21583b("DataMonitor", "monitorCustom: ".concat(String.valueOf(dVar)));
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (dVar.f28953d != null) {
                C12130f.m21651a(jSONObject, "client_category", dVar.f28953d);
            }
            if (dVar.f28954e != null) {
                C12130f.m21651a(jSONObject, "client_metric", dVar.f28954e);
            }
            if (dVar.f28955f != null) {
                C12130f.m21652a(dVar.f28955f, "event_name", dVar.f28952c);
                C12130f.m21652a(dVar.f28955f, "sdk_version", "1.2.0-alpha.4");
                C12130f.m21651a(jSONObject, "client_extra", dVar.f28955f);
            }
            if (dVar.f28957h != null) {
                C12130f.m21651a(jSONObject, "client_timing", dVar.f28957h);
            }
            if (dVar.f28959j != null) {
                C12130f.m21651a(jSONObject, "nativeBase", dVar.f28959j);
            }
            if (dVar.f28960k != null) {
                C12130f.m21651a(jSONObject, "containerBase", dVar.f28960k);
            }
            if (dVar.f28961l != null) {
                C12130f.m21651a(jSONObject, "jsBase", dVar.f28961l);
            }
            C12130f.m21651a(jSONObject, "bid_info", dVar.f28956g);
            String str = dVar.f28950a;
            C12130f.m21652a(jSONObject, "url", str);
            if (str != null) {
                C12130f.m21652a(jSONObject, "host", C12135k.m21668b(str));
                C12130f.m21652a(jSONObject, "path", C12135k.m21667a(str));
            }
            C12130f.m21652a(jSONObject, "ev_type", "custom");
            C12130f.m21653a(jSONObject, dVar.f28958i);
            if (!TextUtils.isEmpty(dVar.f28962m)) {
                C12130f.m21652a(jSONObject, "virtual_aid", dVar.f28962m);
            }
            m21494a(dVar.f28964o, jSONObject, "custom");
        }
    }

    /* renamed from: a */
    private static boolean m21496a(JSONObject jSONObject, String str) {
        try {
            JSONObject d = C12130f.m21658d(jSONObject, "extra");
            String c = C12130f.m21657c(d, "virtual_aid");
            if (TextUtils.isEmpty(c)) {
                c = C12130f.m21657c(C12130f.m21658d(d, "nativeBase"), "virtual_aid");
            }
            if (TextUtils.isEmpty(c)) {
                c = "default";
            }
            C12077c a = C12077c.m21502a();
            if (!TextUtils.isEmpty(c)) {
                if (!TextUtils.isEmpty(str)) {
                    Set<String> set = a.f28941a.get(c);
                    if (set != null) {
                        if (!set.contains("all")) {
                            if (!set.contains(str)) {
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return true;
        }
    }

    /* renamed from: a */
    public static void m21492a(AbstractC12072g gVar, AbstractC12190b bVar) {
        if (gVar == null) {
            throw new NullPointerException("data should not be null");
        } else if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                C12130f.m21652a(jSONObject, "event_type", gVar.mo19427h());
                if (gVar.mo19420b() != null) {
                    C12130f.m21651a(jSONObject, "nativeBase", gVar.mo19420b().mo19416a());
                }
                if (gVar.mo19424e() != null) {
                    C12130f.m21651a(jSONObject, "nativeInfo", gVar.mo19424e().mo19416a());
                }
                if (gVar.mo19422c() != null) {
                    C12130f.m21651a(jSONObject, "jsInfo", gVar.mo19422c());
                }
                if (gVar.mo19423d() != null) {
                    C12130f.m21651a(jSONObject, "jsBase", gVar.mo19423d());
                }
                if (gVar.mo19426g() != null) {
                    C12130f.m21651a(jSONObject, "containerBase", gVar.mo19426g().mo19416a());
                }
                if (gVar.mo19425f() != null) {
                    C12130f.m21651a(jSONObject, "containerInfo", gVar.mo19425f().mo19416a());
                }
                m21495a(bVar, jSONObject, gVar.mo19427h(), gVar.mo19428i());
            } catch (Throwable unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: a */
    private static void m21494a(AbstractC12190b bVar, JSONObject jSONObject, String str) {
        if (bVar != null) {
            try {
                m21495a(bVar, jSONObject, str, "");
            } catch (Throwable th) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
                C12115b.m21584c("DataMonitor", "monitorCustom error: " + th.getMessage());
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: c */
    private static void m21499c(AbstractC12190b bVar, JSONObject jSONObject, String str, String str2) {
        f28930d = bVar;
        f28931e = jSONObject;
        f28933g = str;
        f28932f = str2;
    }

    /* renamed from: b */
    private static void m21497b(AbstractC12190b bVar, JSONObject jSONObject, String str, String str2) {
        m21499c(bVar, jSONObject, str, str2);
        JSONObject jSONObject2 = new JSONObject();
        C12130f.m21651a(jSONObject2, "extra", jSONObject);
        HybridMultiMonitor.getInstance().notifyReportInterceptor("bd_hybrid_monitor_service_all_in_one", str, str2, jSONObject2);
        if (bVar != null && m21496a(jSONObject2, "bd_hybrid_monitor_service_all_in_one")) {
            bVar.mo19564a("bd_hybrid_monitor_service_all_in_one", jSONObject2);
            if (!m21498b(str)) {
                C12115b.m21583b("DataMonitor", bVar.hashCode() + C1764a.m5928a(" do report: event:%s container:%s data:%s", new Object[]{str, str2, m21491a(jSONObject2.toString())}));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r21.toString().equals(r0.toString()) != false) goto L_0x010f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21495a(com.bytedance.android.monitorV2.webview.AbstractC12190b r20, org.json.JSONObject r21, java.lang.String r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 511
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.C12074b.m21495a(com.bytedance.android.monitorV2.webview.b, org.json.JSONObject, java.lang.String, java.lang.String):void");
    }
}
