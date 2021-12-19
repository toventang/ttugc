package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32798n;
import com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b;
import com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate */
public final class PrivateAccountTipsViewDelegate implements IPrivateAccountTipsView {

    /* renamed from: a */
    public C32798n f77782a;

    static {
        Covode.recordClassIndex(39382);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: c */
    public final void mo58489c() {
        this.f77782a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: b */
    public final void mo58488b() {
        C32798n nVar = this.f77782a;
        if (nVar == null) {
            C89219l.m154715b();
        }
        nVar.f78149a = System.currentTimeMillis();
    }

    /* renamed from: d */
    public static IPrivateAccountTipsView m67099d() {
        MethodCollector.m26663i(10882);
        Object a = C81908b.m141854a(IPrivateAccountTipsView.class, false);
        if (a != null) {
            IPrivateAccountTipsView iPrivateAccountTipsView = (IPrivateAccountTipsView) a;
            MethodCollector.m26664o(10882);
            return iPrivateAccountTipsView;
        }
        if (C81908b.f183122E == null) {
            synchronized (IPrivateAccountTipsView.class) {
                try {
                    if (C81908b.f183122E == null) {
                        C81908b.f183122E = new PrivateAccountTipsViewDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10882);
                    throw th;
                }
            }
        }
        PrivateAccountTipsViewDelegate privateAccountTipsViewDelegate = (PrivateAccountTipsViewDelegate) C81908b.f183122E;
        MethodCollector.m26664o(10882);
        return privateAccountTipsViewDelegate;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58485a() {
        if (C17873f.f42636l) {
            C33744d a = new C33744d().mo59983a("result", "background");
            long currentTimeMillis = System.currentTimeMillis();
            C32798n nVar = this.f77782a;
            if (nVar == null) {
                C89219l.m154715b();
            }
            C39162r.m79460a("private_notify_exit", a.mo59981a("stay_time", currentTimeMillis - nVar.f78149a).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58486a(Bundle bundle) {
        if (bundle == null) {
            C39162r.onEventV3("private_notify_show");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final void mo58487a(View view, AbstractC33062b bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C32798n nVar = new C32798n(view, bVar);
        this.f77782a = nVar;
        nVar.f78151c.findViewById(R.id.b_f).setOnClickListener(new C32798n.View$OnClickListenerC32801c(nVar));
        Context context = nVar.f78151c.getContext();
        String string = context.getString(R.string.cv9);
        C89219l.m154716b(string, "");
        String string2 = context.getString(R.string.b60, string);
        C89219l.m154716b(string2, "");
        SpannableString spannableString = new SpannableString(string2);
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        spannableString.setSpan(new C32798n.C32802d(context, C0643b.m2378c(context, R.color.bx)), a, string.length() + a, 34);
        TextView textView = (TextView) nVar.f78151c.findViewById(R.id.eij);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        textView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
        ((PrivateAccountUserSettingsApi) nVar.f78150b.getValue()).setPrivatePolicyShow("minor_private_policy_status", "0").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C32798n.C32803e.f78157a, C32798n.C32804f.f78158a);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    /* renamed from: a */
    public final View mo58484a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.gd, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
