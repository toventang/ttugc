package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.aj */
public final class C1776aj implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1946);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1199);
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            IllegalStateException illegalStateException = new IllegalStateException("merge tag container should not be null attach should not be false");
            MethodCollector.m26664o(1199);
            throw illegalStateException;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.el5);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 48;
        }
        if (DrawerLayout.C0844d.class.isInstance(a)) {
            ((DrawerLayout.C0844d) a).f3113a = 48;
        }
        View view = new View(context);
        view.setId(R.id.el4);
        view.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131233142);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 51;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.C0844d) layoutParams3).f3113a = 51;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(2131233143);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 53;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.C0844d) layoutParams4).f3113a = 53;
        }
        C0174a.m578a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams4);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            viewGroup.addView(linearLayout, a);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.uq);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams a2 = C0174a.m576a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a2)) {
            ((DrawerLayout.C0844d) a2).f3113a = 80;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setImageResource(2131233144);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 83;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.C0844d) layoutParams6).f3113a = 83;
        }
        C0174a.m578a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout2.addView(appCompatImageView3, layoutParams6);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setImageResource(2131233145);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 85;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.C0844d) layoutParams7).f3113a = 85;
        }
        C0174a.m578a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout2.addView(appCompatImageView4, layoutParams7);
        }
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams5);
        }
        View view2 = new View(context);
        view2.setId(R.id.up);
        view2.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams8);
        }
        C0174a.m578a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            viewGroup.addView(linearLayout2, a2);
        }
        MethodCollector.m26664o(1199);
        return viewGroup;
    }
}
