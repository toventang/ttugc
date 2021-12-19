package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.x */
public final class C14077x {
    static {
        Covode.recordClassIndex(16144);
    }

    /* renamed from: a */
    public static void m25670a(C13864b bVar, Header header, CrashType crashType) {
        if (bVar != null) {
            m25671a(bVar.f33757a, header, crashType);
        }
    }

    /* renamed from: a */
    private static void m25671a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a = C13933m.m25226b().mo22549a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        JSONObject jSONObject2 = header.f33753a;
                        if (jSONObject2 != null) {
                            jSONObject2.put("unique_key", str);
                            return;
                        }
                        return;
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
