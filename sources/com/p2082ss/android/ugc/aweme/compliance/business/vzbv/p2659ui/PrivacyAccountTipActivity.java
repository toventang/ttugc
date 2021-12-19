package com.p2082ss.android.ugc.aweme.compliance.business.vzbv.p2659ui;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.vzbv.p2658a.C39589a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63859w;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity */
public class PrivacyAccountTipActivity extends ActivityC17312a implements View.OnClickListener, AbstractC63860x {

    /* renamed from: a */
    boolean f93349a;

    /* renamed from: b */
    AbstractC63859w f93350b;

    /* renamed from: c */
    private boolean f93351c;

    /* renamed from: d */
    private TextView f93352d;

    /* renamed from: e */
    private TextView f93353e;

    static {
        Covode.recordClassIndex(47301);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public static boolean m80374b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69008a() {
        AbstractC63859w newUserPresenter = C63419ae.f143971a.newUserPresenter();
        this.f93350b = newUserPresenter;
        newUserPresenter.mo103292a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.PRIVATE_ACCOUNT_TIP);
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

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            int id = view.getId();
            if (id == R.id.xt) {
                C39223a.m79595i().mo68685d();
                SettingServiceImpl.m120782v().providePushSettingChangePresenter().mo57616a("notify_private_account", 1);
                finish();
                C39589a.m80371a("tns_privacy_notify_skip");
            } else if (id != R.id.xs) {
            } else {
                if (!this.f93351c) {
                    if (!isDestroyed()) {
                        new C17197a.C17200a(this).mo27194b(R.string.bna).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.c4e, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC39590a(this), false).mo27193a().mo27184b();
                    }
                    C39589a.m80371a("tns_privacy_notify_enable");
                    return;
                }
                SettingServiceImpl.m120782v().providePushSettingChangePresenter().mo57616a("notify_private_account", 1);
                C39589a.m80373b("privacy_account_setting_confirm", this.f93349a);
                finish();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u3);
        this.f93352d = (TextView) findViewById(R.id.xt);
        this.f93353e = (TextView) findViewById(R.id.xs);
        this.f93352d.setText(getString(R.string.fyb));
        this.f93353e.setText(getString(R.string.esy));
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.acq);
        TextView textView3 = (TextView) findViewById(R.id.a3r);
        boolean b = C39223a.m79595i().mo68683b();
        this.f93351c = b;
        if (b) {
            this.f93352d.setVisibility(8);
            textView.setText(R.string.n3);
            this.f93353e.setText(R.string.c4r);
            textView2.setText(R.string.bnc);
            textView3.setVisibility(8);
        }
        this.f93352d.setOnClickListener(this);
        this.f93353e.setOnClickListener(this);
        if (getIntent() != null) {
            this.f93349a = getIntent().getBooleanExtra("isFirstLaunch", false);
        }
        if (C39223a.m79595i().mo68683b()) {
            C39589a.m80373b("privacy_account_setting_show", this.f93349a);
        } else {
            C39589a.m80372a("privacy_account_setting_show", this.f93349a);
        }
        C39589a.m80371a("tns_privacy_notify");
        mo69008a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.vzbv.ui.PrivacyAccountTipActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        if (i == 122) {
            new C23144b(this).mo37640e(R.string.gx0).mo37637b();
        }
    }
}
