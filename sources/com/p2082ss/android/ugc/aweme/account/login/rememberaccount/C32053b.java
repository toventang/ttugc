package com.p2082ss.android.ugc.aweme.account.login.rememberaccount;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22433k;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.C31987r;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31962m;
import com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.aweme.services.LoginService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b */
public final class C32053b extends AbstractC32572b implements DialogC31962m.AbstractC31963a {

    /* renamed from: b */
    public static final C32054a f76512b = new C32054a((byte) 0);

    /* renamed from: a */
    DialogC31962m f76513a;

    /* renamed from: c */
    private final AbstractC89244h f76514c = C89250i.m154773a((AbstractC89171a) new C32064e(this));

    /* renamed from: d */
    private final AbstractC89244h f76515d = C89250i.m154773a((AbstractC89171a) new C32055b(this));

    /* renamed from: e */
    private HashMap f76516e;

    static {
        Covode.recordClassIndex(38810);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    public final String ad_() {
        return "LoginMethodListFragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76516e == null) {
            this.f76516e = new HashMap();
        }
        View view = (View) this.f76516e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76516e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final Bundle mo58023g() {
        return (Bundle) this.f76514c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76516e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: i */
    public final Map<String, Object> mo58024i() {
        return (Map) this.f76515d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public final boolean mo57458q() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$a */
    public static final class C32054a {
        static {
            Covode.recordClassIndex(38811);
        }

        private C32054a() {
        }

        public /* synthetic */ C32054a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.DialogC31962m.AbstractC31963a
    /* renamed from: e */
    public final void mo57803e() {
        mo58459B();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c */
    public static final class C32056c implements AbstractC32077e {

        /* renamed from: a */
        final /* synthetic */ C32053b f76518a;

        /* renamed from: b */
        final /* synthetic */ View f76519b;

        static {
            Covode.recordClassIndex(38813);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$a */
        public static final class C32057a extends AbstractC22433k {

            /* renamed from: c */
            final /* synthetic */ C32056c f76520c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89183m f76521d;

            /* renamed from: e */
            final /* synthetic */ String f76522e;

            /* renamed from: f */
            final /* synthetic */ BaseLoginMethod f76523f;

            static {
                Covode.recordClassIndex(38814);
            }

            /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$a$a */
            static final class RunnableC32058a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ AbstractC89171a f76524a;

                static {
                    Covode.recordClassIndex(38815);
                }

                RunnableC32058a(AbstractC89171a aVar) {
                    this.f76524a = aVar;
                }

                public final void run() {
                    this.f76524a.invoke();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$a$b */
            static final class C32059b extends AbstractC89220m implements AbstractC89171a<C89391z> {

                /* renamed from: a */
                final /* synthetic */ C32057a f76525a;

                /* renamed from: b */
                final /* synthetic */ C22292e f76526b;

                static {
                    Covode.recordClassIndex(38816);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C32059b(C32057a aVar, C22292e eVar) {
                    super(0);
                    this.f76525a = aVar;
                    this.f76526b = eVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C22507a aVar;
                    String str = this.f76525a.f76522e;
                    C32053b bVar = this.f76525a.f76520c.f76518a;
                    C22292e eVar = this.f76526b;
                    if (eVar != null) {
                        aVar = eVar.f52724j;
                    } else {
                        aVar = null;
                    }
                    C32404v.m66778a(false, str, (AbstractC32584f) bVar, aVar, (Map) this.f76525a.f76520c.f76518a.mo58024i(), false, 32);
                    boolean z = false;
                    C32840d.C32841a.m67416b(0, 0, "");
                    C22292e eVar2 = this.f76526b;
                    if (eVar2 == null) {
                        C89219l.m154715b();
                    }
                    C36085cj.m73542a(eVar2.f52724j);
                    Bundle arguments = this.f76525a.f76520c.f76518a.getArguments();
                    if (arguments == null) {
                        C89219l.m154715b();
                    }
                    C31604d.m65915a(arguments, this.f76525a.f76520c.f76518a.getActivity(), new AbstractC89172b<C1731i<Bundle>, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32053b.C32056c.C32057a.C32059b.C320601 */

                        /* renamed from: a */
                        final /* synthetic */ C32059b f76527a;

                        static {
                            Covode.recordClassIndex(38817);
                        }

                        {
                            this.f76527a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
                            C89219l.m154721d(iVar, "");
                            this.f76527a.f76525a.f76520c.f76518a.mo58025k();
                            C32053b bVar = this.f76527a.f76525a.f76520c.f76518a;
                            Bundle arguments = this.f76527a.f76525a.f76520c.f76518a.getArguments();
                            if (arguments == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(arguments, "");
                            bVar.mo58463b(arguments);
                            return C89391z.f203057a;
                        }
                    });
                    if (C89219l.m154714a((Object) this.f76525a.f76523f.isFromReInstallNet(), (Object) true)) {
                        String uid = this.f76525a.f76523f.getUid();
                        String valueOf = String.valueOf(this.f76526b.f52724j.f53210a);
                        C89219l.m154721d(uid, "");
                        C89219l.m154721d(valueOf, "");
                        for (T t : C31975q.f76367b) {
                            if (C89219l.m154714a((Object) t.getUid(), (Object) uid)) {
                                t.setUid(valueOf);
                                t.setLoginTime(Long.valueOf(System.currentTimeMillis()));
                                t.setTransToNormal(true);
                                z = true;
                            }
                        }
                        if (z) {
                            C31975q.m66361f();
                        }
                    }
                    return C89391z.f203057a;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22292e eVar) {
                C22507a aVar;
                C22292e eVar2 = eVar;
                C32059b bVar = new C32059b(this, eVar2);
                if (eVar2 == null || (aVar = eVar2.f52724j) == null || !aVar.f53221l) {
                    bVar.invoke();
                } else {
                    C39223a.m79603q().mo68627a(true, new RunnableC32058a(bVar));
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22292e eVar, int i) {
                String str;
                C22292e eVar2 = eVar;
                AbstractC89183m mVar = this.f76521d;
                Integer valueOf = Integer.valueOf(i);
                if (eVar2 != null) {
                    str = eVar2.f52717f;
                } else {
                    str = null;
                }
                mVar.invoke(valueOf, str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22292e eVar, String str) {
                C22292e eVar2 = eVar;
                C89219l.m154721d(eVar2, "");
                super.mo36682a(eVar2, str);
                this.f76521d.invoke(Integer.valueOf(eVar2.f52715d), eVar2.f52717f);
            }

            C32057a(C32056c cVar, AbstractC89183m mVar, String str, BaseLoginMethod baseLoginMethod) {
                this.f76520c = cVar;
                this.f76521d = mVar;
                this.f76522e = str;
                this.f76523f = baseLoginMethod;
            }
        }

        /* renamed from: b */
        private static boolean m66455b() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.rememberaccount.AbstractC32077e
        /* renamed from: a */
        public final void mo58026a() {
            Bundle bundle = new Bundle(this.f76518a.mo58023g());
            bundle.putString("enter_from", "trust_one_click_pad");
            bundle.putString("enter_method", "add_a_account");
            Map<String, Object> a = C32404v.m66765a(bundle);
            if (a == null) {
                C89219l.m154715b();
            }
            a.put("login_last_time", 1);
            ActivityC0945e activity = this.f76518a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            I18nSignUpActivity.C31771a.m66132a(activity, bundle, true, true, false);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$b */
        static final class C32061b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32056c f76528a;

            /* renamed from: b */
            final /* synthetic */ BaseLoginMethod f76529b;

            static {
                Covode.recordClassIndex(38818);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32061b(C32056c cVar, BaseLoginMethod baseLoginMethod) {
                super(0);
                this.f76528a = cVar;
                this.f76529b = baseLoginMethod;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String w = this.f76528a.f76518a.mo58466w();
                C89219l.m154716b(w, "");
                String x = this.f76528a.f76518a.mo58467x();
                C89219l.m154716b(x, "");
                C31376a a = I18nSignUpActivity.C31771a.m66130a(w, x, "click_login", C32404v.m66765a(this.f76528a.f76518a.mo58023g()));
                if (this.f76529b.getLoginMethodName() == LoginMethodName.THIRD_PARTY) {
                    StringBuilder sb = new StringBuilder();
                    BaseLoginMethod baseLoginMethod = this.f76529b;
                    Objects.requireNonNull(baseLoginMethod, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.TPLoginMethod");
                    a.mo57397a(sb.append(((TPLoginMethod) baseLoginMethod).getPlatform()).append("_is_show").toString(), 1);
                } else {
                    a.mo57397a("phone_email_show", 1);
                }
                C39162r.m79460a("login_notify", a.f75156a);
                Bundle bundle = new Bundle(this.f76528a.f76518a.mo58023g());
                bundle.putBoolean("disable_auto_gms", true);
                LoginService g = C36085cj.m73553g();
                Objects.requireNonNull(g, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.LoginService");
                Context context = this.f76528a.f76519b.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                if (!g.loginByMethod((Activity) context, bundle, this.f76529b)) {
                    Context context2 = this.f76528a.f76519b.getContext();
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    I18nSignUpActivity.C31771a.m66132a((Activity) context2, bundle, true, false, false);
                }
                return C89391z.f203057a;
            }
        }

        C32056c(C32053b bVar, View view) {
            this.f76518a = bVar;
            this.f76519b = view;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$c$c */
        static final class C32062c extends AbstractC89220m implements AbstractC89183m<Integer, String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32056c f76530a;

            /* renamed from: b */
            final /* synthetic */ String f76531b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89171a f76532c;

            static {
                Covode.recordClassIndex(38819);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32062c(C32056c cVar, String str, AbstractC89171a aVar) {
                super(2);
                this.f76530a = cVar;
                this.f76531b = str;
                this.f76532c = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Integer num, String str) {
                int intValue = num.intValue();
                String str2 = str;
                C32840d.C32841a.m67416b(1, intValue, str2);
                C32404v.m66775a(false, intValue, this.f76531b, (AbstractC32584f) this.f76530a.f76518a, (Map) this.f76530a.f76518a.mo58024i(), false, 32);
                this.f76530a.f76518a.mo58025k();
                if (intValue == 2029 || intValue == 1321) {
                    this.f76532c.invoke();
                } else {
                    C32053b bVar = this.f76530a.f76518a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bVar.mo57442a(intValue, str2);
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.rememberaccount.AbstractC32077e
        /* renamed from: a */
        public final void mo58027a(BaseLoginMethod baseLoginMethod, int i) {
            String str;
            String str2;
            String str3;
            String uid;
            String str4 = "";
            C89219l.m154721d(baseLoginMethod, str4);
            this.f76518a.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m66455b();
            }
            if (!C58029j.f132256h) {
                new C79459a(this.f76519b.getContext()).mo123052a(this.f76518a.getString(R.string.dcq)).mo123053a();
                return;
            }
            C32061b bVar = new C32061b(this, baseLoginMethod);
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            Long l = null;
            if (commonUserInfo != null) {
                str = commonUserInfo.getSecUid();
            } else {
                str = null;
            }
            int i2 = 1;
            boolean z = !TextUtils.isEmpty(str);
            if (z) {
                CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo2 == null) {
                    C89219l.m154715b();
                }
                String secUid = commonUserInfo2.getSecUid();
                if (secUid == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(secUid, str4);
                C89219l.m154721d("d_ticket", str4);
                if (!TextUtils.isEmpty(secUid)) {
                    str2 = Keva.getRepo("aweme_user_config__".concat(String.valueOf(secUid))).getString("d_ticket", str4);
                    if ((!(!C89219l.m154714a((Object) baseLoginMethod.getAllowOneKeyLogin(), (Object) true)) || TextUtils.isEmpty(str2)) && (!C89219l.m154714a((Object) baseLoginMethod.isFromReInstallNet(), (Object) true))) {
                        bVar.invoke();
                    }
                    String a = C32052a.m66445a(baseLoginMethod);
                    C32053b bVar2 = this.f76518a;
                    if (bVar2.f76513a == null) {
                        Context context = bVar2.getContext();
                        if (context == null) {
                            C89219l.m154715b();
                        }
                        bVar2.f76513a = new DialogC31962m(context);
                        DialogC31962m mVar = bVar2.f76513a;
                        if (mVar == null) {
                            C89219l.m154715b();
                        }
                        mVar.f76326a = bVar2;
                    }
                    C80273bt.m139145a(bVar2.f76513a);
                    if (baseLoginMethod.getLoginTime() != null) {
                        Long loginTime = baseLoginMethod.getLoginTime();
                        if (loginTime == null) {
                            C89219l.m154715b();
                        }
                        if (loginTime.longValue() > 0) {
                            Long loginTime2 = baseLoginMethod.getLoginTime();
                            if (loginTime2 == null) {
                                C89219l.m154715b();
                            }
                            l = Long.valueOf(loginTime2.longValue() / 1000);
                        }
                    }
                    Map<String, Object> i3 = this.f76518a.mo58024i();
                    if (i3 != null) {
                        i3.put("order", String.valueOf(i));
                    }
                    C32053b bVar3 = this.f76518a;
                    C32404v.m66770a((Boolean) false, a, (AbstractC32584f) bVar3, false, (Map) bVar3.mo58024i(), false, 40);
                    C32057a aVar = new C32057a(this, new C32062c(this, a, bVar), a, baseLoginMethod);
                    this.f76518a.mo58464b(aVar);
                    HashMap hashMap = new HashMap();
                    if (C89219l.m154714a((Object) baseLoginMethod.isFromReInstallNet(), (Object) true)) {
                        str3 = "true";
                    } else {
                        str3 = "false";
                    }
                    hashMap.put("is_reinstall", str3);
                    AbstractC22329e z2 = this.f76518a.mo58469z();
                    if (z) {
                        CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
                        if (commonUserInfo3 == null) {
                            C89219l.m154715b();
                        }
                        uid = commonUserInfo3.getSecUid();
                        if (uid == null) {
                            C89219l.m154715b();
                        }
                    } else {
                        uid = baseLoginMethod.getUid();
                    }
                    C89219l.m154721d(baseLoginMethod, str4);
                    int i4 = C31987r.f76379a[baseLoginMethod.getLoginMethodName().ordinal()];
                    if (i4 == 1 || i4 == 2 || i4 == 3) {
                        i2 = 3;
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            i2 = -1;
                        } else {
                            i2 = 2;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    if (baseLoginMethod instanceof TPLoginMethod) {
                        str4 = ((TPLoginMethod) baseLoginMethod).getPlatform();
                    }
                    z2.mo36659a(uid, z, str2, valueOf, l, str4, hashMap, aVar);
                    return;
                }
            }
            str2 = str4;
            if (!(!C89219l.m154714a((Object) baseLoginMethod.getAllowOneKeyLogin(), (Object) true))) {
            }
            bVar.invoke();
        }
    }

    /* renamed from: k */
    public final void mo58025k() {
        C80273bt.m139146b(this.f76513a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$b */
    static final class C32055b extends AbstractC89220m implements AbstractC89171a<Map<String, Object>> {

        /* renamed from: a */
        final /* synthetic */ C32053b f76517a;

        static {
            Covode.recordClassIndex(38812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32055b(C32053b bVar) {
            super(0);
            this.f76517a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Object> invoke() {
            Bundle arguments = this.f76517a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return C89206ad.m154686h(arguments.getSerializable("ONE_KEY_LOGIN_MOB_PARAMS"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$e */
    static final class C32064e extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ C32053b f76534a;

        static {
            Covode.recordClassIndex(38821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32064e(C32053b bVar) {
            super(0);
            this.f76534a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle arguments = this.f76534a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return arguments.getBundle("origin_bundle");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.b$d */
    static final class View$OnClickListenerC32063d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32053b f76533a;

        static {
            Covode.recordClassIndex(38820);
        }

        View$OnClickListenerC32063d(C32053b bVar) {
            this.f76533a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Bundle bundle = new Bundle(this.f76533a.mo58023g());
            bundle.putString("enter_from", "trust_one_click_pad");
            bundle.putString("enter_method", "sign_in");
            Map<String, Object> a = C32404v.m66765a(bundle);
            if (a == null) {
                C89219l.m154715b();
            }
            a.put("login_last_time", 1);
            ActivityC0945e activity = this.f76533a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            I18nSignUpActivity.C31771a.m66132a(activity, bundle, false, true, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (i < 0) {
            new C79459a(context).mo123052a(getString(R.string.dcq)).mo123053a();
        } else if (!TextUtils.isEmpty(str)) {
            new C79459a(context).mo123052a(str).mo123053a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        List g = C89070n.m154585g((Collection) C31975q.m66343a(C36085cj.f85262b.mo57069e().allUidList()));
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.cjt);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) mo57434c(R.id.cjt);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(new C32065c(g, new C32056c(this, view)));
        ((TuxTextView) mo57434c(R.id.cdo)).setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        String string = getString(R.string.f8);
        C89219l.m154716b(string, "");
        String string2 = getString(R.string.f7, string);
        C89219l.m154716b(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.cdo);
        C89219l.m154716b(tuxTextView, "");
        int c = C0643b.m2378c(tuxTextView.getContext(), R.color.bh);
        spannableStringBuilder.setSpan(new LoginMethodListFragment$onViewCreated$2(c, c), a, string.length() + a, 34);
        TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.cdo);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(spannableStringBuilder);
        ((TuxTextView) mo57434c(R.id.cdo)).setOnClickListener(new View$OnClickListenerC32063d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.g_, viewGroup, false);
    }
}
