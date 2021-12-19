package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.f */
public final class C26946f extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ C26952l f63821a;

    static {
        Covode.recordClassIndex(32421);
    }

    C26946f(C26952l lVar) {
        this.f63821a = lVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        if (this.f63821a.f63837k != null) {
            this.f63821a.f63828b.mo44598d("Unbind from service.", new Object[0]);
            this.f63821a.f63827a.unbindService(this.f63821a.f63836j);
            this.f63821a.f63831e = false;
            this.f63821a.f63837k = null;
            this.f63821a.f63836j = null;
        }
    }
}
