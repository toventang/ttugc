package com.p2082ss.android.ugc.aweme.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2144h.C29919b;
import com.p2082ss.android.p2144h.C29921d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.q */
public final class C39161q {

    /* renamed from: a */
    private static String f92373a;

    static {
        Covode.recordClassIndex(46784);
    }

    /* renamed from: a */
    public static void m79451a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(f92373a)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("launch_from", f92373a);
            }
            C29921d.C29923a.f71406a.mo52234a(str, map, C29919b.f71379g);
        }
    }

    /* renamed from: a */
    public static void m79447a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        if (!TextUtils.isEmpty(f92373a)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch_from", f92373a);
            } catch (JSONException unused) {
                C29921d.C29923a.f71406a.mo52233a("event_v1", str, str2, null, null, jSONObject, C29919b.f71378f);
            }
        } else {
            C29921d.C29923a.f71406a.mo52232a("event_v1", str, str2, C29919b.f71378f);
        }
    }

    /* renamed from: a */
    public static void m79448a(Context context, String str, String str2, long j, long j2) {
        m79450a(context, "event_v1", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m79449a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        m79450a(context, "event_v1", str, str2, j, j2, jSONObject);
    }

    /* renamed from: a */
    public static void m79450a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str4 = str;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str4)) {
                str4 = "event_v1";
            }
            if (!C13627m.m24498a(f92373a)) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    jSONObject2.put("launch_from", f92373a);
                } catch (JSONException unused) {
                }
            }
            if (context != null) {
                C29921d.C29923a.f71406a.mo52233a(str4, str2, str3, Long.valueOf(j), Long.valueOf(j2), jSONObject2, C29919b.f71378f);
            }
        }
    }
}
