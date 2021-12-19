package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.assetpacks.p */
final class BinderC26871p extends BinderC26868m<Void> {

    /* renamed from: c */
    final /* synthetic */ C26873r f63746c;

    static {
        Covode.recordClassIndex(32346);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BinderC26871p(C26873r rVar, C27071m<Void> mVar) {
        super(rVar, mVar);
        this.f63746c = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC26868m, com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public final void mo44547a(Bundle bundle, Bundle bundle2) {
        super.mo44547a(bundle, bundle2);
        if (!this.f63746c.f63757f.compareAndSet(true, false)) {
            C26873r.f63751a.mo44599e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f63746c.mo44503a();
        }
    }
}
