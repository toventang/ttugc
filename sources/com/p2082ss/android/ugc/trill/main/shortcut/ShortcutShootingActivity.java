package com.p2082ss.android.ugc.trill.main.shortcut;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity */
public class ShortcutShootingActivity extends ActivityC17312a {
    static {
        Covode.recordClassIndex(99125);
    }

    public void ShortcutShootingActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        m146326x611bfba5(this);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        AVExternalServiceImpl.m113114a().asyncServiceWithActivity(this, "shortcut", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity.C850991 */

            static {
                Covode.recordClassIndex(99126);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                ShortcutShootingActivity.this.finish();
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                ShortcutShootingActivity.this.finish();
                Intent intent = ShortcutShootingActivity.this.getIntent();
                intent.putExtra("shoot_way", "short_cut");
                asyncAVService.uiService().recordService().startRecord(ShortcutShootingActivity.this, intent);
            }
        });
    }

    /* renamed from: com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m146325x7ba3c33e(ShortcutShootingActivity shortcutShootingActivity) {
        shortcutShootingActivity.ShortcutShootingActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m146326x611bfba5(ShortcutShootingActivity shortcutShootingActivity) {
        m146325x7ba3c33e(shortcutShootingActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", true);
        super.onCreate(bundle);
        C39162r.m79460a("shortcut_click", new C33744d().mo59983a(StringSet.type, "shooting").f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", false);
    }
}
