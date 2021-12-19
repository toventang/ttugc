package com.bytedance.ies.xbridge.base.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.C0569a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import p4600h.p4611f.p4613b.C89219l;

public final class GetPermissionActivity extends ActivityC0218d {

    /* renamed from: a */
    public static final C18418a f44005a = new C18418a((byte) 0);

    static {
        Covode.recordClassIndex(21090);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.bytedance.ies.xbridge.base.activity.GetPermissionActivity$a */
    public static final class C18418a {
        static {
            Covode.recordClassIndex(21091);
        }

        private C18418a() {
        }

        public /* synthetic */ C18418a(byte b) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        C0569a.m2182a(this, getIntent().getStringArrayExtra("permissions"), 36);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        if (i == 36) {
            if (iArr.length != 0 && iArr[0] == 0) {
                sendBroadcast(new Intent("GetPermissionActivity.permission_granted"));
            } else if (iArr.length != 0 && !C0569a.m2183a((Activity) this, strArr[0])) {
                sendBroadcast(new Intent("GetPermissionActivity.permission_rejected"));
            } else {
                sendBroadcast(new Intent("GetPermissionActivity.permission_denied"));
            }
            finish();
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
