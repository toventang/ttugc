package com.p2082ss.android.ttve.monitor;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.c */
public final class C30685c {
    static {
        Covode.recordClassIndex(37255);
    }

    /* renamed from: a */
    public static C14827k m63035a() {
        try {
            return SDKMonitorUtils.m27201a("1357");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m63036a(String str) {
        JSONObject jSONObject;
        C14827k a = m63035a();
        if (!(a == null || (jSONObject = a.f36155b) == null)) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m63038a(String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (m63035a() != null) {
            m63035a().mo23856a(str, i, jSONObject, (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m63037a(Context context, String str, String str2, String str3) {
        SDKMonitorUtils.m27203a(context, "1357", C30689e.m63050a(context, str, str2, str3), new C14827k.AbstractC14835a() {
            /* class com.p2082ss.android.ttve.monitor.C30685c.C306861 */

            static {
                Covode.recordClassIndex(37256);
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
            /* renamed from: a */
            public final Map<String, String> mo21830a() {
                HashMap hashMap = new HashMap();
                hashMap.put("effect_version", "10.5.0_rel_27_mt_202112020108_bc0fd2cb7df");
                return hashMap;
            }
        });
    }
}
