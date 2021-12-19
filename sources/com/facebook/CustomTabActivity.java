package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class CustomTabActivity extends Activity {

    /* renamed from: a */
    public static final String f56411a = (CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect");

    /* renamed from: b */
    public static final String f56412b = (CustomTabActivity.class.getSimpleName() + ".action_destroy");

    /* renamed from: c */
    private BroadcastReceiver f56413c;

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
    public void onDestroy() {
        C15477a.m28479e(this);
        C0998a.m3454a(this).mo3692a(this.f56413c);
        super.onDestroy();
    }

    static {
        Covode.recordClassIndex(27961);
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
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f56411a);
        intent.putExtra(CustomTabMainActivity.f56418d, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f56411a);
            intent2.putExtra(CustomTabMainActivity.f56418d, getIntent().getDataString());
            C0998a.m3454a(this).mo3694a(intent2);
            this.f56413c = new BroadcastReceiver() {
                /* class com.facebook.CustomTabActivity.C238481 */

                static {
                    Covode.recordClassIndex(27962);
                }

                public final void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C0998a.m3454a(this).mo3693a(this.f56413c, new IntentFilter(f56412b));
        }
    }
}
