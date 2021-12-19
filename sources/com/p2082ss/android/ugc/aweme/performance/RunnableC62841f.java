package com.p2082ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.performance.f */
final /* synthetic */ class RunnableC62841f implements Runnable {

    /* renamed from: a */
    private final JSONObject f142511a;

    static {
        Covode.recordClassIndex(73667);
    }

    RunnableC62841f(JSONObject jSONObject) {
        this.f142511a = jSONObject;
    }

    public final void run() {
        C39162r.m79461a("tool_performance_fps_info", this.f142511a);
    }
}
