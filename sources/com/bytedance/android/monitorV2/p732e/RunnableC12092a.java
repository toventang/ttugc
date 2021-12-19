package com.bytedance.android.monitorV2.p732e;

import com.bytedance.android.monitorV2.p740l.C12126c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.e.a */
public final class RunnableC12092a implements Runnable {

    /* renamed from: a */
    private final Runnable f29020a;

    static {
        Covode.recordClassIndex(13821);
    }

    public final void run() {
        try {
            this.f29020a.run();
        } catch (Exception unused) {
            C12126c.m21636a();
        }
    }

    public RunnableC12092a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        this.f29020a = runnable;
    }
}
