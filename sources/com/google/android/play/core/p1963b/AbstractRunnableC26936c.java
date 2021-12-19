package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.b.c */
public abstract class AbstractRunnableC26936c implements Runnable {

    /* renamed from: g */
    public final C27071m<?> f63817g;

    static {
        Covode.recordClassIndex(32411);
    }

    AbstractRunnableC26936c() {
    }

    public AbstractRunnableC26936c(C27071m<?> mVar) {
        this.f63817g = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44415a();

    public final void run() {
        try {
            mo44415a();
        } catch (Exception e) {
            C27071m<?> mVar = this.f63817g;
            if (mVar != null) {
                mVar.mo44784b(e);
            }
        }
    }
}
