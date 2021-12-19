package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.a */
public final /* synthetic */ class C4006a implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10984a;

    static {
        Covode.recordClassIndex(4539);
    }

    C4006a(PagingViewModel pagingViewModel) {
        this.f10984a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10984a.f10972b.postValue(obj);
    }
}
