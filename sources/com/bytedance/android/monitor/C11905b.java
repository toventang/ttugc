package com.bytedance.android.monitor;

import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.monitor.p704b.AbstractC11911e;
import com.bytedance.android.monitor.p704b.AbstractC11913g;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.p714l.C11951e;
import com.bytedance.android.monitor.p714l.C11956j;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b */
public final class C11905b implements AbstractC11911e {

    /* renamed from: a */
    protected AbstractC12009a f28459a;

    static {
        Covode.recordClassIndex(13631);
    }

    public C11905b(AbstractC12009a aVar) {
        this.f28459a = aVar;
    }

    /* renamed from: a */
    private static boolean m20999a(String str) {
        if ("jsbPerf".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11911e
    /* renamed from: a */
    public final void mo19114a(final AbstractC11913g gVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C11929a.m21040a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.C11905b.RunnableC119061 */

                static {
                    Covode.recordClassIndex(13632);
                }

                public final void run() {
                    C11905b.m20995a(gVar, C11905b.this.f28459a);
                }
            });
        } else {
            m20995a(gVar, this.f28459a);
        }
    }

    /* renamed from: a */
    public static void m20996a(C11919c cVar) {
        String str;
        C11937b.m21063b("DataMonitor", "monitorCustom: ".concat(String.valueOf(cVar)));
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (cVar.f28472d != null) {
                C11950d.m21100a(jSONObject, "client_category", cVar.f28472d);
            }
            if (cVar.f28473e != null) {
                C11950d.m21100a(jSONObject, "client_metric", cVar.f28473e);
            }
            if (cVar.f28474f != null) {
                C11950d.m21101a(cVar.f28474f, "event_name", cVar.f28471c);
                C11950d.m21100a(jSONObject, "client_extra", cVar.f28474f);
            }
            if (cVar.f28475g != null) {
                C11950d.m21100a(jSONObject, "client_timing", cVar.f28475g);
            }
            if (cVar.f28478j) {
                str = "samplecustom";
            } else {
                str = "newcustom";
            }
            String str2 = cVar.f28469a;
            C11950d.m21101a(jSONObject, "url", str2);
            if (str2 != null) {
                C11950d.m21101a(jSONObject, "host", C11956j.m21116b(str2));
                C11950d.m21101a(jSONObject, "path", C11956j.m21115a(str2));
            }
            C11950d.m21101a(jSONObject, "ev_type", "custom");
            C11950d.m21102a(jSONObject, cVar.f28476h);
            if (!TextUtils.isEmpty(cVar.f28477i)) {
                C11950d.m21101a(jSONObject, "virtual_aid", cVar.f28477i);
            }
            m20997a(cVar.f28479k, jSONObject, str, cVar.f28470b);
        }
    }

    /* renamed from: a */
    public static void m20995a(AbstractC11913g gVar, AbstractC12009a aVar) {
        boolean z;
        if (gVar == null) {
            throw new NullPointerException("data should not be null");
        } else if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                C11950d.m21101a(jSONObject, "event_type", gVar.mo19125h());
                if (gVar.mo19119b() != null) {
                    C11950d.m21100a(jSONObject, "nativeBase", gVar.mo19119b().mo19116a());
                }
                if (gVar.mo19122e() != null) {
                    C11950d.m21100a(jSONObject, "nativeInfo", gVar.mo19122e().mo19116a());
                }
                if (gVar.mo19120c() != null) {
                    C11950d.m21100a(jSONObject, "jsInfo", gVar.mo19120c());
                }
                if (gVar.mo19121d() != null) {
                    C11950d.m21100a(jSONObject, "jsBase", gVar.mo19121d());
                }
                if (gVar.mo19124g() != null) {
                    C11950d.m21100a(jSONObject, "containerBase", gVar.mo19124g().mo19116a());
                }
                if (gVar.mo19123f() != null) {
                    C11950d.m21100a(jSONObject, "containerInfo", gVar.mo19123f().mo19116a());
                }
                if (!m20999a(gVar.mo19125h())) {
                    z = true;
                } else {
                    z = false;
                }
                m20998a(aVar, jSONObject, gVar.mo19125h(), gVar.mo19126i(), gVar.mo19127j(), z);
            } catch (Throwable unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: a */
    private static boolean m21000a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (str != null) {
            try {
                JSONObject c = C11950d.m21105c(jSONObject, "extra");
                str2 = C11950d.m21104b(c, "virtual_aid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = C11950d.m21104b(C11950d.m21105c(c, "nativeBase"), "virtual_aid");
                }
            } catch (Throwable unused) {
                HybridMonitor.getInstance().getExceptionHandler();
                return true;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        C11915c a = C11915c.m21019a();
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                Set<String> set = a.f28464a.get(str2);
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
    }

    /* renamed from: a */
    private static void m20997a(AbstractC12009a aVar, JSONObject jSONObject, String str, String str2) {
        if (aVar != null) {
            try {
                m20998a(aVar, jSONObject, str, "", str2, false);
            } catch (Throwable th) {
                HybridMonitor.getInstance().getExceptionHandler();
                C11937b.m21064c("DataMonitor", "monitorCustom error: " + th.getMessage());
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    /* renamed from: a */
    private static void m20998a(AbstractC12009a aVar, JSONObject jSONObject, String str, String str2, String str3, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        C11950d.m21100a(jSONObject2, "extra", jSONObject);
        String a = C11951e.m21107a(str, str2, str3);
        HybridMonitor.getInstance().notifyReportInterceptor(a, str, str2, jSONObject2);
        if (aVar != null && m21000a(jSONObject2, a)) {
            aVar.mo13268a(a, 0, null, jSONObject2);
            C11937b.m21063b("DataMonitor", aVar + " do report: " + a);
        }
        if (z) {
            C11937b.m21063b("BDHybridMonitor", C1764a.m5928a("service:%s,data:%s", new Object[]{a, jSONObject2}));
        }
    }
}
