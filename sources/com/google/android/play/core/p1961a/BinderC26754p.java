package com.google.android.play.core.p1961a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractBinderC26932bw;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.p */
public class BinderC26754p<T> extends AbstractBinderC26932bw {

    /* renamed from: a */
    final C26909b f63378a;

    /* renamed from: b */
    final C27071m<T> f63379b;

    /* renamed from: c */
    final /* synthetic */ C26757s f63380c;

    static {
        Covode.recordClassIndex(32226);
    }

    BinderC26754p(C26757s sVar, C26909b bVar, C27071m<T> mVar) {
        this.f63380c = sVar;
        this.f63378a = bVar;
        this.f63379b = mVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26933bx
    /* renamed from: a */
    public void mo44416a(Bundle bundle) {
        this.f63380c.f63385b.mo44651a();
        this.f63378a.mo44598d("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26933bx
    /* renamed from: b */
    public void mo44417b(Bundle bundle) {
        this.f63380c.f63385b.mo44651a();
        this.f63378a.mo44598d("onCompleteUpdate", new Object[0]);
    }
}
