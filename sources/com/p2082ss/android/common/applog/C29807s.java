package com.p2082ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.s */
public final class C29807s {
    static {
        Covode.recordClassIndex(36212);
    }

    /* renamed from: a */
    public static void m60041a(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        AppLog.onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }
}
