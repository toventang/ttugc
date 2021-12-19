package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C26863h extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f63721a;

    /* renamed from: b */
    final /* synthetic */ String f63722b;

    /* renamed from: c */
    final /* synthetic */ String f63723c;

    /* renamed from: d */
    final /* synthetic */ int f63724d;

    /* renamed from: e */
    final /* synthetic */ C27071m f63725e;

    /* renamed from: f */
    final /* synthetic */ C26873r f63726f;

    static {
        Covode.recordClassIndex(32338);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26863h(C26873r rVar, C27071m mVar, int i, String str, String str2, int i2, C27071m mVar2) {
        super(mVar);
        this.f63726f = rVar;
        this.f63721a = i;
        this.f63722b = str;
        this.f63723c = str2;
        this.f63724d = i2;
        this.f63725e = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26937ca) this.f63726f.f63755d.f63837k).mo44637a(this.f63726f.f63753b, C26873r.m53360c(this.f63721a, this.f63722b, this.f63723c, this.f63724d), C26873r.m53357b(), new BinderC26868m(this.f63726f, this.f63725e, (char) 0));
        } catch (RemoteException unused) {
            C26873r.f63751a.mo44597c("notifyChunkTransferred", new Object[0]);
        }
    }
}
