package com.google.android.play.core.p1966e;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26899aq;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.o */
public final class C27043o extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f64009a;

    /* renamed from: b */
    final /* synthetic */ C27071m f64010b;

    /* renamed from: c */
    final /* synthetic */ C27048t f64011c;

    static {
        Covode.recordClassIndex(32519);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C27043o(C27048t tVar, C27071m mVar, int i, C27071m mVar2) {
        super(mVar);
        this.f64011c = tVar;
        this.f64009a = i;
        this.f64010b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26899aq) this.f64011c.f64017c.f63837k).mo44573a(this.f64011c.f64016b, this.f64009a, C27048t.m53765a(), new BinderC27044p(this.f64011c, this.f64010b));
        } catch (RemoteException e) {
            C27048t.f64014a.mo44597c("cancelInstall(%d)", Integer.valueOf(this.f64009a));
            this.f64010b.mo44784b(new RuntimeException(e));
        }
    }
}
