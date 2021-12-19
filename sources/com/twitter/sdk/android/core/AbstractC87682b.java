package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.twitter.sdk.android.core.b */
public abstract class AbstractC87682b<T> implements AbstractC89743d<T> {
    static {
        Covode.recordClassIndex(103669);
    }

    /* renamed from: a */
    public abstract void mo34386a(C87690h<T> hVar);

    /* renamed from: a */
    public abstract void mo34387a(C87810s sVar);

    @Override // p4640l.AbstractC89743d
    /* renamed from: a */
    public final void mo34286a(AbstractC89716b<T> bVar, Throwable th) {
        mo34387a(new C87810s("Request Failure", th));
    }

    @Override // p4640l.AbstractC89743d
    /* renamed from: a */
    public final void mo34287a(AbstractC89716b<T> bVar, C89781l<T> lVar) {
        if (lVar.f203560a.mo144720a()) {
            mo34386a(new C87690h<>(lVar.f203561b, lVar));
        } else {
            mo34387a(new C87796m(lVar));
        }
    }
}
