package com.snapchat.kit.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.snapchat.kit.sdk.core.controller.EnumC28970a;

/* renamed from: com.snapchat.kit.sdk.d */
public class ActivityC29063d extends Activity {

    /* renamed from: a */
    C29073m f68651a;

    static {
        Covode.recordClassIndex(35412);
    }

    /* access modifiers changed from: protected */
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        SnapKitComponent a = C28951c.m57973a(this);
        if (a == null) {
            finish();
            return;
        }
        a.inject(this);
        Uri data = intent.getData();
        if (data != null) {
            if (data.toString().startsWith(this.f68651a.f68710c)) {
                C29073m mVar = this.f68651a;
                mVar.mo50742a(mVar.f68719l, data.getQueryParameter("code"), data.getQueryParameter("state"));
                finish();
            }
        }
        C29073m mVar2 = this.f68651a;
        if (mVar2.f68722o) {
            mVar2.mo50743a(EnumC28970a.INVALID_OAUTH_RESPONSE);
        } else {
            mVar2.mo50744b();
        }
        finish();
    }
}
