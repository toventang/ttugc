package com.p2082ss.android.ugc.aweme.qrcode.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.powerpermissions.C17773l;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity */
public class QRCodePermissionActivity extends ActivityC0218d {

    /* renamed from: c */
    public static long f149372c;

    /* renamed from: a */
    public boolean f149373a;

    /* renamed from: b */
    public int f149374b = -1;

    /* renamed from: d */
    public boolean f149375d;

    static {
        Covode.recordClassIndex(77987);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo105381b() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService().mo101685a(new AbstractC63212bb.AbstractC63213a() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.C664564 */

            static {
                Covode.recordClassIndex(77991);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
            public final void onSuccess() {
                if (QRCodePermissionActivity.this.f149374b != -1) {
                    QRCodePermissionActivity qRCodePermissionActivity = QRCodePermissionActivity.this;
                    int i = qRCodePermissionActivity.f149374b;
                    boolean z = QRCodePermissionActivity.this.f149375d;
                    Intent intent = new Intent(qRCodePermissionActivity, ScanQRCodeActivityV2.class);
                    intent.putExtra("scan_page_from", i);
                    intent.putExtra("camera_only", z);
                    ScanQRCodeActivityV2.m118198a(qRCodePermissionActivity, intent);
                } else {
                    QRCodePermissionActivity qRCodePermissionActivity2 = QRCodePermissionActivity.this;
                    boolean z2 = qRCodePermissionActivity2.f149373a;
                    Intent intent2 = new Intent(qRCodePermissionActivity2, ScanQRCodeActivityV2.class);
                    intent2.putExtra("enter_from", z2);
                    ScanQRCodeActivityV2.m118198a(qRCodePermissionActivity2, intent2);
                }
                QRCodePermissionActivity.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo105380a() {
        Dialog b = new C17197a.C17200a(this).mo27194b(R.string.dnf).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.DialogInterface$OnClickListenerC664542 */

            static {
                Covode.recordClassIndex(77989);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                QRCodePermissionActivity.this.finish();
            }
        }, false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.DialogInterface$OnClickListenerC664531 */

            static {
                Covode.recordClassIndex(77988);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C80310cp.m139213a(QRCodePermissionActivity.this);
                QRCodePermissionActivity.this.finish();
            }
        }, false).mo27193a().mo27184b();
        b.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity.DialogInterface$OnDismissListenerC664553 */

            static {
                Covode.recordClassIndex(77990);
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                QRCodePermissionActivity.this.finish();
            }
        });
        b.show();
    }

    /* renamed from: a */
    public static void m118193a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f149372c >= 1000) {
            f149372c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", false);
            intent.putExtra("page_from", -1);
            m118194a(context, intent);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C80620e.m139778a(this) != 0) {
            z = false;
        }
        this.f149373a = getIntent().getBooleanExtra("enter_from", false);
        this.f149374b = getIntent().getIntExtra("page_from", -1);
        this.f149375d = getIntent().getBooleanExtra("camera_only", false);
        if (z) {
            mo105381b();
        } else if (C80620e.m139779a()) {
            C17773l.m32969a(this).mo28229a("android.permission.CAMERA").mo28230a(new C66473c(this));
        } else {
            mo105380a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m118194a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m118195a(Context context, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f149372c >= 1000) {
            f149372c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            intent.putExtra("enter_from", z2);
            m118194a(context, intent);
        }
    }
}
