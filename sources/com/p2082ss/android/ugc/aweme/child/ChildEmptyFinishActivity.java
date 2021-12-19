package com.p2082ss.android.ugc.aweme.child;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* renamed from: com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity */
public final class ChildEmptyFinishActivity extends ActivityC0218d {
    static {
        Covode.recordClassIndex(42905);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity", "onCreate", true);
        super.onCreate(bundle);
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity", "onCreate", false);
    }
}
