package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.z */
public final class C32302z extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f77038a = C89250i.m154773a((AbstractC89171a) new C32304b(this));

    /* renamed from: b */
    private HashMap f77039b;

    static {
        Covode.recordClassIndex(39067);
    }

    /* renamed from: g */
    private String m66667g() {
        return (String) this.f77038a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77039b == null) {
            this.f77039b = new HashMap();
        }
        View view = (View) this.f77039b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77039b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77039b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.z$b */
    static final class C32304b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32302z f77041a;

        static {
            Covode.recordClassIndex(39069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32304b(C32302z zVar) {
            super(0);
            this.f77041a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67069c(this.f77041a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.z$c */
    public static final class C32305c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32302z f77042a;

        static {
            Covode.recordClassIndex(39070);
        }

        C32305c(C32302z zVar) {
            this.f77042a = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f77042a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m66666c("resend").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.f77920b = true;
        lVar.mo58526a(m66667g());
        lVar.f77922d = C32582d.m67073d(this);
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        if (C31663o.m65975a()) {
            i = R.string.aqj;
        } else {
            i = R.string.arh;
        }
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(i);
        bVar.f78107f = getString(R.string.aqh, m66667g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m66666c("user_click").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        C32407x.m66790a(this, str, 22, (Map<String, String>) null).mo143251d(new C32303a(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.z$a */
    static final class C32303a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32302z f77040a;

        static {
            Covode.recordClassIndex(39068);
        }

        C32303a(C32302z zVar) {
            this.f77040a = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22293f fVar = (C22293f) obj;
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "phone");
            C89219l.m154716b(fVar, "");
            String str = fVar.f52736j;
            C89219l.m154716b(str, "");
            C32582d.m67072d(bundle, str);
            Bundle arguments = this.f77040a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putBundle("final_data", bundle);
            C32302z zVar = this.f77040a;
            Bundle arguments2 = zVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments2, "");
            zVar.mo58463b(arguments2);
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22419n>> m66666c(String str) {
        C89219l.m154721d(str, "");
        AbstractC88973n<C22291d<C22419n>> a = C32407x.m66795a(this, m66667g(), mo58458A(), mo58460Z_(), "", str, (String) null, 192).mo143235a((AbstractC88428a) new C32305c(this));
        C89219l.m154716b(a, "");
        return a;
    }
}
