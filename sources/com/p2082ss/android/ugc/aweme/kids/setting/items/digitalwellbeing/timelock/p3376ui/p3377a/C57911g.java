package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

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
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.g */
public final class C57911g extends AbstractC57904d {

    /* renamed from: k */
    ViewGroup f132008k;

    /* renamed from: l */
    ViewGroup f132009l;

    /* renamed from: m */
    TuxTextView f132010m;

    /* renamed from: n */
    private String f132011n;

    static {
        Covode.recordClassIndex(67928);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    /* renamed from: c */
    public final int mo95223c() {
        return R.string.gdn;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d
    /* renamed from: b */
    public final void mo95179b() {
        super.mo95179b();
        C57878a.m104636a(getActivity(), this.f131992d);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    /* renamed from: b */
    public final void mo95222b(String str) {
        if (!this.f132011n.equals(str)) {
            new C23144b(this).mo37640e(R.string.gdm).mo37637b();
            return;
        }
        mo95221a(this.f131980a);
        boolean z = this.f131992d;
        if (this.f131993e != null && getActivity() != null) {
            mo95232d();
            this.f131993e.mo95199b(C57878a.m104635a(true, str, z, getActivity()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f132011n = getArguments().getString("password");
        this.f132008k = (ViewGroup) view.findViewById(R.id.dnb);
        this.f132009l = (ViewGroup) view.findViewById(R.id.ejf);
        this.f132008k.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        this.f132009l.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.egj);
        this.f132010m = tuxTextView;
        tuxTextView.mo37697a(28.0f);
        this.f132010m.setText(R.string.as8);
        this.f131994j = (TuxStatusView) view.findViewById(R.id.e7i);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ac_, viewGroup, false);
    }
}
