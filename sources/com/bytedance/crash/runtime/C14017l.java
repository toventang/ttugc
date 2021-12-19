package com.bytedance.crash.runtime;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.l */
public final class C14017l {

    /* renamed from: a */
    public static JSONObject f34164a;

    /* renamed from: b */
    public static long f34165b;

    /* renamed from: c */
    private static long f34166c;

    static {
        Covode.recordClassIndex(16082);
    }

    /* renamed from: a */
    public static void m25414a() {
        C14018m.m25417a("npthStart", null, f34164a);
    }

    /* renamed from: a */
    public static void m25415a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = f34164a;
        if (jSONObject == null) {
            f34164a = new JSONObject();
            f34165b = uptimeMillis;
        } else {
            try {
                jSONObject.put(str, uptimeMillis - f34166c);
            } catch (JSONException unused) {
            }
        }
        f34166c = uptimeMillis;
    }
}
