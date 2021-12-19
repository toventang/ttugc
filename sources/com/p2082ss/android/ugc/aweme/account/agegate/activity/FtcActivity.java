package com.p2082ss.android.ugc.aweme.account.agegate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32791i;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity */
public final class FtcActivity extends AbstractActivityC32568a {

    /* renamed from: a */
    private final AbstractC89244h f75198a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C31400b.f75202a, "next_page", Integer.class);

    /* renamed from: b */
    private final AbstractC89244h f75199b = C89250i.m154773a((AbstractC89171a) new C31399a(this));

    /* renamed from: c */
    private HashMap f75200c;

    static {
        Covode.recordClassIndex(38111);
    }

    /* renamed from: c */
    private final int m65619c() {
        return ((Number) this.f75198a.getValue()).intValue();
    }

    /* renamed from: h */
    private final Serializable m65620h() {
        return (Serializable) this.f75199b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75200c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f75200c == null) {
            this.f75200c = new HashMap();
        }
        View view = (View) this.f75200c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75200c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity$a */
    static final class C31399a extends AbstractC89220m implements AbstractC89171a<Serializable> {

        /* renamed from: a */
        final /* synthetic */ FtcActivity f75201a;

        static {
            Covode.recordClassIndex(38112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31399a(FtcActivity ftcActivity) {
            super(0);
            this.f75201a = ftcActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Serializable invoke() {
            Bundle a = m65623a(this.f75201a.getIntent());
            if (a != null) {
                return a.getSerializable("age_gate_data");
            }
            return null;
        }

        /* renamed from: a */
        private static Bundle m65623a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
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
    private static Bundle m65618a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity$b */
    static final class C31400b extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C31400b f75202a = new C31400b();

        static {
            Covode.recordClassIndex(38113);
        }

        C31400b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return Integer.valueOf(EnumC32594j.NONE.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity$c */
    static final class C31401c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C31401c f75203a = new C31401c();

        static {
            Covode.recordClassIndex(38114);
        }

        C31401c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C314021.f75204a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_page", -1);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle.getInt("next_page", EnumC32594j.FTC_CREATE_ACCOUNT.getValue()));
        if (a == EnumC32594j.DELETE_VIDEO_ALERT) {
            SmartRouter.buildRoute(this, "//account/video/deleted/alert").withParam("age_gate_response", new AgeGateResponse(0, "", false, 0, 1, null, 32, null)).withParam("enter_from", "from_create_account_password").open();
            finish();
            return;
        }
        bundle.putInt("previous_page", i);
        bundle.putInt("current_page", a.getValue());
        bundle.remove("next_page");
        AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (m65620h() != null) {
            bundle.putSerializable("age_gate_response", m65620h());
        }
        if (!TextUtils.isEmpty(C32079s.f76562b)) {
            bundle.putString("enter_from", C32079s.f76562b);
        }
        if (C36085cj.m73547a()) {
            bundle.putBoolean("only_login", true);
        }
        bundle.putString("platform", "account");
        SmartRouter.buildRoute(this, "//account/ftc/complete").withParam(bundle).open();
        Activity[] activityStack = ActivityStack.getActivityStack();
        C89219l.m154716b(activityStack, "");
        for (Activity activity : C89064i.m154505f(activityStack)) {
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", true);
        activityConfiguration(C31401c.f75203a);
        super.onCreate(bundle);
        if (bundle == null) {
            if (m65619c() != EnumC32594j.NONE.getValue()) {
                C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a;
                Bundle a = m65618a(getIntent());
                if (a == null) {
                    a = new Bundle();
                }
                a.putInt("next_page", m65619c());
                rVar.postValue(a);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot start AgeGateActivityV2 with Step.NONE");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
                throw illegalArgumentException;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
    }
}
