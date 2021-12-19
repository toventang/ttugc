package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.k */
final class C26866k extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ int f63735a;

    /* renamed from: b */
    final /* synthetic */ String f63736b;

    /* renamed from: c */
    final /* synthetic */ String f63737c;

    /* renamed from: d */
    final /* synthetic */ int f63738d;

    /* renamed from: e */
    final /* synthetic */ C27071m f63739e;

    /* renamed from: f */
    final /* synthetic */ C26873r f63740f;

    static {
        Covode.recordClassIndex(32341);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26866k(C26873r rVar, C27071m mVar, int i, String str, String str2, int i2, C27071m mVar2) {
        super(mVar);
        this.f63740f = rVar;
        this.f63735a = i;
        this.f63736b = str;
        this.f63737c = str2;
        this.f63738d = i2;
        this.f63739e = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            ((AbstractC26937ca) this.f63740f.f63755d.f63837k).mo44643d(this.f63740f.f63753b, C26873r.m53360c(this.f63735a, this.f63736b, this.f63737c, this.f63738d), C26873r.m53357b(), new BinderC26869n(this.f63740f, this.f63739e));
        } catch (RemoteException e) {
            C26873r.f63751a.mo44596b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f63736b, this.f63737c, Integer.valueOf(this.f63738d), Integer.valueOf(this.f63735a));
            this.f63739e.mo44784b(new RuntimeException(e));
        }
    }
}
