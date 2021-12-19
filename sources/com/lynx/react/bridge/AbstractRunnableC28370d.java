package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28509e;

/* renamed from: com.lynx.react.bridge.d */
public abstract class AbstractRunnableC28370d implements Runnable {

    /* renamed from: a */
    private final AbstractC28509e f66625a;

    static {
        Covode.recordClassIndex(34354);
    }

    /* renamed from: a */
    public abstract void mo48440a();

    public final void run() {
        try {
            mo48440a();
        } catch (RuntimeException e) {
            this.f66625a.mo48666a(e);
        }
    }

    public AbstractRunnableC28370d(AbstractC28509e eVar) {
        this.f66625a = eVar;
    }
}
