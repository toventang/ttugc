package com.bytedance.push.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.push.C21798f;
import com.bytedance.push.third.C21922f;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.push.C30194a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class PushActivity extends Activity {
    static {
        Covode.recordClassIndex(25513);
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
    private static Bundle m40956a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle a = m40956a(intent);
            if (a != null) {
                for (String str : a.keySet()) {
                    m40957a(a, str);
                }
            }
            boolean b = C30194a.m61073b(intent, "from_notification");
            String a2 = m40958a(intent, "push_body");
            if (b && !TextUtils.isEmpty(a2)) {
                int a3 = C30194a.m61069a(intent, "message_from", 0);
                try {
                    Context applicationContext = getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    C21922f.m41214a(applicationContext);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C21798f.m40815c().mo35433a(this, a2, a3);
            }
        }
        finish();
    }

    /* renamed from: a */
    private static Object m40957a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m40958a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
