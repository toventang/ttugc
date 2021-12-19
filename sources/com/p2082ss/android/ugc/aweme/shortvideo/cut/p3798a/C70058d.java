package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.d */
final /* synthetic */ class C70058d implements AbstractC1214u {

    /* renamed from: a */
    private final C70045a f156670a;

    static {
        Covode.recordClassIndex(82478);
    }

    C70058d(C70045a aVar) {
        this.f156670a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C70045a aVar = this.f156670a;
        Boolean bool = (Boolean) obj;
        aVar.f156641f = bool != null && bool.booleanValue();
        if (bool == null || !bool.booleanValue()) {
            aVar.f156642g.mo96696a();
        } else {
            aVar.f156642g.mo96697b();
        }
    }
}
