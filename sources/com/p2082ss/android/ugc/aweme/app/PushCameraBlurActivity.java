package com.p2082ss.android.ugc.aweme.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.utils.C34724j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.app.PushCameraBlurActivity */
public class PushCameraBlurActivity extends ActivityC17312a {

    /* renamed from: a */
    private boolean f79695a;

    /* renamed from: b */
    private boolean f79696b;

    /* renamed from: c */
    private boolean f79697c;

    /* renamed from: d */
    private String f79698d;

    static {
        Covode.recordClassIndex(40435);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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
    public final void mo59726a() {
        if (this.f79696b) {
            final RecordConfig build = new RecordConfig.Builder().showStickerPanel(true).shootWay("camera_blur").build();
            AVExternalServiceImpl.m113114a().asyncService(this, "camera_blur", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.app.PushCameraBlurActivity.C335554 */

                static {
                    Covode.recordClassIndex(40439);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(PushCameraBlurActivity.this, build);
                    PushCameraBlurActivity.this.finish();
                }
            });
        } else if (this.f79697c && !C34724j.m70936a(this.f79698d)) {
            C71924b bVar = new C71924b();
            bVar.f161176i = new C71924b.AbstractC71934a() {
                /* class com.p2082ss.android.ugc.aweme.app.PushCameraBlurActivity.C335565 */

                static {
                    Covode.recordClassIndex(40440);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.AbstractC71934a
                /* renamed from: a */
                public final void mo59730a() {
                    PushCameraBlurActivity.this.finish();
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b.AbstractC71934a
                /* renamed from: b */
                public final void mo59731b() {
                    PushCameraBlurActivity.this.finish();
                }
            };
            bVar.mo113571a(this.f79698d, this, "push");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        activityConfiguration(C33589ae.f79758a);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f79695a = intent.getBooleanExtra("show_dialog", false);
        this.f79696b = intent.getBooleanExtra("show_effect", false);
        this.f79697c = intent.getBooleanExtra("show_duet", false);
        String a = m68769a(intent, "aid");
        this.f79698d = a;
        if (a == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
            return;
        }
        if (this.f79695a) {
            setContentView(R.layout.c5);
            Dialog b = new C17197a.C17200a(this).mo27189a(R.string.dl0).mo27194b(R.string.dky).mo27195b(R.string.c50, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.app.PushCameraBlurActivity.DialogInterface$OnClickListenerC335532 */

                static {
                    Covode.recordClassIndex(40437);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PushCameraBlurActivity.this.finish();
                }
            }, false).mo27190a(R.string.si, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.app.PushCameraBlurActivity.DialogInterface$OnClickListenerC335521 */

                static {
                    Covode.recordClassIndex(40436);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    PushCameraBlurActivity.this.mo59726a();
                    dialogInterface.dismiss();
                }
            }, false).mo27193a().mo27184b();
            b.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.p2082ss.android.ugc.aweme.app.PushCameraBlurActivity.DialogInterface$OnCancelListenerC335543 */

                static {
                    Covode.recordClassIndex(40438);
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    PushCameraBlurActivity.this.finish();
                }
            });
            b.setCanceledOnTouchOutside(true);
            b.show();
        } else {
            mo59726a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m68769a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
