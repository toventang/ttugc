package com.bytedance.android.monitor.p707e;

import com.bytedance.android.monitor.p714l.C11948b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.e.a */
public final class RunnableC11928a implements Runnable {

    /* renamed from: a */
    private final Runnable f28541a;

    static {
        Covode.recordClassIndex(13654);
    }

    public final void run() {
        try {
            this.f28541a.run();
        } catch (Exception unused) {
            C11948b.m21086a();
        }
    }

    public RunnableC11928a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        this.f28541a = runnable;
    }
}
