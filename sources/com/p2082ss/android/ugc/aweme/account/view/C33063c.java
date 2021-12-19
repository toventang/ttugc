package com.p2082ss.android.ugc.aweme.account.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.PrivateAccountTipsViewDelegate;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.view.c */
public final class C33063c implements IPrivateAccountTipsView {

    /* renamed from: a */
    public static final C33063c f78615a = new C33063c();

    /* renamed from: b */
    private final /* synthetic */ IPrivateAccountTipsView f78616b;

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final View mo58484a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return this.f78616b.mo58484a(layoutInflater, viewGroup, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58485a() {
        this.f78616b.mo58485a();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58486a(Bundle bundle) {
        this.f78616b.mo58486a(bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58487a(View view, AbstractC33062b bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f78616b.mo58487a(view, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: b */
    public final void mo58488b() {
        this.f78616b.mo58488b();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: c */
    public final void mo58489c() {
        this.f78616b.mo58489c();
    }

    static {
        Covode.recordClassIndex(39871);
    }

    private C33063c() {
        IPrivateAccountTipsView d = PrivateAccountTipsViewDelegate.m67099d();
        C89219l.m154716b(d, "");
        this.f78616b = d;
    }
}
