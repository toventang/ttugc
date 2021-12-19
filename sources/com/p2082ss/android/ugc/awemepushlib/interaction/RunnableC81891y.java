package com.p2082ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.awemepushlib.interaction.y */
public final /* synthetic */ class RunnableC81891y implements Runnable {

    /* renamed from: a */
    private final Runnable f183058a;

    static {
        Covode.recordClassIndex(95305);
    }

    RunnableC81891y(Runnable runnable) {
        this.f183058a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f183058a;
        if (C81890x.f183056c) {
            runnable.run();
        } else {
            C81890x.f183055b.add(runnable);
        }
    }
}
