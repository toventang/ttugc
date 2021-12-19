package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.u */
public final class C18361u {

    /* renamed from: a */
    private final Map<String, Object> f43911a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(21033);
    }

    C18361u() {
    }

    /* renamed from: a */
    public final String mo29397a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f43911a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final C18361u mo29396a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f43911a.put(str, obj);
        }
        return this;
    }
}
