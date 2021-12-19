package com.p2082ss.android.ugc.aweme.deeplink;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* renamed from: com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2 */
public final class AppLinkHandlerV2 extends DeepLinkActivityV2 {

    /* renamed from: f */
    private SparseArray f95828f;

    static {
        Covode.recordClassIndex(48840);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f95828f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f95828f == null) {
            this.f95828f = new SparseArray();
        }
        View view = (View) this.f95828f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95828f.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "onCreate", true);
        this.f95832c = true;
        this.f95831b.f95906a = true;
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "onCreate", false);
    }
}
