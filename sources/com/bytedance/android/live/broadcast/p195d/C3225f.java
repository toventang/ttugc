package com.bytedance.android.live.broadcast.p195d;

import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3665b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.d.f */
public final class C3225f implements AbstractC3665b {
    static {
        Covode.recordClassIndex(3706);
    }

    @Override // com.bytedance.android.live.broadcast.stream.p205a.AbstractC3665b
    /* renamed from: a */
    public final void mo8573a(String str) {
        C3854a.m9453a(4, "live-stream-sdk", str);
    }

    @Override // com.bytedance.android.live.broadcast.stream.p205a.AbstractC3665b
    /* renamed from: a */
    public final void mo8574a(String str, Throwable th) {
        C3854a.m9460b("live-stream-sdk", str, th);
    }
}
