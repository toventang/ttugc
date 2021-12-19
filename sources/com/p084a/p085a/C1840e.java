package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.e */
public final class C1840e implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2010);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        MethodCollector.m26663i(1819);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cn3);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.ne);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.cn7);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, layoutParams2);
        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231262), (Drawable) null, (Drawable) null, (Drawable) null);
        C79467f.m138187a(tuxTextView, layoutParams2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.cn5);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView2.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i3 = Build.VERSION.SDK_INT;
            f = 5.0f;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView2, layoutParams3);
        tuxTextView2.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231260), (Drawable) null, (Drawable) null, (Drawable) null);
        C79467f.m138187a(tuxTextView2, layoutParams3);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.cn4);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView3.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView3.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i5 = Build.VERSION.SDK_INT;
            f2 = 5.0f;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView3, layoutParams4);
        tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231259), (Drawable) null, (Drawable) null, (Drawable) null);
        C79467f.m138187a(tuxTextView3, layoutParams4);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.cn6);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView4.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView4.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i7 = Build.VERSION.SDK_INT;
            f3 = 5.0f;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView4, layoutParams5);
        tuxTextView4.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231261), (Drawable) null, (Drawable) null, (Drawable) null);
        C79467f.m138187a(tuxTextView4, layoutParams5);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout.addView(tuxTextView4, layoutParams5);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.cn8);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView5.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView5.setVisibility(8);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView5.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i9 = Build.VERSION.SDK_INT;
            f4 = 5.0f;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView5, layoutParams6);
        tuxTextView5.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231263), (Drawable) null, (Drawable) null, (Drawable) null);
        C79467f.m138187a(tuxTextView5, layoutParams6);
        C0174a.m578a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout.addView(tuxTextView5, layoutParams6);
        }
        TuxCompoundIconTextView tuxCompoundIconTextView = new TuxCompoundIconTextView(context);
        tuxCompoundIconTextView.setId(R.id.cn9);
        tuxCompoundIconTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxCompoundIconTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxCompoundIconTextView.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i11 = Build.VERSION.SDK_INT;
            f5 = 5.0f;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f5 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i12 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138188a("app:tux_iconPadding", new C1863a.C1867d("4", "dp"), tuxCompoundIconTextView, layoutParams7);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxCompoundIconTextView, layoutParams7);
        C79467f.m138187a(tuxCompoundIconTextView, layoutParams7);
        C0174a.m578a(tuxCompoundIconTextView);
        if (tuxCompoundIconTextView.getParent() == null) {
            linearLayout.addView(tuxCompoundIconTextView, layoutParams7);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.cn2);
        appCompatImageView.setImageResource(2131231243);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(20, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.C0844d) layoutParams8).f3113a = 80;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams8);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(1819);
        return frameLayout;
    }
}
