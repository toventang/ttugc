package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.p3375a.C57879a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d */
public abstract class AbstractC57904d extends AbstractC57897c implements AbstractC57877a {

    /* renamed from: d */
    protected boolean f131992d;

    /* renamed from: e */
    protected C57879a f131993e;

    /* renamed from: j */
    protected TuxStatusView f131994j;

    /* renamed from: k */
    private View f131995k;

    static {
        Covode.recordClassIndex(67921);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: a */
    public void mo95178a() {
        m104682e();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: b */
    public void mo95179b() {
        m104682e();
    }

    /* renamed from: e */
    private void m104682e() {
        TuxStatusView tuxStatusView;
        if (af_() && (tuxStatusView = this.f131994j) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95232d() {
        TuxStatusView tuxStatusView = this.f131994j;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
            this.f131994j.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f131993e != null && af_()) {
            this.f131993e.f131955a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.pi);
        this.f131995k = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d.View$OnClickListenerC579051 */

            static {
                Covode.recordClassIndex(67922);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC57904d.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f131992d = arguments.getBoolean("from_change_pwd", false);
        }
        C57879a aVar = new C57879a();
        this.f131993e = aVar;
        aVar.mo95197a(this);
    }
}
