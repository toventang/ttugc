package com.bytedance.android.live.broadcast;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.r */
public final /* synthetic */ class CallableC3654r implements Callable {

    /* renamed from: a */
    private final EnumC3338p f10076a;

    static {
        Covode.recordClassIndex(4166);
    }

    CallableC3654r(EnumC3338p pVar) {
        this.f10076a = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.f10076a.mo8678a());
    }
}
