package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.MonitorCrash;
import com.bytedance.crash.util.C14062n;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.m */
public final class C14018m {

    /* renamed from: a */
    public static int f34167a = -1;

    /* renamed from: b */
    public static int f34168b;

    /* renamed from: c */
    private static MonitorCrash f34169c;

    static {
        Covode.recordClassIndex(16083);
    }

    /* renamed from: a */
    public static MonitorCrash m25416a() {
        if (f34169c == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(C13933m.f33936a, "2010", 3010663, "3.1.6-rc.13-ttp", "");
            f34169c = initSDK;
            initSDK.config().setChannel("release");
        }
        return f34169c;
    }

    /* renamed from: a */
    private static void m25419a(JSONObject... jSONObjectArr) {
        int i = 0;
        do {
            JSONObject jSONObject = jSONObjectArr[0];
            if (jSONObject != null) {
                try {
                    for (Map.Entry<String, String> entry : C14004d.m25377a(C13933m.m25221a().f34140a.getCommonParams(), "aid", "4444", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0").entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Throwable unused) {
                }
            }
            i++;
        } while (i <= 0);
    }

    /* renamed from: a */
    public static void m25418a(String str, String... strArr) {
        if (C13933m.f33936a != null) {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            do {
                C14062n.m25593a(jSONObject, strArr[i], strArr[i + 1]);
                i += 2;
            } while (i < 6);
            m25417a(str, jSONObject, null);
        }
    }

    /* renamed from: a */
    public static void m25417a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        if (C13933m.f33936a != null) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            m25419a(jSONObject3);
            m25416a().reportEvent(str, 1, jSONObject3, jSONObject2, null);
        }
    }
}
