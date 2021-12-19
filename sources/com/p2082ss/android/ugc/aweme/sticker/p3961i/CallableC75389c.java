package com.p2082ss.android.ugc.aweme.sticker.p3961i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3961i.C75385a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.c */
final /* synthetic */ class CallableC75389c implements Callable {

    /* renamed from: a */
    private final C75385a.C753861 f169442a;

    /* renamed from: b */
    private final Effect f169443b;

    static {
        Covode.recordClassIndex(88308);
    }

    CallableC75389c(C75385a.C753861 r1, Effect effect) {
        this.f169442a = r1;
        this.f169443b = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C75385a.C753861 r0 = this.f169442a;
        return C75385a.this.mo118942a(this.f169443b);
    }
}
