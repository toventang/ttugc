package com.p2082ss.android.ugc.aweme.login.p3425ui;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity */
public final class LogoutDialogActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C58967a f134207a = new C58967a((byte) 0);

    /* renamed from: b */
    private SparseArray f134208b;

    static {
        Covode.recordClassIndex(69294);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f134208b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f134208b == null) {
            this.f134208b = new SparseArray();
        }
        View view = (View) this.f134208b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f134208b.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$a */
    public static final class C58967a {
        static {
            Covode.recordClassIndex(69295);
        }

        private C58967a() {
        }

        public /* synthetic */ C58967a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aiz);
        C17197a.C17200a aVar = new C17197a.C17200a(this);
        aVar.f41070a = getString(R.string.cy5);
        aVar.f41071b = getString(R.string.cy4);
        aVar.mo27192a(getString(R.string.b6k), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58968b(this), false).mo27193a().mo27184b().setCancelable(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$b */
    static final class DialogInterface$OnClickListenerC58968b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LogoutDialogActivity f134209a;

        static {
            Covode.recordClassIndex(69296);
        }

        DialogInterface$OnClickListenerC58968b(LogoutDialogActivity logoutDialogActivity) {
            this.f134209a = logoutDialogActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C31575b.m65860b().logout("expired_logout", "sdk_expired_logout", C589691.f134210a);
            dialogInterface.dismiss();
            this.f134209a.finish();
            this.f134209a.overridePendingTransition(0, 0);
        }
    }
}
