package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.b */
public final /* synthetic */ class C4007b implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10985a;

    static {
        Covode.recordClassIndex(4540);
    }

    C4007b(PagingViewModel pagingViewModel) {
        this.f10985a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10985a.f10973c.postValue(obj);
    }
}
