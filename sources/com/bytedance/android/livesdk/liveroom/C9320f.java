package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.liveroom.f */
final /* synthetic */ class C9320f implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f22756a = new C9320f();

    static {
        Covode.recordClassIndex(10254);
    }

    private C9320f() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", ((Throwable) obj).getMessage());
        C3868c.m9491a("ttlive_audience_task_report", 1, hashMap);
    }
}
