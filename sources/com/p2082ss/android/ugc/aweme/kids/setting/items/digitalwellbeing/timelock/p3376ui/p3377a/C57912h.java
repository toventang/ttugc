package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

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
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57806a;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57807b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.p3375a.C57879a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.h */
public class C57912h extends AbstractC57904d {

    /* renamed from: k */
    private C57879a f132012k;

    /* renamed from: l */
    private int f132013l;

    static {
        Covode.recordClassIndex(67929);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d
    /* renamed from: a */
    public final void mo95178a() {
        super.mo95178a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d
    public void onDestroy() {
        super.onDestroy();
        C57879a aVar = this.f132012k;
        if (aVar != null) {
            aVar.f131955a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d
    /* renamed from: b */
    public final void mo95179b() {
        super.mo95179b();
        Boolean.valueOf(false);
        mo95221a(this.f131980a);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        C57806a b = C57807b.m104534a().mo95144b("TimeLockEnterFragmentV2");
        if (b != null) {
            b.mo95139a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    /* renamed from: b */
    public final void mo95222b(String str) {
        C89219l.m154721d(str, "");
        C57878a.f131952b = str;
        if (!TextUtils.isEmpty(str) && this.f132012k != null && getActivity() != null && this.f131994j != null) {
            mo95232d();
            int i = this.f132013l;
            if (i == 2) {
                this.f132012k.mo95198a(str);
            } else if (i == 1) {
                this.f132012k.mo95199b(C57878a.m104635a(false, str, false, getActivity()));
            } else if (i == 0) {
                this.f132012k.mo95199b(C57878a.m104635a(true, str, false, getActivity()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57904d, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.egj);
        tuxTextView.mo37697a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.egi);
        this.f131994j = (TuxStatusView) view.findViewById(R.id.e7i);
        int i = getArguments().getInt("type_close", 0);
        this.f132013l = i;
        if (i == 1) {
            C34729o.m70956a(false, textView);
            tuxTextView.setText(getString(R.string.b74));
        } else if (i == 2) {
            tuxTextView.setText(getString(R.string.gdr));
            textView.setText(getString(R.string.gdo));
        } else if (i == 0) {
            tuxTextView.setText(getString(R.string.cmk));
            textView.setText(getString(R.string.cmj));
        }
        C57879a aVar = new C57879a();
        this.f132012k = aVar;
        aVar.mo95197a(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ac8, viewGroup, false);
    }
}
