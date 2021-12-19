package com.bytedance.android.livesdk.p442ai;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ai.r */
final /* synthetic */ class RunnableC6748r implements Runnable {

    /* renamed from: a */
    private final C6741n f16753a;

    /* renamed from: b */
    private final float f16754b;

    static {
        Covode.recordClassIndex(7486);
    }

    RunnableC6748r(C6741n nVar, float f) {
        this.f16753a = nVar;
        this.f16754b = f;
    }

    public final void run() {
        C6741n nVar = this.f16753a;
        float f = this.f16754b;
        if (nVar.f16729a && f >= 0.0f) {
            nVar.f16730b = f;
        }
    }
}
