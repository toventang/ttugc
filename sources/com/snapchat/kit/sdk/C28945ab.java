package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.C28965f;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.core.metrics.skate.C29021c;
import com.snapchat.kit.sdk.core.metrics.skate.C29023d;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.ab */
public final class C28945ab implements AbstractC88078c<C29021c> {

    /* renamed from: a */
    private final C29085n f68384a;

    /* renamed from: b */
    private final AbstractC89405a<C28965f> f68385b;

    /* renamed from: c */
    private final AbstractC89405a<C29023d> f68386c;

    /* renamed from: d */
    private final AbstractC89405a<MetricQueue<SkateEvent>> f68387d;

    /* renamed from: e */
    private final AbstractC89405a<C29073m> f68388e;

    /* renamed from: f */
    private final AbstractC89405a<SnapKitInitType> f68389f;

    static {
        Covode.recordClassIndex(35129);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C29085n nVar = this.f68384a;
        return C88081f.m153153a(new C29021c(this.f68385b.get(), this.f68386c.get(), this.f68387d.get(), this.f68388e.get(), this.f68389f.get(), nVar.f68753f, nVar.f68754g), "Cannot return null from a non-@Nullable @Provides method");
    }

    C28945ab(C29085n nVar, AbstractC89405a<C28965f> aVar, AbstractC89405a<C29023d> aVar2, AbstractC89405a<MetricQueue<SkateEvent>> aVar3, AbstractC89405a<C29073m> aVar4, AbstractC89405a<SnapKitInitType> aVar5) {
        this.f68384a = nVar;
        this.f68385b = aVar;
        this.f68386c = aVar2;
        this.f68387d = aVar3;
        this.f68388e = aVar4;
        this.f68389f = aVar5;
    }
}
