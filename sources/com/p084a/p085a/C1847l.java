package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.l */
public final class C1847l implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2017);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(4008);
        Resources resources = context.getResources();
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.bky);
        smartImageView.setBackgroundColor(resources.getColor(R.color.v));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        C1766a aVar = new C1766a();
        aVar.mo5576a("app:placeholderImage", new C1863a.C1865b("2131231667", "drawable"), smartImageView, a);
        aVar.mo5576a("app:placeholderImageScaleType", new C1863a.C1866c("center"), smartImageView, a);
        aVar.mo5575a(smartImageView, a);
        C0174a.m578a(smartImageView);
        smartImageView.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(smartImageView);
        }
        MethodCollector.m26664o(4008);
        return smartImageView;
    }
}
