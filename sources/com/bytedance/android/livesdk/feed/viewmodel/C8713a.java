package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.a */
public final /* synthetic */ class C8713a implements AbstractC1214u {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21521a;

    static {
        Covode.recordClassIndex(9586);
    }

    C8713a(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21521a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f21521a.f21482i.setValue(obj);
    }
}
