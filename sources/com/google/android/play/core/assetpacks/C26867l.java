package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.l */
public final class C26867l extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ C27071m f63741a;

    /* renamed from: b */
    final /* synthetic */ C26873r f63742b;

    static {
        Covode.recordClassIndex(32342);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26867l(C26873r rVar, C27071m mVar, C27071m mVar2) {
        super(mVar);
        this.f63742b = rVar;
        this.f63741a = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26937ca) this.f63742b.f63756e.f63837k).mo44641b(this.f63742b.f63753b, C26873r.m53357b(), new BinderC26871p(this.f63742b, this.f63741a));
        } catch (RemoteException unused) {
            C26873r.f63751a.mo44597c("keepAlive", new Object[0]);
        }
    }
}
