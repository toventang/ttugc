package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87794k;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.identity.b */
public final class C87695b {

    /* renamed from: a */
    public final AtomicReference<AbstractC87694a> f199207a = new AtomicReference<>(null);

    static {
        Covode.recordClassIndex(103684);
    }

    C87695b() {
    }

    /* renamed from: a */
    public final boolean mo142139a() {
        if (this.f199207a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo142140a(Activity activity, AbstractC87694a aVar) {
        if (mo142139a()) {
            C87794k.m152811c().mo142114c();
        } else if (aVar.mo142138a(activity)) {
            boolean compareAndSet = this.f199207a.compareAndSet(null, aVar);
            if (compareAndSet) {
                return compareAndSet;
            }
            C87794k.m152811c().mo142114c();
            return compareAndSet;
        }
        return false;
    }
}
