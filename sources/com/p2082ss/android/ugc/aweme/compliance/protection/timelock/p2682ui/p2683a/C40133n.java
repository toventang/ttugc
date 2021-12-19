package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.n */
public final class C40133n extends AbstractC40126k {

    /* renamed from: j */
    ViewGroup f94229j;

    /* renamed from: k */
    ViewGroup f94230k;

    /* renamed from: l */
    TuxTextView f94231l;

    /* renamed from: m */
    private String f94232m;

    static {
        Covode.recordClassIndex(47916);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j
    /* renamed from: c */
    public final int mo69271c() {
        return R.string.gdn;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k
    /* renamed from: b */
    public final void mo68126b() {
        super.mo68126b();
        C40074a.m81036a(getActivity(), mo69279d(), this.f94213c);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j
    /* renamed from: a */
    public final void mo69270a(String str) {
        if (!this.f94232m.equals(str)) {
            new C23144b(this).mo37640e(R.string.gdm).mo37637b();
            return;
        }
        mo69269a(this.f94203a);
        if (this.f94214d != null && getActivity() != null) {
            mo69280e();
            this.f94214d.mo69238b(C40074a.m81034a(mo69279d(), true, str, this.f94213c, getActivity()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94232m = getArguments().getString("password");
        this.f94229j = (ViewGroup) view.findViewById(R.id.dnb);
        this.f94230k = (ViewGroup) view.findViewById(R.id.ejf);
        this.f94229j.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        this.f94230k.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.egj);
        this.f94231l = tuxTextView;
        tuxTextView.mo37697a(28.0f);
        this.f94231l.setText(R.string.as8);
        this.f94215e = (TuxStatusView) view.findViewById(R.id.e7i);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ub, viewGroup, false);
    }
}
