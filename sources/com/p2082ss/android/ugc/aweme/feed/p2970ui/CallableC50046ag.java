package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.metrics.C59247l;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ag */
final /* synthetic */ class CallableC50046ag implements Callable {

    /* renamed from: a */
    private final C50041af f115531a;

    static {
        Covode.recordClassIndex(59172);
    }

    CallableC50046ag(C50041af afVar) {
        this.f115531a = afVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C50041af afVar = this.f115531a;
        C59247l a = new C59247l("enter_homepage_hot").mo96816a("open_app");
        a.f135247a = "open_app";
        Fragment fragment = afVar.f116587v;
        if (fragment instanceof AbstractC59105l) {
            a.f135248b = ((AbstractC59105l) fragment).mo96558q();
        }
        if (!(afVar.f115519n == null || afVar.f115519n.mo81109aD() == null)) {
            a.mo96817f(afVar.f115519n.mo81109aD());
        }
        a.mo96792f();
        return null;
    }
}
