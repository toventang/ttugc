package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.fragment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.host.TikTokHostActivity;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment$$Activity */
public class SessionListFragment$$Activity extends TikTokHostActivity {
    static {
        Covode.recordClassIndex(64746);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.host.TikTokHostActivity
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
}
