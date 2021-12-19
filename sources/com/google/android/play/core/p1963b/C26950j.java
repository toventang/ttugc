package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.j */
final class C26950j extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ ServiceConnectionC26951k f63824a;

    static {
        Covode.recordClassIndex(32425);
    }

    C26950j(ServiceConnectionC26951k kVar) {
        this.f63824a = kVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        C26952l lVar = this.f63824a.f63825a;
        lVar.f63828b.mo44598d("unlinkToDeath", new Object[0]);
        lVar.f63837k.asBinder().unlinkToDeath(lVar.f63835i, 0);
        this.f63824a.f63825a.f63837k = null;
        this.f63824a.f63825a.f63831e = false;
    }
}
