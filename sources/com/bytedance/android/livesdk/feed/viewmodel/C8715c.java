package com.bytedance.android.livesdk.feed.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.c */
public final /* synthetic */ class C8715c implements AbstractC1214u {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21523a;

    static {
        Covode.recordClassIndex(9588);
    }

    C8715c(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21523a = baseFeedDataViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        BaseFeedDataViewModel baseFeedDataViewModel = this.f21523a;
        if (obj == BaseFeedRepository.EnumC8657a.SUCCESS) {
            Integer value = baseFeedDataViewModel.f21485l.getValue();
            if (value == null) {
                value = 0;
            }
            baseFeedDataViewModel.f21485l.setValue(Integer.valueOf(value.intValue() + 1));
        }
    }
}
