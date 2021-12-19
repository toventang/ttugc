package com.p2082ss.android.ugc.aweme.account.p2253l;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.l.g */
public final class C31744g extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f75904a = C89250i.m154773a((AbstractC89171a) new C31747c(this));

    /* renamed from: b */
    private final AbstractC89244h f75905b = C89250i.m154773a((AbstractC89171a) new C31745a(this));

    /* renamed from: j */
    private HashMap f75906j;

    static {
        Covode.recordClassIndex(38478);
    }

    /* renamed from: g */
    private String m66077g() {
        return (String) this.f75904a.getValue();
    }

    /* renamed from: k */
    private final String m66078k() {
        return (String) this.f75905b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75906j == null) {
            this.f75906j = new HashMap();
        }
        View view = (View) this.f75906j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75906j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75906j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.g$c */
    static final class C31747c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31744g f75909a;

        static {
            Covode.recordClassIndex(38481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31747c(C31744g gVar) {
            super(0);
            this.f75909a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67069c(this.f75909a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.g$d */
    public static final class C31748d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C31744g f75910a;

        static {
            Covode.recordClassIndex(38482);
        }

        C31748d(C31744g gVar) {
            this.f75910a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f75910a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m66076c("resend").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.g$a */
    static final class C31745a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31744g f75907a;

        static {
            Covode.recordClassIndex(38479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31745a(C31744g gVar) {
            super(0);
            this.f75907a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75907a.getArguments();
            if (arguments != null) {
                return arguments.getString("conditional_login_ticket");
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m66077g());
        lVar.f77920b = true;
        lVar.f77921c = false;
        lVar.f77922d = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        int i2;
        String str;
        if (C31663o.m65975a()) {
            i = R.string.aqj;
        } else {
            i = R.string.arh;
        }
        if (C31663o.m65975a()) {
            i2 = R.string.fl8;
        } else {
            i2 = R.string.fl_;
        }
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(i);
        boolean z = true;
        bVar.f78107f = getString(i2, m66077g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        if (m66078k() != null) {
            str = getString(R.string.ab9);
        } else {
            str = "";
        }
        bVar.f78105d = str;
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isLogin() && m66078k() != null) {
            z = false;
        }
        bVar.f78104c = z;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m66076c("user_click").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.g$b */
    static final class C31746b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31744g f75908a;

        static {
            Covode.recordClassIndex(38480);
        }

        C31746b(C31744g gVar) {
            this.f75908a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22293f fVar = (C22293f) obj;
            C31744g gVar = this.f75908a;
            C89219l.m154716b(fVar, "");
            String str = fVar.f52736j;
            C89219l.m154716b(str, "");
            C32582d.m67068b(gVar, str);
            C31744g gVar2 = this.f75908a;
            Bundle arguments = gVar2.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("next_page", EnumC32594j.CHANGE_PASSWORD.getValue());
            arguments.putString("platform", "phone");
            C89219l.m154716b(arguments, "");
            gVar2.mo58461a(arguments);
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22419n>> m66076c(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k = m66078k();
        if (k != null) {
            C89219l.m154716b(k, "");
            linkedHashMap.put("conditional_login_ticket", k);
        }
        AbstractC88973n<C22291d<C22419n>> a = C32407x.m66796a(this, m66077g(), mo58458A(), mo58460Z_(), "", str, (String) null, linkedHashMap).mo143235a(new C31748d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k = m66078k();
        if (k != null) {
            C89219l.m154716b(k, "");
            linkedHashMap.put("conditional_login_ticket", k);
        }
        C32407x.m66790a(this, str, 13, linkedHashMap).mo143251d(new C31746b(this)).mo143246c();
    }
}
