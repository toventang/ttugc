package com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.b */
public final class C42871b {

    /* renamed from: a */
    public static long f99968a = -1;

    /* renamed from: b */
    public static final C42871b f99969b = new C42871b();

    /* renamed from: c */
    private static long f99970c = -1;

    private C42871b() {
    }

    static {
        Covode.recordClassIndex(50976);
    }

    /* renamed from: a */
    public static void m85602a(long j, boolean z) {
        String str;
        if (f99970c <= 0) {
            f99970c = j;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", j - f99968a);
            if (z) {
                str = "lynx";
            } else {
                str = "";
            }
            jSONObject.put("fe_flag", str);
            C29819a.m60077a("search_transfer_firstscreen_time_monitor", jSONObject);
        }
    }
}
