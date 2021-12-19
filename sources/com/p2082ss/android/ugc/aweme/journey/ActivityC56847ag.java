package com.p2082ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.journey.ag */
public class ActivityC56847ag extends Activity {
    static {
        Covode.recordClassIndex(66732);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C58945a.C58947b.f134185a.mo96429b("cold_boot_application_to_stubmain", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_stubmain_oncreate_duration", false);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(268435456);
        } else {
            intent = new Intent();
        }
        intent.putExtra("redirect_from_main", true);
        intent.setClassName(this, NewUserJourneyActivity.class.getName());
        C84349a.m145093a(intent, this);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_stubmain_oncreate_duration", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_stubmain_to_new_user_jrouney", false);
    }
}
