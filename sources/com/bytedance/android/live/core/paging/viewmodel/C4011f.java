package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.viewmodel.f */
public final /* synthetic */ class C4011f implements AbstractC1214u {

    /* renamed from: a */
    private final PagingViewModel f10989a;

    static {
        Covode.recordClassIndex(4544);
    }

    C4011f(PagingViewModel pagingViewModel) {
        this.f10989a = pagingViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f10989a.f10976f.setValue(obj);
    }
}
