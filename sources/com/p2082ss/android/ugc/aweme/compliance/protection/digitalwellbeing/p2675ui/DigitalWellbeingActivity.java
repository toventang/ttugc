package com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.p2675ui;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity */
public final class DigitalWellbeingActivity extends ActivityC17312a implements View.OnClickListener {

    /* renamed from: a */
    public static final C40077a f94135a = new C40077a((byte) 0);

    /* renamed from: b */
    private TuxNavBar f94136b;

    /* renamed from: c */
    private CommonItemView f94137c;

    /* renamed from: d */
    private CommonItemView f94138d;

    /* renamed from: e */
    private SparseArray f94139e;

    static {
        Covode.recordClassIndex(47849);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f94139e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f94139e == null) {
            this.f94139e = new SparseArray();
        }
        View view = (View) this.f94139e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94139e.put(i, findViewById);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity$a */
    public static final class C40077a {
        static {
            Covode.recordClassIndex(47850);
        }

        private C40077a() {
        }

        public /* synthetic */ C40077a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity$b */
    static final class C40078b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DigitalWellbeingActivity f94140a;

        static {
            Covode.recordClassIndex(47851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40078b(DigitalWellbeingActivity digitalWellbeingActivity) {
            super(0);
            this.f94140a = digitalWellbeingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f94140a.onBackPressed();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onResume", true);
        super.onResume();
        m81046a();
        m81047b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onResume", false);
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
    private final void m81046a() {
        CommonItemView commonItemView;
        String string;
        String string2;
        if (FamilyPiaringManager.m81048a() != IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) {
            commonItemView = this.f94137c;
            if (commonItemView == null) {
                C89219l.m154710a("mTimeLockSetting");
            }
            if (C40074a.m81040c()) {
                string = getString(R.string.c9x);
            } else {
                string = getString(R.string.dhn);
            }
        } else if (FamilyPiaringManager.m81054c()) {
            commonItemView = this.f94137c;
            if (commonItemView == null) {
                C89219l.m154710a("mTimeLockSetting");
            }
            string = getString(R.string.br5);
        } else {
            CommonItemView commonItemView2 = this.f94137c;
            if (commonItemView2 == null) {
                C89219l.m154710a("mTimeLockSetting");
            }
            if (C40074a.m81040c()) {
                string2 = getString(R.string.c9x);
            } else {
                string2 = getString(R.string.dhn);
            }
            commonItemView2.setRightText(string2);
            return;
        }
        commonItemView.setRightText(string);
    }

    /* renamed from: b */
    private final void m81047b() {
        CommonItemView commonItemView;
        String string;
        String string2;
        if (FamilyPiaringManager.m81048a() != IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) {
            commonItemView = this.f94138d;
            if (commonItemView == null) {
                C89219l.m154710a("mTeenagerModeSetting");
            }
            if (C40061a.m81022b()) {
                string = getString(R.string.c9x);
            } else {
                string = getString(R.string.dhn);
            }
        } else if (FamilyPiaringManager.m81052b()) {
            commonItemView = this.f94138d;
            if (commonItemView == null) {
                C89219l.m154710a("mTeenagerModeSetting");
            }
            string = getString(R.string.br5);
        } else {
            CommonItemView commonItemView2 = this.f94138d;
            if (commonItemView2 == null) {
                C89219l.m154710a("mTeenagerModeSetting");
            }
            if (C40074a.m81039b()) {
                string2 = getString(R.string.c9x);
            } else {
                string2 = getString(R.string.dhn);
            }
            commonItemView2.setRightText(string2);
            return;
        }
        commonItemView.setRightText(string);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity$c */
    static final class C40079c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C40079c f94141a = new C40079c();

        static {
            Covode.recordClassIndex(47852);
        }

        C40079c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C400801.f94142a);
            baseActivityViewModel2.config(C400812.f94143a);
            return C89391z.f203057a;
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickAgent.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == R.id.alg) {
                if (!FamilyPiaringManager.m81054c()) {
                    C39162r.m79460a("enter_time_lock", new C33744d().f79943a);
                    SmartRouter.buildRoute(this, "//settimelock").withParam("SetTimeLockActivityKeyType", 0).withParam("SetTimeLockActivityKeyFromParent", false).open();
                }
            } else if (num.intValue() == R.id.alf && !FamilyPiaringManager.m81052b()) {
                C33744d a = new C33744d().mo59983a("enter_from", C40106a.f94179a);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C39162r.m79460a("enter_teen_mode", a.mo59980a("is_login", g.isLogin() ? 1 : 0).f79943a);
                SmartRouter.buildRoute(this, "//settimelock").withParam("SetTimeLockActivityKeyType", 1).withParam("SetTimeLockActivityKeyFromParent", false).open();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onCreate", true);
        activityConfiguration(C40079c.f94141a);
        super.onCreate(bundle);
        setContentView(R.layout.tz);
        View findViewById = findViewById(R.id.ejf);
        C89219l.m154716b(findViewById, "");
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById;
        this.f94136b = tuxNavBar;
        if (tuxNavBar == null) {
            C89219l.m154710a("mTitle");
        }
        C23194g gVar = new C23194g();
        String string = getString(R.string.ge8);
        C89219l.m154716b(string, "");
        tuxNavBar.mo37725a(gVar.mo37753a(string));
        TuxNavBar tuxNavBar2 = this.f94136b;
        if (tuxNavBar2 == null) {
            C89219l.m154710a("mTitle");
        }
        tuxNavBar2.mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C40078b(this)));
        TuxNavBar tuxNavBar3 = this.f94136b;
        if (tuxNavBar3 == null) {
            C89219l.m154710a("mTitle");
        }
        tuxNavBar3.mo37727a(true);
        View findViewById2 = findViewById(R.id.alg);
        C89219l.m154716b(findViewById2, "");
        CommonItemView commonItemView = (CommonItemView) findViewById2;
        this.f94137c = commonItemView;
        if (commonItemView == null) {
            C89219l.m154710a("mTimeLockSetting");
        }
        commonItemView.setLeftText(getString(R.string.b6x));
        CommonItemView commonItemView2 = this.f94137c;
        if (commonItemView2 == null) {
            C89219l.m154710a("mTimeLockSetting");
        }
        commonItemView2.setRightIconRes(0);
        CommonItemView commonItemView3 = this.f94137c;
        if (commonItemView3 == null) {
            C89219l.m154710a("mTimeLockSetting");
        }
        commonItemView3.setOnClickListener(this);
        View findViewById3 = findViewById(R.id.alf);
        C89219l.m154716b(findViewById3, "");
        CommonItemView commonItemView4 = (CommonItemView) findViewById3;
        this.f94138d = commonItemView4;
        if (commonItemView4 == null) {
            C89219l.m154710a("mTeenagerModeSetting");
        }
        commonItemView4.setLeftText(getString(R.string.b6w));
        CommonItemView commonItemView5 = this.f94138d;
        if (commonItemView5 == null) {
            C89219l.m154710a("mTeenagerModeSetting");
        }
        commonItemView5.setRightIconRes(0);
        CommonItemView commonItemView6 = this.f94138d;
        if (commonItemView6 == null) {
            C89219l.m154710a("mTeenagerModeSetting");
        }
        commonItemView6.setOnClickListener(this);
        m81046a();
        m81047b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onCreate", false);
    }
}
