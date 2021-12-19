package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22367g;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.login.C32816w;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31937c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32794l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32716r;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.p4173ug.C79679i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity */
public final class SignUpOrLoginActivity extends AbstractActivityC32568a implements C31667a.AbstractC31669b {

    /* renamed from: c */
    public static final C32606a f77783c = new C32606a((byte) 0);

    /* renamed from: a */
    public AgeGateResponse f77784a;

    /* renamed from: b */
    public Integer f77785b;

    /* renamed from: d */
    private EnumC32594j f77786d = EnumC32594j.PHONE_EMAIL_LOGIN;

    /* renamed from: e */
    private EnumC32594j f77787e = EnumC32594j.NONE;

    /* renamed from: f */
    private boolean f77788f;

    /* renamed from: g */
    private HashMap f77789g;

    static {
        Covode.recordClassIndex(39384);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f77789g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f77789g == null) {
            this.f77789g = new HashMap();
        }
        View view = (View) this.f77789g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f77789g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$a */
    public static final class C32606a {
        static {
            Covode.recordClassIndex(39385);
        }

        private C32606a() {
        }

        public /* synthetic */ C32606a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        C31667a.m65986b(this);
        C32816w.f78184a.erase("use_current_user_info");
        super.onDestroy();
        C22362d.m42100a().mo36727b();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        Bundle a;
        C32794l.C32795a g;
        super.finish();
        C31412b.f75219b = false;
        int i = C32805o.f78159a[this.f77786d.ordinal()];
        if (i == 1) {
            C36085cj.m73540a(15, 1, (Object) "");
        } else if (i != 2 && i != 3) {
        } else {
            if (this.f77787e == EnumC32594j.NONE) {
                if (this.f77788f) {
                    C31667a.m65983a(11);
                }
            } else if ((this.f77787e == EnumC32594j.INPUT_PHONE_LOGIN || this.f77787e == EnumC32594j.INPUT_EMAIL_LOGIN) && (a = m67106a(getIntent())) != null && !a.getBoolean("has_callBack", true)) {
                AbstractC32572b d = mo58454d();
                if (!(d instanceof C32716r)) {
                    d = null;
                }
                C32716r rVar = (C32716r) d;
                if (rVar != null) {
                    if (rVar.f77985b == 0) {
                        g = rVar.mo58545e();
                    } else {
                        g = rVar.mo57437g();
                    }
                    Fragment fragment = g.f78144a;
                    Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.NeedCancelThisLoginMethod");
                    if (((AbstractC32818x) fragment).mo57964a() && !C36085cj.m73550d()) {
                        C36085cj.m73553g().retryLogin();
                        return;
                    }
                }
                C36085cj.m73541a(7, 4, "");
                if (!this.f77788f) {
                    C36085cj.m73540a(1, 2, (Object) "");
                }
            }
        }
    }

    /* renamed from: a */
    private static Bundle m67106a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$c */
    static final class C32608c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32608c f77792a = new C32608c();

        static {
            Covode.recordClassIndex(39387);
        }

        C32608c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C326091.f77793a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        Serializable serializable = bundle.getSerializable("age_gate_response");
        if (!(serializable instanceof AgeGateResponse)) {
            serializable = null;
        }
        this.f77784a = (AgeGateResponse) serializable;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$b */
    static final class C32607b extends AbstractC89220m implements AbstractC89172b<C1731i<Bundle>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SignUpOrLoginActivity f77790a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77791b;

