package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.utils.C68686a;
import com.p2082ss.android.ugc.aweme.setting.utils.C68690e;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity */
public final class SettingAdsActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C68499a f153314a = new C68499a((byte) 0);

    /* renamed from: b */
    private SparseArray f153315b;

    static {
        Covode.recordClassIndex(80751);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f153315b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f153315b == null) {
            this.f153315b = new SparseArray();
        }
        View view = (View) this.f153315b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f153315b.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity$a */
    public static final class C68499a {
        static {
            Covode.recordClassIndex(80752);
        }

        private C68499a() {
        }

        public /* synthetic */ C68499a(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity$b */
    public static final class C68500b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ SettingAdsActivity f153316a;

        static {
            Covode.recordClassIndex(80753);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68500b(SettingAdsActivity settingAdsActivity) {
            this.f153316a = settingAdsActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f153316a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity$e */
    static final class C68503e extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C68503e f153319a = new C68503e();

        static {
            Covode.recordClassIndex(80756);
        }

        C68503e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C685041.f153320a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity$c */
    static final class View$OnClickListenerC68501c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingAdsActivity f153317a;

        static {
            Covode.recordClassIndex(80754);
        }

        View$OnClickListenerC68501c(SettingAdsActivity settingAdsActivity) {
            this.f153317a = settingAdsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("refer", "settings_ads");
            User b = C80580in.m139683b();
            if (b != null) {
                str = b.getUid();
            } else {
                str = null;
            }
            C39162r.m79460a("click_settings_ads_specialist", a.mo59983a("user_id", str).f79943a);
            SmartRouter.buildRoute(this.f153317a, C68690e.m121123a()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity$d */
    static final class View$OnClickListenerC68502d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingAdsActivity f153318a;

        static {
            Covode.recordClassIndex(80755);
        }

        View$OnClickListenerC68502d(SettingAdsActivity settingAdsActivity) {
            this.f153318a = settingAdsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C33744d dVar = new C33744d();
            User b = C80580in.m139683b();
            if (b != null) {
                str = b.getUid();
            } else {
                str = null;
            }
            C39162r.m79460a("click_settings_ads_engage", dVar.mo59983a("user_id", str).f79943a);
            SmartRouter.buildRoute(this.f153318a, C68686a.m121120a()).open();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onCreate", true);
        activityConfiguration(C68503e.f153319a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.ayf);
        User b = C80580in.m139683b();
        if (b != null) {
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.dy);
            C89219l.m154716b(commonItemView, "");
            CommerceUserInfo commerceUserInfo = b.getCommerceUserInfo();
            int i2 = 8;
            if (commerceUserInfo == null || !commerceUserInfo.isHasAdExperienceEntry()) {
                i = 8;
            } else {
                i = 0;
            }
            commonItemView.setVisibility(i);
            CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.gd);
            C89219l.m154716b(commonItemView2, "");
            CommerceUserInfo commerceUserInfo2 = b.getCommerceUserInfo();
            if (commerceUserInfo2 != null && commerceUserInfo2.isHasAdFeedbackEntry()) {
                i2 = 0;
            }
            commonItemView2.setVisibility(i2);
            ((TextTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C68500b(this));
            ((CommonItemView) _$_findCachedViewById(R.id.dy)).setOnClickListener(new View$OnClickListenerC68501c(this));
            ((CommonItemView) _$_findCachedViewById(R.id.gd)).setOnClickListener(new View$OnClickListenerC68502d(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onCreate", false);
    }
}
