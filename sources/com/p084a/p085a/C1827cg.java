package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui.FeedMultiTagLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cg */
public final class C1827cg implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1997);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(480);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        FeedMultiTagLayout feedMultiTagLayout = new FeedMultiTagLayout(context);
        feedMultiTagLayout.setId(R.id.b0t);
        feedMultiTagLayout.setClickable(true);
        feedMultiTagLayout.setFocusable(true);
        feedMultiTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.a0z));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(feedMultiTagLayout);
        if (feedMultiTagLayout.getParent() == null) {
            linearLayout.addView(feedMultiTagLayout, layoutParams);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(480);
        return linearLayout;
    }
}
