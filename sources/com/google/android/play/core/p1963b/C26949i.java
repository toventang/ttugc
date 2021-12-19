package com.google.android.play.core.p1963b;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.i */
final class C26949i extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ IBinder f63822a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC26951k f63823b;

    static {
        Covode.recordClassIndex(32424);
    }

    C26949i(ServiceConnectionC26951k kVar, IBinder iBinder) {
        this.f63823b = kVar;
        this.f63822a = iBinder;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        C26952l lVar = this.f63823b.f63825a;
        lVar.f63837k = lVar.f63833g.mo44414a(this.f63822a);
        C26952l lVar2 = this.f63823b.f63825a;
        lVar2.f63828b.mo44598d("linkToDeath", new Object[0]);
        try {
            lVar2.f63837k.asBinder().linkToDeath(lVar2.f63835i, 0);
        } catch (RemoteException unused) {
            lVar2.f63828b.mo44597c("linkToDeath failed", new Object[0]);
        }
        this.f63823b.f63825a.f63831e = false;
        for (AbstractRunnableC26936c cVar : this.f63823b.f63825a.f63830d) {
            cVar.run();
        }
        this.f63823b.f63825a.f63830d.clear();
    }
}
