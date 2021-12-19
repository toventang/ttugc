package com.p2082ss.android.ugc.aweme.account.p2245d;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32392n;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2242b.C31581b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.d.b */
public final class C31622b extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    private final AbstractC89244h f75655a = C89250i.m154773a((AbstractC89171a) new C31623a(this));

    /* renamed from: b */
    private final AbstractC89244h f75656b = C89250i.m154773a((AbstractC89171a) new C31624b(this));

    /* renamed from: j */
    private HashMap f75657j;

    static {
        Covode.recordClassIndex(38351);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75657j == null) {
            this.f75657j = new HashMap();
        }
        View view = (View) this.f75657j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75657j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final String mo57437g() {
        return (String) this.f75655a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75657j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: j */
    public final boolean mo57643j() {
        return ((Boolean) this.f75656b.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$a */
    static final class C31623a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C31622b f75658a;

        static {
            Covode.recordClassIndex(38352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31623a(C31622b bVar) {
            super(0);
            this.f75658a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C32582d.m67060a(this.f75658a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$b */
    static final class C31624b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31622b f75659a;

        static {
            Covode.recordClassIndex(38353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31624b(C31622b bVar) {
            super(0);
            this.f75659a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f75659a.getArguments();
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
        lVar.mo58526a(mo57437g());
        lVar.f77920b = false;
        lVar.f77922d = C32582d.m67073d(this);
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        if (mo57643j()) {
            C39162r.onEventV3("resend_code_email");
        }
        C31615a.f75646b.invoke(this, mo57437g(), "resend").mo143251d(new C31626d(this)).mo143246c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        String string;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (mo57643j()) {
            i = R.string.fm3;
        } else {
            i = R.string.ara;
        }
        bVar.f78106e = getString(i);
        if (mo57643j()) {
            string = getString(R.string.fm2, mo57437g());
        } else {
            string = getString(R.string.arb, mo57437g());
        }
        bVar.f78107f = string;
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$d */
    static final class C31626d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31622b f75661a;

        static {
            Covode.recordClassIndex(38355);
        }

        C31626d(C31622b bVar) {
            this.f75661a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f75661a.mo58532t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        String g = mo57437g();
        String e = C32582d.m67074e(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        boolean z = arguments.getBoolean("from_changePwd", false);
        C89219l.m154721d(this, "");
        C89219l.m154721d(g, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(e, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32526g(this, str, g, e, z));
        C89219l.m154716b(a, "");
        C32555z.m67011a(this, a).mo143251d(new C31625c(this)).mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$c */
    static final class C31625c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31622b f75660a;

        static {
            Covode.recordClassIndex(38354);
        }

        C31625c(C31622b bVar) {
            this.f75660a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            C22291d dVar = (C22291d) obj;
            C32582d.m67068b(this.f75660a, "");
            User f = C36085cj.m73552f();
            C89219l.m154716b(f, "");
            String uid = f.getUid();
            C89219l.m154716b(uid, "");
            String g = this.f75660a.mo57437g();
            C89219l.m154721d(uid, "");
            C89219l.m154721d(g, "");
            boolean z = false;
            for (T t : C31975q.f76367b) {
                if (C89219l.m154714a((Object) t.getUid(), (Object) uid) && t.getLoginMethodName() == LoginMethodName.EMAIL_PASS) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod");
                    t.setName(g);
                    z = true;
                }
            }
            if (z) {
                C31975q.m66361f();
            }
            JSONObject jSONObject = ((C32392n) dVar.f52723j).f53008m;
            if (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("data")) == null || (str = optJSONObject2.optString("email")) == null) {
                str = "";
            }
            f.setEmail(str);
            f.setEmailVerified(true);
            f.setHasEmail(true);
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            JSONObject jSONObject2 = ((C32392n) dVar.f52723j).f53008m;
            if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (str2 = optJSONObject.optString("ticket")) == null) {
                str2 = "";
            }
            C32582d.m67072d(bundle, str2);
            Bundle arguments = this.f75660a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putBundle("final_data", bundle);
            Bundle arguments2 = this.f75660a.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            if (arguments2.getBoolean("show_success_toast", true)) {
                new C79459a(C31291a.f74991a).mo123052a(this.f75660a.getString(R.string.blx)).mo123053a();
            }
            C39162r.m79460a(C31581b.f75534c, new C33744d().mo59980a(StringSet.type, 2).f79943a);
            if (this.f75660a.mo57643j()) {
                C39162r.m79460a("set_up_proAccount", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("method", "use_new_email").mo57398a("duration", System.currentTimeMillis() - this.f75660a.f77723t).f75156a);
            }
            C31622b bVar = this.f75660a;
            Bundle arguments3 = bVar.getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments3, "");
            bVar.mo58463b(arguments3);
        }
    }
}
