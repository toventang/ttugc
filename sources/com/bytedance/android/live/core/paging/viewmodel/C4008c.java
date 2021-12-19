package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.c */
public final /* synthetic */ class C4008c implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10986a;

    static {
        Covode.recordClassIndex(4541);
    }

    C4008c(PagingViewModel pagingViewModel) {
        this.f10986a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10986a.f10977g.postValue(obj);
    }
}
