package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cb */
public final class C1822cb implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1992);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1718);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        if (TextView.class.isInstance(tuxTextView)) {
            C0174a.m579a(tuxTextView, (int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setLines(1);
        tuxTextView.setAlpha(0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.l));
        tuxTextView.setId(16908308);
        tuxTextView.setText(R.string.ggv);
        tuxTextView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 17;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H3_Semibold"), tuxTextView, layoutParams);
        C79467f.m138187a(tuxTextView, layoutParams);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.b7j);
        viewStub.setInflatedId(R.id.b7i);
        viewStub.setLayoutResource(R.layout.a3w);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams2);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.f5d);
        viewStub2.setInflatedId(R.id.f5_);
        viewStub2.setLayoutResource(R.layout.a3z);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams3);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.f5b);
        viewStub3.setInflatedId(R.id.f5a);
        viewStub3.setLayoutResource(R.layout.a3x);
        if (TextView.class.isInstance(viewStub3)) {
            C0174a.m579a(viewStub3, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            viewStub3.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        viewStub3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub3.getPaddingTop(), viewStub3.getPaddingRight(), viewStub3.getPaddingBottom());
        viewStub3.setPadding(viewStub3.getPaddingLeft(), viewStub3.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub3.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(viewStub3);
        if (viewStub3.getParent() == null) {
            linearLayout.addView(viewStub3, layoutParams4);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.f5c);
        viewStub4.setInflatedId(R.id.cc5);
        viewStub4.setLayoutResource(R.layout.a3y);
        viewStub4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub4.getPaddingTop(), viewStub4.getPaddingRight(), viewStub4.getPaddingBottom());
        viewStub4.setPadding(viewStub4.getPaddingLeft(), viewStub4.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub4.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(viewStub4);
        if (viewStub4.getParent() == null) {
            linearLayout.addView(viewStub4, layoutParams5);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(1718);
        return linearLayout;
    }
}
