package com.bytedance.android.livesdk.p442ai;

import android.os.Build;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.s */
public final class C6749s {
    static {
        Covode.recordClassIndex(7487);
    }

    /* renamed from: a */
    public static void m14407a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        C3866a.m9475a(jSONObject, "device_name", Build.MODEL);
        C3866a.m9475a(jSONObject, "last_cdn_play_url", str);
        C3866a.m9475a(jSONObject, "url", str2);
        C3866a.m9475a(jSONObject, "pull_stream_data", str3);
        C3866a.m9475a(jSONObject, "default_resolution", str4);
        C3866a.m9475a(jSONObject, "sdk_params", str5);
        C3866a.m9474a(jSONObject, "uid", C11115u.m19743a().mo17915b().mo13161c());
        C3868c.m9497b("ttlive_audience_enter_room_stream_switch", 0, jSONObject);
    }
}
