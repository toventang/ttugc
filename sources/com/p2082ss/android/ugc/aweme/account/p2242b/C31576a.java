package com.p2082ss.android.ugc.aweme.account.p2242b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32386i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.b.a */
public final class C31576a extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f75525a = C89250i.m154773a((AbstractC89171a) new C31577a(this));

    /* renamed from: b */
    private final AbstractC89244h f75526b = C89250i.m154773a((AbstractC89171a) new C31578b(this));

    /* renamed from: j */
    private HashMap f75527j;

    static {
        Covode.recordClassIndex(38301);
    }

    /* renamed from: k */
    private String m65868k() {
        return (String) this.f75525a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75527j == null) {
            this.f75527j = new HashMap();
        }
        View view = (View) this.f75527j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75527j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final boolean mo57437g() {
        return ((Boolean) this.f75526b.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75527j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$a */
    static final class C31577a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31576a f75528a;

        static {
            Covode.recordClassIndex(38302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31577a(C31576a aVar) {
            super(0);
            this.f75528a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f75528a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$b */
    static final class C31578b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31576a f75529a;

        static {
            Covode.recordClassIndex(38303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31578b(C31576a aVar) {
            super(0);
            this.f75529a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75529a.getArguments();
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
        lVar.mo58526a(m65868k());
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
        C31581b.f75533b.invoke(this, m65868k(), "resend").mo143251d(new C31580d(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.ara);
        bVar.f78107f = getString(R.string.arb, m65868k());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$d */
    static final class C31580d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31576a f75531a;

        static {
            Covode.recordClassIndex(38305);
        }

        C31580d(C31576a aVar) {
            this.f75531a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f75531a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        String k = m65868k();
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        boolean z = arguments.getBoolean("from_changePwd", false);
        C89219l.m154721d(this, "");
        C89219l.m154721d(k, "");
        C89219l.m154721d(str, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32408a(this, k, str, z)).mo143251d(new C32407x.C32450b(this)).mo143244b(new C32407x.C32486c(this));
        C89219l.m154716b(b, "");
        C32555z.m67011a(this, b).mo143251d(new C31579c(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$c */
    static final class C31579c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31576a f75530a;

        static {
            Covode.recordClassIndex(38304);
        }

        C31579c(C31576a aVar) {
            this.f75530a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            C22291d dVar = (C22291d) obj;
            User f = C36085cj.m73552f();
            JSONObject jSONObject = ((C32386i) dVar.f52723j).f53008m;
            if (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("data")) == null || (str = optJSONObject2.optString("email")) == null) {
                str = "";
            }
            f.setEmail(str);
            f.setEmailVerified(true);
            f.setHasEmail(true);
            Bundle arguments = this.f75530a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getBoolean("show_success_toast", true)) {
                new C79459a(C31291a.f74991a).mo123052a(this.f75530a.getString(R.string.blt)).mo123053a();
            }
            C39162r.m79460a(C31581b.f75534c, new C33744d().mo59980a(StringSet.type, 1).f79943a);
            if (this.f75530a.mo57437g()) {
                C39162r.m79460a("set_up_proAccount", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("method", "set_by_email").mo57398a("duration", System.currentTimeMillis() - this.f75530a.f77723t).f75156a);
            }
            Bundle arguments2 = this.f75530a.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            JSONObject jSONObject2 = ((C32386i) dVar.f52723j).f53008m;
            if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (str2 = optJSONObject.optString("ticket")) == null) {
                str2 = "";
            }
            C32582d.m67072d(bundle, str2);
            arguments2.putBundle("final_data", bundle);
            C31576a aVar = this.f75530a;
            Bundle arguments3 = aVar.getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments3, "");
            aVar.mo58463b(arguments3);
        }
    }
}
