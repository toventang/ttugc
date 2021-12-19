package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.deeplink.UpdateTipActivity */
public class UpdateTipActivity extends ActivityC17312a {

    /* renamed from: a */
    String f95867a = "";

    /* renamed from: b */
    private UpdateTipsArgs f95868b;

    static {
        Covode.recordClassIndex(48855);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        mo70194a();
    }

    /* renamed from: d */
    private void m82608d() {
        HashMap hashMap = new HashMap();
        hashMap.put("schema_url", this.f95867a);
        hashMap.put("click_position", "back");
        C39162r.m79460a("schema_update_toast_click", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70194a() {
        Intent intent = new Intent(this, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass());
        intent.addFlags(131072);
        m82605a(this, intent);
        m82608d();
        finish();
    }

    /* renamed from: b */
    private void m82606b() {
        if (m82604a(getIntent()) != null) {
            this.f95867a = this.f95868b.getUrlToGo();
            if (TextUtils.equals(C17867d.f42595s, "local_test") && !this.f95867a.isEmpty()) {
                TextView textView = (TextView) findViewById(R.id.ai3);
                textView.setText(this.f95867a);
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: c */
    private void m82607c() {
        if (m82604a(getIntent()) != null) {
            String versionRequire = this.f95868b.getVersionRequire();
            if (!TextUtils.isEmpty(versionRequire)) {
                ((TextView) findViewById(R.id.ai4)).setText(C1764a.m5928a(getResources().getString(R.string.fcu), new Object[]{versionRequire}));
            }
        }
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
    private static Bundle m82604a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m82607c();
        m82606b();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ca);
        this.f95868b = UpdateTipsArgs.getOrNew(this);
        View findViewById = findViewById(R.id.ai5);
        View findViewById2 = findViewById(R.id.ai2);
        findViewById.setOnClickListener(new View$OnClickListenerC41070x(this));
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            findViewById2.setVisibility(4);
        } else {
            findViewById2.setOnClickListener(new View$OnClickListenerC41071y(this));
        }
        m82607c();
        m82606b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m82605a(UpdateTipActivity updateTipActivity, Intent intent) {
        C84349a.m145093a(intent, updateTipActivity);
        updateTipActivity.startActivity(intent);
    }
}
