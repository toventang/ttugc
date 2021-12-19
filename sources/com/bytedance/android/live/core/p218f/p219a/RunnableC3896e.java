package com.bytedance.android.live.core.p218f.p219a;

import android.net.Uri;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.f.a.e */
final /* synthetic */ class RunnableC3896e implements Runnable {

    /* renamed from: a */
    private final Uri f10790a;

    /* renamed from: b */
    private final long f10791b;

    static {
        Covode.recordClassIndex(4425);
    }

    RunnableC3896e(Uri uri, long j) {
        this.f10790a = uri;
        this.f10791b = j;
    }

    public final void run() {
        Uri uri = this.f10790a;
        long j = this.f10791b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException unused) {
        }
        C3868c.m9499c("hotsoon_image_load_error_rate", 0, jSONObject);
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("url", uri);
            } catch (JSONException unused2) {
            }
            C3868c.m9495a("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            float f = (float) j;
            if (C3868c.m9484a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
                C3868c.m9484a().mo7732a("hotsoon_image_load", "load_time", f);
            }
            C3854a.m9453a(3, "image_monitor", "no cache = " + uri + " duration = " + j);
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("url", uri2);
        C3868c.m9489a(C6542d.m13984a("ttlive_image_load_status"), 0, j, hashMap);
    }
}
