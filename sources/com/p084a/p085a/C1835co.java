package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.livesdk.p643ui.p644a.C10936a;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.co */
public final class C1835co implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2005);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        float f6;
        int i8;
        int i9;
        int i10;
        int i11;
        float f7;
        int i12;
        float f8;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f11;
        int i25;
        int i26;
        float f12;
        int i27;
        float f13;
        int i28;
        int i29;
        int i30;
        float f14;
        int i31;
        int i32;
        int i33;
        MethodCollector.m26663i(1540);
        Resources resources = context.getResources();
        GestureDetectLayout gestureDetectLayout = new GestureDetectLayout(context);
        gestureDetectLayout.setId(R.id.cz7);
        gestureDetectLayout.setClipChildren(false);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        HSImageView hSImageView = new HSImageView(context);
        hSImageView.setId(R.id.rr);
        hSImageView.setBackgroundColor(Color.parseColor("#303342"));
        hSImageView.setVisibility(8);
        ViewGroup.LayoutParams a2 = C0174a.m576a(gestureDetectLayout, -1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a2)) {
            ((DrawerLayout.C0844d) a2).f3113a = 80;
        }
        C0174a.m578a(hSImageView);
        if (hSImageView.getParent() == null) {
            gestureDetectLayout.addView(hSImageView, a2);
        }
        View view = new View(context);
        view.setId(R.id.ug);
        view.setBackgroundResource(R.drawable.bsp);
        ViewGroup.LayoutParams a3 = C0174a.m576a(gestureDetectLayout, -1, (int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 80;
        }
        if (DrawerLayout.C0844d.class.isInstance(a3)) {
            ((DrawerLayout.C0844d) a3).f3113a = 80;
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            gestureDetectLayout.addView(view, a3);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.gf);
        frameLayout.setClipChildren(false);
        ViewGroup.LayoutParams a4 = C0174a.m576a(gestureDetectLayout, -1, -1);
        View widgetContainer = new WidgetContainer(context);
        widgetContainer.setId(R.id.avr);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        C0174a.m578a(widgetContainer);
        if (widgetContainer.getParent() == null) {
            frameLayout.addView(widgetContainer, layoutParams);
        }
        View view2 = new View(context);
        view2.setId(R.id.bpg);
        view2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams2);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.bp4);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams3);
        }
        View widgetContainer2 = new WidgetContainer(context);
        widgetContainer2.setId(R.id.d29);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer2);
        if (widgetContainer2.getParent() == null) {
            frameLayout.addView(widgetContainer2, layoutParams4);
        }
        View widgetContainer3 = new WidgetContainer(context);
        widgetContainer3.setId(R.id.cxz);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer3);
        if (widgetContainer3.getParent() == null) {
            frameLayout.addView(widgetContainer3, layoutParams5);
        }
        View widgetContainer4 = new WidgetContainer(context);
        widgetContainer4.setId(R.id.ctl);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer4);
        if (widgetContainer4.getParent() == null) {
            frameLayout.addView(widgetContainer4, layoutParams6);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.bpe);
        relativeLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bpf);
        frameLayout3.setBackgroundResource(R.drawable.brz);
        frameLayout3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        C0174a.m578a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            relativeLayout.addView(frameLayout3, layoutParams8);
        }
        View widgetContainer5 = new WidgetContainer(context);
        widgetContainer5.setId(R.id.cac);
        ViewGroup.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer5);
        if (widgetContainer5.getParent() == null) {
            relativeLayout.addView(widgetContainer5, layoutParams9);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.emc);
        constraintLayout.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        WidgetContainer widgetContainer6 = new WidgetContainer(context);
        widgetContainer6.setVisibility(8);
        widgetContainer6.setId(R.id.pw);
        widgetContainer6.setBackgroundColor(resources.getColor(R.color.e_));
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            i = 0;
            aVar.f2279q = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i34 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer6);
        if (widgetContainer6.getParent() == null) {
            constraintLayout.addView(widgetContainer6, aVar);
        }
        WidgetContainer widgetContainer7 = new WidgetContainer(context);
        widgetContainer7.setId(R.id.f_r);
        widgetContainer7.setLayoutDirection(3);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2288z = 0.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2278p = R.id.pw;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2232I = 1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2243T = true;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2230G = 1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2280r = R.id.mg;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i35 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i36 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer7);
        if (widgetContainer7.getParent() == null) {
            constraintLayout.addView(widgetContainer7, aVar2);
        }
        WidgetContainer widgetContainer8 = new WidgetContainer(context);
        widgetContainer8.setId(R.id.mg);
        widgetContainer8.setBackgroundColor(resources.getColor(R.color.c9));
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            i2 = 0;
            aVar3.f2270h = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i37 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2243T = true;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2232I = 1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2236M = (int) TypedValue.applyDimension(1, 136.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2278p = R.id.f_r;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2281s = 0;
        }
        if (LinearLayout.LayoutParams.class.isInstance(aVar3)) {
            ((LinearLayout.LayoutParams) aVar3).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar3)) {
            ((FrameLayout.LayoutParams) aVar3).gravity = 8388613;
        }
        if (DrawerLayout.C0844d.class.isInstance(aVar3)) {
            ((DrawerLayout.C0844d) aVar3).f3113a = 8388613;
        }
        C0174a.m578a(widgetContainer8);
        if (widgetContainer8.getParent() == null) {
            constraintLayout.addView(widgetContainer8, aVar3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.aoy);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            i3 = 0;
            aVar4.f2281s = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2269g = i3;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2270h = i3;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2273k = i3;
        }
        C0174a.m578a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            constraintLayout.addView(frameLayout4, aVar4);
        }
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            relativeLayout.addView(constraintLayout, layoutParams10);
        }
        View widgetContainer9 = new WidgetContainer(context);
        widgetContainer9.setId(R.id.c8u);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            int i38 = Build.VERSION.SDK_INT;
            f = 12.0f;
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).leftMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer9);
        if (widgetContainer9.getParent() == null) {
            relativeLayout.addView(widgetContainer9, layoutParams11);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.eky);
        frameLayout5.setPadding(frameLayout5.getPaddingLeft(), frameLayout5.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout5.getPaddingBottom());
        frameLayout5.setPadding(frameLayout5.getPaddingLeft(), frameLayout5.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout5.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(3, R.id.emc);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            relativeLayout.addView(frameLayout5, layoutParams12);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.d_q);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(3, R.id.emc);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i4 = -1;
            layoutParams13.addRule(21, -1);
        } else {
            i4 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(11, i4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            int i39 = Build.VERSION.SDK_INT;
            f2 = 8.0f;
            layoutParams13.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            ((ViewGroup.MarginLayoutParams) layoutParams13).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            relativeLayout.addView(frameLayout6, layoutParams13);
        }
        View widgetContainer10 = new WidgetContainer(context);
        widgetContainer10.setId(R.id.b9i);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(21, -1);
        }
        C0174a.m578a(widgetContainer10);
        if (widgetContainer10.getParent() == null) {
            relativeLayout.addView(widgetContainer10, layoutParams14);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.qj);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(3, R.id.elg);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i5 = -1;
            layoutParams15.addRule(21, -1);
        } else {
            i5 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(11, i5);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i40 = Build.VERSION.SDK_INT;
            f3 = 12.0f;
            layoutParams15.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).rightMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        WidgetContainer widgetContainer11 = new WidgetContainer(context);
        widgetContainer11.setId(R.id.cjw);
        ConstraintLayout.C0547a aVar5 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2244U = true;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            i6 = 0;
            aVar5.f2273k = 0;
        } else {
            i6 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2281s = i6;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2270h = i6;
        }
        C0174a.m578a(widgetContainer11);
        if (widgetContainer11.getParent() == null) {
            constraintLayout2.addView(widgetContainer11, aVar5);
        }
        WidgetContainer widgetContainer12 = new WidgetContainer(context);
        widgetContainer12.setId(R.id.elv);
        ConstraintLayout.C0547a aVar6 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i41 = Build.VERSION.SDK_INT;
            f4 = 8.0f;
            aVar6.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).rightMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2244U = true;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2280r = R.id.cjw;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            f5 = 0.0f;
            aVar6.f2287y = (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        } else {
            f5 = 0.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2284v = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer12);
        if (widgetContainer12.getParent() == null) {
            constraintLayout2.addView(widgetContainer12, aVar6);
        }
        C0174a.m578a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            relativeLayout.addView(constraintLayout2, layoutParams15);
        }
        View widgetContainer13 = new WidgetContainer(context);
        widgetContainer13.setId(R.id.fj3);
        RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(3, R.id.elg);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            int i42 = Build.VERSION.SDK_INT;
            layoutParams16.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            i7 = R.id.qj;
            layoutParams16.addRule(16, R.id.qj);
        } else {
            i7 = R.id.qj;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(0, i7);
        }
        C0174a.m578a(widgetContainer13);
        if (widgetContainer13.getParent() == null) {
            relativeLayout.addView(widgetContainer13, layoutParams16);
        }
        View widgetContainer14 = new WidgetContainer(context);
        widgetContainer14.setId(R.id.q7);
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.addRule(3, R.id.qj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            int i43 = Build.VERSION.SDK_INT;
            layoutParams17.setMarginEnd((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.addRule(21, -1);
        }
        C0174a.m578a(widgetContainer14);
        if (widgetContainer14.getParent() == null) {
            relativeLayout.addView(widgetContainer14, layoutParams17);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.ahc);
        RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(3, R.id.emc);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            int i44 = Build.VERSION.SDK_INT;
            layoutParams18.setMarginStart((int) resources.getDimension(R.dimen.v6));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).leftMargin = (int) resources.getDimension(R.dimen.v6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(17, R.id.az2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(1, R.id.az2);
        }
        C0174a.m578a(frameLayout7);
        if (frameLayout7.getParent() == null) {
            relativeLayout.addView(frameLayout7, layoutParams18);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.d2a);
        RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.addRule(3, R.id.ahc);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i45 = Build.VERSION.SDK_INT;
            f6 = 8.0f;
            layoutParams19.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f6 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) TypedValue.applyDimension(1, f6, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i46 = Build.VERSION.SDK_INT;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i8 = -1;
            layoutParams19.addRule(20, -1);
        } else {
            i8 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.addRule(9, i8);
        }
        C0174a.m578a(frameLayout8);
        if (frameLayout8.getParent() == null) {
            relativeLayout.addView(frameLayout8, layoutParams19);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.dh4);
        frameLayout9.setClickable(true);
        frameLayout9.setFocusable(true);
        RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i9 = -1;
            layoutParams20.addRule(21, -1);
        } else {
            i9 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.addRule(11, i9);
        }
        C0174a.m578a(frameLayout9);
        if (frameLayout9.getParent() == null) {
            relativeLayout.addView(frameLayout9, layoutParams20);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.elg);
        RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.addRule(3, R.id.emc);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams21)) {
            i10 = -1;
            layoutParams21.addRule(20, -1);
        } else {
            i10 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.addRule(9, i10);
        }
        ConstraintLayout constraintLayout4 = new ConstraintLayout(context);
        constraintLayout4.setId(R.id.eli);
        constraintLayout4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), constraintLayout4.getPaddingTop(), constraintLayout4.getPaddingRight(), constraintLayout4.getPaddingBottom());
        constraintLayout4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), constraintLayout4.getPaddingTop(), constraintLayout4.getPaddingRight(), constraintLayout4.getPaddingBottom());
        ConstraintLayout.C0547a aVar7 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2280r = R.id.rn;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            i11 = 0;
            aVar7.f2270h = 0;
        } else {
            i11 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2273k = i11;
        }
        WidgetContainer widgetContainer15 = new WidgetContainer(context);
        widgetContainer15.setId(R.id.dmv);
        widgetContainer15.setVisibility(8);
        ConstraintLayout.C0547a aVar8 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            int i47 = Build.VERSION.SDK_INT;
            f7 = 8.0f;
            aVar8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f7 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).leftMargin = (int) TypedValue.applyDimension(1, f7, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2280r = R.id.bdi;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2230G = 1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            i12 = 0;
            aVar8.f2279q = 0;
        } else {
            i12 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2270h = i12;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar8)) {
            aVar8.f2232I = 1;
        }
        C0174a.m578a(widgetContainer15);
        if (widgetContainer15.getParent() == null) {
            constraintLayout4.addView(widgetContainer15, aVar8);
        }
        WidgetContainer widgetContainer16 = new WidgetContainer(context);
        widgetContainer16.setId(R.id.bdi);
        ConstraintLayout.C0547a aVar9 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            int i48 = Build.VERSION.SDK_INT;
            f8 = 8.0f;
            aVar9.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f8 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).leftMargin = (int) TypedValue.applyDimension(1, f8, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2280r = R.id.bg2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2278p = R.id.dmv;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar9)) {
            aVar9.f2232I = 1;
        }
        C0174a.m578a(widgetContainer16);
        if (widgetContainer16.getParent() == null) {
            constraintLayout4.addView(widgetContainer16, aVar9);
        }
        WidgetContainer widgetContainer17 = new WidgetContainer(context);
        widgetContainer17.setId(R.id.bg2);
        widgetContainer17.setClickable(true);
        widgetContainer17.setFocusable(true);
        ConstraintLayout.C0547a aVar10 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar10)) {
            int i49 = Build.VERSION.SDK_INT;
            f9 = 8.0f;
            aVar10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f9 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar10)) {
            ((ViewGroup.MarginLayoutParams) aVar10).leftMargin = (int) TypedValue.applyDimension(1, f9, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar10)) {
            aVar10.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar10)) {
            aVar10.f2280r = R.id.elj;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar10)) {
            aVar10.f2278p = R.id.bdi;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar10)) {
            aVar10.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar10)) {
            aVar10.f2232I = 1;
        }
        C0174a.m578a(widgetContainer17);
        if (widgetContainer17.getParent() == null) {
            constraintLayout4.addView(widgetContainer17, aVar10);
        }
        View view3 = new View(context);
        view3.setId(R.id.elj);
        ConstraintLayout.C0547a aVar11 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar11)) {
            aVar11.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar11)) {
            aVar11.f2278p = R.id.bg2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar11)) {
            i13 = 0;
            aVar11.f2270h = 0;
        } else {
            i13 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar11)) {
            aVar11.f2234K = (int) TypedValue.applyDimension(i13, 1.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(view3);
        if (view3.getParent() == null) {
            constraintLayout4.addView(view3, aVar11);
        }
        C0174a.m578a(constraintLayout4);
        if (constraintLayout4.getParent() == null) {
            constraintLayout3.addView(constraintLayout4, aVar7);
        }
        View widgetContainer18 = new WidgetContainer(context);
        widgetContainer18.setId(R.id.rn);
        ConstraintLayout.C0547a aVar12 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar12)) {
            i14 = 0;
            aVar12.f2273k = 0;
        } else {
            i14 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar12)) {
            aVar12.f2281s = i14;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar12)) {
            aVar12.f2278p = R.id.eli;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar12)) {
            aVar12.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar12)) {
            i15 = 1;
            aVar12.f2232I = 1;
        } else {
            i15 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            ((ViewGroup.MarginLayoutParams) aVar12).leftMargin = (int) TypedValue.applyDimension(i15, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar12)) {
            int i50 = Build.VERSION.SDK_INT;
            aVar12.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(widgetContainer18);
        if (widgetContainer18.getParent() == null) {
            constraintLayout3.addView(widgetContainer18, aVar12);
        }
        C0174a.m578a(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            relativeLayout.addView(constraintLayout3, layoutParams21);
        }
        ConstraintLayout constraintLayout5 = new ConstraintLayout(context);
        constraintLayout5.setId(R.id.chq);
        RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(3, R.id.elg);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(16, R.id.fj3);
        }
        WidgetContainer widgetContainer19 = new WidgetContainer(context);
        widgetContainer19.setId(R.id.chp);
        ConstraintLayout.C0547a aVar13 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar13)) {
            i16 = 0;
            aVar13.f2270h = 0;
        } else {
            i16 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar13)) {
            aVar13.f2279q = i16;
        }
        C0174a.m578a(widgetContainer19);
        if (widgetContainer19.getParent() == null) {
            constraintLayout5.addView(widgetContainer19, aVar13);
        }
        C0174a.m578a(constraintLayout5);
        if (constraintLayout5.getParent() == null) {
            relativeLayout.addView(constraintLayout5, layoutParams22);
        }
        View widgetContainer20 = new WidgetContainer(context);
        widgetContainer20.setId(R.id.cho);
        RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.addRule(3, R.id.chq);
        }
        C0174a.m578a(widgetContainer20);
        if (widgetContainer20.getParent() == null) {
            relativeLayout.addView(widgetContainer20, layoutParams23);
        }
        View widgetContainer21 = new WidgetContainer(context);
        widgetContainer21.setId(R.id.cbk);
        RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            i17 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams24).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            i17 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            ((ViewGroup.MarginLayoutParams) layoutParams24).topMargin = (int) TypedValue.applyDimension(i17, 52.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.addRule(6, R.id.chq);
        }
        C0174a.m578a(widgetContainer21);
        if (widgetContainer21.getParent() == null) {
            relativeLayout.addView(widgetContainer21, layoutParams24);
        }
        View frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.az2);
        RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.addRule(3, R.id.emc);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            int i51 = Build.VERSION.SDK_INT;
            f10 = 8.0f;
            i18 = 1;
            layoutParams25.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f10 = 8.0f;
            i18 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            ((ViewGroup.MarginLayoutParams) layoutParams25).leftMargin = (int) TypedValue.applyDimension(i18, f10, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout10);
        if (frameLayout10.getParent() == null) {
            relativeLayout.addView(frameLayout10, layoutParams25);
        }
        View widgetContainer22 = new WidgetContainer(context);
        widgetContainer22.setId(R.id.edl);
        RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.addRule(12, -1);
        }
        C0174a.m578a(widgetContainer22);
        if (widgetContainer22.getParent() == null) {
            relativeLayout.addView(widgetContainer22, layoutParams26);
        }
        ShapeControllableView shapeControllableView = new ShapeControllableView(context);
        shapeControllableView.setId(R.id.dab);
        RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.addRule(12, -1);
        }
        C10936a.m19559a("app:gradientColors", new C1863a.C1865b("2130903084", "array"), shapeControllableView, layoutParams27);
        C10936a.m19559a("app:gradientPositions", new C1863a.C1865b("2130903085", "array"), shapeControllableView, layoutParams27);
        C10936a.m19559a("app:gradientOrientation", new C1863a.C1866c("vertical"), shapeControllableView, layoutParams27);
        C10936a.m19558a(shapeControllableView, layoutParams27);
        C0174a.m578a(shapeControllableView);
        if (shapeControllableView.getParent() == null) {
            relativeLayout.addView(shapeControllableView, layoutParams27);
        }
        View widgetContainer23 = new WidgetContainer(context);
        widgetContainer23.setId(R.id.cjn);
        RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x_));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            ((ViewGroup.MarginLayoutParams) layoutParams28).leftMargin = (int) resources.getDimension(R.dimen.yw);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            ((ViewGroup.MarginLayoutParams) layoutParams28).rightMargin = (int) resources.getDimension(R.dimen.yx);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            ((ViewGroup.MarginLayoutParams) layoutParams28).bottomMargin = (int) resources.getDimension(R.dimen.yy);
        }
        C0174a.m578a(widgetContainer23);
        if (widgetContainer23.getParent() == null) {
            relativeLayout.addView(widgetContainer23, layoutParams28);
        }
        View widgetContainer24 = new WidgetContainer(context);
        widgetContainer24.setId(R.id.v5);
        RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams29)) {
            i19 = -1;
            layoutParams29.addRule(11, -1);
        } else {
            i19 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.addRule(12, i19);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).leftMargin = (int) resources.getDimension(R.dimen.zd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).bottomMargin = (int) resources.getDimension(R.dimen.zc);
        }
        C0174a.m578a(widgetContainer24);
        if (widgetContainer24.getParent() == null) {
            relativeLayout.addView(widgetContainer24, layoutParams29);
        }
        View widgetContainer25 = new WidgetContainer(context);
        widgetContainer25.setId(R.id.dv2);
        ViewGroup.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer25);
        if (widgetContainer25.getParent() == null) {
            relativeLayout.addView(widgetContainer25, layoutParams30);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.v6);
        RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            i20 = -1;
            layoutParams31.addRule(11, -1);
        } else {
            i20 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.addRule(12, i20);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            ((ViewGroup.MarginLayoutParams) layoutParams31).leftMargin = (int) resources.getDimension(R.dimen.zd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            ((ViewGroup.MarginLayoutParams) layoutParams31).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            ((ViewGroup.MarginLayoutParams) layoutParams31).bottomMargin = (int) resources.getDimension(R.dimen.zc);
        }
        C0174a.m578a(frameLayout11);
        if (frameLayout11.getParent() == null) {
            relativeLayout.addView(frameLayout11, layoutParams31);
        }
        View frameLayout12 = new FrameLayout(context);
        frameLayout12.setId(R.id.ecc);
        RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 162.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            i21 = -1;
            layoutParams32.addRule(11, -1);
        } else {
            i21 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            layoutParams32.addRule(12, i21);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            i22 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams32).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            i22 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            ((ViewGroup.MarginLayoutParams) layoutParams32).bottomMargin = (int) TypedValue.applyDimension(i22, 52.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout12);
        if (frameLayout12.getParent() == null) {
            relativeLayout.addView(frameLayout12, layoutParams32);
        }
        View widgetContainer26 = new WidgetContainer(context);
        widgetContainer26.setId(R.id.dcx);
        widgetContainer26.setPadding(widgetContainer26.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer26.getPaddingRight(), widgetContainer26.getPaddingBottom());
        widgetContainer26.setPadding(widgetContainer26.getPaddingLeft(), widgetContainer26.getPaddingTop(), widgetContainer26.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        widgetContainer26.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).bottomMargin = (int) resources.getDimension(R.dimen.yy);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            int i52 = Build.VERSION.SDK_INT;
            layoutParams33.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            int i53 = Build.VERSION.SDK_INT;
            layoutParams33.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(widgetContainer26);
        if (widgetContainer26.getParent() == null) {
            relativeLayout.addView(widgetContainer26, layoutParams33);
        }
        View frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.b8k);
        frameLayout13.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            ((ViewGroup.MarginLayoutParams) layoutParams34).bottomMargin = (int) resources.getDimension(R.dimen.yy);
        }
        C0174a.m578a(frameLayout13);
        if (frameLayout13.getParent() == null) {
            relativeLayout.addView(frameLayout13, layoutParams34);
        }
        View frameLayout14 = new FrameLayout(context);
        frameLayout14.setId(R.id.fbx);
        ViewGroup.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout14);
        if (frameLayout14.getParent() == null) {
            relativeLayout.addView(frameLayout14, layoutParams35);
        }
        FrameLayout frameLayout15 = new FrameLayout(context);
        frameLayout15.setId(R.id.azb);
        frameLayout15.setClipChildren(false);
        RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.addRule(12, -1);
        }
        C0174a.m578a(frameLayout15);
        if (frameLayout15.getParent() == null) {
            relativeLayout.addView(frameLayout15, layoutParams36);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.ur);
        relativeLayout2.setClipChildren(false);
        RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.addRule(12, -1);
        }
        WidgetContainer widgetContainer27 = new WidgetContainer(context);
        widgetContainer27.setId(R.id.uv);
        widgetContainer27.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            i23 = -1;
            layoutParams38.addRule(9, -1);
        } else {
            i23 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.addRule(12, i23);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams38)) {
            i24 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams38).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i24 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams38)) {
            ((ViewGroup.MarginLayoutParams) layoutParams38).leftMargin = (int) TypedValue.applyDimension(i24, 12.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer27);
        if (widgetContainer27.getParent() == null) {
            relativeLayout2.addView(widgetContainer27, layoutParams38);
        }
        WidgetContainer widgetContainer28 = new WidgetContainer(context);
        widgetContainer28.setId(R.id.a9r);
        RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            f11 = 8.0f;
            i25 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams39).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            f11 = 8.0f;
            i25 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            ((ViewGroup.MarginLayoutParams) layoutParams39).leftMargin = (int) TypedValue.applyDimension(i25, f11, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(0, R.id.ek7);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(1, R.id.uv);
        }
        C0174a.m578a(widgetContainer28);
        if (widgetContainer28.getParent() == null) {
            relativeLayout2.addView(widgetContainer28, layoutParams39);
        }
        WidgetContainer widgetContainer29 = new WidgetContainer(context);
        widgetContainer29.setId(R.id.ek7);
        widgetContainer29.setPadding(widgetContainer29.getPaddingLeft(), widgetContainer29.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer29.getPaddingBottom());
        widgetContainer29.setPadding(widgetContainer29.getPaddingLeft(), widgetContainer29.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer29.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams40)) {
            i26 = -1;
            layoutParams40.addRule(11, -1);
        } else {
            i26 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.addRule(12, i26);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            f12 = 8.0f;
            i27 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams40).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            f12 = 8.0f;
            i27 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            ((ViewGroup.MarginLayoutParams) layoutParams40).bottomMargin = (int) TypedValue.applyDimension(i27, f12, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer29);
        if (widgetContainer29.getParent() == null) {
            relativeLayout2.addView(widgetContainer29, layoutParams40);
        }
        C0174a.m578a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams37);
        }
        View widgetContainer30 = new WidgetContainer(context);
        widgetContainer30.setId(R.id.bbb);
        widgetContainer30.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), widgetContainer30.getPaddingTop(), widgetContainer30.getPaddingRight(), widgetContainer30.getPaddingBottom());
        widgetContainer30.setPadding(widgetContainer30.getPaddingLeft(), widgetContainer30.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), widgetContainer30.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.addRule(3, R.id.emc);
        }
        C0174a.m578a(widgetContainer30);
        if (widgetContainer30.getParent() == null) {
            relativeLayout.addView(widgetContainer30, layoutParams41);
        }
        View widgetContainer31 = new WidgetContainer(context);
        widgetContainer31.setId(R.id.qp);
        ViewGroup.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(widgetContainer31);
        if (widgetContainer31.getParent() == null) {
            relativeLayout.addView(widgetContainer31, layoutParams42);
        }
        View frameLayout16 = new FrameLayout(context);
        frameLayout16.setId(R.id.cpu);
        RelativeLayout.LayoutParams layoutParams43 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            ((ViewGroup.MarginLayoutParams) layoutParams43).bottomMargin = (int) resources.getDimension(R.dimen.w0);
        }
        C0174a.m578a(frameLayout16);
        if (frameLayout16.getParent() == null) {
            relativeLayout.addView(frameLayout16, layoutParams43);
        }
        View frameLayout17 = new FrameLayout(context);
        frameLayout17.setId(R.id.baj);
        RelativeLayout.LayoutParams layoutParams44 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams44)) {
            layoutParams44.addRule(6, R.id.cpu);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams44)) {
            ((ViewGroup.MarginLayoutParams) layoutParams44).topMargin = (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout17);
        if (frameLayout17.getParent() == null) {
            relativeLayout.addView(frameLayout17, layoutParams44);
        }
        View frameLayout18 = new FrameLayout(context);
        frameLayout18.setId(R.id.e30);
        RelativeLayout.LayoutParams layoutParams45 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.addRule(2, R.id.ur);
        }
        C0174a.m578a(frameLayout18);
        if (frameLayout18.getParent() == null) {
            relativeLayout.addView(frameLayout18, layoutParams45);
        }
        View frameLayout19 = new FrameLayout(context);
        frameLayout19.setId(R.id.fby);
        ViewGroup.LayoutParams layoutParams46 = new RelativeLayout.LayoutParams(-1, -1);
        C0174a.m578a(frameLayout19);
        if (frameLayout19.getParent() == null) {
            relativeLayout.addView(frameLayout19, layoutParams46);
        }
        View frameLayout20 = new FrameLayout(context);
        frameLayout20.setId(R.id.ps);
        RelativeLayout.LayoutParams layoutParams47 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams47)) {
            layoutParams47.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            ((ViewGroup.MarginLayoutParams) layoutParams47).bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout20);
        if (frameLayout20.getParent() == null) {
            relativeLayout.addView(frameLayout20, layoutParams47);
        }
        View frameLayout21 = new FrameLayout(context);
        frameLayout21.setId(R.id.d6u);
        RelativeLayout.LayoutParams layoutParams48 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams48)) {
            layoutParams48.addRule(3, R.id.bbb);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams48)) {
            int i54 = Build.VERSION.SDK_INT;
            f13 = 8.0f;
            i28 = 1;
            layoutParams48.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f13 = 8.0f;
            i28 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams48)) {
            ((ViewGroup.MarginLayoutParams) layoutParams48).leftMargin = (int) TypedValue.applyDimension(i28, f13, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams48)) {
            ((ViewGroup.MarginLayoutParams) layoutParams48).topMargin = (int) TypedValue.applyDimension(i28, 32.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(frameLayout21);
        if (frameLayout21.getParent() == null) {
            relativeLayout.addView(frameLayout21, layoutParams48);
        }
        View widgetContainer32 = new WidgetContainer(context);
        widgetContainer32.setId(R.id.dmk);
        widgetContainer32.setAlpha(0.9f);
        RelativeLayout.LayoutParams layoutParams49 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams49)) {
            i29 = -1;
            layoutParams49.addRule(20, -1);
        } else {
            i29 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.addRule(9, i29);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.addRule(12, i29);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams49)) {
            ((ViewGroup.MarginLayoutParams) layoutParams49).bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer32);
        if (widgetContainer32.getParent() == null) {
            relativeLayout.addView(widgetContainer32, layoutParams49);
        }
        View widgetContainer33 = new WidgetContainer(context);
        widgetContainer33.setId(R.id.ahs);
        widgetContainer33.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams50 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.addRule(3, R.id.elg);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            int i55 = Build.VERSION.SDK_INT;
            layoutParams50.setMarginStart((int) resources.getDimension(R.dimen.zd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            ((ViewGroup.MarginLayoutParams) layoutParams50).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            int i56 = Build.VERSION.SDK_INT;
            layoutParams50.setMarginEnd((int) resources.getDimension(R.dimen.zd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            ((ViewGroup.MarginLayoutParams) layoutParams50).bottomMargin = (int) resources.getDimension(R.dimen.ze);
        }
        C0174a.m578a(widgetContainer33);
        if (widgetContainer33.getParent() == null) {
            relativeLayout.addView(widgetContainer33, layoutParams50);
        }
        C0174a.m578a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams7);
        }
        View widgetContainer34 = new WidgetContainer(context);
        widgetContainer34.setId(R.id.a7a);
        FrameLayout.LayoutParams layoutParams51 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams51)) {
            i30 = 8388613;
            ((LinearLayout.LayoutParams) layoutParams51).gravity = 8388613;
        } else {
            i30 = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.gravity = i30;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams51)) {
            ((DrawerLayout.C0844d) layoutParams51).f3113a = i30;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams51)) {
            ((ViewGroup.MarginLayoutParams) layoutParams51).topMargin = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams51)) {
            int i57 = Build.VERSION.SDK_INT;
            f14 = 8.0f;
            i31 = 1;
            layoutParams51.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f14 = 8.0f;
            i31 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams51)) {
            ((ViewGroup.MarginLayoutParams) layoutParams51).rightMargin = (int) TypedValue.applyDimension(i31, f14, resources.getDisplayMetrics());
        }
        C0174a.m578a(widgetContainer34);
        if (widgetContainer34.getParent() == null) {
            frameLayout.addView(widgetContainer34, layoutParams51);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.cba);
        liveTextView.setText(R.string.gpe);
        liveTextView.setTextColor(resources.getColorStateList(R.color.wc));
        liveTextView.setTextSize(2, 15.0f);
        liveTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams52 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams52)) {
            i32 = 17;
            ((LinearLayout.LayoutParams) layoutParams52).gravity = 17;
        } else {
            i32 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.gravity = i32;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams52)) {
            ((DrawerLayout.C0844d) layoutParams52).f3113a = i32;
        }
        C0174a.m578a(liveTextView);
        if (liveTextView.getParent() == null) {
            frameLayout.addView(liveTextView, layoutParams52);
        }
        C0174a.m578a(frameLayout);
        if (frameLayout.getParent() == null) {
            gestureDetectLayout.addView(frameLayout, a4);
        }
        View widgetContainer35 = new WidgetContainer(context);
        widgetContainer35.setId(R.id.bp7);
        widgetContainer35.setVisibility(8);
        ViewGroup.LayoutParams a5 = C0174a.m576a(gestureDetectLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            i33 = 21;
            ((LinearLayout.LayoutParams) a5).gravity = 21;
        } else {
            i33 = 21;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = i33;
        }
        if (DrawerLayout.C0844d.class.isInstance(a5)) {
            ((DrawerLayout.C0844d) a5).f3113a = i33;
        }
        C0174a.m578a(widgetContainer35);
        if (widgetContainer35.getParent() == null) {
            gestureDetectLayout.addView(widgetContainer35, a5);
        }
        C0174a.m578a(gestureDetectLayout);
        gestureDetectLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(gestureDetectLayout);
        }
        MethodCollector.m26664o(1540);
        return gestureDetectLayout;
    }
}
