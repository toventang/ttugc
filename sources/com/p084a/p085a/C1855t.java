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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0820e;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.t */
public final class C1855t implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2025);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        MethodCollector.m26663i(1794);
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            IllegalStateException illegalStateException = new IllegalStateException("merge tag container should not be null attach should not be false");
            MethodCollector.m26664o(1794);
            throw illegalStateException;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setId(R.id.po);
        autoRTLImageView.setRotation(180.0f);
        C0820e.m2895a(autoRTLImageView, resources.getColorStateList(R.color.c5));
        autoRTLImageView.setImageResource(R.drawable.yo);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(a)) {
            ((ConstraintLayout.C0547a) a).f2273k = R.id.dui;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a)) {
            ((ConstraintLayout.C0547a) a).f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a)) {
            ((ConstraintLayout.C0547a) a).f2270h = 0;
        }
        C0174a.m578a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            viewGroup.addView(autoRTLImageView, a);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.duc);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(6);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(a2)) {
            ((DrawerLayout.C0844d) a2).f3113a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            int i5 = Build.VERSION.SDK_INT;
            a2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            int i6 = Build.VERSION.SDK_INT;
            a2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).weight = 1.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2273k = R.id.dui;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2280r = R.id.due;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2267e = R.id.dui;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2268f = R.id.due;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2278p = R.id.dui;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a2)) {
            ((ConstraintLayout.C0547a) a2).f2270h = R.id.dui;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView, a2);
        C79467f.m138187a(tuxTextView, a2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            viewGroup.addView(tuxTextView, a2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.due);
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextAlignment(6);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.bx));
        tuxTextView2.setVisibility(8);
        ViewGroup.LayoutParams a3 = C0174a.m576a(viewGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(a3)) {
            ((DrawerLayout.C0844d) a3).f3113a = 8388613;
        }
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).weight = 1.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2280r = R.id.po;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2267e = R.id.duc;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2268f = R.id.po;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2278p = R.id.duc;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2273k = R.id.dui;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a3)) {
            ((ConstraintLayout.C0547a) a3).f2270h = R.id.dui;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView2, a3);
        C79467f.m138187a(tuxTextView2, a3);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            viewGroup.addView(tuxTextView2, a3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.dui);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.bx));
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(viewGroup, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i7 = Build.VERSION.SDK_INT;
            f = 8.0f;
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView3, a4);
        if (ConstraintLayout.C0547a.class.isInstance(a4)) {
            i = 0;
            ((ConstraintLayout.C0547a) a4).f2279q = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a4)) {
            ((ConstraintLayout.C0547a) a4).f2270h = i;
        }
        C79467f.m138187a(tuxTextView3, a4);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            viewGroup.addView(tuxTextView3, a4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.duh);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView4.setVisibility(8);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(a5)) {
            i2 = 0;
            ((ConstraintLayout.C0547a) a5).f2281s = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a5)) {
            ((ConstraintLayout.C0547a) a5).f2269g = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a5)) {
            ((ConstraintLayout.C0547a) a5).f2279q = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a5)) {
            ((ConstraintLayout.C0547a) a5).f2271i = R.id.dui;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView4, a5);
        C79467f.m138187a(tuxTextView4, a5);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            viewGroup.addView(tuxTextView4, a5);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.dug);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.c4));
        tuxTextView5.setVisibility(8);
        tuxTextView5.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView5.setBackgroundResource(R.drawable.xr);
        ViewGroup.MarginLayoutParams a6 = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(a6)) {
            i3 = 0;
            ((ConstraintLayout.C0547a) a6).f2281s = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a6)) {
            ((ConstraintLayout.C0547a) a6).f2269g = i3;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a6)) {
            ((ConstraintLayout.C0547a) a6).f2279q = i3;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a6)) {
            ((ConstraintLayout.C0547a) a6).f2271i = R.id.duh;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView5, a6);
        C79467f.m138187a(tuxTextView5, a6);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            viewGroup.addView(tuxTextView5, a6);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.dud);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView6.setVisibility(8);
        ViewGroup.MarginLayoutParams a7 = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
            a7.topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(a7)) {
            i4 = 0;
            ((ConstraintLayout.C0547a) a7).f2281s = 0;
        } else {
            i4 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a7)) {
            ((ConstraintLayout.C0547a) a7).f2269g = i4;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a7)) {
            ((ConstraintLayout.C0547a) a7).f2279q = i4;
        }
        if (ConstraintLayout.C0547a.class.isInstance(a7)) {
            ((ConstraintLayout.C0547a) a7).f2271i = R.id.dug;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Regular"), tuxTextView6, a7);
        C79467f.m138187a(tuxTextView6, a7);
        C0174a.m578a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            viewGroup.addView(tuxTextView6, a7);
        }
        MethodCollector.m26664o(1794);
        return viewGroup;
    }
}
