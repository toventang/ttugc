package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.ah */
public final /* synthetic */ class RunnableC6681ah implements Runnable {

    /* renamed from: a */
    private final C6561ab f16577a;

    static {
        Covode.recordClassIndex(7419);
    }

    RunnableC6681ah(C6561ab abVar) {
        this.f16577a = abVar;
    }

    public final void run() {
        C6561ab abVar = this.f16577a;
        if (abVar.f16403k != null) {
            abVar.f16403k.run();
        }
    }
}
