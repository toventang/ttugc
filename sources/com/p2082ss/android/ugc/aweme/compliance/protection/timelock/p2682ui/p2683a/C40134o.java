package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2679b.C40097a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.o */
public class C40134o extends AbstractC40126k {

    /* renamed from: j */
    private C40097a f94233j;

    /* renamed from: k */
    private int f94234k;

    static {
        Covode.recordClassIndex(47917);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k
    /* renamed from: a */
    public final void mo68125a() {
        super.mo68125a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C40097a aVar = this.f94233j;
        if (aVar != null) {
            aVar.f94166a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k
    /* renamed from: b */
    public final void mo68126b() {
        super.mo68126b();
        mo69269a(this.f94203a);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        C34708a b = C34710c.m70888a().mo61388b("TimeLockEnterFragmentV2");
        if (b != null) {
            Boolean.valueOf(false);
            b.mo61382a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j
    /* renamed from: a */
    public final void mo69270a(String str) {
        C89219l.m154721d(str, "");
        C40074a.f94128c = str;
        if (!TextUtils.isEmpty(str) && this.f94233j != null && getActivity() != null && this.f94215e != null) {
            mo69280e();
            int i = this.f94234k;
            if (i == 2) {
                this.f94233j.mo69237a(str);
            } else if (i == 1) {
                this.f94233j.mo69238b(C40074a.m81034a(mo69279d(), false, str, false, getActivity()));
            } else if (i == 0) {
                this.f94233j.mo69238b(C40074a.m81034a(mo69279d(), true, str, false, getActivity()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40126k, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.egj);
        tuxTextView.mo37697a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.egi);
        this.f94215e = (TuxStatusView) view.findViewById(R.id.e7i);
        int i2 = getArguments().getInt("type_close", 0);
        this.f94234k = i2;
        if (i2 == 1) {
            C34729o.m70956a(false, textView);
            if (mo69279d() == 0) {
                i = R.string.b74;
            } else {
                i = R.string.b73;
            }
            tuxTextView.setText(getString(i));
        } else if (i2 == 2) {
            tuxTextView.setText(getString(R.string.gdr));
            textView.setText(getString(R.string.gdo));
        } else if (i2 == 0) {
            tuxTextView.setText(getString(R.string.cmk));
            textView.setText(getString(R.string.cmj));
        }
        C40097a aVar = new C40097a();
        this.f94233j = aVar;
        aVar.mo69236a(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.u_, viewGroup, false);
    }
}
