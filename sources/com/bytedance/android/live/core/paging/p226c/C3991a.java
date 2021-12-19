package com.bytedance.android.live.core.paging.p226c;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.paging.p225b.C3988c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.core.paging.c.a */
public final class C3991a<CacheKey, V> extends AbstractC3993c<Long, V, CacheKey> {

    /* renamed from: n */
    private final AbstractC3992b<V> f10934n;

    static {
        Covode.recordClassIndex(4522);
    }

    public C3991a(C3988c<CacheKey, V> cVar) {
        super(cVar);
        this.f10934n = cVar.f10929o;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.core.paging.p226c.AbstractC3993c
    /* renamed from: a */
    public final /* synthetic */ Long mo9362a(C2965a aVar) {
        if (aVar == null || !aVar.hasMore) {
            return null;
        }
        return Long.valueOf(aVar.f8718d);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.core.paging.p226c.AbstractC3993c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC88979t mo9361a(boolean z, Long l) {
        return this.f10934n.mo9363a(z, l);
    }
}
