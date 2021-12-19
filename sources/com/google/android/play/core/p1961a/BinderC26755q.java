package com.google.android.play.core.p1961a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.install.C27055a;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.tasks.C27071m;

/* renamed from: com.google.android.play.core.a.q */
final class BinderC26755q extends BinderC26754p<Void> {
    static {
        Covode.recordClassIndex(32227);
    }

    BinderC26755q(C26757s sVar, C27071m<Void> mVar) {
        super(sVar, new C26909b("OnCompleteUpdateCallback"), mVar);
    }

    @Override // com.google.android.play.core.p1961a.BinderC26754p, com.google.android.play.core.p1963b.AbstractC26933bx
    /* renamed from: b */
    public final void mo44417b(Bundle bundle) {
        super.mo44417b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f63379b.mo44784b(new C27055a(bundle.getInt("error.code", -2)));
        } else {
            this.f63379b.mo44783a((Object) null);
        }
    }
}
