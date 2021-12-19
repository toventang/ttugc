package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.m */
public final class C1848m implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2018);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2221);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.aaa);
        smartImageView.setBackgroundColor(resources.getColor(R.color.v));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C0174a.m578a(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2221);
        return frameLayout;
    }
}
