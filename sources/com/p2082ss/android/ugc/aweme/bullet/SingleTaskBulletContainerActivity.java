package com.p2082ss.android.ugc.aweme.bullet;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23147d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity */
public final class SingleTaskBulletContainerActivity extends BulletContainerActivity {

    /* renamed from: m */
    private SparseArray f82457m;

    static {
        Covode.recordClassIndex(41978);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final View mo26864a(int i) {
        if (this.f82457m == null) {
            this.f82457m = new SparseArray();
        }
        View view = (View) this.f82457m.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82457m.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity
    /* renamed from: v */
    public final int mo61827v() {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void finish() {
        super.finish();
        if (C80471gb.m139482a()) {
            overridePendingTransition(R.anim.dq, R.anim.dv);
        } else {
            overridePendingTransition(R.anim.f205073do, R.anim.dx);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
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

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && ((BulletContainerActivity) this).f82439l) {
            C23147d.m43620a(this);
            ((BulletContainerActivity) this).f82439l = false;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", true);
        boolean booleanExtra = getIntent().getBooleanExtra("is_clear_top", false);
        if ((!C80471gb.m139482a() || !booleanExtra) && (C80471gb.m139482a() || booleanExtra)) {
            overridePendingTransition(R.anim.f205073do, R.anim.dx);
        } else {
            overridePendingTransition(R.anim.dq, R.anim.dv);
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", false);
    }
}
