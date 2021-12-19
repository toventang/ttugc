package com.google.android.play.core.p1961a;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26931bv;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.a.n */
final class C26752n extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ String f63372a;

    /* renamed from: b */
    final /* synthetic */ C27071m f63373b;

    /* renamed from: c */
    final /* synthetic */ C26757s f63374c;

    static {
        Covode.recordClassIndex(32224);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26752n(C26757s sVar, C27071m mVar, String str, C27071m mVar2) {
        super(mVar);
        this.f63374c = sVar;
        this.f63372a = str;
        this.f63373b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26931bv) this.f63374c.f63385b.f63837k).mo44635a(this.f63374c.f63386c, C26757s.m53132a(this.f63374c, this.f63372a), new BinderC26756r(this.f63374c, this.f63373b, this.f63372a));
        } catch (RemoteException e) {
            C26757s.f63383a.mo44597c("requestUpdateInfo(%s)", this.f63372a);
            this.f63373b.mo44784b(new RuntimeException(e));
        }
    }
}
