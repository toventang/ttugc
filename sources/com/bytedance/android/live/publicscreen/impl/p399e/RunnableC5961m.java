package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.publicscreen.impl.e.m */
public final /* synthetic */ class RunnableC5961m implements Runnable {

    /* renamed from: a */
    private final C5953h f14947a;

    /* renamed from: b */
    private final AbstractC6571a f14948b;

    static {
        Covode.recordClassIndex(6569);
    }

    RunnableC5961m(C5953h hVar, AbstractC6571a aVar) {
        this.f14947a = hVar;
        this.f14948b = aVar;
    }

    public final void run() {
        this.f14947a.onMessage(this.f14948b);
    }
}
