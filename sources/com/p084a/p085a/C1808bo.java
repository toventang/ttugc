package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bo */
public final class C1808bo implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1978);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(3403);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setId(R.id.c4h);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a)) {
            ((RelativeLayout.LayoutParams) a).addRule(15, -1);
        }
        linearLayout.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setAlpha(0.75f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755391", "raw"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099683", C19386b.f45894a), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("16", "dp"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("16", "dp"), tuxIconView, layoutParams);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 17;
        }
        C79466e.m138185a(tuxIconView, layoutParams);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ex8);
        tuxTextView.setTextSize(1, 15.0f);
        tuxTextView.setAlpha(0.75f);
        tuxTextView.setLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView, layoutParams2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        C79467f.m138187a(tuxTextView, layoutParams2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ex9);
        tuxTextView2.setBackgroundResource(R.drawable.a54);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setText(R.string.d4i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Semibold"), tuxTextView2, layoutParams3);
        C79467f.m138187a(tuxTextView2, layoutParams3);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams3);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(3403);
        return linearLayout;
    }
}
