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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.au */
public final class C1787au implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1957);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        MethodCollector.m26663i(3177);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(resources.getColor(R.color.bl));
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.dxu);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755520", "raw"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("16", "dp"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("16", "dp"), tuxIconView, layoutParams);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, layoutParams);
        C79466e.m138185a(tuxIconView, layoutParams);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setText(R.string.c_5);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setId(R.id.dxl);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.dxu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.dk1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, layoutParams2);
        C79467f.m138187a(tuxTextView, layoutParams2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.dk1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i = -1;
            layoutParams3.addRule(15, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, i);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.avv);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = i2;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.C0844d) layoutParams4).f3113a = i2;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755198", "raw"), tuxIconView2, layoutParams4);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView2, layoutParams4);
        C79466e.m138185a(tuxIconView2, layoutParams4);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f93);
        tuxTextView2.setText(R.string.h13);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView2, layoutParams5);
        C79467f.m138187a(tuxTextView2, layoutParams5);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout.addView(tuxTextView2, layoutParams5);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout, layoutParams3);
        }
        C0174a.m578a(relativeLayout);
        relativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.m26664o(3177);
        return relativeLayout;
    }
}
