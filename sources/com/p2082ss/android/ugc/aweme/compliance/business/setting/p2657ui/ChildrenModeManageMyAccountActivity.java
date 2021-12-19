package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.util.C33037g;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity */
public class ChildrenModeManageMyAccountActivity extends ActivityC17312a implements View.OnClickListener {

    /* renamed from: a */
    TextTitleBar f93239a;

    /* renamed from: b */
    CommonItemView f93240b;

    /* renamed from: c */
    TuxTextView f93241c;

    /* renamed from: d */
    protected User f93242d;

    /* renamed from: e */
    public boolean f93243e;

    static {
        Covode.recordClassIndex(47241);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m80329a() {
        this.f93242d = C31575b.m65865g().getCurUser();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", true);
        super.onResume();
        C31575b.m65865g().getSetPasswordStatus(new AbstractC40763cv() {
            /* class com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui.ChildrenModeManageMyAccountActivity.C395362 */

            static {
                Covode.recordClassIndex(47243);
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
            /* renamed from: a */
            public final void mo57507a(String str) {
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
            /* renamed from: a */
            public final void mo57508a(boolean z) {
                ChildrenModeManageMyAccountActivity.this.f93243e = z;
                SharePrefCache.inst().getUserHasPassword().mo59940b(Boolean.valueOf(ChildrenModeManageMyAccountActivity.this.f93243e));
            }
        });
        m80329a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", false);
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
        int id = view.getId();
        if (id == R.id.a3u) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("have_set_password", this.f93243e);
            C39162r.m79460a("manage_account_password_click", new C33744d().f79943a);
            C31575b.m65864f().changePassword(this, "manage_my_account", "password_click", bundle, null);
        } else if (id == R.id.aiy) {
            C59206ab.m108755a("enter_delete_account").mo96746b("previous_page", "account_security_settings").mo96746b("enter_method", "click_button").mo96792f();
            C33037g.m67671a(this);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.l;
        activityConfiguration(new C39539a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.tw);
        m80329a();
        TextTitleBar textTitleBar = (TextTitleBar) findViewById(R.id.eiz);
        this.f93239a = textTitleBar;
        textTitleBar.setTitle(R.string.d0k);
        this.f93239a.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui.ChildrenModeManageMyAccountActivity.C395351 */

            static {
                Covode.recordClassIndex(47242);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                ChildrenModeManageMyAccountActivity.this.finish();
            }
        });
        TextTitleBar textTitleBar2 = this.f93239a;
        textTitleBar2.setBackgroundColor(C0643b.m2378c(textTitleBar2.getContext(), R.color.l));
        this.f93240b = (CommonItemView) findViewById(R.id.a3u);
        this.f93241c = (TuxTextView) findViewById(R.id.aiy);
        this.f93240b.setOnClickListener(this);
        this.f93241c.setOnClickListener(this);
        C39223a.m79598l().mo68665a("new_kids_mode_visit", true ^ C80580in.m139687c(), new C33744d().mo59983a("activity", "ChildrenModeManageMyAccountActivity").f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", false);
    }
}
