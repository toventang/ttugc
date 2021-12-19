package com.snapchat.kit.sdk.core.metrics.p2070c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.C28983b;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.e */
public final class C29000e implements AbstractC88078c<C28999d> {

    /* renamed from: a */
    private final AbstractC89405a<C29004i> f68509a;

    /* renamed from: b */
    private final AbstractC89405a<C28983b<ServerEvent>> f68510b;

    static {
        Covode.recordClassIndex(35197);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28999d(this.f68509a.get(), this.f68510b.get());
    }

    public C29000e(AbstractC89405a<C29004i> aVar, AbstractC89405a<C28983b<ServerEvent>> aVar2) {
        this.f68509a = aVar;
        this.f68510b = aVar2;
    }
}
