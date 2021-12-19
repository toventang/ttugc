package com.p2082ss.android.ugc.aweme.qrcode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity */
public class TextQRCodeActivity extends ActivityC17312a {

    /* renamed from: a */
    public String f149255a = "";

    /* renamed from: b */
    private View f149256b;

    /* renamed from: c */
    private TextView f149257c;

    /* renamed from: d */
    private View f149258d;

    /* renamed from: e */
    private View f149259e;

    /* renamed from: f */
    private TextView f149260f;

    static {
        Covode.recordClassIndex(77891);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c9);
        this.f149259e = findViewById(R.id.bsy);
        this.f149256b = findViewById(R.id.f2r);
        this.f149258d = findViewById(R.id.eu9);
        this.f149257c = (TextView) findViewById(R.id.eu6);
        this.f149256b.setVisibility(8);
        this.f149260f = (TextView) findViewById(R.id.f0e);
        Intent intent = getIntent();
        if (intent != null) {
            this.f149255a = m118052a(intent, "intent_extra_content");
        }
        this.f149257c.setText(this.f149255a);
        String str = this.f149255a;
        if (str != null && ((!TextUtils.isEmpty(str) && str.startsWith("aweme://webview/")) || this.f149255a.contains("snssdk1128"))) {
            this.f149260f.setText(getResources().getText(R.string.fe7));
        }
        this.f149258d.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.TextQRCodeActivity.View$OnClickListenerC663661 */

            static {
                Covode.recordClassIndex(77892);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                try {
                    C80228av.m139063a("label", TextQRCodeActivity.this.f149255a, TextQRCodeActivity.this, PrivacyCert.Builder.with("bpea-218").usage("Copy text recognized by the QR code").tag("copy_qr_text").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                } catch (C13340a e) {
                    C51423a.m95788a("", e);
                }
                new C79459a(TextQRCodeActivity.this).mo123050a(R.string.au8).mo123053a();
            }
        });
        this.f149259e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.TextQRCodeActivity.View$OnClickListenerC663672 */

            static {
                Covode.recordClassIndex(77893);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TextQRCodeActivity.this.finish();
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m118052a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
