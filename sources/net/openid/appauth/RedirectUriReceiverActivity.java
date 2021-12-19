package net.openid.appauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

public class RedirectUriReceiverActivity extends Activity {
    static {
        Covode.recordClassIndex(106135);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
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

    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent a = AuthorizationManagementActivity.m156093a(this);
        a.setData(data);
        a.addFlags(603979776);
        C84349a.m145093a(a, this);
        startActivity(a);
        finish();
    }
}
