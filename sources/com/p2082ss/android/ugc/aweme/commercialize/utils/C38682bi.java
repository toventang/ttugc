package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bi */
public class C38682bi implements AbstractC40547m {

    /* renamed from: c */
    protected final Activity f91384c;

    /* renamed from: d */
    protected AbstractC40735a f91385d;

    /* renamed from: e */
    protected AbstractC40691e f91386e;

    /* renamed from: f */
    protected final C40618a f91387f;

    /* renamed from: g */
    protected final AbstractC40591g f91388g = AbstractC40591g.C40592a.m81943a(this);

    static {
        Covode.recordClassIndex(46223);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: a */
    public final void mo67253a(CharSequence charSequence, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81545g
    /* renamed from: a */
    public final void mo67254a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: c */
    public final void mo67255c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: d */
    public final void mo67256d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: e */
    public final AbstractC40691e mo67257e() {
        return this.f91386e;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: f */
    public final AbstractC40735a mo67258f() {
        return this.f91385d;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public Context getContext() {
        return this.f91384c;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public AbstractC40591g getCrossPlatformBusiness() {
        return this.f91388g;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public C40618a getCrossPlatformParams() {
        return this.f91387f;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: g */
    public final void mo67259g() {
        this.f91385d.mo67259g();
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: h */
    public final boolean mo67263h() {
        return this.f91385d.mo67263h();
    }

    public C38682bi(Activity activity, AbstractC40735a aVar, AbstractC40691e eVar, C40618a aVar2) {
        this.f91384c = activity;
        this.f91385d = aVar;
        this.f91386e = eVar;
        this.f91387f = aVar2;
    }
}
