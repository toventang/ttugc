package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.ao */
abstract class AbstractRunnableC25378ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C25368ae f60211a;

    static {
        Covode.recordClassIndex(30777);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41578a();

    public void run() {
        this.f60211a.f60176b.lock();
        try {
            if (!Thread.interrupted()) {
                mo41578a();
                this.f60211a.f60176b.unlock();
            }
        } catch (RuntimeException e) {
            C25386aw awVar = this.f60211a.f60175a;
            awVar.f60245e.sendMessage(awVar.f60245e.obtainMessage(2, e));
        } finally {
            this.f60211a.f60176b.unlock();
        }
    }

    private AbstractRunnableC25378ao(C25368ae aeVar) {
        this.f60211a = aeVar;
    }

    /* synthetic */ AbstractRunnableC25378ao(C25368ae aeVar, byte b) {
        this(aeVar);
    }
}
