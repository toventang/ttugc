package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.q */
final class BinderC26872q extends BinderC26868m<Void> {

    /* renamed from: c */
    final int f63747c;

    /* renamed from: d */
    final String f63748d;

    /* renamed from: e */
    final int f63749e;

    /* renamed from: f */
    final /* synthetic */ C26873r f63750f;

    static {
        Covode.recordClassIndex(32347);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BinderC26872q(C26873r rVar, C27071m<Void> mVar, int i, String str, int i2) {
        super(rVar, mVar);
        this.f63750f = rVar;
        this.f63747c = i;
        this.f63748d = str;
        this.f63749e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC26868m, com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public final void mo44546a(Bundle bundle) {
        this.f63750f.f63755d.mo44651a();
        int i = bundle.getInt("error_code");
        C26873r.f63751a.mo44596b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f63749e;
        if (i2 > 0) {
            this.f63750f.mo44557a(this.f63747c, this.f63748d, i2 - 1);
        }
    }
}
