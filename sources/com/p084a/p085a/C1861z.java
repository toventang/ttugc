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
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.FlowLayout;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.z */
public final class C1861z implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2031);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2003);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.djt);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView.setVisibility(8);
        tuxTextView.setTextAlignment(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, layoutParams);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(8388611);
        C79467f.m138187a(tuxTextView, layoutParams);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        ViewMoreText viewMoreText = new ViewMoreText(context);
        viewMoreText.setId(R.id.djk);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388611;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 8388611;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.C0844d) layoutParams2).f3113a = 8388611;
        }
        C0174a.m578a(viewMoreText);
        if (viewMoreText.getParent() == null) {
            linearLayout.addView(viewMoreText, layoutParams2);
        }
        FlowLayout flowLayout = new FlowLayout(context);
        flowLayout.setId(R.id.djq);
        flowLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(flowLayout);
        if (flowLayout.getParent() == null) {
            linearLayout.addView(flowLayout, layoutParams3);
        }
        ViewMoreText viewMoreText2 = new ViewMoreText(context);
        viewMoreText2.setId(R.id.djr);
        viewMoreText2.setBackgroundResource(R.drawable.y0);
        viewMoreText2.setVisibility(8);
        viewMoreText2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingTop(), viewMoreText2.getPaddingRight(), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), viewMoreText2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingRight(), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), viewMoreText2.getPaddingTop(), viewMoreText2.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(viewMoreText2);
        if (viewMoreText2.getParent() == null) {
            linearLayout.addView(viewMoreText2, layoutParams4);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2003);
        return linearLayout;
    }
}
