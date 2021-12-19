package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34708a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2664e.p2665a.C39628a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40144w;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity */
public class TimeUnlockActivity extends AbstractActivityC40107a {

    /* renamed from: b */
    public static String f94182b = "UNLOCK";

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    /* renamed from: a */
    public final int mo69254a() {
        return R.layout.u5;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(47889);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    public void onBackPressed() {
        if (C40106a.m81124a() != null) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    /* renamed from: b */
    public final void mo69255b() {
        View findViewById = findViewById(R.id.b82);
        findViewById.setBackgroundColor(C0643b.m2378c(findViewById.getContext(), R.color.l));
        this.f94183a = C39628a.m80469a(C40144w.class).mo69040a();
        this.f94183a.setArguments(m81137a(getIntent()));
        C34708a<Boolean> a = C40106a.m81124a();
        if (a != null) {
            a.mo61381a(this.f94183a);
        }
        mo69256a(this.f94183a);
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

    /* renamed from: a */
    private static Bundle m81137a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C40151e(xVar));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", false);
    }
}
