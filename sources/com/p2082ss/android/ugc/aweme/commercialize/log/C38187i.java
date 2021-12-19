package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38174b;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.i */
public final class C38187i {
    static {
        Covode.recordClassIndex(45666);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.i$a */
    public static class C38188a {

        /* renamed from: a */
        public AwemeRawAd f90222a;

        /* renamed from: b */
        public String f90223b;

        /* renamed from: c */
        public boolean f90224c;

        /* renamed from: d */
        public JSONObject f90225d;

        /* renamed from: e */
        public Map<String, String> f90226e;

        static {
            Covode.recordClassIndex(45667);
        }

        /* renamed from: a */
        public final JSONObject mo66507a() {
            try {
                JSONObject jSONObject = this.f90225d;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    AwemeRawAd awemeRawAd = this.f90222a;
                    if (awemeRawAd != null) {
                        String logExtra = awemeRawAd.getLogExtra();
                        if (!TextUtils.isEmpty(logExtra)) {
                            jSONObject.put("log_extra", logExtra);
                        }
                        jSONObject.put("is_ad_event", "1");
                        Context a = C17867d.m33078a();
                        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
                        }
                        String str = C58029j.f132254f;
                        if (!C13627m.m24498a(str)) {
                            jSONObject.put("nt", str);
                        }
                    }
                    if (this.f90224c) {
                        jSONObject.put("has_v3", "1");
                    }
                    Map<String, String> map = this.f90226e;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (TextUtils.isEmpty(this.f90223b)) {
                        return jSONObject;
                    }
                    jSONObject.put("refer", this.f90223b);
                    return jSONObject;
                } catch (Throwable unused) {
                    return jSONObject;
                }
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m77453a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C28022o j = C28024q.m56139a(jSONObject.getString("log_extra")).mo46789j();
            JSONObject jSONObject2 = new JSONObject();
            if (j.mo46803c("rit") != null) {
                jSONObject2.put("ctr_rit", j.mo46803c("rit").mo46689c());
            }
            return jSONObject2;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m77454a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception e) {
            e.printStackTrace();
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next) && !TextUtils.equals("category", next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        C38174b.C38175a aVar = new C38174b.C38175a();
        aVar.f90167c = str;
        aVar.f90166b = "realtime_click";
        aVar.f90169e = j2;
        aVar.f90171g = j;
        aVar.f90165a = "event_v3";
        aVar.f90173i = jSONObject2;
        aVar.mo66470a().mo66469a();
        C38161ag.m77365a("ctr_monitor", "ctr_click", m77453a(jSONObject));
    }

    /* renamed from: a */
    public static void m77455a(String str, String str2, JSONObject jSONObject, String str3, long j) {
        C18133a.f43191a.mo28906a(str, str2, str3, jSONObject);
        if (TextUtils.equals("click", str2)) {
            m77454a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            String a = C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3");
            if (!TextUtils.equals(a, "v3")) {
                if (TextUtils.equals(a, "all")) {
                    try {
                        jSONObject.put("_ad_staging_flag", "1");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        if (C16091a.f38741a != null) {
            C16091a.f38741a.onEventV1(C17867d.m33078a(), str, null, str2, str3, j, jSONObject);
        }
    }
}
