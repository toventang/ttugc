package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.w */
public final class C1858w implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2028);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2225);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.aat);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        PdpSelectItemView pdpSelectItemView = new PdpSelectItemView(context);
        pdpSelectItemView.setId(R.id.dub);
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), (int) resources.getDimension(R.dimen.fj));
        pdpSelectItemView.setPadding((int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding((int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingTop(), pdpSelectItemView.getPaddingRight(), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingBottom());
        pdpSelectItemView.setPadding(pdpSelectItemView.getPaddingLeft(), pdpSelectItemView.getPaddingTop(), (int) resources.getDimension(R.dimen.fj), pdpSelectItemView.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C0174a.m578a(pdpSelectItemView);
        if (pdpSelectItemView.getParent() == null) {
            frameLayout.addView(pdpSelectItemView, layoutParams);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2225);
        return frameLayout;
    }
}
