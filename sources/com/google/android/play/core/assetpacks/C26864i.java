package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.i */
public final class C26864i extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f63727a;

    /* renamed from: b */
    final /* synthetic */ String f63728b;

    /* renamed from: c */
    final /* synthetic */ C27071m f63729c;

    /* renamed from: d */
    final /* synthetic */ int f63730d;

    /* renamed from: e */
    final /* synthetic */ C26873r f63731e;

    static {
        Covode.recordClassIndex(32339);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26864i(C26873r rVar, C27071m mVar, int i, String str, C27071m mVar2, int i2) {
        super(mVar);
        this.f63731e = rVar;
        this.f63727a = i;
        this.f63728b = str;
        this.f63729c = mVar2;
        this.f63730d = i2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26937ca) this.f63731e.f63755d.f63837k).mo44640b(this.f63731e.f63753b, C26873r.m53359b(this.f63727a, this.f63728b), C26873r.m53357b(), new BinderC26872q(this.f63731e, this.f63729c, this.f63727a, this.f63728b, this.f63730d));
        } catch (RemoteException unused) {
            C26873r.f63751a.mo44597c("notifyModuleCompleted", new Object[0]);
        }
    }
}
