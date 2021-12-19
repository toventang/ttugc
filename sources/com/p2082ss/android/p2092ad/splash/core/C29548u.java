package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.AbstractC29372aa;
import com.p2082ss.android.p2092ad.splash.C29666h;
import com.p2082ss.android.p2092ad.splash.C29687y;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29462f;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29468l;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29474p;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29477s;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2108e.AbstractC29636a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29641d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29645h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.u */
public final class C29548u {

    /* renamed from: d */
    private static volatile C29548u f70408d;

    /* renamed from: a */
    public volatile long f70409a;

    /* renamed from: b */
    public long f70410b = 20000;

    /* renamed from: c */
    public AbstractC29636a f70411c = new C29555a();

    static {
        Covode.recordClassIndex(35942);
    }

    /* renamed from: a */
    public static void m59331a(List<C29468l> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!C29643f.m59683a(list)) {
                for (C29468l lVar : list) {
                    String x = lVar.mo51554x();
                    if (!C29657l.m59760a(x)) {
                        jSONArray.put(x);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", C29535k.m59196a().f70379l);
            C29495h.m59099a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m59328a(C29455b bVar, C29455b bVar2) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", bVar.f70032j).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.f70024b));
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(bVar2.f70026d));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "boarding", jSONObject);
            } catch (Exception unused) {
                return;
            }
        }
        if (bVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", bVar2.f70032j).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar2.f70024b));
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(bVar.f70026d));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            C29495h.m59099a(bVar2.f70026d, "splash_ad", "covered", jSONObject3);
        }
    }

    /* renamed from: a */
    public final void mo51715a(C29455b bVar) {
        if (m59342f(bVar)) {
            C29556v.m59363a().mo51729a(bVar.f70001a);
        }
        m59336c(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m59332a(com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29548u.m59332a(com.ss.android.ad.splash.core.e.b, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: a */
    private static boolean m59333a(C29474p pVar, boolean z) {
        if (pVar != null && pVar.mo51561a()) {
            String a = C29654j.m59713a(pVar);
            String a2 = C29654j.m59714a(pVar, z);
            if (C29657l.m59760a(a) || C29657l.m59760a(a2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m59329a(final C29455b bVar, final String str, final String str2, final int i, final boolean z) {
        C29666h a = m59322a(bVar, true);
        final long currentTimeMillis = System.currentTimeMillis();
        if (C29495h.f70227c != null) {
            C29495h.f70227c.mo28697a(str, str2, a, new AbstractC29372aa.AbstractC29373a() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29548u.C295546 */

                static {
                    Covode.recordClassIndex(35948);
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa.AbstractC29373a
                /* renamed from: b */
                public final void mo51354b() {
                    int i;
                    C29638a.m59659a(bVar.f70026d, " the resource url of video ad is " + str + ", download async failed");
                    int i2 = i;
                    if (i2 > 0) {
                        C29548u.this.mo51716a(bVar, str, str2, i2 - 1);
                        return;
                    }
                    C29455b bVar = bVar;
                    if (z) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                    C29548u.m59327a(bVar, 17, true, i);
                }

                @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa.AbstractC29373a
                /* renamed from: a */
                public final void mo51353a() {
                    int i;
                    C29638a.m59659a(bVar.f70026d, " the resource url of video ad is " + str);
                    C29548u.m59330a(str2, bVar.mo51539e());
                    C29455b bVar = bVar;
                    if (z) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                    C29548u.m59327a(bVar, 16, true, i);
                    C29548u.m59324a(1, str2);
                    C29548u.m59323a(2, System.currentTimeMillis() - currentTimeMillis);
                    C29556v.m59363a().mo51730a(bVar.f70040r);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m59330a(String str, long j) {
        JSONArray jSONArray;
        MethodCollector.m26663i(8360);
        try {
            if (C29657l.m59760a(str) || j <= 0) {
                MethodCollector.m26664o(8360);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
            synchronized (C29556v.class) {
                try {
                    String g = C29556v.m59363a().mo51748g();
                    if (C29657l.m59760a(g)) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = new JSONArray(g);
                    }
                    jSONArray.put(jSONObject);
                    C29556v.m59363a().mo51747g(jSONArray.toString()).mo51750h();
                } finally {
                    MethodCollector.m26664o(8360);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(8360);
        }
    }

    private C29548u() {
    }

    /* renamed from: c */
    public final boolean mo51720c() {
        if (System.currentTimeMillis() - this.f70409a > this.f70410b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C29548u m59321a() {
        MethodCollector.m26663i(13701);
        if (f70408d == null) {
            synchronized (C29548u.class) {
                try {
                    if (f70408d == null) {
                        f70408d = new C29548u();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13701);
                    throw th;
                }
            }
        }
        C29548u uVar = f70408d;
        MethodCollector.m26664o(13701);
        return uVar;
    }

    /* renamed from: b */
    public final void mo51717b() {
        Exception e;
        int i;
        boolean z;
        C29455b bVar;
        C29455b bVar2;
        long currentTimeMillis = System.currentTimeMillis();
        this.f70409a = currentTimeMillis;
        C29644g.m59688b("preload begins...");
        Future submit = C29495h.f70230f.submit(new Callable<C29687y>() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29548u.CallableC295491 */

            static {
                Covode.recordClassIndex(35943);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C29687y call() {
                return m59355a();
            }

            /* renamed from: a */
            private static C29687y m59355a() {
                C29446b.m58971a();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("start_time", Long.valueOf(System.currentTimeMillis()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                    jSONObject.putOpt("log_extra", C29535k.m59196a().f70379l);
                    jSONObject.putOpt("is_ad_event", "1");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C29495h.m59099a(84378473382L, "splash_ad", "request", jSONObject);
                if (C29495h.f70227c == null) {
                    C29644g.m59688b(" SplashNetWork is null, check if calling SplashAdLifecycleHandler.onAppForeground() before this method ");
                    return null;
                }
                String b = C29654j.m59738b();
                C29654j.m59744c();
                String d = C29535k.m59196a().mo51651d();
                C29535k.m59196a().mo51650c();
                if (C29657l.m59760a(b)) {
                    return null;
                }
                C29638a.m59659a(0, " sending preload request ");
                return C29495h.f70227c.mo28695a(b, d);
            }
        });
        try {
            JSONObject jSONObject = new JSONObject();
            C29687y yVar = (C29687y) submit.get(30, TimeUnit.SECONDS);
            if (yVar == null || !yVar.f70828b || yVar.f70827a == null) {
                C29446b.m58971a();
                i = 0;
                C29446b.m58985b(false);
                C29638a.m59659a(0, " request failed or request success with empty response ");
            } else {
                C29446b.m58971a();
                C29446b.m58985b(true);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject optJSONObject = yVar.f70827a.optJSONObject("data");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                    long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                    this.f70410b = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                    long optLong3 = optJSONObject.optLong("cold_boot_interval", 0) * 1000;
                    String optString = optJSONObject.optString("log_extra", "{}");
                    boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                    int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                    C29644g.m59688b("concurrent_downloads : ".concat(String.valueOf(min)));
                    long optLong4 = optJSONObject.optLong("server_time", 0);
                    m59325a(optLong4);
                    String optString2 = optJSONObject.optString("period_first_map");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                    if (optJSONArray != null && optJSONArray.length() == 2) {
                        C29535k.m59196a().mo51646a(optJSONArray.getLong(0) * 1000);
                        C29535k.m59196a().mo51649b(optJSONArray.getLong(1) * 1000);
                    } else if (optJSONArray == null) {
                        try {
                            optJSONArray = new JSONArray();
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            C29446b.m58971a();
                            C29446b.m58985b(false);
                            C29638a.m59660a(0, " request failed, maybe there is an exception", e);
                            C29375a.m58829a().mo51356a(e, "key_exception_request");
                        }
                    }
                    int optInt = optJSONObject.optInt("show_limit", 0);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (!C29495h.f70214ak || optLong4 == 0) {
                        optLong4 = currentTimeMillis3;
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                    if (optJSONArray2 == null) {
                        optJSONArray2 = new JSONArray();
                    }
                    C29638a.m59659a(0, " parsing preloaded data success ");
                    C29535k a = C29535k.m59196a();
                    List<C29455b> a2 = C29654j.m59720a(optJSONArray2, optLong4, false);
                    if (C29495h.f70216am != null) {
                        C29495h.f70216am.mo28667a(a2);
                    }
                    C29446b.m58971a();
                    C29446b.m58981a(a2.isEmpty());
                    List<C29455b> list = a.f70368a;
                    if (C29495h.f70207ad) {
                        List<C29455b> a3 = C29654j.m59717a(a.f70369b, a2);
                        JSONArray b = C29654j.m59741b(a3);
                        a.f70369b = a3;
                        C29556v.m59363a().mo51740d(b.toString()).mo51750h();
                        if (!C29556v.m59363a().mo51741d()) {
                            m59343g(list);
                            m59348k(null);
                        }
                    }
                    if (!C29643f.m59683a(a2)) {
                        bVar = a2.get(0);
                        z = false;
                    } else {
                        z = true;
                        bVar = null;
                    }
                    if (!C29643f.m59683a(list)) {
                        bVar2 = list.get(0);
                    } else {
                        bVar2 = null;
                    }
                    m59328a(bVar, bVar2);
                    a.f70368a = a2;
                    a.f70372e = optLong;
                    a.f70371d = optLong2;
                    a.f70376i = optLong3;
                    a.f70379l = optString;
                    a.f70375h = optBoolean;
                    a.f70377j = min;
                    a.f70378k = C29477s.m59062a(optString2);
                    C29495h.f70181E = true;
                    C29556v.m59363a().mo51726a(optLong).mo51725a(optInt).mo51732b(optLong2).mo51736c(optLong3).mo51727a(optJSONArray2.toString()).mo51749h(optJSONArray.toString()).mo51728a(z).mo51751i(optString).mo51737c(optString2).mo51738c(optBoolean).mo51766w().mo51750h();
                    C29495h.f70182F = true;
                    mo51719b(a2);
                    jSONObject.put("durarion_ad_request_total_times", currentTimeMillis2 - currentTimeMillis);
                    m59335c(a2);
                    m59338d(a2);
                    if (C29495h.f70213aj) {
                        C29537m.m59206a().mo51653c();
                    }
                    i = 0;
                } else {
                    return;
                }
            }
            C29375a.m58829a().mo51358a("service_ad_request_status", i, jSONObject, null);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            C29446b.m58971a();
            C29446b.m58985b(false);
            C29638a.m59660a(0, " request failed, maybe there is an exception", e);
            C29375a.m58829a().mo51356a(e, "key_exception_request");
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.u$a */
    class C29555a implements AbstractC29636a {
        static {
            Covode.recordClassIndex(35949);
        }

        C29555a() {
        }
    }

    /* renamed from: a */
    public static void m59325a(long j) {
        if (j > 0) {
            C29644g.m59686a("splash remote server time: ".concat(String.valueOf(j)));
            C29556v.m59363a().mo51743e(j);
        }
    }

    /* renamed from: c */
    private boolean m59336c(C29455b bVar) {
        boolean z = false;
        if (!C29643f.m59683a(bVar.f70038p)) {
            C29638a.m59659a(bVar.f70026d, "start to download resource of time-gap ad");
            for (C29455b bVar2 : bVar.f70038p) {
                if (bVar2 != null && bVar2.mo51534a() && m59342f(bVar2)) {
                    C29556v.m59363a().mo51729a(bVar2.f70001a);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m59337d(C29455b bVar) {
        if (!C29643f.m59683a(bVar.f70038p)) {
            for (C29455b bVar2 : bVar.f70038p) {
                if (bVar2 != null && bVar2.mo51534a()) {
                    m59346i(bVar2);
                }
            }
        }
    }

    /* renamed from: e */
    private static boolean m59340e(C29455b bVar) {
        if (!C29654j.m59729a(bVar)) {
            C29446b.m58971a();
            C29446b.m58978a(bVar, "splash_start_download");
        }
        C29474p pVar = bVar.f70040r;
        if (m59333a(pVar, bVar.mo51546k()) && m59344g(bVar)) {
            return m59332a(bVar, C29654j.m59713a(pVar), C29654j.m59714a(pVar, bVar.mo51546k()), false);
        }
        return false;
    }

    /* renamed from: g */
    private static void m59343g(List<C29455b> list) {
        if (!C29643f.m59683a(list)) {
            for (C29455b bVar : list) {
                if (bVar.f70043u == 1 && bVar.mo51551u()) {
                    m59348k(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m59345h(C29455b bVar) {
        if (C29654j.m59730a(bVar.f70001a, C29556v.m59363a())) {
            C29638a.m59659a(bVar.f70026d, " image resource exist, no more download");
            if (bVar.f70039q != 3) {
                m59334b(bVar, 0);
            }
            return false;
        } else if (!C29654j.m59729a(bVar) || bVar.f70039q == 3) {
            return true;
        } else {
            C29446b.m58971a();
            C29446b.m58978a(bVar, "topview_start_download");
            return true;
        }
    }

    /* renamed from: k */
    private static void m59348k(C29455b bVar) {
        long j;
        String str = C29535k.m59196a().f70379l;
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            j = bVar.f70026d;
            str = bVar.f70032j;
            currentTimeMillis = bVar.f70024b;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", str);
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            C29495h.m59099a(j, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m59335c(List<C29455b> list) {
        if (C29645h.m59695b(C29495h.f70242r) && !C29643f.m59683a(list) && C29495h.f70227c != null) {
            try {
                if (C29645h.m59696c(C29495h.f70242r) != 0) {
                    for (C29455b bVar : list) {
                        if (bVar != null && bVar.mo51534a()) {
                            int i = bVar.f70039q;
                            if (!(i == 0 || i == 1)) {
                                if (i == 2 || i == 3) {
                                    m59326a(bVar, 2);
                                } else if (i != 4) {
                                }
                            }
                            m59326a(bVar, 1);
                            if (!C29643f.m59683a(bVar.f70038p)) {
                                for (C29455b bVar2 : bVar.f70038p) {
                                    if (bVar2 != null && bVar2.mo51534a()) {
                                        m59326a(bVar2, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private void m59339e(List<C29455b> list) {
        int c = C29645h.m59696c(C29495h.f70242r);
        if (c != 0) {
            for (C29455b bVar : list) {
                if (bVar != null && bVar.mo51534a()) {
                    if ((bVar.f69984I & c) != 0) {
                        int i = bVar.f70039q;
                        if (!(i == 0 || i == 1)) {
                            if (i == 2 || i == 3) {
                                if (C29654j.m59726a(bVar.f69982G, true)) {
                                    m59347j(bVar);
                                    if (bVar.f70039q == 3) {
                                        m59346i(bVar);
                                    }
                                } else {
                                    mo51718b(bVar);
                                }
                            } else if (i != 4) {
                            }
                        }
                        if (C29654j.m59726a(bVar.f69982G, false)) {
                            m59346i(bVar);
                            m59337d(bVar);
                        } else {
                            mo51715a(bVar);
                        }
                    } else {
                        m59334b(bVar, 1);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m59344g(C29455b bVar) {
        if (C29654j.m59731a(bVar.f70040r, C29556v.m59363a())) {
            C29638a.m59659a(bVar.f70026d, " video resource exist, no more download");
            m59334b(bVar, 0);
            return false;
        } else if (!C29654j.m59729a(bVar)) {
            return true;
        } else {
            C29446b.m58971a();
            C29446b.m58978a(bVar, "topview_start_download");
            return true;
        }
    }

    /* renamed from: i */
    private void m59346i(final C29455b bVar) {
        if (!C29654j.m59729a(bVar) && bVar.f70039q != 3) {
            C29446b.m58971a();
            C29446b.m58978a(bVar, "splash_start_download");
        }
        C29462f fVar = bVar.f70001a;
        if (fVar != null) {
            String a = C29654j.m59712a(fVar);
            final String b = C29654j.m59739b(fVar);
            if (!C29657l.m59760a(a) && !C29657l.m59760a(b) && m59345h(bVar)) {
                C29666h a2 = m59322a(bVar, false);
                final long currentTimeMillis = System.currentTimeMillis();
                if (C29495h.f70227c != null) {
                    C29495h.f70227c.mo28697a(a, b, a2, new AbstractC29372aa.AbstractC29373a() {
                        /* class com.p2082ss.android.p2092ad.splash.core.C29548u.C295535 */

                        static {
                            Covode.recordClassIndex(35947);
                        }

                        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa.AbstractC29373a
                        /* renamed from: b */
                        public final void mo51354b() {
                            C29548u.m59327a(bVar, 1, true, -1);
                        }

                        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29372aa.AbstractC29373a
                        /* renamed from: a */
                        public final void mo51353a() {
                            C29548u.m59330a(b, bVar.mo51539e());
                            C29548u.m59327a(bVar, 0, true, -1);
                            C29548u.m59324a(0, b);
                            C29548u.m59323a(1, System.currentTimeMillis() - currentTimeMillis);
                            C29556v.m59363a().mo51729a(bVar.f70001a);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: j */
    private void m59347j(C29455b bVar) {
        if (!C29654j.m59729a(bVar)) {
            C29446b.m58971a();
            C29446b.m58978a(bVar, "splash_start_download");
        }
        C29474p pVar = bVar.f70040r;
        if (m59333a(pVar, bVar.mo51546k())) {
            if (m59344g(bVar)) {
                mo51716a(bVar, C29654j.m59713a(pVar), C29654j.m59714a(pVar, bVar.mo51546k()), 1);
            }
            if (bVar.f69982G == 3) {
                C29638a.m59659a(bVar.f70026d, " interactive splash ad, checking if resource of second video exist");
                C29474p pVar2 = bVar.f70041s;
                if (m59333a(pVar2, bVar.mo51546k()) && !C29654j.m59731a(pVar2, C29556v.m59363a())) {
                    C29638a.m59659a(bVar.f70026d, " start to download the second video of interactive ad async");
                    m59329a(bVar, C29654j.m59713a(pVar2), C29654j.m59714a(pVar2, bVar.mo51546k()), 3, true);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51718b(C29455b bVar) {
        if (m59340e(bVar)) {
            C29556v.m59363a().mo51730a(bVar.f70040r);
        }
        if (bVar.f70039q == 3 && m59342f(bVar)) {
            C29556v.m59363a().mo51729a(bVar.f70001a);
        }
        if (bVar.f69982G == 3) {
            C29638a.m59659a(bVar.f70026d, " interactive splash ad, checking if resource of second video exist");
            C29474p pVar = bVar.f70041s;
            if (m59333a(pVar, bVar.mo51546k())) {
                if (!C29654j.m59731a(pVar, C29556v.m59363a())) {
                    C29638a.m59659a(bVar.f70026d, " start to download the second video of interactive splash ad ");
                    if (m59332a(bVar, C29654j.m59713a(pVar), C29654j.m59714a(pVar, bVar.mo51546k()), true)) {
                        C29556v.m59363a().mo51730a(bVar.f70041s);
                        return;
                    }
                    return;
                }
                C29638a.m59659a(bVar.f70026d, " the second video of interactive splash ad exist, no more download ");
            }
        }
    }

    /* renamed from: d */
    public static void m59338d(List<C29455b> list) {
        if (!C29645h.m59695b(C29495h.f70242r) || C29643f.m59683a(list) || C29495h.f70227c == null) {
            return;
        }
        if (C29495h.f70228d == null || !C29495h.f70228d.mo51942a()) {
            C29644g.m59688b("microapp is not supported");
            return;
        }
        for (C29455b bVar : list) {
            if (bVar == null || !bVar.mo51534a() || bVar.f69985J == 0) {
                C29644g.m59688b("invalid splashAd or not preload");
            } else if (C29654j.m59703a(bVar.f70029g) == 5 && C29645h.m59695b(C29495h.f70242r)) {
                if (bVar.f69985J != 1) {
                    if (bVar.f69985J == 2) {
                        Context context = C29495h.f70242r;
                        if (C29645h.m59695b(context)) {
                            if (C29645h.m59696c(context) != 1) {
                            }
                        }
                    }
                }
                "microgame".equals(Uri.parse(bVar.f70029g).getHost());
                C29644g.m59688b("preload micro app success:false");
            }
        }
    }

    /* renamed from: f */
    private void m59341f(List<C29455b> list) {
        if (C29495h.f70231g == null) {
            int i = C29535k.m59196a().f70377j;
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = i;
            C29495h.f70231g = C40780g.m82242a(a.mo70028a());
        }
        if (C29495h.f70236l == null) {
            C29495h.f70236l = new ConcurrentHashMap<>();
        }
        int c = C29645h.m59696c(C29495h.f70242r);
        if (c != 0) {
            for (final C29455b bVar : list) {
                if (!(bVar == null || !bVar.mo51534a() || (bVar.f69984I & c) == 0)) {
                    long j = bVar.f70026d;
                    if (!C29495h.f70236l.containsKey(Long.valueOf(j))) {
                        C29495h.f70236l.put(Long.valueOf(j), 0);
                        int i2 = bVar.f70039q;
                        if (!(i2 == 0 || i2 == 1)) {
                            if (i2 == 2 || i2 == 3) {
                                C29495h.f70231g.execute(new Runnable() {
                                    /* class com.p2082ss.android.p2092ad.splash.core.C29548u.RunnableC295524 */

                                    static {
                                        Covode.recordClassIndex(35946);
                                    }

                                    public final void run() {
                                        Thread.currentThread().setName("SplashSDKDownloadThread_" + bVar.f70026d);
                                        C29548u.this.mo51718b(bVar);
                                        C29495h.m59098a(bVar.f70026d);
                                    }
                                });
                            } else if (i2 != 4) {
                            }
                        }
                        C29495h.f70231g.execute(new Runnable() {
                            /* class com.p2082ss.android.p2092ad.splash.core.C29548u.RunnableC295513 */

                            static {
                                Covode.recordClassIndex(35945);
                            }

                            public final void run() {
                                Thread.currentThread().setName("SplashSDKDownloadThread_" + bVar.f70026d);
                                C29548u.this.mo51715a(bVar);
                                C29495h.m59098a(bVar.f70026d);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m59342f(com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b r10) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29548u.m59342f(com.ss.android.ad.splash.core.e.b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0149 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0108 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef A[Catch:{ all -> 0x0158 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51719b(java.util.List<com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b> r14) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29548u.mo51719b(java.util.List):void");
    }

    /* renamed from: b */
    private static void m59334b(C29455b bVar, int i) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("reason", Integer.valueOf(i));
        if (C29654j.m59729a(bVar)) {
            str = "topview_no_download";
        } else {
            str = "splash_no_download";
        }
        C29446b.m58971a();
        C29446b.m58973a(bVar, 0, str, hashMap2, hashMap);
    }

    /* renamed from: a */
    private static C29666h m59322a(C29455b bVar, boolean z) {
        C29666h.C29667a aVar = new C29666h.C29667a();
        aVar.f70745a = bVar.f70026d;
        aVar.f70746b = bVar.f70032j;
        aVar.f70747c = bVar.f69976A;
        aVar.f70748d = C29654j.m59729a(bVar);
        aVar.f70749e = bVar.mo51529A();
        if (z) {
            aVar.f70750f = 2;
        } else {
            aVar.f70750f = 1;
        }
        C29666h a = aVar.mo51938a();
        a.f70742d = bVar.mo51542h();
        return a;
    }

    /* renamed from: a */
    public static void m59323a(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            C29375a.m58829a().mo51358a("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m59324a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(C29641d.m59677a(str)));
            C29375a.m58829a().mo51358a("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m59326a(C29455b bVar, int i) {
        C29666h.C29667a aVar = new C29666h.C29667a();
        aVar.f70745a = bVar.f70026d;
        aVar.f70746b = bVar.f70032j;
        aVar.f70750f = i;
        aVar.f70747c = bVar.f69976A;
        aVar.f70749e = bVar.mo51529A();
        aVar.mo51938a();
    }

    /* renamed from: a */
    public final void mo51716a(C29455b bVar, String str, String str2, int i) {
        m59329a(bVar, str, str2, i, false);
    }

    /* renamed from: a */
    public static void m59327a(C29455b bVar, int i, boolean z, int i2) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str3 = "";
        if (i == 0) {
            str3 = C29654j.m59712a(bVar.f70001a);
            str = "download_image_succeed";
            hashMap2.put("image_mode", Integer.valueOf(bVar.f70035m));
        } else if (i == 1) {
            str3 = C29654j.m59712a(bVar.f70001a);
            str = "download_image_failed";
            hashMap2.put("image_mode", Integer.valueOf(bVar.f70035m));
        } else if (i == 16) {
            try {
                str3 = C29654j.m59713a(bVar.f70040r);
                str = "download_video_succeed";
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else if (i != 17) {
            str = str3;
        } else {
            str3 = C29654j.m59713a(bVar.f70040r);
            str = "download_video_failed";
        }
        hashMap.put("ad_fetch_time", Long.valueOf(bVar.f70024b));
        if (i2 != -1) {
            hashMap2.put("position", Integer.valueOf(i2));
        }
        hashMap2.put("url", str3);
        String str4 = "1";
        if (C29654j.m59729a(bVar)) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        hashMap2.put("is_topview", str2);
        if (!z) {
            str4 = "0";
        }
        hashMap2.put("is_async", str4);
        C29446b.m58971a();
        C29446b.m58973a(bVar, 0, str, hashMap, hashMap2);
    }
}
