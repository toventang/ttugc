package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22318e;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h */
public final class C32642h extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    public final int f77851a = 1;

    /* renamed from: b */
    public final int f77852b = 3;

    /* renamed from: j */
    private final AbstractC89244h f77853j = C89250i.m154773a((AbstractC89171a) new C32643a(this));

    /* renamed from: k */
    private HashMap f77854k;

    static {
        Covode.recordClassIndex(39421);
    }

    /* renamed from: g */
    private String m67187g() {
        return (String) this.f77853j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77854k == null) {
            this.f77854k = new HashMap();
        }
        View view = (View) this.f77854k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77854k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77854k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$a */
    static final class C32643a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32642h f77855a;

        static {
            Covode.recordClassIndex(39422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32643a(C32642h hVar) {
            super(0);
            this.f77855a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f77855a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$c */
    public static final class C32645c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32642h f77857a;

        static {
            Covode.recordClassIndex(39424);
        }

        C32645c(C32642h hVar) {
            this.f77857a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f77857a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m67186c("resend").mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m67187g());
        lVar.f77920b = false;
        lVar.f77922d = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, true, null, false, true, 895);
        bVar.f78106e = getString(R.string.ara);
        bVar.f78107f = getString(R.string.arb, m67187g());
        bVar.f78102a = getString(R.string.aog);
        bVar.f78111j = false;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m67186c("auto_system").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$b */
    static final class C32644b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32642h f77856a;

        static {
            Covode.recordClassIndex(39423);
        }

        C32644b(C32642h hVar) {
            this.f77856a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22318e eVar = (C22318e) obj;
            C32642h hVar = this.f77856a;
            Bundle arguments = hVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154716b(arguments, "");
            C89219l.m154716b(eVar, "");
            String str = eVar.f52749j;
            C89219l.m154716b(str, "");
            C32582d.m67072d(arguments, str);
            arguments.putInt("next_page", EnumC32594j.CREATE_PASSWORD_FOR_EMAIL.getValue());
            C89219l.m154716b(arguments, "");
            hVar.mo58461a(arguments);
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22412g>> m67186c(String str) {
        C89219l.m154721d(str, "");
        AbstractC88973n<C22291d<C22412g>> a = C32407x.m66789a(this, m67187g(), this.f77851a, str, (Map<String, String>) null, (String) null, Integer.valueOf(this.f77852b)).mo143235a(new C32645c(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        String g = m67187g();
        C89219l.m154721d(this, "");
        C89219l.m154721d(g, "");
        C89219l.m154721d(str, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32423ak(this, g, str));
        C89219l.m154716b(a, "");
        C32555z.m67011a(this, a).mo143251d(new C32644b(this)).mo143246c();
    }
}
