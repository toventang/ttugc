package com.p2082ss.android.ugc.trill.setting;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.AbstractC31004b;
import com.p2082ss.android.ugc.trill.R;

@AbstractC31004b(mo56087a = C85142g.class)
/* renamed from: com.ss.android.ugc.trill.setting.PushSettingActivity */
public class PushSettingActivity extends AbstractActivityC85117a<C85142g> implements View.OnClickListener {

    /* renamed from: a */
    protected ButtonTitleBar f190427a;

    /* renamed from: b */
    protected CommonItemView f190428b;

    /* renamed from: c */
    protected CommonItemView f190429c;

    /* renamed from: d */
    protected CommonItemView f190430d;

    static {
        Covode.recordClassIndex(99143);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.trill.setting.AbstractActivityC85117a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.trill.setting.AbstractActivityC85117a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.trill.setting.AbstractActivityC85117a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo130052b() {
        CommonItemView commonItemView = this.f190428b;
        commonItemView.setChecked(!commonItemView.mo27138d());
        C31575b.m65865g().updateShieldDiggNotice(!this.f190428b.mo27138d());
        m146349a("like", this.f190428b.mo27138d());
    }

    /* renamed from: c */
    public final void mo130053c() {
        CommonItemView commonItemView = this.f190429c;
        commonItemView.setChecked(!commonItemView.mo27138d());
        C31575b.m65865g().updateShieldFollowNotice(!this.f190429c.mo27138d());
        m146349a("follow", this.f190429c.mo27138d());
    }

    /* renamed from: d */
    public final void mo130054d() {
        CommonItemView commonItemView = this.f190430d;
        commonItemView.setChecked(!commonItemView.mo27138d());
        C31575b.m65865g().updateShieldCommentNotice(!this.f190430d.mo27138d());
        m146349a("comment_page", this.f190430d.mo27138d());
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
        if (id == R.id.c8r) {
            ((C85142g) mo130059a()).mo130073a(view.getId(), this.f190428b.mo27138d());
        } else if (id == R.id.b6t) {
            ((C85142g) mo130059a()).mo130073a(view.getId(), this.f190429c.mo27138d());
        } else if (id == R.id.a9x) {
            ((C85142g) mo130059a()).mo130073a(view.getId(), this.f190430d.mo27138d());
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.trill.setting.AbstractActivityC85117a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        C15477a.m28474a(this, bundle);
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C85140e(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.by);
        this.f190427a = (ButtonTitleBar) findViewById(R.id.ejf);
        this.f190428b = (CommonItemView) findViewById(R.id.c8r);
        this.f190429c = (CommonItemView) findViewById(R.id.b6t);
        this.f190430d = (CommonItemView) findViewById(R.id.a9x);
        this.f190427a.setTitle(getString(R.string.f03));
        this.f190427a.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.trill.setting.PushSettingActivity.C851101 */

            static {
                Covode.recordClassIndex(99144);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                PushSettingActivity.this.finish();
            }
        });
        this.f190428b.setOnClickListener(this);
        this.f190429c.setOnClickListener(this);
        this.f190430d.setOnClickListener(this);
        User curUser = C31575b.m65865g().getCurUser();
        CommonItemView commonItemView = this.f190428b;
        if (curUser.getShieldDiggNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        CommonItemView commonItemView2 = this.f190429c;
        if (curUser.getShieldFollowNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        commonItemView2.setChecked(z2);
        CommonItemView commonItemView3 = this.f190430d;
        if (curUser.getShieldCommentNotice() == 1) {
            z3 = false;
        }
        commonItemView3.setChecked(z3);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m146349a(String str, boolean z) {
        String str2;
        C39163s sVar = new C39163s();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        sVar.mo67941a("to_status", str2);
        C39162r.onEvent(MobClick.obtain().setEventName("notification_switch").setLabelName(str).setJsonObject(sVar.mo67942a()));
    }
}
