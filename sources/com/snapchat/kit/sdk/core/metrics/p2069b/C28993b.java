package com.snapchat.kit.sdk.core.metrics.p2069b;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.b */
public final class C28993b implements AbstractC88078c<C28991a> {

    /* renamed from: a */
    private final AbstractC89405a<C27910f> f68489a;

    static {
        Covode.recordClassIndex(35190);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28991a(this.f68489a.get());
    }

    public C28993b(AbstractC89405a<C27910f> aVar) {
        this.f68489a = aVar;
    }
}
