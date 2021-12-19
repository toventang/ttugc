package com.p2082ss.android.sdk.activity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.a */
public final class C30225a {
    static {
        Covode.recordClassIndex(36733);
    }

    /* renamed from: a */
    public static JSONObject m61165a(Context context, long j, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (com.p2082ss.android.ugc.aweme.utils.C80374ee.m139354a(r13, android.content.Intent.createChooser(r2, "")) != false) goto L_0x000a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ies.uikit.dialog.DialogC18267b m61164a(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, org.json.JSONObject r18) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.activity.C30225a.m61164a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):com.bytedance.ies.uikit.dialog.b");
    }
}
