package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cu */
public final class C70011cu extends AbstractC72463p {
    static {
        Covode.recordClassIndex(82425);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC72463p
    /* renamed from: a */
    public final void mo110464a(Fragment fragment, View view) {
        MethodCollector.m26663i(7869);
        this.f162448a = C63253l.f143623a.mo73326v().mo101690a(fragment.getActivity());
        this.f162448a.mo101694a(fragment);
        ((LinearLayout) view.findViewById(R.id.edu)).addView(this.f162448a.mo101699c());
        MethodCollector.m26664o(7869);
    }

    public C70011cu(Fragment fragment, View view, boolean z) {
        super(fragment, view, 1, z);
    }
}
