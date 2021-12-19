package com.bytedance.android.live.core.p214d;

import android.text.TextUtils;
import com.bytedance.android.live.base.p178b.AbstractC2955a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.c */
public final class C3868c {
    static {
        Covode.recordClassIndex(4397);
    }

    /* renamed from: a */
    public static void m9495a(String str, String str2, JSONObject jSONObject) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
            m9484a().mo7733a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m9492a(String str, int i, JSONObject jSONObject) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3870e(str, jSONObject, i));
        }
    }

    /* renamed from: a */
    public static void m9494a(String str, long j, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3872g(j, jSONObject, str));
        }
    }

    /* renamed from: a */
    public static void m9493a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3878m(jSONObject2, str, i, jSONObject));
        }
    }

    /* renamed from: a */
    public static void m9496a(Throwable th, String str) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3871f(th, str));
        }
    }

    /* renamed from: a */
    public static AbstractC2955a m9484a() {
        return (AbstractC2955a) C6193a.m13435a(AbstractC2955a.class);
    }

    /* renamed from: a */
    static JSONObject m9485a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static JSONObject m9486a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static JSONObject m9487a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2150");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            C3854a.m9453a(6, "LiveSlardarMonitor", e.getMessage());
        }
        return jSONObject2;
    }

    /* renamed from: b */
    public static void m9497b(String str, int i, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3875j(str, i, jSONObject));
        }
    }

    /* renamed from: c */
    public static void m9499c(String str, int i, JSONObject jSONObject) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            m9484a().mo7730a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m9488a(String str, int i, long j) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3874i(j, str, i));
        }
    }

    /* renamed from: a */
    public static void m9491a(String str, int i, Map<String, Object> map) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3869d(map, str, i));
        }
    }

    /* renamed from: b */
    public static void m9498b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3879n(str, i, jSONObject, jSONObject2));
        }
    }

    /* renamed from: a */
    public static void m9489a(String str, int i, long j, Map<String, Object> map) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3876k(j, map, str, i));
        }
    }

    /* renamed from: a */
    public static void m9490a(String str, int i, long j, JSONObject jSONObject) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            C6203g.m13466b(new RunnableC3877l(j, str, i, jSONObject));
        }
    }
}
