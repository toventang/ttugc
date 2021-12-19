package com.bytedance.android.livesdkapi.session;

import com.bytedance.android.live.base.p178b.AbstractC2955a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.session.d */
public final class C11868d {

    /* renamed from: a */
    public static List<Integer> f28398a = new ArrayList();

    /* renamed from: b */
    private static String f28399b = "LiveLinkSlardarMonitor";

    /* renamed from: a */
    static AbstractC2955a m20956a() {
        return (AbstractC2955a) C6193a.m13435a(AbstractC2955a.class);
    }

    static {
        Covode.recordClassIndex(13586);
    }

    /* renamed from: a */
    private static JSONObject m20957a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2150");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            C3854a.m9453a(6, f28399b, e.getMessage());
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m20959a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C3854a.m9453a(6, f28399b, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m20960a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C3854a.m9453a(6, f28399b, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m20958a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (m20956a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (!str.startsWith("ttlive_")) {
                str = "ttlive_".concat(String.valueOf(str));
            }
            m20960a(jSONObject3, "tag", "ttlive_sdk");
            m20960a(jSONObject3, "ttlive_sdk_version", "2150");
            m20956a().mo7735a(str, jSONObject, jSONObject2, m20957a(jSONObject3));
        }
    }
}
