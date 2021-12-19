package com.p2082ss.android.sdk.activity;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.b */
public final class C30226b {
    static {
        Covode.recordClassIndex(36734);
    }

    /* renamed from: a */
    public static void m61166a(JSONObject jSONObject, String str, Object obj) {
        if (!C13627m.m24498a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
