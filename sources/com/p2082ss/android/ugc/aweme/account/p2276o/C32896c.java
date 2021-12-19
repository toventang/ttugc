package com.p2082ss.android.ugc.aweme.account.p2276o;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2276o.C32887a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.o.c */
public final class C32896c extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    public final String f78282a = "email_verify_success";

    /* renamed from: b */
    private final AbstractC89244h f78283b = C89250i.m154773a((AbstractC89171a) new C32897a(this));

    /* renamed from: j */
    private final AbstractC89244h f78284j = C89250i.m154773a((AbstractC89171a) new C32898b(this));

    /* renamed from: k */
    private final AbstractC89244h f78285k = C89250i.m154773a((AbstractC89171a) new C32899c(this));

    /* renamed from: l */
    private HashMap f78286l;

    static {
        Covode.recordClassIndex(39684);
    }

    /* renamed from: k */
    private String m67526k() {
        return (String) this.f78283b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78286l == null) {
            this.f78286l = new HashMap();
        }
        View view = (View) this.f78286l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78286l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final boolean mo57437g() {
        return ((Boolean) this.f78285k.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78286l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$a */
    static final class C32897a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32896c f78287a;

        static {
            Covode.recordClassIndex(39685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32897a(C32896c cVar) {
            super(0);
            this.f78287a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f78287a.mo58458A() != EnumC32592i.MODIFY_PHONE) {
                return C32582d.m67060a(this.f78287a);
            }
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            return f.getEmail();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$b */
    static final class C32898b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32896c f78288a;

        static {
            Covode.recordClassIndex(39686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32898b(C32896c cVar) {
            super(0);
            this.f78288a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f78288a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_changePwd"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$c */
    static final class C32899c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32896c f78289a;

        static {
            Covode.recordClassIndex(39687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32899c(C32896c cVar) {
            super(0);
            this.f78289a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f78289a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m67526k());
        lVar.f77920b = false;
        lVar.f77922d = C32582d.m67073d(this);
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        if (mo57437g()) {
            C39162r.onEventV3("resend_code_email");
        }
        C32887a.f78270a.invoke(this, m67526k(), "resend").mo143251d(new C32902f(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        String string;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (mo57437g()) {
            i = R.string.fm3;
        } else {
            i = R.string.ara;
        }
        bVar.f78106e = getString(i);
        if (mo57437g()) {
            string = getString(R.string.fm2, m67526k());
        } else {
            string = getString(R.string.arb, m67526k());
        }
        bVar.f78107f = string;
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$d */
    static final class C32900d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32896c f78290a;

        static {
            Covode.recordClassIndex(39688);
        }

        C32900d(C32896c cVar) {
            this.f78290a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f78290a.mo58532t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$f */
    static final class C32902f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32896c f78292a;

        static {
            Covode.recordClassIndex(39690);
        }

        C32902f(C32896c cVar) {
            this.f78292a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f78292a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        C32407x.m66807b(this, str, C32887a.C32888a.m67525a(this), null).mo143251d(new C32901e(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo58458A() == EnumC32592i.MODIFY_PHONE) {
            C32887a.f78270a.invoke(this, m67526k(), "auto_system").mo143251d(new C32900d(this)).mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$e */
    static final class C32901e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32896c f78291a;

        static {
            Covode.recordClassIndex(39689);
        }

        C32901e(C32896c cVar) {
            this.f78291a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22328o oVar = (C22328o) obj;
            if (this.f78291a.mo58458A() == EnumC32592i.MODIFY_PHONE) {
                C32896c cVar = this.f78291a;
                Bundle arguments = cVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", EnumC32594j.INPUT_PHONE_MODIFY.getValue());
                arguments.putString("ticket", oVar.f52769j);
                C89219l.m154716b(arguments, "");
                cVar.mo58461a(arguments);
                return;
            }
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            f.setEmailVerified(true);
            if (this.f78291a.mo57437g()) {
                C39162r.m79460a("set_up_proAccount", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("method", "verify_email").mo57398a("duration", System.currentTimeMillis() - this.f78291a.f77723t).f75156a);
            }
            Bundle arguments2 = this.f78291a.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            if (arguments2.getBoolean("show_success_toast", true)) {
                new C79459a(C31291a.f74991a).mo123052a(this.f78291a.getString(R.string.blz)).mo123053a();
            }
            C39162r.m79460a(this.f78291a.f78282a, new HashMap());
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            String str = oVar.f52769j;
            C89219l.m154716b(str, "");
            C32582d.m67072d(bundle, str);
            Bundle arguments3 = this.f78291a.getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            arguments3.putBundle("final_data", bundle);
            C32896c cVar2 = this.f78291a;
            Bundle arguments4 = cVar2.getArguments();
            if (arguments4 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments4, "");
            cVar2.mo58463b(arguments4);
        }
    }
}
