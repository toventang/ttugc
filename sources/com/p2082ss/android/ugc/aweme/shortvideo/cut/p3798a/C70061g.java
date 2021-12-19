package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.g */
final /* synthetic */ class C70061g implements AbstractC1214u {

    /* renamed from: a */
    private final C70045a f156673a;

    static {
        Covode.recordClassIndex(82481);
    }

    C70061g(C70045a aVar) {
        this.f156673a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C70045a aVar = this.f156673a;
        if (aVar.f156639d.getPlayBoundary() != null && aVar.f156639d.getPlayBoundary().f2751b != null) {
            aVar.f156642g.f134714b.mo96715c(aVar.f156639d.getPlayBoundary().f2751b.longValue());
            aVar.mo110512a();
        }
    }
}
