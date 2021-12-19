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
import com.bytedance.ies.dmt.p1194ui.gesture.GestureFrameLayout;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bs */
public final class C1812bs implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1982);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2843);
        Resources resources = context.getResources();
        GestureFrameLayout gestureFrameLayout = new GestureFrameLayout(context);
        gestureFrameLayout.setId(R.id.bba);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(R.id.fgn);
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(gestureFrameLayout, -1, -1);
        C0174a.m578a(scrollableViewPager);
        if (scrollableViewPager.getParent() == null) {
            gestureFrameLayout.addView(scrollableViewPager, a2);
        }
        View a3 = C1862a.m6033a(context, R.layout.a3t, gestureFrameLayout, false, R.layout.a3c);
        if (a3.getParent() == null) {
            gestureFrameLayout.addView(a3);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bfe);
        appCompatImageView.setImageResource(2131233142);
        ViewGroup.MarginLayoutParams a4 = C0174a.m576a(gestureFrameLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 51;
        }
        if (DrawerLayout.C0844d.class.isInstance(a4)) {
            ((DrawerLayout.C0844d) a4).f3113a = 51;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            gestureFrameLayout.addView(appCompatImageView, a4);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.bff);
        appCompatImageView2.setImageResource(2131233143);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(gestureFrameLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 53;
        }
        if (DrawerLayout.C0844d.class.isInstance(a5)) {
            ((DrawerLayout.C0844d) a5).f3113a = 53;
        }
        C0174a.m578a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            gestureFrameLayout.addView(appCompatImageView2, a5);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.fhh);
        viewStub.setLayoutResource(R.layout.a3f);
        viewStub.setVisibility(8);
        ViewGroup.MarginLayoutParams a6 = C0174a.m576a(gestureFrameLayout, -1, -1);
        viewStub.setInflatedId(-1);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            gestureFrameLayout.addView(viewStub, a6);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.fhr);
        viewStub2.setLayoutResource(R.layout.a3e);
        ViewGroup.MarginLayoutParams a7 = C0174a.m576a(gestureFrameLayout, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        viewStub2.setInflatedId(-1);
        C0174a.m578a(viewStub2);
        if (viewStub2.getParent() == null) {
            gestureFrameLayout.addView(viewStub2, a7);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.e_);
        viewStub3.setLayoutResource(R.layout.rq);
        ViewGroup.MarginLayoutParams a8 = C0174a.m576a(gestureFrameLayout, -1, -1);
        viewStub3.setInflatedId(-1);
        C0174a.m578a(viewStub3);
        if (viewStub3.getParent() == null) {
            gestureFrameLayout.addView(viewStub3, a8);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.e8);
        viewStub4.setLayoutResource(R.layout.a3d);
        ViewGroup.MarginLayoutParams a9 = C0174a.m576a(gestureFrameLayout, -1, -1);
        viewStub4.setInflatedId(-1);
        C0174a.m578a(viewStub4);
        if (viewStub4.getParent() == null) {
            gestureFrameLayout.addView(viewStub4, a9);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.abi);
        viewStub5.setLayoutResource(R.layout.rw);
        ViewGroup.MarginLayoutParams a10 = C0174a.m576a(gestureFrameLayout, -1, -1);
        viewStub5.setInflatedId(-1);
        C0174a.m578a(viewStub5);
        if (viewStub5.getParent() == null) {
            gestureFrameLayout.addView(viewStub5, a10);
        }
        C0174a.m578a(gestureFrameLayout);
        gestureFrameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(gestureFrameLayout);
        }
        MethodCollector.m26664o(2843);
        return gestureFrameLayout;
    }
}
