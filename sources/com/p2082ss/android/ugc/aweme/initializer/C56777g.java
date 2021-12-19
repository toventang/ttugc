package com.p2082ss.android.ugc.aweme.initializer;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.recommend.p2453a.C35540b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69801c;
import com.p2082ss.android.ugc.aweme.video.hashtag.AVRecommendHashTagResponseViewModel;

/* renamed from: com.ss.android.ugc.aweme.initializer.g */
final /* synthetic */ class C56777g implements AbstractC1214u {

    /* renamed from: a */
    private final ActivityC0945e f129336a;

    static {
        Covode.recordClassIndex(66642);
    }

    C56777g(ActivityC0945e eVar) {
        this.f129336a = eVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        ((AVRecommendHashTagResponseViewModel) C1181ae.m3881a(this.f129336a, (C1175ad.AbstractC1177b) null).mo3983a(AVRecommendHashTagResponseViewModel.class)).f180506a.postValue(C69801c.m123329a((C35540b) obj));
    }
}
