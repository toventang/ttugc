package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.networking.C29025a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;
import p4640l.p4641a.p4643b.C89713a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.h */
public final class C29009h implements AbstractC88078c<MetricsClient> {

    /* renamed from: a */
    private final AbstractC89405a<C29025a> f68527a;

    static {
        Covode.recordClassIndex(35206);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C29025a aVar = this.f68527a.get();
        return C88081f.m153153a(aVar.mo50701a(aVar.f68574b, "https://api.snapkit.com", MetricsClient.class, new C89713a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29009h(AbstractC89405a<C29025a> aVar) {
        this.f68527a = aVar;
    }
}