        static {
            Covode.recordClassIndex(39386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32607b(SignUpOrLoginActivity signUpOrLoginActivity, AbstractC32572b bVar) {
            super(1);
            this.f77790a = signUpOrLoginActivity;
            this.f77791b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
            C89219l.m154721d(iVar, "");
            AbstractC32572b bVar = this.f77791b;
            if (bVar != null) {
                bVar.mo57470b_(0);
            }
            this.f77790a.finish();
            if (C36085cj.m73550d()) {
                C36085cj.m73540a(1, 1, (Object) "");
            }
            C31667a.m65983a(11);
            C36085cj.m73544a(C36085cj.m73552f());
            if (C89219l.m154714a((Object) "find_account", (Object) this.f77790a.mo58455e())) {
                AbstractC81915c.m141874a(new C33488c());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31669b
    /* renamed from: a */
    public final void mo57661a(int i) {
        if (i == 9) {
            finish();
        } else if (i == 14) {
            String e = mo58455e();
            String f = mo58456f();
            C89219l.m154721d(e, "");
            C89219l.m154721d(f, "");
            long a = C79679i.C79680a.m138493a();
            C33744d a2 = new C33744d().mo59983a("enter_method", f).mo59983a("enter_from", e);
            if (a != -1) {
                a2.mo59981a("stay_time", a);
            }
            C39162r.m79460a("success_guestmode", a2.f79943a);
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        this.f77788f = true;
        AbstractC32572b d = mo58454d();
        if (bundle == null) {
            bundle = new Bundle();
        }
        AgeGateResponse ageGateResponse = this.f77784a;
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
        if (!TextUtils.isEmpty(C32079s.f76562b)) {
            bundle.putString("enter_from", C32079s.f76562b);
        }
        if (!TextUtils.isEmpty(C32079s.f76561a)) {
            bundle.putString("enter_method", C32079s.f76561a);
        }
        if (C36085cj.m73547a()) {
            bundle.putBoolean("only_login", true);
        }
        Integer num = this.f77785b;
        if (num != null) {
            bundle.putInt("kr_marketing_notification_operation", num.intValue());
        }
        if (d != null) {
            d.mo57470b_(1);
        }
        C31604d.m65915a(bundle, this, new C32607b(this, d));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        boolean z;
        Bundle bundle2 = new Bundle(bundle);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle2.getInt("next_page", EnumC32594j.PHONE_EMAIL_SIGN_UP.getValue()));
        int i = C32805o.f78160b[a.ordinal()];
        if (i == 1) {
            if (bundle2.getInt("result_code", -99988) != -99988) {
                setResult(bundle2.getInt("result_code", -99988));
            }
            finish();
        } else if (i != 2) {
            int i2 = bundle2.getInt("current_page", -1);
            bundle2.putInt("previous_page", i2);
            boolean z2 = false;
            if (a == EnumC32594j.PHONE_EMAIL_SIGN_UP && i2 == -1 && !GuestModeServiceImpl.m65990d().mo57219c()) {
                z = true;
            } else {
                z = false;
            }
            if (bundle2.getBoolean("is_multi_account", false) && C32816w.C32817a.m67394a()) {
                z2 = true;
            }
            Object a2 = C31291a.m65463a(AbstractC34817bf.class);
            C89219l.m154716b(a2, "");
            int d = ((AbstractC34817bf) a2).mo60103d();
            if (z && !z2 && d != 0) {
                a = EnumC32594j.AGE_GATE_SIGN_UP;
                Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
            } else if (C31937c.m66302a() && a == EnumC32594j.PHONE_EMAIL_SIGN_UP && i2 == -1) {
                a = EnumC32594j.TERMS_CONSENT_SIGN_UP;
            }
            bundle2.putInt("current_page", a.getValue());
            bundle2.remove("next_page");
            if (a == EnumC32594j.THIRD_PARTY_AGE_GATE) {
                bundle2.putString("platform", m67107a(getIntent(), "platform"));
            }
            bundle2.putInt("age_gate_register_action", d);
            bundle2.putBoolean("is_multi_account_same_user", z2);
            AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle2);
        } else {
            SmartRouter.buildRoute(this, "//account/ftc").withParam("next_page", EnumC32594j.FTC_CREATE_ACCOUNT.getValue()).withParam("age_gate_data", this.f77784a).withParam(bundle2).open();
            finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", true);
        activityConfiguration(C32608c.f77792a);
        super.onCreate(bundle);
        C31667a.m65984a(this);
        this.f77786d = EnumC32594j.C32595a.m67087a(getIntent().getIntExtra("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue()));
        this.f77787e = EnumC32594j.C32595a.m67087a(getIntent().getIntExtra("child_page", EnumC32594j.NONE.getValue()));
        if (bundle == null) {
            C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a;
            Bundle a = m67106a(getIntent());
            if (a == null) {
                a = new Bundle();
            }
            a.putString("enter_from", mo58455e());
            a.putString("enter_method", mo58456f());
            a.putString("enter_type", mo58457g());
            a.putInt("next_page", this.f77786d.getValue());
            rVar.postValue(a);
        }
        C22362d.m42100a().mo36726a(C32610d.f77794a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$d */
    static final class C32610d implements AbstractC22367g.AbstractC22368a {

        /* renamed from: a */
        public static final C32610d f77794a = new C32610d();

        static {
            Covode.recordClassIndex(39389);
        }

        C32610d() {
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g.AbstractC22368a
        /* renamed from: a */
        public final void mo36733a(String str, Bundle bundle) {
            C39162r.m79453a(str, bundle);
        }
    }

    /* renamed from: a */
    private static String m67107a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(persistableBundle, "");
        super.onSaveInstanceState(bundle, persistableBundle);
        AgeGateResponse ageGateResponse = this.f77784a;
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C22362d.m42100a().mo36723a(i, i2, intent);
    }
}
