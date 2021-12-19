package com.p2082ss.android.deviceregister;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* renamed from: com.ss.android.deviceregister.AActivity */
public final class AActivity extends Activity {
    static {
        Covode.recordClassIndex(36272);
    }

    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onCreate", false);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
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
}
