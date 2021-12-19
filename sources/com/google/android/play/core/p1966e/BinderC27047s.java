package com.google.android.play.core.p1966e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractBinderC26900ar;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.s */
public class BinderC27047s<T> extends AbstractBinderC26900ar {

    /* renamed from: a */
    final C27071m<T> f64012a;

    /* renamed from: b */
    final /* synthetic */ C27048t f64013b;

    static {
        Covode.recordClassIndex(32523);
    }

    BinderC27047s(C27048t tVar, C27071m<T> mVar) {
        this.f64013b = tVar;
        this.f64012a = mVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: a */
    public void mo44579a(int i, Bundle bundle) {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: b */
    public void mo44582b(int i, Bundle bundle) {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: c */
    public void mo44584c(int i, Bundle bundle) {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: b */
    public final void mo44581b() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: c */
    public final void mo44583c() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onDeferredInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: e */
    public final void mo44586e() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: d */
    public final void mo44585d() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: a */
    public final void mo44580a(Bundle bundle) {
        this.f64013b.f64017c.mo44651a();
        int i = bundle.getInt("error_code");
        C27048t.f64014a.mo44596b("onError(%d)", Integer.valueOf(i));
        this.f64012a.mo44784b(new C26993a(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: a */
    public final void mo44577a() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: a */
    public final void mo44578a(int i) {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: f */
    public final void mo44587f() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26901as
    /* renamed from: g */
    public final void mo44588g() {
        this.f64013b.f64017c.mo44651a();
        C27048t.f64014a.mo44598d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
