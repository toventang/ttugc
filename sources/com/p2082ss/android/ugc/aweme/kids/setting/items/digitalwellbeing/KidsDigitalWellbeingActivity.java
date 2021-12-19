package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.model.TimeLockUserSetting;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.SetTimeLockActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity */
public final class KidsDigitalWellbeingActivity extends ActivityC17312a {

    /* renamed from: a */
    private HashMap f131915a;

    static {
        Covode.recordClassIndex(67866);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131915a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131915a == null) {
            this.f131915a = new HashMap();
        }
        View view = (View) this.f131915a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131915a.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity$b */
    static final class C57859b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsDigitalWellbeingActivity f131917a;

        static {
            Covode.recordClassIndex(67868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57859b(KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity) {
            super(0);
            this.f131917a = kidsDigitalWellbeingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131917a.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m104600a() {
        int i;
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.alg);
        if (TimeLockRuler.isTimeLockOn()) {
            i = R.string.c9x;
        } else {
            i = R.string.dhn;
        }
        commonItemView.setRightText(getString(i));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onResume", true);
        super.onResume();
        m104600a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity$c */
    static final class C57860c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57860c f131918a = new C57860c();

        static {
            Covode.recordClassIndex(67869);
        }

        C57860c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C578611.f131919a);
            return C89391z.f203057a;
        }
    }

    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        if (timeLockUserSetting != null && !timeLockUserSetting.isNotifyParentModeOnly()) {
            m104600a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity$a */
    static final class View$OnClickListenerC57858a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KidsDigitalWellbeingActivity f131916a;

        static {
            Covode.recordClassIndex(67867);
        }

        View$OnClickListenerC57858a(KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity) {
            this.f131916a = kidsDigitalWellbeingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KidsDigitalWellbeingActivity kidsDigitalWellbeingActivity = this.f131916a;
            Intent intent = new Intent(this.f131916a, SetTimeLockActivity.class);
            C84349a.m145093a(intent, kidsDigitalWellbeingActivity);
            kidsDigitalWellbeingActivity.startActivity(intent);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onCreate", true);
        activityConfiguration(C57860c.f131918a);
        super.onCreate(bundle);
        setContentView(R.layout.adq);
        C23194g gVar = new C23194g();
        String string = getString(R.string.ge8);
        C89219l.m154716b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37725a(gVar.mo37753a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C57859b(this)));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37727a(true);
        ((CommonItemView) _$_findCachedViewById(R.id.alg)).setLeftText(getString(R.string.b6x));
        ((CommonItemView) _$_findCachedViewById(R.id.alg)).setRightIconRes(0);
        ((CommonItemView) _$_findCachedViewById(R.id.alg)).setOnClickListener(new View$OnClickListenerC57858a(this));
        m104600a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.KidsDigitalWellbeingActivity", "onCreate", false);
    }
}
