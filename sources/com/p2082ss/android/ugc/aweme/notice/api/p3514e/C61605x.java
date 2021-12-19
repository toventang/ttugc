package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.x */
public final class C61605x {

    /* renamed from: a */
    static boolean f139805a = true;

    /* renamed from: b */
    static long f139806b;

    /* renamed from: c */
    public static final C61605x f139807c = new C61605x();

    private C61605x() {
    }

    static {
        Covode.recordClassIndex(72283);
    }

    /* renamed from: a */
    private static void m111561a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("message");
                int i = jSONObject2.getInt("code");
                boolean z = jSONObject2.getBoolean("is_connecting");
                jSONObject.put("error_msg", string);
                jSONObject.put("error_code", i);
                jSONObject.put("is_connecting", z);
            } catch (Exception unused) {
                jSONObject.put("error_msg", str);
            }
        }
    }

    /* renamed from: a */
    static void m111560a(int i, SocketState socketState) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_duration", SystemClock.uptimeMillis() - f139806b);
            jSONObject.put("connection_type", socketState.f33438a);
            jSONObject.put("connection_state", socketState.f33439b);
            jSONObject.put("channel_id", socketState.f33441d);
            jSONObject.put("channel_type", socketState.f33442e);
            jSONObject.put("error", socketState.f33443f);
            m111561a(socketState.f33443f, jSONObject);
            C12290b.m22060a("aweme_long_connection_error_rate_v2", i, jSONObject);
            C56244a.m102190b("WsConnectionReportManager", "reportConnect status: ".concat(String.valueOf(i)));
        } catch (Exception unused) {
        }
    }
}
