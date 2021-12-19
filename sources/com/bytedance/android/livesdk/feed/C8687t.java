package com.bytedance.android.livesdk.feed;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.t */
public final class C8687t extends C3866a {

    /* renamed from: a */
    public long f21437a;

    /* renamed from: b */
    public long f21438b;

    static {
        Covode.recordClassIndex(9554);
    }

    /* renamed from: b */
    private long m16966b() {
        long j;
        if (this.f21437a > 0) {
            j = SystemClock.uptimeMillis() - this.f21437a;
        } else {
            j = 0;
        }
        this.f21437a = 0;
        return j;
    }

    /* renamed from: a */
    public final long mo14967a() {
        long j;
        if (this.f21438b > 0) {
            j = SystemClock.uptimeMillis() - this.f21438b;
        } else {
            j = 0;
        }
        this.f21438b = 0;
        return j;
    }

    /* renamed from: a */
    public static void m16965a(float f) {
        JSONObject jSONObject = new JSONObject();
        m9473a(jSONObject, "feed_fps", f);
        C3868c.m9497b("ttlive_feed_list_fps_all", 0, jSONObject);
    }

    /* renamed from: a */
    public final void mo14968a(String str) {
        long b = m16966b();
        JSONObject jSONObject = new JSONObject();
        m9475a(jSONObject, "request_type", str);
        C3868c.m9490a("ttlive_request_feed_api_all", 0, b, jSONObject);
    }

    /* renamed from: a */
    public final void mo14969a(String str, Throwable th) {
        int i;
        String str2;
        m16966b();
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C2908a) {
            i = ((C2908a) th).getErrorCode();
        } else {
            i = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        m9474a(jSONObject, "error_code", (long) i);
        m9475a(jSONObject, "error_msg", str2);
        m9475a(jSONObject, "request_type", str);
        C3868c.m9497b("ttlive_request_feed_api_all", 1, jSONObject);
        C3868c.m9492a("ttlive_request_feed_api_error", 1, jSONObject);
    }
}
