package com.p2082ss.android.ugc.aweme.account.p2253l;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
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

/* renamed from: com.ss.android.ugc.aweme.account.l.c */
public final class C31734c extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f75892a = C89250i.m154773a((AbstractC89171a) new C31736b(this));

    /* renamed from: b */
    private final AbstractC89244h f75893b = C89250i.m154773a((AbstractC89171a) new C31735a(this));

    /* renamed from: j */
    private HashMap f75894j;

    static {
        Covode.recordClassIndex(38468);
    }

    /* renamed from: g */
    private String m66064g() {
        return (String) this.f75892a.getValue();
    }

    /* renamed from: k */
    private final String m66065k() {
        return (String) this.f75893b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75894j == null) {
            this.f75894j = new HashMap();
        }
        View view = (View) this.f75894j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75894j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75894j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.c$b */
    static final class C31736b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31734c f75896a;

        static {
            Covode.recordClassIndex(38470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31736b(C31734c cVar) {
            super(0);
            this.f75896a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f75896a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.l.c$d */
    public static final class C31738d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C31734c f75898a;

        static {
            Covode.recordClassIndex(38472);
        }

        C31738d(C31734c cVar) {
            this.f75898a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f75898a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        m66063c("resend").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.c$a */
    static final class C31735a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31734c f75895a;

        static {
            Covode.recordClassIndex(38469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31735a(C31734c cVar) {
            super(0);
            this.f75895a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f75895a.getArguments();
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
        lVar.mo58526a(m66064g());
        lVar.f77920b = false;
        lVar.f77922d = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String str;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.ara);
        boolean z = true;
        bVar.f78107f = getString(R.string.fl9, m66064g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        if (m66065k() != null) {
            str = getString(R.string.ab9);
        } else {
            str = "";
        }
        bVar.f78105d = str;
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isLogin() && m66065k() != null) {
            z = false;
        }
        bVar.f78104c = z;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m66063c("auto_system").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.c$c */
    static final class C31737c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31734c f75897a;

        static {
            Covode.recordClassIndex(38471);
        }

        C31737c(C31734c cVar) {
            this.f75897a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C31734c cVar = this.f75897a;
            String str = ((C22328o) obj).f52769j;
            C89219l.m154716b(str, "");
            C32582d.m67068b(cVar, str);
            C31734c cVar2 = this.f75897a;
            Bundle arguments = cVar2.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("next_page", EnumC32594j.CHANGE_PASSWORD.getValue());
            arguments.putString("platForm", "email");
            C89219l.m154716b(arguments, "");
            cVar2.mo58461a(arguments);
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22412g>> m66063c(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k = m66065k();
        if (k != null) {
            C89219l.m154716b(k, "");
            linkedHashMap.put("conditional_login_ticket", k);
        }
        AbstractC88973n<C22291d<C22412g>> a = C32407x.m66788a(this, "", 11, str, linkedHashMap, (String) null, 96).mo143235a((AbstractC88428a) new C31738d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k = m66065k();
        if (k != null) {
            C89219l.m154716b(k, "");
            linkedHashMap.put("conditional_login_ticket", k);
        }
        C32407x.m66807b(this, str, 11, linkedHashMap).mo143251d(new C31737c(this)).mo143246c();
    }
}
