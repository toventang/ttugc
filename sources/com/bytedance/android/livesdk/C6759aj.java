package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.aj */
final /* synthetic */ class C6759aj implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f16794a = new C6759aj();

    static {
        Covode.recordClassIndex(7497);
    }

    private C6759aj() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6555i.m14021b();
        C3854a.m9455a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
