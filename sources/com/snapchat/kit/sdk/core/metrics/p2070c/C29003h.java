package com.snapchat.kit.sdk.core.metrics.p2070c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.h */
public final class C29003h implements AbstractC88078c<C28995a> {

    /* renamed from: a */
    private final AbstractC89405a<String> f68513a;

    /* renamed from: b */
    private final AbstractC89405a<KitPluginType> f68514b;

    /* renamed from: c */
    private final AbstractC89405a<Boolean> f68515c;

    static {
        Covode.recordClassIndex(35200);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28995a(this.f68513a.get(), this.f68514b.get(), this.f68515c.get().booleanValue());
    }

    public C29003h(AbstractC89405a<String> aVar, AbstractC89405a<KitPluginType> aVar2, AbstractC89405a<Boolean> aVar3) {
        this.f68513a = aVar;
        this.f68514b = aVar2;
        this.f68515c = aVar3;
    }
}
