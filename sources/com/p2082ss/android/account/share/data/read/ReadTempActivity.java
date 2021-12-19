package com.p2082ss.android.account.share.data.read;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.account.share.data.C29356a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.read.ReadTempActivity */
public final class ReadTempActivity extends Activity {

    /* renamed from: a */
    public int f69688a = 17;

    /* renamed from: b */
    public String f69689b = "";

    /* renamed from: c */
    public String f69690c = "";

    static {
        Covode.recordClassIndex(35746);
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
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", true);
        super.onCreate(bundle);
        String a = m58790a(getIntent(), "READ_PKG");
        if (a == null) {
            a = "";
        }
        this.f69689b = a;
        String a2 = m58790a(getIntent(), "EXTRA_KEY");
        if (a2 == null) {
            a2 = "";
        }
        this.f69690c = a2;
        if (TextUtils.isEmpty(this.f69689b)) {
            finish();
        }
        try {
            String str = this.f69689b;
            C89219l.m154719c(str, "");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            Context context = C29359b.f69697a;
            if (context == null) {
                C89219l.m154707a();
            }
            if (intent.resolveActivityInfo(context.getPackageManager(), 65536) == null) {
                C29359b.m58791a(new C29358a(this.f69689b, false, "not support", 8, (byte) 0));
                finish();
            }
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(this.f69689b, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            intent2.putExtra("EXTRA_KEY", this.f69690c);
            startActivityForResult(intent2, this.f69688a);
        } catch (Exception e) {
            C29359b.m58791a(new C29358a(this.f69689b, false, String.valueOf(e.getMessage()), 3));
            C29356a.m58786a().mo51314a("share_sdk_read_start_share_activity_failed").mo51315a("err_msg", e.getMessage()).mo51315a("err_msg_stack", Log.getStackTraceString(e)).mo51316b();
        }
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m58790a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f69688a && intent != null) {
            if (i2 == -1) {
                boolean z = true;
                if (1 != intent.getIntExtra("EXTRA_IS_SUCCESS", -1)) {
                    z = false;
                }
                String str = "";
                if (z) {
                    String a = m58790a(intent, "EXTRA_VALUE");
                    if (a == null) {
                        a = str;
                    }
                    C29358a aVar = new C29358a(this.f69689b, true, null, 12, (byte) 0);
                    String str2 = this.f69690c;
                    C89219l.m154719c(str2, str);
                    aVar.f69691a = str2;
                    aVar.f69696f = 3;
                    C89219l.m154719c(a, str);
                    aVar.f69692b = a;
                    C29359b.m58791a(aVar);
                } else {
                    String a2 = m58790a(intent, "ERROR_MSG");
                    if (a2 != null) {
                        str = a2;
                    }
                    C29359b.m58791a(new C29358a(this.f69689b, false, str, 3));
                }
            } else {
                C29359b.m58791a(new C29358a(this.f69689b, false, "resultCode not ok", 3));
            }
        }
        finish();
    }
}
