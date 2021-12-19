package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CustomInterceptTouchEventFrameLayout;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.FlippableViewPagerExt;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bv */
public final class C1815bv implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1985);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(240);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b59);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d59);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout = new CustomInterceptTouchEventFrameLayout(context);
        customInterceptTouchEventFrameLayout.setId(R.id.b44);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View flippableViewPagerExt = new FlippableViewPagerExt(context);
        flippableViewPagerExt.setId(R.id.fgn);
        ViewGroup.LayoutParams a2 = C0174a.m576a(customInterceptTouchEventFrameLayout, -1, -1);
        C0174a.m578a(flippableViewPagerExt);
        if (flippableViewPagerExt.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(flippableViewPagerExt, a2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.eji);
        appCompatImageView.setImageResource(R.drawable.a_i);
        appCompatImageView.setVisibility(0);
        ViewGroup.LayoutParams a3 = C0174a.m576a(customInterceptTouchEventFrameLayout, -1, -2);
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(appCompatImageView, a3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ej3);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a4 = C0174a.m576a(customInterceptTouchEventFrameLayout, -1, -1);
        View view = new View(context);
        view.setId(R.id.e7_);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.dm4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.C0844d) layoutParams5).f3113a = 16;
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams5);
        }
        View a5 = C1862a.m6033a(context, R.layout.a42, frameLayout3, false, 0);
        if (a5.getParent() == null) {
            frameLayout3.addView(a5);
        }
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams4);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(linearLayout, a4);
        }
        C0174a.m578a(customInterceptTouchEventFrameLayout);
        if (customInterceptTouchEventFrameLayout.getParent() == null) {
            frameLayout.addView(customInterceptTouchEventFrameLayout, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.fb0);
        view2.setBackgroundColor(resources.getColor(R.color.oj));
        view2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.n5));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.C0844d) layoutParams6).f3113a = 80;
        }
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bfj);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams7);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(240);
        return frameLayout;
    }
}
