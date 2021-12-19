package com.p2082ss.android.p2092ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.C29543r;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29464h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29477s;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29641d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.a */
public class C29387a {

    /* renamed from: a */
    private static volatile C29387a f69773a;

    static {
        Covode.recordClassIndex(35781);
    }

    /* renamed from: a */
    public static C29387a m58870a() {
        MethodCollector.m26663i(13355);
        if (f69773a == null) {
            synchronized (C29387a.class) {
                try {
                    if (f69773a == null) {
                        f69773a = new C29387a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13355);
                    throw th;
                }
            }
        }
        C29387a aVar = f69773a;
        MethodCollector.m26664o(13355);
        return aVar;
    }

    /* renamed from: b */
    static void m58871b() {
        if (C29495h.f70201Y) {
            C29543r a = C29543r.m59263a();
            if (!C29495h.f70181E) {
                C29495h.f70181E = true;
                C29543r.RunnableC295441 r1 = new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29543r.RunnableC295441 */

                    static {
                        Covode.recordClassIndex(35938);
                    }

                    public final void run() {
                        String str;
                        String str2;
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            C29556v a = C29556v.m59363a();
                            if (C29495h.f70210ag) {
                                str = C29641d.m59681b(C29556v.f70430a + "splash_ad_ordered_data");
                            } else {
                                str = a.f70433b.getString("splash_ad_data", "");
                            }
                            C29644g.m59688b("load splashAdData from local time : " + (System.currentTimeMillis() - currentTimeMillis2));
                            List<C29455b> a2 = C29543r.m59264a(str);
                            C29644g.m59688b("wait for load local:" + (System.currentTimeMillis() - currentTimeMillis));
                            if (!C29495h.f70182F) {
                                C29535k a3 = C29535k.m59196a();
                                if (C29495h.f70207ad) {
                                    a3.f70369b = C29543r.m59265b();
                                }
                                long j = C29556v.m59363a().mo51753j();
                                long k = C29556v.m59363a().mo51754k();
                                long j2 = C29556v.m59363a().f70433b.getLong("splash_ad_cold_launch_interval", 0);
                                long j3 = C29556v.m59363a().f70433b.getLong("splash_ad_last_show_time", 0);
                                String s = C29556v.m59363a().mo51762s();
                                String t = C29556v.m59363a().mo51763t();
                                boolean n = C29556v.m59363a().mo51757n();
                                String string = C29556v.m59363a().f70433b.getString("key_splash_ad_time_period_map", "");
                                C29644g.m59688b("wait for load sp:" + (System.currentTimeMillis() - currentTimeMillis));
                                if (!TextUtils.isEmpty(s)) {
                                    JSONArray jSONArray = new JSONArray(s);
                                    if (jSONArray.length() == 2) {
                                        a3.mo51646a(jSONArray.getLong(0) * 1000);
                                        a3.mo51649b(jSONArray.getLong(1) * 1000);
                                    }
                                }
                                a3.f70368a = a2;
                                a3.f70372e = j;
                                a3.f70371d = k;
                                a3.f70376i = j2;
                                a3.f70379l = t;
                                a3.f70375h = n;
                                if (!TextUtils.isEmpty(string)) {
                                    a3.f70378k = C29477s.m59062a(string);
                                }
                                if (C29495h.m59095a().f70662j) {
                                    C29539n.m59216a().f70385a = j3;
                                }
                                C29495h.f70182F = true;
                                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                                C29644g.m59688b("load local and init time:".concat(String.valueOf(currentTimeMillis3)));
                                JSONObject jSONObject = new JSONObject();
                                if (C29495h.f70210ag) {
                                    str2 = "dur_use_file";
                                } else {
                                    str2 = "dur_use_sp";
                                }
                                jSONObject.put(str2, currentTimeMillis3);
                                C29375a.m58829a().mo51359a("service_load_local_data", jSONObject);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                if (C29495h.f70209af) {
                    C29495h.f70232h.execute(r1);
                } else {
                    r1.run();
                }
            }
        } else {
            C29543r.m59263a();
            if (!C29495h.f70181E) {
                long currentTimeMillis = System.currentTimeMillis();
                C29495h.f70181E = true;
                try {
                    C29464h c = C29543r.m59267c();
                    if (!C29495h.f70182F) {
                        C29535k a2 = C29535k.m59196a();
                        a2.f70370c = c;
                        long j = C29556v.m59363a().mo51753j();
                        long k = C29556v.m59363a().mo51754k();
                        String s = C29556v.m59363a().mo51762s();
                        String t = C29556v.m59363a().mo51763t();
                        boolean n = C29556v.m59363a().mo51757n();
                        if (!TextUtils.isEmpty(s)) {
                            JSONArray jSONArray = new JSONArray(s);
                            if (jSONArray.length() == 2) {
                                C29535k.m59196a().mo51646a(jSONArray.getLong(0) * 1000);
                                C29535k.m59196a().mo51649b(jSONArray.getLong(1) * 1000);
                            }
                        }
                        a2.f70372e = j;
                        a2.f70371d = k;
                        a2.f70370c = c;
                        a2.f70379l = t;
                        a2.f70375h = n;
                        C29495h.f70182F = true;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration_load_local_data_time", currentTimeMillis2 - currentTimeMillis);
                        C29375a.m58829a().mo51359a("service_ad_load_local_sync_data", jSONObject);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C29375a.m58829a().mo51356a(e, "key_exception_local_data");
                }
            }
        }
    }
}
