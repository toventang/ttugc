package com.bytedance.android.live.core.p213c;

import android.text.TextUtils;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.c.b */
public abstract class AbstractC3855b {
    static {
        Covode.recordClassIndex(4384);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract JSONObject mo9214a();

    /* renamed from: a */
    static JSONObject m9461a(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9462a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C6203g.m13466b(new RunnableC3857d(str, str2));
        }
    }

    /* renamed from: b */
    public static void m9463b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C6203g.m13466b(new RunnableC3863j(str, str2));
        }
    }

    /* renamed from: c */
    public static void m9464c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C6203g.m13466b(new RunnableC3858e(str, str2));
        }
    }

    /* renamed from: b */
    public final void mo9217b(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C6203g.m13466b(new RunnableC3865l(this, str, map));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo9219c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        mo9214a();
        try {
            jSONObject2.put("tag", str);
            jSONObject2.put("params", mo9214a());
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2.toString();
    }

    /* renamed from: a */
    public final void mo9215a(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C6203g.m13466b(new RunnableC3856c(this, str, map));
        }
    }

    /* renamed from: b */
    public final void mo9218b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C6203g.m13466b(new RunnableC3864k(this, str, jSONObject));
        }
    }

    /* renamed from: c */
    public final void mo9220c(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C6203g.m13466b(new RunnableC3860g(this, str, map));
        }
    }

    /* renamed from: a */
    public final void mo9216a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C6203g.m13466b(new RunnableC3862i(this, str, jSONObject));
        }
    }
}
