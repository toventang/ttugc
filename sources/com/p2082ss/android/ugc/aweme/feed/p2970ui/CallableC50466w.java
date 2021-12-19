package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.C59247l;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.w */
final /* synthetic */ class CallableC50466w implements Callable {

    /* renamed from: a */
    private final C50403p f116562a;

    /* renamed from: b */
    private final String f116563b;

    static {
        Covode.recordClassIndex(59602);
    }

    CallableC50466w(C50403p pVar, String str) {
        this.f116562a = pVar;
        this.f116563b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C50403p pVar = this.f116562a;
        String str = this.f116563b;
        C59247l a = new C59247l("enter_homepage_follow").mo96816a("open_app");
        a.f135247a = "open_app";
        if (!TextUtils.isEmpty(str)) {
            a.f135248b = str;
        }
        if (!(pVar.f116377q == null || pVar.f116377q.mo81109aD() == null)) {
            a.mo96817f(pVar.f116377q.mo81109aD());
        }
        a.mo96792f();
        return null;
    }
}
