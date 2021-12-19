package com.p2082ss.android.ugc.trill.main.shortcut;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity */
public class ShortcutMessageActivity extends MainActivity implements AbstractC90253j {
    boolean isFirstOpenFlag = true;

    static {
        Covode.recordClassIndex(99124);
    }

    public void ShortcutMessageActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onStop() {
        C15477a.m28478d(this);
        m146324xb8ab3e71(this);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.main.MainActivity
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", false);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            if (C31575b.m65865g().isLogin()) {
                IMService.createIIMServicebyMonsterPlugin(false).openSessionListActivity(this);
            } else {
                this.mDataCenter.mo60191a("proformToTab", "NOTIFICATION");
            }
        }
    }

    /* renamed from: com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m146323xd087aa0a(ShortcutMessageActivity shortcutMessageActivity) {
        shortcutMessageActivity.ShortcutMessageActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m146324xb8ab3e71(ShortcutMessageActivity shortcutMessageActivity) {
        m146323xd087aa0a(shortcutMessageActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.main.AbstractActivityC59100h, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.main.MainActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        C39162r.m79460a("shortcut_click", new C33744d().mo59983a(StringSet.type, "message").f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }
}
