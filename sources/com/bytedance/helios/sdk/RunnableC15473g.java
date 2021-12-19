package com.bytedance.helios.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15484f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.helios.sdk.g */
public final /* synthetic */ class RunnableC15473g implements Runnable {

    /* renamed from: a */
    private final C15434f f37714a;

    static {
        Covode.recordClassIndex(17725);
    }

    RunnableC15473g(C15434f fVar) {
        this.f37714a = fVar;
    }

    public final void run() {
        C15434f fVar = this.f37714a;
        fVar.f37679h.set(!fVar.f37675d.get());
        C15484f.m28490a("Helios-Log-Page-State", "mBackgroundInvokeFlag=" + fVar.f37679h);
    }
}
