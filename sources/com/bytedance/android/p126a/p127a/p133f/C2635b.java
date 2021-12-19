package com.bytedance.android.p126a.p127a.p133f;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.f.b */
public class C2635b {

    /* renamed from: i */
    public boolean f7931i = true;

    static {
        Covode.recordClassIndex(3023);
    }

    /* renamed from: a */
    public void mo7153a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f7931i = m7632a(jSONObject, "is_enable", true);
            } catch (Throwable th) {
                C2640a.m7643a(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    protected static boolean m7631a(JSONObject jSONObject, String str) {
        return m7632a(jSONObject, str, false);
    }

    /* renamed from: a */
    protected static boolean m7632a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str)) {
            return z;
        }
        if (jSONObject.optBoolean(str, z)) {
            C2640a.m7643a("please replace True/False with 1/0 for setting :".concat(String.valueOf(str)));
            return true;
        } else if (jSONObject.optInt(str, z ? 1 : 0) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
