package com.snapchat.kit.sdk.creative.p2071a;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.creative.a.c */
public final class C29047c implements AbstractC88078c<C29046b> {

    /* renamed from: a */
    private final AbstractC89405a<MetricQueue<OpMetric>> f68618a;

    static {
        Covode.recordClassIndex(35393);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29046b(this.f68618a.get());
    }

    public C29047c(AbstractC89405a<MetricQueue<OpMetric>> aVar) {
        this.f68618a = aVar;
    }
}
