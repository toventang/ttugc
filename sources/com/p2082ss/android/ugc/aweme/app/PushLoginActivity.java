package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.accountsdk.C33582g;
import com.p2082ss.android.ugc.aweme.app.accountsdk.C33586k;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.PushLoginActivity */
public class PushLoginActivity extends ActivityC17312a {

    /* renamed from: a */
    private Handler f79705a = new Handler(Looper.myLooper());

    static {
        Covode.recordClassIndex(40441);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f79705a.removeCallbacksAndMessages(null);
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        final Bundle bundle2;
        final Intent intent;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", true);
        activityConfiguration(C33591ag.f79760a);
        super.onCreate(bundle);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("next_step");
        final ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("next_steps");
        Intent intent3 = getIntent();
        final String str = null;
        if (intent3 != null) {
            bundle2 = intent3.getBundleExtra("multi_account");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundle2 == null || context == null)) {
                bundle2.setClassLoader(context.getClassLoader());
            }
            if (bundle2 != null) {
                intent = (Intent) bundle2.getParcelable("push_intent");
            }
            intent = null;
        } else {
            bundle2 = null;
            intent = null;
        }
        if (intent3 != null) {
            str = m68773a(intent3, "multi_account_push_uid");
        }
        final RecordConfig recordConfig = (RecordConfig) getIntent().getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
        final Intent intent4 = new Intent();
        intent4.setClassName(this, "com.ss.android.ugc.aweme.main.MainActivity");
        C335571 r9 = new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.app.PushLoginActivity.C335571 */

            static {
                Covode.recordClassIndex(40442);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                PushLoginActivity.this.finish();
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                if (bundle2 == null || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str) || str.equals(C31575b.m65865g().getCurUserId())) {
                        Intent intent = intent2;
                        if (intent != null) {
                            m68774a(PushLoginActivity.this, intent);
                        } else {
                            ArrayList arrayList = parcelableArrayListExtra;
                            if (arrayList != null && arrayList.size() > 1) {
                                PushLoginActivity pushLoginActivity = PushLoginActivity.this;
                                ArrayList arrayList2 = parcelableArrayListExtra;
                                pushLoginActivity.startActivities((Intent[]) arrayList2.toArray(new Intent[arrayList2.size()]));
                            }
                        }
                    }
                    if (recordConfig != null) {
                        AVExternalServiceImpl.m113114a().asyncService("PushLogin", new SimpleServiceLoadCallback() {
                            /* class com.p2082ss.android.ugc.aweme.app.PushLoginActivity.C335571.C335581 */

                            static {
                                Covode.recordClassIndex(40443);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                asyncAVService.uiService().recordService().startRecord(PushLoginActivity.this, recordConfig);
                            }
                        });
                    }
                    PushLoginActivity.this.finish();
                    return;
                }
                if (TextUtils.equals(str, C31575b.m65865g().getCurUserId())) {
                    bundle2.putBoolean("login_jump", true);
                    bundle2.putParcelable("push_intent", intent);
                    LoginUtilsServiceImpl.m108310a().mo96439a(bundle2);
                } else {
                    m68774a(PushLoginActivity.this, intent4);
                }
                PushLoginActivity.this.finish();
            }

            /* renamed from: a */
            private static void m68774a(PushLoginActivity pushLoginActivity, Intent intent) {
                C84349a.m145093a(intent, pushLoginActivity);
                pushLoginActivity.startActivity(intent);
            }
        };
        Bundle bundle3 = new Bundle();
        if (C31575b.m65865g().isLogin()) {
            bundle3.putBoolean("force_use_default_login_method", true);
            bundle3.putBoolean("need_auto_fill_latest_login_info", false);
        }
        AbstractC34892bo b = C31575b.m65860b();
        IAccountService.C31274d dVar = new IAccountService.C31274d();
        dVar.f74960a = this;
        dVar.f74961b = "push";
        dVar.f74962c = "push";
        dVar.f74966g = true;
        dVar.f74963d = bundle3;
        dVar.f74965f = new C33582g();
        dVar.f74964e = new C33586k(r9);
        b.showLoginAndRegisterView(dVar.mo57084a());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m68773a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
