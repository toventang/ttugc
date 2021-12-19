package com.p2082ss.android.p2092ad.splash.p2094b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.b */
public class C29381b {

    /* renamed from: d */
    private static volatile C29381b f69764d;

    /* renamed from: a */
    public volatile long f69765a;

    /* renamed from: b */
    public volatile boolean f69766b = true;

    /* renamed from: c */
    public volatile long f69767c;

    static {
        Covode.recordClassIndex(35774);
    }

    private C29381b() {
    }

    /* renamed from: b */
    public final void mo51365b() {
        this.f69765a = System.currentTimeMillis();
        this.f69766b = true;
    }

    /* renamed from: a */
    public static C29381b m58846a() {
        MethodCollector.m26663i(9929);
        if (f69764d == null) {
            synchronized (C29381b.class) {
                try {
                    if (f69764d == null) {
                        f69764d = new C29381b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9929);
                    throw th;
                }
            }
        }
        C29381b bVar = f69764d;
        MethodCollector.m26664o(9929);
        return bVar;
    }

    /* renamed from: c */
    public final void mo51366c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f69767c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            C29375a.m58829a().mo51360a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m58847a(int i) {
        C29375a.m58829a().mo51357a("service_splash_ad_show_result", i, (JSONObject) null);
    }
}
