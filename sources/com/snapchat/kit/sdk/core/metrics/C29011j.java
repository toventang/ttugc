package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p2068a.C28980a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.j */
public final class C29011j implements AbstractC88078c<MetricQueue<OpMetric>> {

    /* renamed from: a */
    private final AbstractC89405a<C28980a> f68530a;

    /* renamed from: b */
    private final AbstractC89405a<ScheduledExecutorService> f68531b;

    /* renamed from: c */
    private final AbstractC89405a<C28994c> f68532c;

    static {
        Covode.recordClassIndex(35208);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C28983b bVar = new C28983b(this.f68530a.get(), this.f68531b.get(), this.f68532c.get(), 10);
        bVar.mo50354a();
        return C88081f.m153153a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29011j(AbstractC89405a<C28980a> aVar, AbstractC89405a<ScheduledExecutorService> aVar2, AbstractC89405a<C28994c> aVar3) {
        this.f68530a = aVar;
        this.f68531b = aVar2;
        this.f68532c = aVar3;
    }
}
