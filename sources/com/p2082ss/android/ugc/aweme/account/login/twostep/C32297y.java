package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.y */
public final class C32297y extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f77032a = C89250i.m154773a((AbstractC89171a) new C32298a(this));

    /* renamed from: b */
    private HashMap f77033b;

    static {
        Covode.recordClassIndex(39062);
    }

    /* renamed from: g */
    private String m66658g() {
        return (String) this.f77032a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77033b == null) {
            this.f77033b = new HashMap();
        }
        View view = (View) this.f77033b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77033b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77033b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.y$a */
    static final class C32298a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32297y f77034a;

        static {
            Covode.recordClassIndex(39063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32298a(C32297y yVar) {
            super(0);
            this.f77034a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f77034a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.y$d */
    public static final class C32301d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32297y f77037a;

        static {
            Covode.recordClassIndex(39066);
        }

        C32301d(C32297y yVar) {
            this.f77037a = yVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f77037a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m66658g());
        lVar.f77920b = false;
        lVar.f77922d = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m66657c("resend").mo143251d(new C32300c(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.ara);
        bVar.f78107f = getString(R.string.arb, m66658g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.y$c */
    static final class C32300c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32297y f77036a;

        static {
            Covode.recordClassIndex(39065);
        }

        C32300c(C32297y yVar) {
            this.f77036a = yVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77036a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m66657c("user_click").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        C32407x.m66807b(this, str, 6, null).mo143251d(new C32299b(this)).mo143246c();
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22412g>> m66657c(String str) {
        C89219l.m154721d(str, "");
        AbstractC88973n<C22291d<C22412g>> a = C32407x.m66788a(this, m66658g(), 6, str, (Map) null, (String) null, 112).mo143235a((AbstractC88428a) new C32301d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.y$b */
    static final class C32299b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32297y f77035a;

        static {
            Covode.recordClassIndex(39064);
        }

        C32299b(C32297y yVar) {
            this.f77035a = yVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            f.setEmailVerified(true);
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            String str = ((C22328o) obj).f52769j;
            C89219l.m154716b(str, "");
            C32582d.m67072d(bundle, str);
            Bundle arguments = this.f77035a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putBundle("final_data", bundle);
            C32297y yVar = this.f77035a;
            Bundle arguments2 = yVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments2, "");
            yVar.mo58463b(arguments2);
        }
    }
}
