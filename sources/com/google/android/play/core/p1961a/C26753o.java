package com.google.android.play.core.p1961a;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26931bv;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.a.o */
final class C26753o extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ C27071m f63375a;

    /* renamed from: b */
    final /* synthetic */ String f63376b;

    /* renamed from: c */
    final /* synthetic */ C26757s f63377c;

    static {
        Covode.recordClassIndex(32225);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26753o(C26757s sVar, C27071m mVar, C27071m mVar2, String str) {
        super(mVar);
        this.f63377c = sVar;
        this.f63375a = mVar2;
        this.f63376b = str;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26931bv) this.f63377c.f63385b.f63837k).mo44636b(this.f63377c.f63386c, C26757s.m53134b(), new BinderC26755q(this.f63377c, this.f63375a));
        } catch (RemoteException e) {
            C26757s.f63383a.mo44597c("completeUpdate(%s)", this.f63376b);
            this.f63375a.mo44784b(new RuntimeException(e));
        }
    }
}
