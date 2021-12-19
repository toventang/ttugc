package com.p2082ss.android.ugc.aweme.sticker.p3961i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3961i.C75385a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d */
final /* synthetic */ class CallableC75390d implements Callable {

    /* renamed from: a */
    private final C75385a.C753872 f169444a;

    /* renamed from: b */
    private final Effect f169445b;

    static {
        Covode.recordClassIndex(88309);
    }

    CallableC75390d(C75385a.C753872 r1, Effect effect) {
        this.f169444a = r1;
        this.f169445b = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C75385a.C753872 r0 = this.f169444a;
        return C75385a.this.mo118942a(this.f169445b);
    }
}
