package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cv */
public final class C70619cv extends AbstractC72463p {
    static {
        Covode.recordClassIndex(83085);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC72463p
    /* renamed from: a */
    public final void mo110464a(Fragment fragment, View view) {
        MethodCollector.m26663i(7720);
        this.f162448a = C63253l.f143623a.mo73326v().mo101691b(fragment.getActivity());
        this.f162448a.mo101694a(fragment);
        ((ViewGroup) view.findViewById(R.id.c6b)).addView(this.f162448a.mo101699c());
        MethodCollector.m26664o(7720);
    }

    public C70619cv(Fragment fragment, View view, boolean z) {
        super(fragment, view, 1, z);
    }
}
