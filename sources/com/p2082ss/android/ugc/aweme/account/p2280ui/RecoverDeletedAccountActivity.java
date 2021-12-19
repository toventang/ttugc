package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.p2082ss.android.ugc.aweme.legacy.AbstractC58083b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity */
public class RecoverDeletedAccountActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final String f78499a;

    /* renamed from: b */
    public static final String f78500b;

    /* renamed from: l */
    private static final boolean f78501l = false;

    /* renamed from: c */
    TuxTextView f78502c;

    /* renamed from: d */
    TuxTextView f78503d;

    /* renamed from: e */
    TuxTextView f78504e;

    /* renamed from: f */
    TuxTextView f78505f;

    /* renamed from: g */
    String f78506g;

    /* renamed from: h */
    DialogC81438i f78507h;

    /* renamed from: i */
    boolean f78508i;

    /* renamed from: j */
    IAccountUserService f78509j = C36085cj.f85262b.mo57069e();

    /* renamed from: k */
    AbstractC58083b f78510k = ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60105f();

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(39788);
        String str = Api.f79771d;
        f78499a = str;
        f78500b = str + "/passport/cancel/do/";
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f78506g = m67622a(intent, "enter_from");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        String string;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fm);
        this.f78506g = m67622a(getIntent(), "enter_from");
        this.f78502c = (TuxTextView) findViewById(R.id.y8);
        this.f78503d = (TuxTextView) findViewById(R.id.a0z);
        this.f78504e = (TuxTextView) findViewById(R.id.buz);
        this.f78505f = (TuxTextView) findViewById(R.id.f63);
        User curUser = this.f78509j.getCurUser();
        if (curUser != null) {
            if (curUser.getCancelType() == 1) {
                if (!TextUtils.isEmpty(C39223a.m79600n().mo68674d())) {
                    this.f78504e.setText(C39223a.m79600n().mo68666a(this, C39223a.m79600n().mo68674d(), C39223a.m79600n().mo68675e()));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new PolicyBodyLinkList(getString(R.string.bq6), "aweme://webview/?url=https://www.tiktok.com/legal/new-terms-of-service?", false, 0, false, ""));
                    arrayList.add(new PolicyBodyLinkList(getString(R.string.bq5), "aweme://webview/?url=https://www.tiktok.com/legal/new-privacy-policy?", false, 0, false, ""));
                    this.f78504e.setText(C39223a.m79600n().mo68666a(this, getString(R.string.b48), arrayList));
                }
                this.f78504e.setMovementMethod(LinkMovementMethod.getInstance());
                TuxTextView tuxTextView = this.f78505f;
                if (!TextUtils.isEmpty(C39223a.m79600n().mo68673c())) {
                    string = C39223a.m79600n().mo68673c();
                } else {
                    string = getString(R.string.b49);
                }
                tuxTextView.setText(string);
                this.f78503d.setText(R.string.b47);
            } else {
                this.f78504e.setText(R.string.f8v);
                this.f78505f.setText(R.string.b49);
                this.f78503d.setText(R.string.f8u);
            }
        }
        this.f78502c.setOnClickListener(new View$OnClickListenerC32991d(this));
        this.f78503d.setOnClickListener(new View$OnClickListenerC32992e(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m67622a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
