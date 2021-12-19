package com.p2082ss.android.ugc.aweme.openauthorize;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity */
public class AwemeAuthorizeLoginActivity extends ActivityC17312a {
    static {
        Covode.recordClassIndex(73499);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", true);
        activityConfiguration(C62696a.f142132a);
        super.onCreate(bundle);
        Bundle bundle2 = new C80222ap().mo123650a("only_login", true).f179700a;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("authorize_hide_platforms");
        if (stringArrayListExtra != null) {
            bundle2.putStringArrayList("authorize_hide_platforms", stringArrayListExtra);
        }
        String a = m113084a(getIntent(), "auth_from_app");
        if (a != null) {
            bundle2.putString("auth_from_app", a);
        }
        C58957c.m108320a(this, "authorize", "", bundle2, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity.C626951 */

            static {
                Covode.recordClassIndex(73500);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                AwemeAuthorizeLoginActivity.this.setResult(-1);
                AwemeAuthorizeLoginActivity.this.finish();
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                AwemeAuthorizeLoginActivity.this.setResult(0);
                AwemeAuthorizeLoginActivity.this.finish();
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m113084a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
