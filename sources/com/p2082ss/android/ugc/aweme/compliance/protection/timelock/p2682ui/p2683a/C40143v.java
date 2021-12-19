package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.v */
public class C40143v extends AbstractC40126k {
    static {
        Covode.recordClassIndex(47926);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j
    /* renamed from: a */
    public final void mo69270a(String str) {
        boolean z = this.f94213c;
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        C40133n nVar = new C40133n();
        nVar.setArguments(bundle);
        ((AbstractActivityC40107a) getActivity()).mo69256a(nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.egj);
        tuxTextView.mo37697a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.egi);
        if (this.f94213c) {
            tuxTextView.setText(getString(R.string.ge2));
            textView.setVisibility(4);
            return;
        }
        if (mo69279d() == 0) {
            i = R.string.ge3;
        } else {
            i = R.string.ge4;
        }
        textView.setText(getString(i));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ua, viewGroup, false);
    }
}
