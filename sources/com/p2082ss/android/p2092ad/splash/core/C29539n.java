package com.p2082ss.android.p2092ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29444a;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29464h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29466j;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29467k;
import com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2094b.C29381b;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29659n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.n */
final class C29539n {

    /* renamed from: d */
    private static volatile C29539n f70384d;

    /* renamed from: a */
    public long f70385a;

    /* renamed from: b */
    public String f70386b = "";

    /* renamed from: c */
    public long f70387c;

    /* renamed from: e */
    private long f70388e;

    /* renamed from: f */
    private C29455b f70389f;

    /* renamed from: g */
    private boolean f70390g;

    /* renamed from: h */
    private boolean f70391h;

    /* renamed from: i */
    private boolean f70392i;

    static {
        Covode.recordClassIndex(35933);
    }

    /* renamed from: a */
    private static void m59221a(C29455b bVar, int i, String str) {
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.f70032j).putOpt("is_ad_event", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i));
            if (!C29654j.m59729a(bVar)) {
                str2 = "0";
            }
            jSONObject2.putOpt("is_topview", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.f70024b);
        } catch (Exception unused) {
        }
        C29495h.m59099a(bVar.f70026d, "splash_ad", "data_invalid", jSONObject);
    }

    /* renamed from: a */
    private static void m59220a(C29455b bVar, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.f70032j);
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "";
            if (i == 1) {
                str2 = "not_download_image";
                str = C29654j.m59712a(bVar.f70001a);
            } else if (i != 2) {
                str = str2;
            } else {
                str2 = "not_download_video";
                str = C29654j.m59713a(bVar.f70040r);
            }
            jSONObject2.putOpt("reason", str2);
            jSONObject2.putOpt("url", str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.f70024b));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C29495h.m59099a(bVar.f70026d, "splash_ad", "not_showing_reason", jSONObject);
    }

    /* renamed from: a */
    private static void m59219a(long j, boolean z, boolean z2, boolean z3) {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", str);
            jSONObject2.putOpt("status", z ? str : "0");
            jSONObject.putOpt("log_extra", C29535k.m59196a().f70379l);
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                if (!z3) {
                    str = "0";
                }
                jSONObject2.putOpt("stop_show", str);
            } else {
                if (!z2) {
                    str = "0";
                }
                jSONObject2.putOpt("is_penalty_period", str);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C29495h.m59099a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }

    /* renamed from: a */
    private static void m59222a(String str, int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length == 2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("log_extra", C29535k.m59196a().f70379l);
                    jSONObject2.put("first_show_period", jSONArray);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("is_ad_event", "1");
                    C29495h.m59099a(84378473382L, "splash_ad", str, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m59223a(com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b r7) {
        /*
            r6 = this;
            com.ss.android.ad.splash.c.c r1 = com.p2082ss.android.p2092ad.splash.core.C29495h.f70197U
            r5 = 0
            if (r1 != 0) goto L_0x000b
            java.lang.String r0 = "origin splash operation is null"
            com.p2082ss.android.p2092ad.splash.p2109f.C29644g.m59690d(r0)
            return r5
        L_0x000b:
            java.lang.String r0 = r7.f69983H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "origin splash adid is empty"
            com.p2082ss.android.p2092ad.splash.p2109f.C29644g.m59690d(r0)
            return r5
        L_0x0019:
            boolean r0 = r7.mo51542h()
            if (r0 == 0) goto L_0x0043
            boolean r5 = r1.mo28665a(r7, r5)
            if (r5 == 0) goto L_0x0040
            java.lang.String r4 = "topview_show_confirmed"
            long r0 = java.lang.System.currentTimeMillis()
            r6.mo51655a(r0)
        L_0x002e:
            com.ss.android.ad.splash.core.k r3 = com.p2082ss.android.p2092ad.splash.core.C29535k.m59196a()
            long r1 = r7.f70026d
            r0 = 2009(0x7d9, float:2.815E-42)
            r3.mo51647a(r1, r0)
            com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b.m58971a()
            com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b.m58984b(r7, r4)
            return r5
        L_0x0040:
            java.lang.String r4 = "topview_show_rejected"
            goto L_0x004b
        L_0x0043:
            boolean r0 = r7.mo51544i()
            if (r0 == 0) goto L_0x0052
            java.lang.String r4 = "topview_search_show_rejected"
        L_0x004b:
            com.ss.android.ad.splash.core.e.b r0 = r6.f70389f
            if (r0 != 0) goto L_0x002e
            r6.f70389f = r7
            goto L_0x002e
        L_0x0052:
            java.lang.String r4 = ""
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29539n.m59223a(com.ss.android.ad.splash.core.e.b):boolean");
    }

    private C29539n() {
    }

    /* renamed from: a */
    public static C29539n m59216a() {
        MethodCollector.m26663i(9088);
        if (f70384d == null) {
            synchronized (C29539n.class) {
                try {
                    if (f70384d == null) {
                        f70384d = new C29539n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9088);
                    throw th;
                }
            }
        }
        C29539n nVar = f70384d;
        MethodCollector.m26664o(9088);
        return nVar;
    }

    /* renamed from: e */
    private void m59234e() {
        boolean z;
        if (C29495h.f70235k) {
            z = this.f70390g;
        } else {
            z = this.f70391h;
        }
        if (!this.f70392i && !z && C29495h.m59095a().f70656d) {
            C29556v.m59363a().mo51742e().mo51750h();
            HashMap hashMap = new HashMap(1);
            hashMap.put("is_emptyround", 1);
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("log_extra", C29556v.m59363a().mo51763t());
            C29446b.m58971a();
            C29446b.m58973a(null, 84378473382L, "showlimit", hashMap2, hashMap);
            C29638a.m59659a(0, "empty list, add show count");
        }
    }

    /* renamed from: d */
    private List<C29455b> m59231d() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (C29535k.m59196a().f70369b != null) {
            arrayList = new ArrayList(C29535k.m59196a().f70369b);
        } else {
            arrayList = null;
        }
        if (!C29643f.m59683a(arrayList)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C29455b bVar = (C29455b) it.next();
                if (bVar.mo51551u()) {
                    arrayList2.add(bVar);
                    C29638a.m59659a(bVar.f70026d, "retrieved first show ad");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.f70032j).putOpt("ad_fetch_time", Long.valueOf(bVar.f70024b));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C29495h.m59099a(bVar.f70026d, "splash_ad", "launch_miss", jSONObject);
                    C29556v.m59363a().mo51728a(false).mo51750h();
                    break;
                }
                C29638a.m59659a(bVar.f70026d, "retrieve first show ad failed with showtime expired");
            }
        } else {
            C29638a.m59659a(0, "retrieve first show ad failed with empty array");
        }
        if (arrayList2.size() > 0) {
            this.f70387c = ((C29455b) arrayList2.get(0)).f70026d;
        }
        return arrayList2;
    }

    /* renamed from: c */
    private C29466j m59229c() {
        boolean z;
        MethodCollector.m26663i(9386);
        if (C29628x.m59641a().f70681h) {
            MethodCollector.m26664o(9386);
            return null;
        }
        C29466j jVar = new C29466j();
        C29455b b = C29486g.m59087a().mo51575b();
        if (b != null) {
            C29486g.m59087a().mo51576c();
            jVar.f70092a = b;
            jVar.f70093b = 200;
            MethodCollector.m26664o(9386);
            return jVar;
        }
        this.f70392i = false;
        int i = 2;
        int i2 = 1;
        if (C29495h.m59095a().f70656d) {
            C29556v a = C29556v.m59363a();
            C29556v.f70431c.setTimeInMillis(System.currentTimeMillis());
            if (C29556v.f70431c.get(5) + C29556v.f70431c.get(2) + C29556v.f70431c.get(1) != a.mo51755l()) {
                z = true;
            } else {
                z = false;
            }
            this.f70391h = z;
        }
        this.f70390g = !C29556v.m59363a().mo51741d();
        boolean z2 = C29495h.f70196T;
        int a2 = m59212a(z2);
        if (a2 != 4) {
            if (a2 == 0) {
                C29638a.m59659a(0, " interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                m59226b(true);
                C29446b.m58971a();
                C29444a.C29445a aVar = new C29444a.C29445a();
                aVar.f69953a = 84378473382L;
                aVar.f69956d = C29535k.m59196a().f70379l;
                aVar.f69954b = 6;
                C29446b.m58986c(aVar.mo51519a());
                jVar.f70093b = -1;
                if (!this.f70390g) {
                    jVar.f70094c = C29654j.m59752f();
                }
                C29535k.m59196a().mo51647a(84378473382L, 1002);
            } else {
                C29638a.m59659a(0, " interval check failed, stop showing ad with refresh-time unchanging ");
                if (z2 && C29495h.m59095a().f70662j) {
                    i = 29;
                }
                C29446b.m58971a();
                C29444a.C29445a aVar2 = new C29444a.C29445a();
                aVar2.f69953a = 84378473382L;
                aVar2.f69954b = i;
                aVar2.f69956d = C29535k.m59196a().f70379l;
                C29446b.m58974a(aVar2.mo51519a());
                jVar.f70093b = 301;
                C29535k.m59196a().mo51647a(84378473382L, 1001);
            }
            MethodCollector.m26664o(9386);
            return jVar;
        }
        C29638a.m59659a(0, " interval check passed with refresh-time increased, now checking stop-show status ");
        C29638a.m59659a(0, " last show time is  " + C29659n.m59765a(C29556v.m59363a().mo51765v()));
        m59226b(false);
        if (!this.f70390g) {
            jVar.f70094c = C29654j.m59752f();
        }
        C29644g.m59688b("UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + C29628x.m59641a().f70675b);
        if (C29628x.m59641a().f70675b != -1) {
            long j = C29628x.m59641a().f70680g;
            if (C29628x.m59641a().f70675b == 1) {
                m59219a(j, true, false, true);
                C29638a.m59659a(0, " receiving stop-show order success, stop selecting ad ");
                jVar.f70093b = 302;
                C29535k.m59196a().mo51647a(84378473382L, 1003);
                MethodCollector.m26664o(9386);
                return jVar;
            } else if (C29628x.m59641a().f70675b == 2) {
                C29638a.m59659a(0, " receiving stop-show order success, continue to selecting ad ");
                m59219a(j, true, false, false);
            }
        } else {
            C29638a.m59659a(0, " receiving stop-show order failed, fallback to preloaded stop-show period ");
            if (!C29628x.m59641a().mo51923d()) {
                long j2 = C29535k.m59196a().f70373f;
                long j3 = C29535k.m59196a().f70374g;
                if (C29654j.m59727a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (C29495h.f70196T) {
                            m59219a(0, false, true, false);
                        }
                        C29638a.m59659a(0, " current time is in stop-show period, stop selecting ad ");
                        jVar.f70093b = 302;
                        C29535k.m59196a().mo51647a(84378473382L, 1004);
                        MethodCollector.m26664o(9386);
                        return jVar;
                    }
                }
            }
            if (C29495h.f70196T) {
                m59219a(0, false, false, false);
            }
            C29638a.m59659a(0, " current time is not in stop-show period, continue to selecting ad ");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (C29495h.f70222as) {
            synchronized (C29539n.class) {
                try {
                    m59215a(jVar);
                } catch (Throwable th) {
                    MethodCollector.m26664o(9386);
                    throw th;
                }
            }
        } else {
            m59215a(jVar);
            i2 = 0;
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29375a.m58829a().mo51358a("service_get_available_ad_duration", i2, jSONObject, null);
        MethodCollector.m26664o(9386);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C29466j mo51656b() {
        List<C29455b> list;
        List<C29467k> list2;
        if (C29628x.m59641a().f70681h) {
            C29638a.m59663b(" SDK is unavailable ");
            return null;
        } else if (C29495h.f70201Y) {
            C29466j c = m59229c();
            if (!(c == null || c.f70094c == 0)) {
                C29638a.m59659a(0, " recording show time of first-show-timegap ad ");
                C29556v a = C29556v.m59363a();
                a.mo51764u().putLong("key_splash_ad_showed_time", c.f70094c);
                a.mo51750h();
            }
            return c;
        } else {
            C29466j jVar = new C29466j();
            C29455b b = C29486g.m59087a().mo51575b();
            if (b != null) {
                C29486g.m59087a().mo51576c();
                jVar.f70093b = 200;
                jVar.f70092a = b;
                return jVar;
            }
            this.f70390g = !C29556v.m59363a().mo51741d();
            int a2 = m59212a(C29495h.f70196T);
            int i = 4;
            if (a2 != 4) {
                if (a2 == 0) {
                    C29638a.m59659a(0, " interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                    m59226b(true);
                    C29444a.C29445a aVar = new C29444a.C29445a();
                    aVar.f69953a = 84378473382L;
                    aVar.f69956d = C29535k.m59196a().f70379l;
                    aVar.f69954b = 6;
                    C29446b.m58971a();
                    C29446b.m58986c(aVar.mo51519a());
                    jVar.f70093b = -1;
                } else {
                    C29638a.m59659a(0, " interval check failed, stop showing ad with refresh-time unchanging ");
                    C29444a.C29445a aVar2 = new C29444a.C29445a();
                    aVar2.f69953a = 84378473382L;
                    aVar2.f69954b = 2;
                    aVar2.f69956d = C29535k.m59196a().f70379l;
                    C29446b.m58971a();
                    C29446b.m58974a(aVar2.mo51519a());
                    jVar.f70093b = 301;
                }
                return jVar;
            }
            C29638a.m59659a(0, " interval check passed with refresh-time increased, now checking stop-show status ");
            m59226b(false);
            C29644g.m59688b("UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + C29628x.m59641a().f70675b);
            if (C29628x.m59641a().f70675b != -1) {
                long j = C29628x.m59641a().f70680g;
                if (C29628x.m59641a().f70675b == 1) {
                    m59219a(j, true, false, true);
                    C29638a.m59659a(0, " receiving stop-show order success, stop selecting ad ");
                    jVar.f70093b = 302;
                    return jVar;
                } else if (C29628x.m59641a().f70675b == 2) {
                    C29638a.m59659a(0, " receiving stop-show order success, continue to selecting ad ");
                    m59219a(j, true, false, false);
                }
            } else {
                C29638a.m59659a(0, " receiving stop-show order failed, fallback to preloaded stop-show period ");
                if (!C29628x.m59641a().mo51922c()) {
                    long j2 = C29535k.m59196a().f70373f;
                    long j3 = C29535k.m59196a().f70374g;
                    if (C29654j.m59727a(j2, j3)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                            if (C29495h.f70196T) {
                                m59219a(0, false, true, false);
                            }
                            C29638a.m59659a(0, " current time is in stop-show period, stop selecting ad ");
                            jVar.f70093b = 302;
                            return jVar;
                        }
                    }
                }
                if (C29495h.f70196T) {
                    m59219a(0, false, false, false);
                }
                C29638a.m59659a(0, " current time is not in stop-show period, continue to selecting ad ");
            }
            C29464h hVar = C29535k.m59196a().f70370c;
            if (hVar == null) {
                return null;
            }
            if (!hVar.f70088e || !C29628x.m59641a().mo51922c()) {
                if (C29495h.f70192P) {
                    C29638a.m59659a(0, " realtime request failed, fall back to preloaded array");
                    C29375a.m58829a().mo51357a("service_real_time_ad_monitor", 3, (JSONObject) null);
                }
                list = hVar.f70085b;
                if (C29643f.m59683a(list)) {
                    C29638a.m59659a(0, "empty ad array, not showing ad this time");
                    C29444a.C29445a aVar3 = new C29444a.C29445a();
                    aVar3.f69953a = 84378473382L;
                    aVar3.f69954b = 3;
                    aVar3.f69956d = C29535k.m59196a().f70379l;
                    C29446b.m58971a();
                    C29446b.m58974a(aVar3.mo51519a());
                    C29381b.m58846a();
                    C29381b.m58847a(1);
                    return null;
                }
            } else {
                C29638a.m59659a(0, " receiving realtime ad ");
                C29628x a3 = C29628x.m59641a();
                if (!a3.mo51922c()) {
                    list2 = null;
                } else {
                    list2 = a3.f70674a.f70132a;
                }
                list = C29654j.m59718a(hVar.f70086c, list2);
                if (C29643f.m59683a(list)) {
                    if (C29643f.m59683a(list2)) {
                        C29638a.m59659a(0, " the realtime array received is empty ");
                        C29375a.m58829a().mo51357a("service_real_time_ad_monitor", 2, (JSONObject) null);
                    } else {
                        C29638a.m59659a(0, " there is no suitable ad between realtime array and preloaded array");
                        i = 5;
                        C29375a.m58829a().mo51357a("service_real_time_ad_monitor", 1, (JSONObject) null);
                    }
                    C29444a.C29445a aVar4 = new C29444a.C29445a();
                    aVar4.f69953a = 84378473382L;
                    aVar4.f69954b = i;
                    aVar4.f69956d = C29535k.m59196a().f70379l;
                    C29446b.m58971a();
                    C29446b.m58974a(aVar4.mo51519a());
                    C29381b.m58846a();
                    C29381b.m58847a(1);
                    return null;
                }
                C29375a.m58829a().mo51357a("service_real_time_ad_monitor", 0, (JSONObject) null);
            }
            if (C29495h.f70235k) {
                C29638a.m59659a(0, "support first show logic, is first show: " + this.f70390g);
                if (this.f70390g) {
                    if (!C29495h.f70221ar) {
                        C29556v.m59363a().mo51734b(true).mo51750h();
                    }
                    C29638a.m59659a(0, "first show, selecting first show ad");
                    list = m59235f(list);
                } else {
                    C29638a.m59659a(0, "not first show, selecting non-first show ad");
                    list = m59237h(list);
                }
            } else {
                C29638a.m59659a(0, "not support first show");
            }
            List<C29455b> e = m59233e(list);
            if (C29643f.m59683a(e)) {
                C29638a.m59659a(0, "not suitable ad, not showing ad this time");
                return null;
            }
            C29455b i2 = m59238i(e);
            if (!(this.f70389f == null || i2 == null)) {
                C29446b.m58971a();
                C29446b.m58977a(this.f70389f, i2);
            }
            this.f70389f = null;
            if (i2 != null) {
                jVar.f70093b = 200;
                jVar.f70092a = i2;
            } else {
                jVar.f70093b = -1;
            }
            return jVar;
        }
    }

    /* renamed from: a */
    private static void m59217a(int i) {
        C29381b.m58846a();
        C29381b.m58847a(i);
    }

    /* renamed from: b */
    private boolean m59227b(long j) {
        if (Math.abs(j - this.f70388e) < C29535k.m59196a().f70371d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51655a(long j) {
        this.f70388e = j;
        if (C29495h.m59095a().f70662j) {
            C29556v.m59363a().mo51739d(j).mo51750h();
        }
    }

    /* renamed from: a */
    private C29455b m59213a(List<C29455b> list) {
        if (C29643f.m59683a(list)) {
            C29638a.m59659a(0, "not suitable ad, not showing ad this time");
            return null;
        } else if (C29628x.m59641a().mo51922c()) {
            C29638a.m59659a(0, " checking ad resource with realtime data ");
            return m59228c(list);
        } else {
            C29638a.m59659a(0, " checking ad resource with non-realtime data ");
            C29375a.m58829a().mo51357a("service_real_time_show", 3, (JSONObject) null);
            return m59225b(list);
        }
    }

    /* renamed from: d */
    private static void m59232d(List<C29455b> list) {
        C29455b bVar;
        if (!C29643f.m59683a(list) && (bVar = list.get(0)) != null && bVar.mo51534a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_expected", Integer.valueOf(bVar.f70025c));
            C29446b.m58971a();
            C29446b.m58973a(bVar, 0, "should_show", null, hashMap);
        }
    }

    /* renamed from: g */
    private static List<C29455b> m59236g(List<C29455b> list) {
        if (C29643f.m59683a(list)) {
            C29638a.m59659a(0, "selecting time gap first show ad, empty array, not showing ad this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C29455b bVar : list) {
            if (bVar.f70043u == 4) {
                arrayList.add(bVar);
            } else {
                C29535k.m59196a().mo51647a(bVar.f70026d, 2007);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static int m59224b(C29455b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C29495h.f70214ak) {
            currentTimeMillis = C29654j.m59752f();
        }
        if (bVar.mo51538d() > currentTimeMillis) {
            C29638a.m59659a(bVar.f70026d, "ad not reached show time");
            return 5001;
        } else if (bVar.mo51539e() < currentTimeMillis) {
            C29638a.m59659a(bVar.f70026d, "ad show time expired");
            return 5002;
        } else if (bVar.f70042t) {
            C29638a.m59659a(bVar.f70026d, "ad call backed");
            return 5003;
        } else if (C29495h.f70218ao == null || C29495h.f70218ao.mo28700a(bVar)) {
            return 5000;
        } else {
            C29638a.m59659a(bVar.f70026d, "ad intercepted");
            return 5007;
        }
    }

    /* renamed from: c */
    private static boolean m59230c(C29455b bVar) {
        int i = bVar.f70039q;
        if (i != 0) {
            if (i == 2) {
                boolean a = C29654j.m59731a(bVar.f70040r, C29556v.m59363a());
                if (a && bVar.f69982G == 3) {
                    a = C29654j.m59731a(bVar.f70041s, C29556v.m59363a());
                }
                if (a) {
                    return a;
                }
                m59220a(bVar, 2);
                return a;
            } else if (i == 3) {
                boolean a2 = C29654j.m59730a(bVar.f70001a, C29556v.m59363a());
                if (!a2) {
                    m59220a(bVar, 1);
                }
                boolean a3 = C29654j.m59731a(bVar.f70040r, C29556v.m59363a());
                if (!a3) {
                    m59220a(bVar, 2);
                }
                if (!a2 || !a3) {
                    return false;
                }
                return true;
            } else if (i != 4) {
                return false;
            }
        }
        boolean a4 = C29654j.m59730a(bVar.f70001a, C29556v.m59363a());
        if (a4) {
            return a4;
        }
        m59220a(bVar, 1);
        return a4;
    }

    /* renamed from: f */
    private List<C29455b> m59235f(List<C29455b> list) {
        if (C29643f.m59683a(list)) {
            C29638a.m59659a(0, "not suitable ad, not showing ad this time");
            if (!C29495h.f70207ad) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<C29455b> arrayList = new ArrayList<>();
        for (C29455b bVar : list) {
            if (bVar.f70043u == 1) {
                C29638a.m59659a(bVar.f70026d, "selected first show ad");
                arrayList.add(bVar);
            } else if (bVar.f70043u != 3) {
                C29535k.m59196a().mo51647a(bVar.f70026d, 2006);
            }
        }
        if (C29643f.m59683a(arrayList) && C29495h.f70207ad) {
            C29638a.m59659a(0, "no first show ad, retrieving local array");
            arrayList = m59231d();
        }
        for (C29455b bVar2 : list) {
            if (bVar2.f70043u == 3) {
                C29638a.m59659a(0, "selected gd ad");
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static List<C29455b> m59237h(List<C29455b> list) {
        if (C29643f.m59683a(list)) {
            C29638a.m59659a(0, "non first show with empty array, not showing this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C29455b bVar : list) {
            if (bVar.f70043u == 1 || bVar.f70043u == 4) {
                C29446b a = C29446b.m58971a();
                C29444a.C29445a aVar = new C29444a.C29445a();
                aVar.f69953a = bVar.f70026d;
                aVar.f69955c = 5005;
                C29444a a2 = aVar.mo51519a();
                if (a.f69959a != null) {
                    a.f69959a.add(a2);
                }
            } else {
                C29638a.m59659a(bVar.f70026d, "not first show, selected non-first show ad");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private int m59212a(boolean z) {
        if (C29654j.m59732a(C29556v.m59363a())) {
            C29638a.m59659a(0, "show time exceeded today, not showing ad this time");
            m59217a(2);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C29495h.f70237m && Math.abs(currentTimeMillis - C29495h.f70238n) > 10000) {
            m59217a(3);
            return 3;
        } else if (Math.abs(currentTimeMillis - C29495h.f70234j) < C29535k.m59196a().f70372e) {
            C29638a.m59659a(0, "background interval illegal, not showing this time");
            m59217a(4);
            return 1;
        } else {
            if (z && C29495h.m59095a().f70662j) {
                long j = C29535k.m59196a().f70376i;
                C29638a.m59659a(0, "current time: " + C29659n.m59765a(currentTimeMillis) + ", last show time: " + C29659n.m59765a(this.f70385a) + ", diff: " + (currentTimeMillis - this.f70385a) + ", cold launch interval: " + j);
                if (Math.abs(currentTimeMillis - this.f70385a) < j) {
                    C29638a.m59659a(0, "splash cold launch show interval illegal, not showing ad this time");
                    m59217a(5);
                    return 5;
                }
            }
            if (!m59227b(currentTimeMillis)) {
                return 4;
            }
            C29638a.m59659a(0, "splash show interval illegal, not showing this time");
            m59217a(5);
            return 2;
        }
    }

    /* renamed from: b */
    private C29455b m59225b(List<C29455b> list) {
        C29455b bVar = null;
        for (C29455b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C29446b.m58971a();
                    C29446b.m58983b(bVar2);
                    C29535k.m59196a().mo51647a(bVar2.f70026d, 2008);
                } else {
                    C29446b.m58971a();
                    C29446b.m58975a(bVar2);
                    if (bVar2.mo51542h() || bVar2.mo51544i()) {
                        if (m59223a(bVar2)) {
                            C29638a.m59659a(bVar2.f70026d, "topview show confirmed");
                        } else {
                            C29638a.m59659a(bVar2.f70026d, "topview show rejected");
                        }
                    } else if (bVar2.mo51534a()) {
                        if (bVar2.mo51530D()) {
                            C29638a.m59659a(bVar2.f70026d, " this ad has reached it\\'s show time limit ");
                        } else if (m59230c(bVar2)) {
                            C29638a.m59659a(bVar2.f70026d, "normal ad ready to show");
                        } else {
                            C29638a.m59659a(bVar2.f70026d, "normal ad failed to show ");
                            if (this.f70387c == bVar2.f70026d) {
                                C29446b.m58971a();
                                C29444a.C29445a aVar = new C29444a.C29445a();
                                aVar.f69953a = bVar2.f70026d;
                                aVar.f69955c = 4004;
                                aVar.f69956d = bVar2.f70032j;
                                aVar.f69954b = 1;
                                C29446b.m58982b(aVar.mo51519a());
                            }
                            C29535k.m59196a().mo51647a(bVar2.f70026d, 2011);
                        }
                    }
                    bVar = bVar2;
                }
            }
        }
        if (bVar == null) {
            C29381b.m58846a();
            C29381b.m58847a(6);
        }
        return bVar;
    }

    /* renamed from: c */
    private C29455b m59228c(List<C29455b> list) {
        LinkedHashMap<Long, String> b = C29628x.m59641a().mo51921b();
        if (b == null) {
            return null;
        }
        if (b.size() > 0) {
            C29455b bVar = null;
            boolean z = false;
            for (Map.Entry<Long, String> entry : b.entrySet()) {
                Long key = entry.getKey();
                String value = entry.getValue();
                Iterator<C29455b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C29455b next = it.next();
                    if (next != null && next.f70026d == key.longValue()) {
                        if (bVar != null) {
                            C29446b.m58971a();
                            C29446b.m58983b(next);
                        } else {
                            C29446b.m58971a();
                            C29446b.m58975a(next);
                            if (!next.mo51542h() && !next.mo51544i()) {
                                boolean a = next.mo51534a();
                                boolean c = m59230c(next);
                                if (!a || !c) {
                                    C29638a.m59659a(next.f70026d, "normal ad failed to show ");
                                    if (!c && this.f70387c == next.f70026d) {
                                        C29446b.m58971a();
                                        C29444a.C29445a aVar = new C29444a.C29445a();
                                        aVar.f69953a = next.f70026d;
                                        aVar.f69955c = 4004;
                                        aVar.f69956d = next.f70032j;
                                        aVar.f69954b = 1;
                                        C29446b.m58982b(aVar.mo51519a());
                                    }
                                } else {
                                    C29638a.m59659a(next.f70026d, "normal ad ready to show");
                                    bVar = (C29455b) next.clone();
                                    bVar.f69978C = true;
                                    bVar.f70032j = value;
                                    C29375a.m58829a().mo51357a("service_real_time_show", 0, (JSONObject) null);
                                }
                                z = true;
                            } else if (m59223a(next)) {
                                C29638a.m59659a(next.f70026d, "topview show confirmed");
                                bVar = next;
                            } else {
                                C29638a.m59659a(next.f70026d, "topview show rejected");
                            }
                        }
                    }
                }
            }
            if (!z) {
                m59218a(1, 1);
            }
            return bVar;
        }
        m59218a(4, 2);
        return null;
    }

    /* renamed from: i */
    private C29455b m59238i(List<C29455b> list) {
        C29455b bVar = null;
        for (C29455b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C29446b.m58971a();
                    C29446b.m58983b(bVar2);
                } else {
                    C29446b.m58971a();
                    C29446b.m58975a(bVar2);
                    if (!bVar2.mo51542h() && !bVar2.mo51544i()) {
                        boolean a = bVar2.mo51534a();
                        boolean c = m59230c(bVar2);
                        if (a) {
                            if (c) {
                                C29638a.m59659a(bVar2.f70026d, "normal ad ready to show");
                                bVar = bVar2;
                            }
                        } else if (c) {
                        }
                        C29638a.m59659a(bVar2.f70026d, "normal ad failed to show ");
                        if (!TextUtils.isEmpty(bVar2.f69980E) && !TextUtils.isEmpty(this.f70386b) && bVar2.f69980E.equals(this.f70386b)) {
                            C29446b.m58971a();
                            C29444a.C29445a aVar = new C29444a.C29445a();
                            aVar.f69953a = bVar2.f70026d;
                            aVar.f69955c = 4004;
                            aVar.f69956d = bVar2.f70032j;
                            aVar.f69954b = 1;
                            C29446b.m58982b(aVar.mo51519a());
                        }
                    } else if (m59223a(bVar2)) {
                        C29638a.m59659a(bVar2.f70026d, "topview show confirmed");
                        return bVar2;
                    } else {
                        C29638a.m59659a(bVar2.f70026d, "topview show rejected");
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private void m59226b(boolean z) {
        C29556v.m59363a().mo51745f().mo51750h();
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad_sequence", Integer.valueOf(C29556v.m59363a().mo51759p()));
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("log_extra", C29556v.m59363a().mo51763t());
        C29446b.m58971a();
        C29446b.m58973a(null, 84378473382L, "valid_stock", hashMap2, hashMap);
        C29638a.m59659a(0, "sending stock request");
        C29479a.m59086a(z);
        if (this.f70390g && C29495h.f70221ar) {
            C29638a.m59659a(0, " consuming first-show ad opportunity ");
            C29556v.m59363a().mo51734b(true).mo51750h();
        }
    }

    /* renamed from: e */
    private List<C29455b> m59233e(List<C29455b> list) {
        if (C29495h.f70214ak) {
            if (C29654j.m59752f() == -1) {
                C29446b.m58971a();
                C29446b.m58972a(0, 1);
                return null;
            }
            C29446b.m58971a();
            C29446b.m58972a(1, 0);
        }
        if (C29643f.m59683a(list)) {
            C29638a.m59659a(0, "empty ad array, not showing ad this time");
            return null;
        }
        if (!TextUtils.isEmpty(list.get(0).f69980E)) {
            this.f70386b = list.get(0).f69980E;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C29455b bVar = list.get(i);
            if (bVar != null) {
                if (bVar.f70038p != null && !bVar.f70038p.isEmpty()) {
                    C29638a.m59659a(bVar.f70026d, "selecting time gap ad");
                    for (int i2 = 0; i2 < bVar.f70038p.size(); i2++) {
                        C29455b bVar2 = bVar.f70038p.get(i2);
                        if (bVar2 != null) {
                            int b = bVar2.mo51535b();
                            if (b != 2000) {
                                C29638a.m59659a(bVar2.f70026d, "time gap ad data illegal");
                                m59221a(bVar2, b, i + "_" + i2);
                                if (i == 0) {
                                    C29446b.m58971a();
                                    C29444a.C29445a aVar = new C29444a.C29445a();
                                    aVar.f69953a = bVar2.f70026d;
                                    aVar.f69955c = b;
                                    aVar.f69956d = bVar2.f70032j;
                                    aVar.f69954b = 1;
                                    C29446b.m58982b(aVar.mo51519a());
                                }
                            } else {
                                C29446b.m58971a();
                                C29446b.m58976a(bVar2, b);
                                int b2 = m59224b(bVar2);
                                if (b2 == 5000) {
                                    C29638a.m59659a(bVar2.f70026d, "time gap ad time-check passed");
                                    arrayList.add(bVar2);
                                    C29446b.m58971a();
                                    C29446b.m58976a(bVar2, b2);
                                } else {
                                    C29446b.m58971a();
                                    C29444a.C29445a aVar2 = new C29444a.C29445a();
                                    aVar2.f69953a = bVar2.f70026d;
                                    aVar2.f69955c = b2;
                                    aVar2.f69956d = bVar2.f70032j;
                                    C29444a.C29445a a = aVar2.mo51518a(C29654j.m59729a(bVar2));
                                    a.f69954b = 1;
                                    C29446b.m58982b(a.mo51519a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.mo51535b();
                if (b3 != 2000) {
                    C29638a.m59659a(bVar.f70026d, "illegal ad data");
                    m59221a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        C29446b.m58971a();
                        C29444a.C29445a aVar3 = new C29444a.C29445a();
                        aVar3.f69953a = bVar.f70026d;
                        aVar3.f69955c = b3;
                        aVar3.f69956d = bVar.f70032j;
                        aVar3.f69954b = 1;
                        C29446b.m58982b(aVar3.mo51519a());
                    }
                } else {
                    C29446b.m58971a();
                    C29446b.m58976a(bVar, b3);
                    int b4 = m59224b(bVar);
                    if (b4 == 5000) {
                        C29638a.m59659a(bVar.f70026d, "ad time-check passed");
                        arrayList.add(bVar);
                        C29446b.m58971a();
                        C29446b.m58976a(bVar, b4);
                    } else {
                        C29446b.m58971a();
                        C29444a.C29445a aVar4 = new C29444a.C29445a();
                        aVar4.f69953a = bVar.f70026d;
                        aVar4.f69955c = b4;
                        aVar4.f69956d = bVar.f70032j;
                        C29444a.C29445a a2 = aVar4.mo51518a(C29654j.m59729a(bVar));
                        a2.f69954b = 1;
                        C29446b.m58982b(a2.mo51519a());
                    }
                }
            }
        }
        if (C29495h.f70214ak) {
            C29628x.m59641a().f70683j = true;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.android.p2092ad.splash.core.p2100e.C29466j m59215a(com.p2082ss.android.p2092ad.splash.core.p2100e.C29466j r17) {
        /*
        // Method dump skipped, instructions count: 945
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29539n.m59215a(com.ss.android.ad.splash.core.e.j):com.ss.android.ad.splash.core.e.j");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0068 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b m59214a(java.util.List<com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b> r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29539n.m59214a(java.util.List, boolean):com.ss.android.ad.splash.core.e.b");
    }

    /* renamed from: a */
    private static void m59218a(int i, int i2) {
        C29446b.m58971a();
        C29444a.C29445a aVar = new C29444a.C29445a();
        aVar.f69953a = 84378473382L;
        aVar.f69954b = i;
        aVar.f69956d = "{}";
        C29446b.m58986c(aVar.mo51519a());
        C29446b.m58971a().mo51520b();
        C29375a.m58829a().mo51357a("service_real_time_show", i2, (JSONObject) null);
    }
}
