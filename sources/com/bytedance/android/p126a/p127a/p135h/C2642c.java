package com.bytedance.android.p126a.p127a.p135h;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.h.c */
public final class C2642c {
    static {
        Covode.recordClassIndex(3030);
    }

    /* renamed from: a */
    public static IllegalArgumentException m7647a(String str) {
        return new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static JSONObject m7648a(Throwable th, JSONObject jSONObject) {
        if (th == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("err", th.getMessage());
            jSONObject.put("err_type", th.getClass().getSimpleName());
            Throwable cause = th.getCause();
            if (cause != null) {
                while (true) {
                    Throwable cause2 = cause.getCause();
                    if (cause2 == null) {
                        break;
                    }
                    cause = cause2;
                }
                jSONObject.put("err_inner", cause.getMessage());
                jSONObject.put("err_type_inner", cause.getClass().getSimpleName());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
