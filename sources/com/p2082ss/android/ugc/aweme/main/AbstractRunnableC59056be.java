package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.main.be */
public abstract class AbstractRunnableC59056be<T> implements Runnable {

    /* renamed from: a */
    protected WeakReference<T> f134433a;

    static {
        Covode.recordClassIndex(69401);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo96561a(T t);

    public void run() {
        WeakReference<T> weakReference = this.f134433a;
        if (weakReference != null && weakReference.get() != null) {
            mo96561a(this.f134433a.get());
        }
    }

    public AbstractRunnableC59056be(T t) {
        this.f134433a = new WeakReference<>(t);
    }
}
