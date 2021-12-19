package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.internal.p1949h.C25756b;

public class ProxyBillingActivity extends Activity {

    /* renamed from: a */
    private ResultReceiver f6645a;

    static {
        Covode.recordClassIndex(2419);
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

    /* renamed from: a */
    private static Bundle m6821a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f6645a);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            this.f6645a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            } else {
                pendingIntent = null;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                String.valueOf(String.valueOf(e)).length();
                this.f6645a.send(6, null);
                finish();
            }
        } else {
            this.f6645a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle a;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i3 = C25756b.m49715a(intent).f6732a;
            ResultReceiver resultReceiver = this.f6645a;
            if (intent == null) {
                a = null;
            } else {
                a = m6821a(intent);
            }
            resultReceiver.send(i3, a);
        }
        finish();
    }
}
