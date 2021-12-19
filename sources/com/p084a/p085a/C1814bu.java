package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bu */
public final class C1814bu implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1984);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1045);
        context.getResources();
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        adHalfWebPageMaskLayer.setId(R.id.g8);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        C0174a.m578a(adHalfWebPageMaskLayer);
        adHalfWebPageMaskLayer.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(adHalfWebPageMaskLayer);
        }
        MethodCollector.m26664o(1045);
        return adHalfWebPageMaskLayer;
    }
}
