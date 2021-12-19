package com.bytedance.android.livesdk.p447ak;

import android.os.SystemClock;
import com.bytedance.android.livesdk.p561j.C9055bu;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.ak.g */
final /* synthetic */ class C6771g implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f16814a = new C6771g();

    static {
        Covode.recordClassIndex(7509);
    }

    private C6771g() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        DataChannelGlobal.f42558d.mo28321a(C9055bu.class, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
