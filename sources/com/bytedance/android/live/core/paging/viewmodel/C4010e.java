package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.e */
public final /* synthetic */ class C4010e implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10988a;

    static {
        Covode.recordClassIndex(4543);
    }

    C4010e(PagingViewModel pagingViewModel) {
        this.f10988a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10988a.f10975e.postValue(obj);
    }
}
