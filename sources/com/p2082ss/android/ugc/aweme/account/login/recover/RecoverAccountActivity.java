package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22367g;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32791i;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.util.C33051t;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.p2310al.C33490e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Set;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity */
public final class RecoverAccountActivity extends AbstractActivityC32568a implements C31667a.AbstractC31669b {

    /* renamed from: a */
    public static final C31988a f76380a = new C31988a((byte) 0);

    /* renamed from: b */
    private EnumC32594j f76381b = EnumC32594j.PHONE_EMAIL_USERNAME_RECOVER;

    /* renamed from: c */
    private boolean f76382c;

    /* renamed from: d */
    private String f76383d = "";

    /* renamed from: e */
    private HashMap f76384e;

    static {
        Covode.recordClassIndex(38742);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76384e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76384e == null) {
            this.f76384e = new HashMap();
        }
        View view = (View) this.f76384e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76384e.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$a */
    public static final class C31988a {
        static {
            Covode.recordClassIndex(38743);
        }

        private C31988a() {
        }

        public /* synthetic */ C31988a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        C31667a.m65986b(this);
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

    /* renamed from: a */
    private static Bundle m66363a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$c */
    static final class C31990c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C31990c f76386a = new C31990c();

        static {
            Covode.recordClassIndex(38745);
        }

        C31990c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C319911.f76387a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$b */
    static final class C31989b extends AbstractC89220m implements AbstractC89172b<C1731i<Bundle>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecoverAccountActivity f76385a;

        static {
            Covode.recordClassIndex(38744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31989b(RecoverAccountActivity recoverAccountActivity) {
            super(1);
            this.f76385a = recoverAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
            C89219l.m154721d(iVar, "");
            this.f76385a.finish();
            if (C36085cj.m73550d()) {
                C36085cj.m73540a(1, 1, (Object) "");
            }
            C31667a.m65983a(11);
            C31667a.m65983a(9);
            C36085cj.m73544a(C36085cj.m73552f());
            AbstractC81915c.m141874a(new C33488c());
            AbstractC81915c.m141874a(new C33490e());
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31669b
    /* renamed from: a */
    public final void mo57661a(int i) {
        if (i == 12) {
            SmartRouter.buildRoute(this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
        } else if (i == 13) {
            finish();
            C31667a.m65983a(11);
            C31667a.m65983a(9);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        this.f76382c = true;
        if (bundle == null) {
            bundle = new Bundle();
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
        C31604d.m65915a(bundle, this, new C31989b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle2.getInt("next_page", EnumC32594j.RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY.getValue()));
        if (C32032d.f76458a[a.ordinal()] != 1) {
            bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
            bundle2.putInt("current_page", a.getValue());
            AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle2);
            return;
        }
        if (bundle2.getInt("result_code", -99988) != -99988) {
            setResult(bundle2.getInt("result_code", -99988));
        }
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Bundle a;
        Bundle a2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", true);
        activityConfiguration(C31990c.f76386a);
        super.onCreate(bundle);
        String str = C33051t.m67698a().f78604d;
        if (str == null) {
            str = "sslocal://webview?url=https%3A%2F%2Fwww.tiktok.com%2Fucenter_web%2Faccount_recover%3Fappend_common_params%3D1%26hide_nav_bar%3D1%26container_color_auto_dark%3D1";
        }
        if (!TextUtils.isEmpty(str)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, str + URLDecoder.decode("&enter_from=" + mo58455e(), "UTF-8"));
            Bundle a3 = m66363a(getIntent());
            if (a3 == null) {
                a3 = new Bundle();
            }
            buildRoute.withParam(a3).withAnimation(R.anim.dq, R.anim.a1).open();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this, R.color.l)));
        C31667a.m65984a(this);
        C39162r.m79460a("find_account_page_show", new C31376a().mo57397a("aid", 1180).f75156a);
        Intent intent = getIntent();
        Set<String> keySet = (intent == null || (a2 = m66363a(intent)) == null) ? null : a2.keySet();
        Uri.Builder builder = new Uri.Builder();
        if (keySet != null) {
            for (String str2 : keySet) {
                Intent intent2 = getIntent();
                builder.appendQueryParameter(str2, (intent2 == null || (a = m66363a(intent2)) == null) ? null : a.getString(str2));
            }
        }
        String builder2 = builder.toString();
        C89219l.m154716b(builder2, "");
        this.f76383d = builder2;
        if (bundle == null) {
            C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a;
            Bundle a4 = m66363a(getIntent());
            if (a4 == null) {
                a4 = new Bundle();
            }
            a4.putString("enter_from", "find_account");
            a4.putString("enter_method", "find_account");
            a4.putString("enter_type", mo58457g());
            a4.putString("feedback_param", this.f76383d);
            a4.putInt("next_page", this.f76381b.getValue());
            rVar.postValue(a4);
        }
        C22362d.m42100a().mo36726a(C31992d.f76388a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$d */
    static final class C31992d implements AbstractC22367g.AbstractC22368a {

        /* renamed from: a */
        public static final C31992d f76388a = new C31992d();

        static {
            Covode.recordClassIndex(38747);
        }

        C31992d() {
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g.AbstractC22368a
        /* renamed from: a */
        public final void mo36733a(String str, Bundle bundle) {
            C39162r.m79453a(str, bundle);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C22362d.m42100a().mo36723a(i, i2, intent);
    }
}
