package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bt */
public final class C1813bt implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1983);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1663);
        Resources resources = context.getResources();
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        adHalfWebPageContainer.setId(R.id.g7);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 81;
        }
        if (DrawerLayout.C0844d.class.isInstance(a)) {
            ((DrawerLayout.C0844d) a).f3113a = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(adHalfWebPageContainer);
        adHalfWebPageContainer.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(adHalfWebPageContainer);
        }
        MethodCollector.m26664o(1663);
        return adHalfWebPageContainer;
    }
}
