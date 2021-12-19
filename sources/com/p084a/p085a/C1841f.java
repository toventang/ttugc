package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.f */
public final class C1841f implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2011);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(35);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        NiceWidthTextView niceWidthTextView = new NiceWidthTextView(context);
        niceWidthTextView.setTextSize(1, 13.0f);
        niceWidthTextView.setId(R.id.xn);
        niceWidthTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), niceWidthTextView.getPaddingTop(), niceWidthTextView.getPaddingRight(), niceWidthTextView.getPaddingBottom());
        niceWidthTextView.setPadding(niceWidthTextView.getPaddingLeft(), niceWidthTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), niceWidthTextView.getPaddingBottom());
        niceWidthTextView.setBackgroundResource(R.drawable.b0u);
        niceWidthTextView.setText(R.string.bxs);
        niceWidthTextView.setMaxLines(1);
        niceWidthTextView.setEllipsize(TextUtils.TruncateAt.END);
        niceWidthTextView.setAllCaps(false);
        niceWidthTextView.setTypeface(Typeface.defaultFromStyle(1));
        niceWidthTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        niceWidthTextView.setFontType("medium");
        niceWidthTextView.setTextColor(resources.getColorStateList(R.color.a_));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        niceWidthTextView.setGravity(17);
        niceWidthTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C0174a.m578a(niceWidthTextView);
        if (niceWidthTextView.getParent() == null) {
            relativeLayout.addView(niceWidthTextView, layoutParams);
        }
        C0174a.m578a(relativeLayout);
        relativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.m26664o(35);
        return relativeLayout;
    }
}
