package com.bytedance.android.live.core.paging;

import androidx.lifecycle.LiveData;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.paging.p225b.C3988c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.paging.c */
public final class C3990c<CacheKey, T> extends C3969a<T> {

    /* renamed from: a */
    private AbstractC3838b<CacheKey, T> f10932a;

    /* renamed from: b */
    private CacheKey f10933b;

    static {
        Covode.recordClassIndex(4521);
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b, com.bytedance.android.live.core.paging.C3969a
    /* renamed from: j */
    public final void mo9327j() {
        this.f10932a.mo9203a(this.f10933b);
        mo9325h();
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b, com.bytedance.android.live.core.paging.C3969a
    /* renamed from: k */
    public final int mo9328k() {
        return this.f10932a.mo9206c(this.f10933b);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bytedance.android.live.core.a.b<CacheKey, V>, com.bytedance.android.live.core.a.b<CacheKey, T> */
    public C3990c(C3988c<CacheKey, T> cVar, LiveData<AbstractC1036i<T>> liveData) {
        super(cVar, liveData);
        this.f10933b = cVar.f10925k;
        this.f10932a = (AbstractC3838b<CacheKey, V>) cVar.f10926l;
    }
}
