package com.p2082ss.ttvideoengine.p4415h;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.w */
final /* synthetic */ class RunnableC86496w implements Runnable {

    /* renamed from: a */
    private final boolean f194310a;

    /* renamed from: b */
    private final JSONObject f194311b;

    static {
        Covode.recordClassIndex(101724);
    }

    RunnableC86496w(boolean z, JSONObject jSONObject) {
        this.f194310a = z;
        this.f194311b = jSONObject;
    }

    public final void run() {
        EnumC86487t.instance.addEventV2(this.f194310a, this.f194311b, "videoplayer_oneevent");
    }
}
