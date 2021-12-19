package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.skate.C29018a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.g */
public final class C29008g implements AbstractC88078c<MetricQueue<SkateEvent>> {

    /* renamed from: a */
    private final AbstractC89405a<C29018a> f68524a;

    /* renamed from: b */
    private final AbstractC89405a<ScheduledExecutorService> f68525b;

    /* renamed from: c */
    private final AbstractC89405a<C28994c> f68526c;

    static {
        Covode.recordClassIndex(35205);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C28983b bVar = new C28983b(this.f68524a.get(), this.f68525b.get(), this.f68526c.get(), 1);
        bVar.mo50354a();
        return C88081f.m153153a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29008g(AbstractC89405a<C29018a> aVar, AbstractC89405a<ScheduledExecutorService> aVar2, AbstractC89405a<C28994c> aVar3) {
        this.f68524a = aVar;
        this.f68525b = aVar2;
        this.f68526c = aVar3;
    }
}
