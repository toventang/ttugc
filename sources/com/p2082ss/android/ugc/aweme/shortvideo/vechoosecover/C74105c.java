package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.c */
final /* synthetic */ class C74105c implements AbstractC1214u {

    /* renamed from: a */
    private final ChooseCoverActivity f166380a;

    static {
        Covode.recordClassIndex(86858);
    }

    C74105c(ChooseCoverActivity chooseCoverActivity) {
        this.f166380a = chooseCoverActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f166380a.f166353h.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
