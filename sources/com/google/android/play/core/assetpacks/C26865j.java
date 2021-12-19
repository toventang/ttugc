package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.j */
final class C26865j extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f63732a;

    /* renamed from: b */
    final /* synthetic */ C27071m f63733b;

    /* renamed from: c */
    final /* synthetic */ C26873r f63734c;

    static {
        Covode.recordClassIndex(32340);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26865j(C26873r rVar, C27071m mVar, int i, C27071m mVar2) {
        super(mVar);
        this.f63734c = rVar;
        this.f63732a = i;
        this.f63733b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26937ca) this.f63734c.f63755d.f63837k).mo44642c(this.f63734c.f63753b, C26873r.m53358b(this.f63732a), C26873r.m53357b(), new BinderC26868m(this.f63734c, this.f63733b, (short) 0));
        } catch (RemoteException unused) {
            C26873r.f63751a.mo44597c("notifySessionFailed", new Object[0]);
        }
    }
}
