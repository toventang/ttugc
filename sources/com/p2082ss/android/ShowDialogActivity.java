package com.p2082ss.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ShowDialogActivity */
public class ShowDialogActivity extends Activity {
    static {
        Covode.recordClassIndex(35722);
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
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", true);
        super.onResume();
        Intent intent = getIntent();
        String a = m58750a(intent, "event");
        a.hashCode();
        if (a.equals("event_dialog")) {
            new AlertDialog.Builder(this).setTitle(m58750a(intent, "title")).setMessage(m58750a(intent, "message") + "\nPlease confirm that account adk is initialized correctly.").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ShowDialogActivity.DialogInterface$OnClickListenerC293371 */

                static {
                    Covode.recordClassIndex(35723);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ShowDialogActivity.this.finish();
                }
            }).setCancelable(false).show();
        }
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c6);
        C29351f.m58781a();
        finish();
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m58750a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
