package com.p2082ss.android.ugc.aweme.account.p2245d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32903d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.d.c */
public final class C31627c extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f75662a = C89250i.m154773a((AbstractC89171a) new C31628a(this));

    /* renamed from: b */
    private HashMap f75663b;

    static {
        Covode.recordClassIndex(38356);
    }

    /* renamed from: g */
    private String m65934g() {
        return (String) this.f75662a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75663b == null) {
            this.f75663b = new HashMap();
        }
        View view = (View) this.f75663b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75663b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75663b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$a */
    static final class C31628a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31627c f75664a;

        static {
            Covode.recordClassIndex(38357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31628a(C31627c cVar) {
            super(0);
            this.f75664a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f75664a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.d.c$d */
    public static final class C31632d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C31627c f75668a;

        static {
            Covode.recordClassIndex(38361);
        }

        C31632d(C31627c cVar) {
            this.f75668a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f75668a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m65933c("resend").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m65934g());
        lVar.f77920b = false;
        lVar.f77922d = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.ara);
        bVar.f78107f = getString(R.string.arb, m65934g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m65933c("auto_system").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        C32407x.m66807b(this, str, 6, null).mo143251d(new C31629b(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$b */
    static final class C31629b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31627c f75665a;

        static {
            Covode.recordClassIndex(38358);
        }

        C31629b(C31627c cVar) {
            this.f75665a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22328o oVar = (C22328o) obj;
            C31627c cVar = this.f75665a;
            Bundle arguments = this.f75665a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Bundle bundle = new Bundle(arguments);
            C32582d.m67061a(bundle, "");
            String str = oVar.f52769j;
            C89219l.m154716b(str, "");
            C32582d.m67072d(bundle, str);
            bundle.putInt("next_page", EnumC32594j.INPUT_EMAIL_CHANGE.getValue());
            cVar.mo58461a(bundle);
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22412g>> m65933c(String str) {
        C89219l.m154721d(str, "");
        AbstractC88973n<C22291d<C22412g>> a = C32407x.m66788a(this, m65934g(), 6, str, (Map) null, (String) null, 112).mo143235a((AbstractC88428a) new C31632d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$c */
    static final class View$OnClickListenerC31630c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31627c f75666a;

        static {
            Covode.recordClassIndex(38359);
        }

        View$OnClickListenerC31630c(C31627c cVar) {
            this.f75666a = cVar;
        }

        public final void onClick(View view) {
            C32308a aVar;
            ClickAgent.onClick(view);
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            if (f.isPhoneBinded()) {
                User f2 = C36085cj.m73552f();
                C89219l.m154716b(f2, "");
                if (!TextUtils.isEmpty(f2.getBindPhone())) {
                    User f3 = C36085cj.m73552f();
                    C89219l.m154716b(f3, "");
                    String bindPhone = f3.getBindPhone();
                    ActivityC0945e activity = this.f75666a.getActivity();
                    C89219l.m154716b(bindPhone, "");
                    TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(activity, bindPhone, this.f75666a.mo58458A());
                    if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
                        C32903d.C32904a.m67541a(this.f75666a, bindPhone, "auto_system").mo143251d(new AbstractC88433f(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.p2245d.C31627c.View$OnClickListenerC31630c.C316311 */

                            /* renamed from: a */
                            final /* synthetic */ View$OnClickListenerC31630c f75667a;

                            static {
                                Covode.recordClassIndex(38360);
                            }

                            {
                                this.f75667a = r1;
                            }

                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(Object obj) {
                                this.f75667a.f75666a.mo57644a(true);
                            }
                        }).mo143246c();
                        return;
                    } else {
                        this.f75666a.mo57644a(false);
                        return;
                    }
                }
            }
            C32857g.m67459b(this.f75666a.getContext(), this.f75666a.mo58466w(), this.f75666a.mo58467x());
        }
    }

    /* renamed from: a */
    public final void mo57644a(boolean z) {
        C32582d.m67064a(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        Bundle bundle = new Bundle(arguments);
        C32582d.m67061a(bundle, "");
        bundle.putInt("next_page", EnumC32594j.VERIFY_PHONE.getValue());
        bundle.putInt("next_next_page", EnumC32594j.INPUT_EMAIL_CHANGE.getValue());
        User f = C36085cj.m73552f();
        C89219l.m154716b(f, "");
        String bindPhone = f.getBindPhone();
        C89219l.m154716b(bindPhone, "");
        C32582d.m67067b(bundle, bindPhone);
        mo58461a(bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(getString(R.string.flb));
        ((TuxTextView) mo57434c(R.id.a3v)).setOnClickListener(new View$OnClickListenerC31630c(this));
    }
}
