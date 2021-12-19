package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.q */
public final class C1852q implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2022);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1238);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        CommerceProductInfoView commerceProductInfoView = new CommerceProductInfoView(context);
        commerceProductInfoView.setId(R.id.d79);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C0174a.m578a(commerceProductInfoView);
        if (commerceProductInfoView.getParent() == null) {
            frameLayout.addView(commerceProductInfoView, layoutParams);
        }
        CommerceProductInfoView commerceProductInfoView2 = new CommerceProductInfoView(context);
        commerceProductInfoView2.setId(R.id.d77);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        C0174a.m578a(commerceProductInfoView2);
        if (commerceProductInfoView2.getParent() == null) {
            frameLayout.addView(commerceProductInfoView2, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(1238);
        return frameLayout;
    }
}
