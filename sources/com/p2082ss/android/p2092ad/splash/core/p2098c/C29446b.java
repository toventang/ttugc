package com.p2082ss.android.p2092ad.splash.core.p2098c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29535k;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.b */
public class C29446b {

    /* renamed from: b */
    private static volatile C29446b f69958b;

    /* renamed from: a */
    public List<C29444a> f69959a = new ArrayList();

    static {
        Covode.recordClassIndex(35840);
    }

    /* renamed from: a */
    public static void m58979a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.putOpt("uri", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.putOpt("path", str2);
            }
            jSONObject2.put("log_extra", C29535k.m59196a().f70379l);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29495h.m59099a(84378473382L, "splash_ad", "error_save_sp", jSONObject);
    }

    /* renamed from: a */
    public static void m58981a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C29535k.m59196a().f70379l);
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29495h.m59099a(84378473382L, "splash_ad", "parse_finished", jSONObject);
    }

    /* renamed from: a */
    public static void m58978a(C29455b bVar, String str) {
        if (bVar != null && !C29657l.m59760a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f70032j)) {
                    jSONObject.put("log_extra", bVar.f70032j);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.f70024b);
            } catch (Exception unused) {
                C29644g.m59686a("error in putting log_extra into json");
            }
            C29495h.m59099a(bVar.f70026d, "splash_ad", str, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m58980a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (!(hashMap == null || hashMap.isEmpty())) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    jSONObject.putOpt(key, value);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m58977a(C29455b bVar, C29455b bVar2) {
        if (bVar != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar2.f70032j)) {
                    jSONObject.put("log_extra", bVar2.f70032j);
                }
                if (!TextUtils.isEmpty(bVar.f69983H)) {
                    jSONObject2.put("topview_ad_id", bVar.f69983H);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", bVar2.f70024b);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C29495h.m59099a(bVar2.f70026d, "splash_ad", "topview_other_show", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo51520b() {
        List<C29444a> list = this.f69959a;
        if (list != null) {
            list.clear();
        }
    }

    private C29446b() {
    }

    /* renamed from: a */
    public static C29446b m58971a() {
        MethodCollector.m26663i(8728);
        if (f69958b == null) {
            synchronized (C29446b.class) {
                try {
                    if (f69958b == null) {
                        f69958b = new C29446b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8728);
                    throw th;
                }
            }
        }
        C29446b bVar = f69958b;
        MethodCollector.m26664o(8728);
        return bVar;
    }

    /* renamed from: c */
    public final void mo51521c() {
        List<C29444a> list = this.f69959a;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    for (C29444a aVar : this.f69959a) {
                        if (aVar != null && aVar.f69950c > 0) {
                            jSONObject.put(new StringBuilder().append(aVar.f69948a).toString(), aVar.f69950c);
                        }
                    }
                    jSONObject3.put("ad_show_fail_list", jSONObject);
                    jSONObject3.put("ad_show_fail_type", 3);
                    jSONObject2.put("log_extra", "{}");
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.put("ad_extra_data", jSONObject3);
                    C29495h.m59099a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                }
                mo51520b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m58982b(C29444a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f69949b > 0 && aVar.f69950c > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f69949b);
                    jSONObject2.put("ad_error_code", aVar.f69950c);
                }
                if (!TextUtils.isEmpty(aVar.f69952e)) {
                    jSONObject2.put("is_topview", aVar.f69952e);
                }
                if (!TextUtils.isEmpty(aVar.f69951d)) {
                    jSONObject.put("log_extra", aVar.f69951d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C29495h.m59099a(aVar.f69948a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: c */
    public static void m58986c(C29444a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.f69949b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f69949b);
                }
                if (aVar.f69950c > 0) {
                    jSONObject2.put("ad_error_code", aVar.f69950c);
                }
                if (!TextUtils.isEmpty(aVar.f69951d)) {
                    jSONObject.put("log_extra", aVar.f69951d);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C29495h.m59099a(aVar.f69948a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: b */
    public static void m58983b(C29455b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f70032j)) {
                    jSONObject.put("log_extra", bVar.f70032j);
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.f70024b);
                if (!C29654j.m59729a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C29644g.m59686a("error in putting log_extra into json");
            }
            C29495h.m59099a(bVar.f70026d, "splash_ad", "ad_no_selected", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m58974a(C29444a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f69949b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f69949b);
                }
                if (!TextUtils.isEmpty(aVar.f69951d)) {
                    jSONObject.put("log_extra", aVar.f69951d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C29495h.m59099a(aVar.f69948a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m58975a(C29455b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f70032j)) {
                    jSONObject.put("log_extra", bVar.f70032j);
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.f70024b);
                if (!C29654j.m59729a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C29644g.m59686a("error in putting log_extra into json");
            }
            C29495h.m59099a(bVar.f70026d, "splash_ad", "ad_selected", jSONObject);
        }
    }

    /* renamed from: b */
    public static void m58985b(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject2.putOpt("status", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C29535k.m59196a().f70379l);
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29495h.m59099a(84378473382L, "splash_ad", "response", jSONObject);
    }

    /* renamed from: a */
    public static void m58972a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("diff", Long.valueOf(C29654j.m59752f() - System.currentTimeMillis()));
            jSONObject2.putOpt("server_time", Long.valueOf(C29654j.m59752f()));
            jSONObject2.putOpt("device_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i2));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", C29535k.m59196a().f70379l);
        } catch (Exception unused) {
            C29644g.m59686a("error in putting data into json");
        }
        C29495h.m59099a(84378473382L, "splash_ad", "valid_time", jSONObject);
    }

    /* renamed from: b */
    public static void m58984b(C29455b bVar, String str) {
        int i;
        if (bVar != null && !C29657l.m59760a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f70032j)) {
                    jSONObject.put("log_extra", bVar.f70032j);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.f70024b);
                if (bVar.mo51542h()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (bVar.mo51545j()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.put("topview_type", i));
                }
            } catch (Exception unused) {
                C29644g.m59686a("error in putting log_extra into json");
            }
            C29495h.m59099a(bVar.f70026d, "splash_ad", str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m58976a(C29455b bVar, int i) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("ad_error_code", Integer.valueOf(i));
        if (C29654j.m59729a(bVar)) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_topview", str);
        m58973a(bVar, 0, "open_splash", null, hashMap);
    }

    /* renamed from: a */
    public static void m58973a(AbstractC29383a aVar, long j, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                m58980a(jSONObject, hashMap);
                m58980a(jSONObject2, hashMap2);
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.mo51372m())) {
                        jSONObject.put("log_extra", aVar.mo51372m());
                    }
                    jSONObject.put("ad_fetch_time", aVar.mo51370f());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C29644g.m59686a("error in putting log_extra into json");
            }
            if (aVar != null) {
                j = aVar.mo51371l();
            }
            C29495h.m59099a(j, "splash_ad", str, jSONObject);
        }
    }
}
