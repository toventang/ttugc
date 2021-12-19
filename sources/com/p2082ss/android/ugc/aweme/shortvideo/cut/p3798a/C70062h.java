package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.h */
final /* synthetic */ class C70062h implements AbstractC1214u {

    /* renamed from: a */
    private final C70045a f156674a;

    static {
        Covode.recordClassIndex(82482);
    }

    C70062h(C70045a aVar) {
        this.f156674a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C70045a aVar = this.f156674a;
        if (aVar.f156639d.getPlayBoundary() != null && aVar.f156639d.getPlayBoundary().f2750a != null) {
            aVar.f156642g.f134714b.mo96712b(aVar.f156639d.getPlayBoundary().f2750a.longValue());
            aVar.mo110512a();
        }
    }
}
