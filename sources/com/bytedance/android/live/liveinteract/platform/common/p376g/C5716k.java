package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3964w;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4013a;
import com.bytedance.android.live.liveinteract.multiguest.p326e.C5203a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableCpuRateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableUseProcFileCpuRateSetting;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.k */
public final /* synthetic */ class C5716k implements AbstractC88434g {

    /* renamed from: a */
    private final C5715j f14507a;

    static {
        Covode.recordClassIndex(6314);
    }

    C5716k(C5715j jVar) {
        this.f14507a = jVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C5715j jVar = this.f14507a;
        JSONObject jSONObject = new JSONObject();
        float a = ((float) C3964w.m9651a()) / 1024.0f;
        float f = a - jVar.f14500c;
        C3966y.m9669e().getPackageName();
        if (LiveMtEnableCpuRateSetting.INSTANCE.enable() && SystemClock.elapsedRealtime() - C3964w.f10861a > 5000) {
            double d = 0.0d;
            if (C4013a.m9782b() && LiveMtEnableUseProcFileCpuRateSetting.INSTANCE.enable()) {
                d = C4013a.m9781a();
            }
            C3964w.f10862b = String.valueOf(d);
            C3964w.f10861a = SystemClock.elapsedRealtime();
        }
        String str = C3964w.f10862b;
        Context e = C3966y.m9669e();
        jSONObject.put("vendor", jVar.f14498a);
        jSONObject.put("server_ip", jVar.f14499b);
        jSONObject.put("resolution_ratio", jVar.f14502e * jVar.f14503f);
        jSONObject.put("memory", a + "MB");
        jSONObject.put("live_push_memory", f + "MB");
        jSONObject.put("cpu", str);
        jSONObject.put("room_id", jVar.f14501d);
        jSONObject.put("video_bitrate", jVar.f14504g);
        jSONObject.put("video_fps", jVar.f14505h);
        jSONObject.put("rtmp_type", 2);
        C5203a aVar = new C5203a();
        aVar.f13447a = jSONObject.toString();
        aVar.f13449c = C11115u.m19743a().mo17915b().mo13161c();
        aVar.f13448b = ((IHostContext) C6193a.m13435a(IHostContext.class)).getServerDeviceId();
        if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132249a = C13624l.m24481a(C13624l.m24479a(e));
        }
        aVar.f13450d = C58029j.f132249a;
        return aVar;
    }
}
