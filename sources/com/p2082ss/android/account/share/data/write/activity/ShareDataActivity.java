package com.p2082ss.android.account.share.data.write.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.account.share.data.C29356a;
import com.p2082ss.android.account.share.data.write.C29361a;
import com.p2082ss.android.account.share.data.write.C29363b;

/* renamed from: com.ss.android.account.share.data.write.activity.ShareDataActivity */
public final class ShareDataActivity extends Activity {
    static {
        Covode.recordClassIndex(35752);
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
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onWindowFocusChanged", true);
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

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = new Intent();
        try {
            if (!C29363b.m58797a(getCallingPackage())) {
                intent.putExtra("EXTRA_IS_SUCCESS", 0);
                setResult(-1, intent);
            } else {
                intent.putExtra("EXTRA_IS_SUCCESS", 1);
                String a = m58795a(getIntent(), "EXTRA_KEY");
                if (a == null) {
                    a = "";
                }
                intent.putExtra("EXTRA_VALUE", C29361a.C29362a.m58794a(this).mo51330a(a));
                setResult(-1, intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C29356a.m58786a().mo51314a("share_sdk_activity_read_local_data_failed").mo51315a("err_msg", e.getMessage()).mo51315a("err_msg_stack", Log.getStackTraceString(e)).mo51316b();
            intent.putExtra("EXTRA_IS_SUCCESS", 0);
            setResult(-1, intent);
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m58795a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
