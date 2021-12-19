package com.google.android.play.core.p1966e;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26899aq;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.n */
public final class C27042n extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f64006a;

    /* renamed from: b */
    final /* synthetic */ C27071m f64007b;

    /* renamed from: c */
    final /* synthetic */ C27048t f64008c;

    static {
        Covode.recordClassIndex(32518);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C27042n(C27048t tVar, C27071m mVar, int i, C27071m mVar2) {
        super(mVar);
        this.f64008c = tVar;
        this.f64006a = i;
        this.f64007b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26899aq) this.f64008c.f64017c.f63837k).mo44574a(this.f64008c.f64016b, this.f64006a, new BinderC27045q(this.f64008c, this.f64007b));
        } catch (RemoteException e) {
            C27048t.f64014a.mo44597c("getSessionState(%d)", Integer.valueOf(this.f64006a));
            this.f64007b.mo44784b(new RuntimeException(e));
        }
    }
}
