package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29464h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.r */
public class C29543r {

    /* renamed from: a */
    private static C29543r f70398a;

    static {
        Covode.recordClassIndex(35937);
    }

    private C29543r() {
    }

    /* renamed from: a */
    public static C29543r m59263a() {
        MethodCollector.m26663i(12495);
        if (f70398a == null) {
            synchronized (C29543r.class) {
                try {
                    if (f70398a == null) {
                        f70398a = new C29543r();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12495);
                    throw th;
                }
            }
        }
        C29543r rVar = f70398a;
        MethodCollector.m26664o(12495);
        return rVar;
    }

    /* renamed from: b */
    public static List<C29455b> m59265b() {
        JSONArray jSONArray;
        try {
            String string = C29556v.m59363a().f70433b.getString("splash_ad_first_show_data", "");
            if (!C29657l.m59760a(string)) {
                jSONArray = new JSONArray(string);
            } else {
                jSONArray = new JSONArray();
            }
            return C29654j.m59720a(jSONArray, 0L, true);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static C29464h m59267c() {
        long currentTimeMillis = System.currentTimeMillis();
        String i = C29556v.m59363a().mo51752i();
        String string = C29556v.m59363a().f70433b.getString("splash_ad_data", "");
        C29644g.m59688b("read sp data time cost: " + (System.currentTimeMillis() - currentTimeMillis));
        C29464h hVar = new C29464h();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<C29455b> b = m59266b(i);
            List<C29455b> b2 = m59266b(string);
            Map<String, C29455b> a = C29654j.m59722a(b);
            hVar.f70085b = b2;
            hVar.f70086c = a;
            hVar.f70084a = b;
            if (!C29643f.m59683a(b2)) {
                hVar.f70088e = C29464h.m59052a(b2);
            } else {
                hVar.f70088e = C29464h.m59052a(b);
            }
            C29644g.m59688b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis2));
            return hVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static List<C29455b> m59264a(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C29657l.m59760a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            C29644g.m59688b("generate json array time : " + (System.currentTimeMillis() - currentTimeMillis));
            List<C29455b> a = C29654j.m59720a(jSONArray, 0L, true);
            C29644g.m59688b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static List<C29455b> m59266b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C29657l.m59760a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<C29455b> a = C29654j.m59721a(jSONArray, false);
            C29644g.m59688b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a;
        } catch (Exception unused) {
            return null;
        }
    }
}
