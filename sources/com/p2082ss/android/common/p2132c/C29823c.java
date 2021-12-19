package com.p2082ss.android.common.p2132c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.c.c */
public final class C29823c {

    /* renamed from: a */
    private static AbstractC29824a f71166a;

    /* renamed from: com.ss.android.common.c.c$a */
    public interface AbstractC29824a {
        static {
            Covode.recordClassIndex(36229);
        }
    }

    static {
        Covode.recordClassIndex(36228);
    }

    /* renamed from: a */
    public static void m60080a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
            if (f71166a != null) {
                TextUtils.isEmpty(str2);
            }
        }
    }

    /* renamed from: a */
    public static void m60083a(Context context, String str, String str2, JSONObject jSONObject) {
        m60082a(context, "event_v1", str, str2, 0, 0, jSONObject);
    }

    /* renamed from: a */
    public static void m60081a(Context context, String str, String str2, long j, long j2) {
        m60082a(context, "event_v1", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m60082a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "event_v1";
            }
            if (context != null) {
                AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
                if ("event_v1".equals(str) && f71166a != null && "event_v1".equals(str)) {
                    TextUtils.isEmpty(str3);
                }
            }
        }
    }
}
