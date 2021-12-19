package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2679b.C40097a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k */
public abstract class AbstractC40126k extends AbstractC40120j implements AbstractC39236g {

    /* renamed from: c */
    protected boolean f94213c;

    /* renamed from: d */
    protected C40097a f94214d;

    /* renamed from: e */
    protected TuxStatusView f94215e;

    /* renamed from: j */
    private View f94216j;

    static {
        Covode.recordClassIndex(47909);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: a */
    public void mo68125a() {
        m81165g();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: b */
    public void mo68126b() {
        m81165g();
    }

    /* renamed from: g */
    private void m81165g() {
        TuxStatusView tuxStatusView;
        if (af_() && (tuxStatusView = this.f94215e) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo69280e() {
        TuxStatusView tuxStatusView = this.f94215e;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
            this.f94215e.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final int mo69279d() {
        return ((SetLockParamViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SetLockParamViewModel.class)).f94260a.getValue().f94262a;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f94214d != null && af_()) {
            this.f94214d.f94166a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.pi);
        this.f94216j = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k.View$OnClickListenerC401271 */

            static {
                Covode.recordClassIndex(47910);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC40126k.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94213c = arguments.getBoolean("from_change_pwd", false);
        }
        C40097a aVar = new C40097a();
        this.f94214d = aVar;
        aVar.mo69236a(this);
    }
}
