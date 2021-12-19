package com.p2082ss.android.ugc.aweme.aabplugin.core.base.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity */
public class DFInstallBlankActivity extends ActivityC17312a {

    /* renamed from: a */
    private boolean f75126a;

    static {
        Covode.recordClassIndex(38056);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        if (this.f75126a) {
            C31357c.m65568a().mo57383b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        finish();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", true);
        super.onCreate(bundle);
        AbstractC31333m<?> b = C31310a.m65494a().mo57317b(m65567a(getIntent(), "module_name"));
        if (b != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("is_hold_progress_dialog", false);
            this.f75126a = booleanExtra;
            if (booleanExtra) {
                C31357c a = C31357c.m65568a();
                T t = b.f75066g;
                DialogInterface$OnCancelListenerC31355a aVar = new DialogInterface$OnCancelListenerC31355a(b);
                if (t.f75079c == null || (str = t.f75079c.f43159b) == null) {
                    str = getString(R.string.c3a);
                }
                WeakReference weakReference = new WeakReference(this);
                a.f75135a = new ProgressDialogC31356b(this);
                a.f75135a.setCancelable(true);
                a.f75135a.setCanceledOnTouchOutside(false);
                a.f75135a.setIndeterminate(false);
                a.f75135a.setMax(100);
                a.f75135a.setMessage(str);
                a.f75135a.setOnCancelListener(aVar);
                a.f75135a.setOnDismissListener(new DialogInterface$OnDismissListenerC31358d(weakReference));
                if (!isFinishing()) {
                    a.f75135a.show();
                }
            }
            if (getIntent().getBooleanExtra("is_hold_permission_dialog", false) && !b.mo57332a((ActivityC17312a) this)) {
                finish();
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m65567a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
