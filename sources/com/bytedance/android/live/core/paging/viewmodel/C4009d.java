package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.d */
public final /* synthetic */ class C4009d implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10987a;

    static {
        Covode.recordClassIndex(4542);
    }

    C4009d(PagingViewModel pagingViewModel) {
        this.f10987a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10987a.f10974d.postValue(obj);
    }
}
