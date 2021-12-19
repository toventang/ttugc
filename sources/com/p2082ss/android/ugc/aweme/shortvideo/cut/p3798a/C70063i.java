package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.i */
final /* synthetic */ class C70063i implements AbstractC1214u {

    /* renamed from: a */
    private final C70045a f156675a;

    static {
        Covode.recordClassIndex(82483);
    }

    C70063i(C70045a aVar) {
        this.f156675a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C70045a aVar = this.f156675a;
        C0692e<Long, Long> singleVideoPlayBoundary = aVar.f156639d.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2750a != null && singleVideoPlayBoundary.f2751b != null) {
            aVar.f156642g.f134714b.mo96709a(singleVideoPlayBoundary.f2750a.longValue(), singleVideoPlayBoundary.f2751b.longValue());
            aVar.f156642g.f134714b.mo96705a(aVar.f156639d.getSinglePlayingPosition());
        }
    }
}
