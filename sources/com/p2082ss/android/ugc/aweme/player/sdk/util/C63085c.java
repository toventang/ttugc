package com.p2082ss.android.ugc.aweme.player.sdk.util;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.util.c */
public final class C63085c {

    /* renamed from: a */
    public Handler f143384a;

    /* renamed from: b */
    public HandlerC63093e f143385b;

    static {
        Covode.recordClassIndex(73925);
    }

    /* renamed from: a */
    public final void mo101241a(Runnable runnable) {
        HandlerC63093e eVar = this.f143385b;
        if (eVar != null) {
            eVar.mo101244a(runnable);
        } else {
            this.f143384a.post(runnable);
        }
    }

    public C63085c(Looper looper) {
        if (((Boolean) C84191b.f187912p.getValue()).booleanValue()) {
            this.f143385b = new HandlerC63093e(looper);
        } else {
            this.f143384a = new Handler(looper);
        }
    }
}
