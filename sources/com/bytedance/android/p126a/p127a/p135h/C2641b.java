package com.bytedance.android.p126a.p127a.p135h;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.AbstractC2632f;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p128a.AbstractC2612a;
import com.bytedance.android.p126a.p127a.p131d.AbstractC2625a;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.h.b */
public final class C2641b {
    static {
        Covode.recordClassIndex(3029);
    }

    public static void onEventExpired(C2626b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", new JSONArray((Collection) bVar.f7884f)).put("is_retry", bVar.f7888j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m7645a("track_url_expired", bVar, jSONObject);
    }

    /* renamed from: a */
    public static boolean m7646a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static void m7645a(String str, C2626b bVar, JSONObject jSONObject) {
        m7646a(jSONObject, "track_url_list", "");
        m7646a(jSONObject, "track_status", (Object) -1);
        m7646a(jSONObject, "ts", Long.valueOf(bVar.f7887i));
        m7646a(jSONObject, "local_time_ms", String.valueOf(System.currentTimeMillis()));
        m7646a(jSONObject, "is_retry", (Object) 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            optJSONObject.put("expire_seconds", bVar.f7892n).put("is_c2s_sdk", 1);
            jSONObject.put("ad_extra_data", optJSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m7644a(str, (AbstractC2625a) bVar, jSONObject);
    }

    /* renamed from: a */
    private static void m7644a(String str, AbstractC2625a aVar, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2;
        Object opt;
        AbstractC2612a aVar2 = C2628e.m7607d().f7910g;
        if (aVar2 == null) {
            C2640a.m7643a("EventCallback not initialized.....");
            return;
        }
        long j = -1;
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = "";
        if (aVar != null) {
            str3 = aVar.mo7142a();
            j = aVar.f7881c;
            str2 = aVar.f7885g;
            currentTimeMillis = aVar.f7887i;
        } else {
            str2 = str3;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            m7646a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
            jSONObject.put("tag", "track_ad").put("value", j).put("track_label", str3).put("log_extra", str2).put("category", "event_v3").put("is_ad_event", "1").put("ad_event_type", "monitor");
            AbstractC2632f fVar = C2628e.m7607d().f7911h;
            if (fVar != null) {
                jSONObject.put("user_agent", C2646f.m7661c(fVar.mo7152a()));
            }
            if (aVar != null) {
                if (!jSONObject.has("ad_extra_data") || (jSONObject2 = jSONObject.optJSONObject("ad_extra_data")) == null) {
                    jSONObject2 = new JSONObject();
                }
                boolean z = false;
                if (aVar.f7886h != null) {
                    JSONObject jSONObject3 = aVar.f7886h;
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (opt = jSONObject3.opt(next)) != null && m7646a(jSONObject2, next, opt)) {
                            z = true;
                        }
                    }
                }
                if (!aVar.f7882d && aVar.f7883e > 0) {
                    jSONObject2.put("non_std_ad_id", aVar.f7883e);
                } else if (z) {
                }
                jSONObject.put("ad_extra_data", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        aVar2.mo7117a(str, jSONObject);
    }
}
