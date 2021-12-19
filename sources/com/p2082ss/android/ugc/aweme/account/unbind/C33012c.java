package com.p2082ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.unbind.C33022d;
import com.p2082ss.android.ugc.aweme.account.unbind.IUnbindApi;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.c */
public final class C33012c extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f78551a = C89250i.m154773a((AbstractC89171a) new C33017d(this));

    /* renamed from: b */
    private HashMap f78552b;

    static {
        Covode.recordClassIndex(39818);
    }

    /* renamed from: g */
    private String m67651g() {
        return (String) this.f78551a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    public final String ad_() {
        return "UnbindInputCodeFragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78552b == null) {
            this.f78552b = new HashMap();
        }
        View view = (View) this.f78552b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78552b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78552b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$e */
    static final class C33018e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33012c f78558a;

        static {
            Covode.recordClassIndex(39824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33018e(C33012c cVar) {
            super(0);
            this.f78558a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f78558a.mo58532t();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$f */
    static final class C33019f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33012c f78559a;

        static {
            Covode.recordClassIndex(39825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33019f(C33012c cVar) {
            super(0);
            this.f78559a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f78559a.mo58532t();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m67651g());
        lVar.f77920b = C33024e.m67663b(this);
        lVar.f77922d = C32582d.m67073d(this);
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        if (C33024e.m67663b(this)) {
            C33024e.m67660a(this, "resend", new C33018e(this));
        } else {
            C33024e.m67662b(this, "resend", new C33019f(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$d */
    static final class C33017d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C33012c f78557a;

        static {
            Covode.recordClassIndex(39823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33017d(C33012c cVar) {
            super(0);
            this.f78557a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (C33024e.m67663b(this.f78557a)) {
                User f = C36085cj.m73552f();
                C89219l.m154716b(f, "");
                return f.getBindPhone();
            }
            User f2 = C36085cj.m73552f();
            C89219l.m154716b(f2, "");
            return f2.getEmail();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.h2l);
        if (C33024e.m67661a(this)) {
            i = R.string.h2k;
        } else {
            i = R.string.h21;
        }
        bVar.f78107f = getString(i, m67651g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$a */
    public static final class C33013a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C33012c f78553a;

        static {
            Covode.recordClassIndex(39819);
        }

        C33013a(C33012c cVar) {
            this.f78553a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C33022d> iVar) {
            C33012c cVar = this.f78553a;
            C89219l.m154716b(iVar, "");
            cVar.mo58822a(iVar);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$b */
    static final class C33014b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C33012c f78554a;

        static {
            Covode.recordClassIndex(39820);
        }

        C33014b(C33012c cVar) {
            this.f78554a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C33022d> iVar) {
            C33012c cVar = this.f78554a;
            C89219l.m154716b(iVar, "");
            cVar.mo58822a(iVar);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$c */
    static final class View$OnClickListenerC33015c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33012c f78555a;

        static {
            Covode.recordClassIndex(39821);
        }

        View$OnClickListenerC33015c(C33012c cVar) {
            this.f78555a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33024e.m67660a(this.f78555a, "auto_system", new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.unbind.C33012c.View$OnClickListenerC33015c.C330161 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC33015c f78556a;

                static {
                    Covode.recordClassIndex(39822);
                }

                {
                    this.f78556a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C32582d.m67064a((Fragment) this.f78556a.f78555a, true);
                    C33012c cVar = this.f78556a.f78555a;
                    Bundle arguments = this.f78556a.f78555a.getArguments();
                    if (arguments == null) {
                        C89219l.m154715b();
                    }
                    arguments.putInt("next_page", EnumC32594j.UNBIND_EMAIL_VERIFY_USING_PHONE.getValue());
                    C89219l.m154716b(arguments, "");
                    cVar.mo58461a(arguments);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$g */
    static final class C33020g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C33012c f78560a;

        static {
            Covode.recordClassIndex(39826);
        }

        C33020g(C33012c cVar) {
            this.f78560a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C33012c cVar = this.f78560a;
            String str = ((C22328o) obj).f52769j;
            C89219l.m154716b(str, "");
            cVar.mo58823c(str);
        }
    }

    /* renamed from: a */
    private Bundle m67650a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("unbind_success", z);
        bundle.putInt("unbind_type", mo58458A().getValue());
        return bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        if (C33024e.m67663b(this)) {
            C89219l.m154721d(str, "");
            C32407x.m66790a(this, str, 22, (Map<String, String>) null).mo143251d(new C33021h(this)).mo143246c();
            return;
        }
        C89219l.m154721d(str, "");
        C32407x.m66807b(this, str, 6, null).mo143251d(new C33020g(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$h */
    static final class C33021h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C33012c f78561a;

        static {
            Covode.recordClassIndex(39827);
        }

        C33021h(C33012c cVar) {
            this.f78561a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22293f fVar = (C22293f) obj;
            if (C33024e.m67663b(this.f78561a)) {
                C33012c cVar = this.f78561a;
                C89219l.m154716b(fVar, "");
                String str = fVar.f52736j;
                C89219l.m154716b(str, "");
                C89219l.m154721d(str, "");
                IUnbindApi iUnbindApi = IUnbindApi.C32996a.f78525a;
                String a = AbstractC22384h.m42212a(C29736b.f70924e + "/passport/mobile/unbind/");
                C89219l.m154716b(a, "");
                iUnbindApi.unbindMobile(str, a).mo5534a(new C33014b(cVar), C1731i.f5564c, null);
                return;
            }
            C33012c cVar2 = this.f78561a;
            C89219l.m154716b(fVar, "");
            String str2 = fVar.f52736j;
            C89219l.m154716b(str2, "");
            cVar2.mo58823c(str2);
        }
    }

    /* renamed from: a */
    public final void mo58822a(C1731i<C33022d> iVar) {
        if (!C80214ai.m139043a(iVar) || iVar.mo5545d().f78563b == null) {
            new C23144b(this).mo37640e(R.string.c3i);
            return;
        }
        C33022d.C33023a aVar = iVar.mo5545d().f78563b;
        if (aVar == null) {
            C89219l.m154715b();
        }
        if (aVar.f78564a == 0) {
            User f = C36085cj.m73552f();
            if (C33024e.m67661a(this)) {
                C89219l.m154716b(f, "");
                f.setPhoneBinded(false);
                f.setBindPhone("");
            } else {
                C89219l.m154716b(f, "");
                f.setEmail("");
            }
            mo58463b(m67650a(true));
            return;
        }
        mo58463b(m67650a(false));
    }

    /* renamed from: c */
    public final void mo58823c(String str) {
        C89219l.m154721d(str, "");
        IUnbindApi iUnbindApi = IUnbindApi.C32996a.f78525a;
        String a = AbstractC22384h.m42212a(C29736b.f70924e + "/passport/email/unbind/");
        C89219l.m154716b(a, "");
        iUnbindApi.unbindEmail(str, a).mo5534a(new C33013a(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (!C33024e.m67663b(this) && !C33024e.m67664c(this)) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            tuxTextView.setVisibility(0);
            tuxTextView.setTuxFont(41);
            tuxTextView.setOnClickListener(new View$OnClickListenerC33015c(this));
            String string = getString(R.string.h4m);
            C89219l.m154716b(string, "");
            String string2 = getString(R.string.a9f, string);
            C89219l.m154716b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
            spannableString.setSpan(new C23126b(43, true), a, string.length() + a, 33);
            tuxTextView.setText(spannableString);
        }
    }
}
