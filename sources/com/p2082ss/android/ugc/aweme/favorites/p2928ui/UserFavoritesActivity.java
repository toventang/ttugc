package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.trill.R;
import dagger.AbstractC88075a;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity */
public class UserFavoritesActivity extends AbstractActivityC47711h implements AbstractC34585f {

    /* renamed from: a */
    protected AbstractC88075a<Fragment> f110312a;

    static {
        Covode.recordClassIndex(56109);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        Fragment a = getSupportFragmentManager().mo3551a("user_favorites_fragment_tag");
        if (!(a instanceof C47742y) || ((C47742y) a).f110661n != 0) {
            return "";
        }
        return "collection_video";
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractActivityC47711h, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78673g = R.color.l;
        xVar.f78667a = true;
        activityConfiguration(new C47736s(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.zk);
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        a.mo3470b(R.id.acf, this.f110312a.get(), "user_favorites_fragment_tag");
        a.mo3467b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", false);
    }
}
