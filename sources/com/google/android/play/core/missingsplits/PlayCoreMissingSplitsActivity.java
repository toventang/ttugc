package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.play.core.p1963b.C26903au;
import com.google.android.play.core.p1963b.C26909b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    static {
        Covode.recordClassIndex(32537);
    }

    /* renamed from: a */
    private final String m53789a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C26903au.m53445a(this)) {
            String a = m53789a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 91);
            sb.append("The app ");
            sb.append(a);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String a2 = m53789a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 87);
            sb2.append("The app ");
            sb2.append(a2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
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

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            String packageName = getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 66);
            sb.append("market://details?id=");
            sb.append(packageName);
            sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
            Intent intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending");
            try {
                C84349a.m145093a(intent, this);
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                new C26909b(getClass().getName()).mo44597c("Couldn't start missing splits activity for %s", packageName);
            }
        }
        finish();
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
}
