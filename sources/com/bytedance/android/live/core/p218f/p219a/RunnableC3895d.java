package com.bytedance.android.live.core.p218f.p219a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.f.a.d */
final /* synthetic */ class RunnableC3895d implements Runnable {

    /* renamed from: a */
    private final Throwable f10788a;

    /* renamed from: b */
    private final C24636b f10789b;

    static {
        Covode.recordClassIndex(4424);
    }

    RunnableC3895d(Throwable th, C24636b bVar) {
        this.f10788a = th;
        this.f10789b = bVar;
    }

    public final void run() {
        Throwable th = this.f10788a;
        C24636b bVar = this.f10789b;
        Context e = C3966y.m9669e();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C3894c.m9523a();
        }
        if (C58029j.f132256h) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorDesc", th.toString());
                jSONObject.put("url", bVar.mSourceUri);
                jSONObject.put("userId", ((IHostUser) C6193a.m13435a(IHostUser.class)).getCurUserId());
                if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132254f = NetworkUtils.getNetworkAccessType(e);
                }
                jSONObject.put("networkType", C58029j.f132254f);
                C3868c.m9495a("hotsoon_image_load_log", "image_error", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C3868c.m9499c("hotsoon_image_load_error_rate", 1, jSONObject);
            String uri = bVar.mSourceUri.toString();
            String th2 = th.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("url", uri);
            hashMap.put("error_msg", th2);
            C3868c.m9489a(C6542d.m13984a("ttlive_image_load_status"), 1, 0, hashMap);
            C3868c.m9489a(C6542d.m13985b("ttlive_image_load_status"), 1, 0, hashMap);
        }
    }
}
