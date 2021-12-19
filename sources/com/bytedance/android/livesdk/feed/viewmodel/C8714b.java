package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.b */
public final /* synthetic */ class C8714b implements AbstractC1214u {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21522a;

    static {
        Covode.recordClassIndex(9587);
    }

    C8714b(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21522a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f21522a.f21483j.setValue(obj);
    }
}
