package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0820e;
import androidx.legacy.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79463b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.k */
public final class C1846k implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2016);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        MethodCollector.m26663i(4396);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.d05);
        linearLayout.setBackgroundResource(R.drawable.za);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.a73);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView, aVar);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755549", "raw"), tuxIconView, aVar);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968652", "attr"), tuxIconView, aVar);
        C79466e.m138185a(tuxIconView, aVar);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.e05);
        tuxIconView2.setVisibility(8);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i7 = Build.VERSION.SDK_INT;
            i = 1;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(i, 22.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2280r = R.id.tl;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView2, aVar2);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755473", "raw"), tuxIconView2, aVar2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968618", "attr"), tuxIconView2, aVar2);
        C79466e.m138185a(tuxIconView2, aVar2);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar2);
        }
        TuxAlertBadge tuxAlertBadge = new TuxAlertBadge(context);
        tuxAlertBadge.setId(R.id.e07);
        tuxAlertBadge.setVisibility(8);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2281s = R.id.e06;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2269g = R.id.e06;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2270h = R.id.e06;
        }
        C79463b.m138181a("app:tux_badgeCount", new C1863a.C1866c("0"), tuxAlertBadge, aVar3);
        C79463b.m138181a("app:tux_badgeMaxCount", new C1863a.C1866c("unlimited"), tuxAlertBadge, aVar3);
        C79463b.m138181a("app:tux_badgeVariant", new C1863a.C1866c("number"), tuxAlertBadge, aVar3);
        C79463b.m138180a(tuxAlertBadge, aVar3);
        C0174a.m578a(tuxAlertBadge);
        if (tuxAlertBadge.getParent() == null) {
            constraintLayout.addView(tuxAlertBadge, aVar3);
        }
        Space space = new Space(context);
        space.setId(R.id.e06);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            i2 = R.id.e05;
            aVar4.f2272j = R.id.e05;
        } else {
            i2 = R.id.e05;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2281s = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2267e = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2269g = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2278p = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2270h = i2;
        }
        C0174a.m578a(space);
        if (space.getParent() == null) {
            constraintLayout.addView(space, aVar4);
        }
        TuxIconView tuxIconView3 = new TuxIconView(context);
        tuxIconView3.setId(R.id.tl);
        tuxIconView3.setVisibility(8);
        ConstraintLayout.C0547a aVar5 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i8 = Build.VERSION.SDK_INT;
            f = 22.0f;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        } else {
            f = 22.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2280r = R.id.clv;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2270h = 0;
        }
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView3, aVar5);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755176", "raw"), tuxIconView3, aVar5);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968618", "attr"), tuxIconView3, aVar5);
        C79466e.m138185a(tuxIconView3, aVar5);
        C0174a.m578a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, aVar5);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.clv);
        ConstraintLayout.C0547a aVar6 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i9 = Build.VERSION.SDK_INT;
            aVar6.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).leftMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i10 = Build.VERSION.SDK_INT;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            i3 = 0;
            aVar6.f2273k = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2281s = i3;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2270h = i3;
        }
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView4, aVar6);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755294", "raw"), tuxIconView4, aVar6);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968618", "attr"), tuxIconView4, aVar6);
        C79466e.m138185a(tuxIconView4, aVar6);
        C0174a.m578a(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            constraintLayout.addView(tuxIconView4, aVar6);
        }
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams2);
        }
        DmtTabLayout dmtTabLayout = new DmtTabLayout(context);
        dmtTabLayout.setId(R.id.d06);
        dmtTabLayout.setSelectedTabIndicatorColor(resources.getColor(R.color.bi));
        dmtTabLayout.setSelectedTabIndicatorHeight((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMinWidth((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMode(0);
        dmtTabLayout.setTabPaddingEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabPaddingStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        C0174a.m578a(dmtTabLayout);
        if (dmtTabLayout.getParent() == null) {
            linearLayout.addView(dmtTabLayout, layoutParams3);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.cft);
        constraintLayout2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            f2 = 10.0f;
            i4 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            f2 = 10.0f;
            i4 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(i4, f2, resources.getDisplayMetrics());
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.a6q);
        C0820e.m2895a(appCompatImageView, resources.getColorStateList(R.color.bx));
        appCompatImageView.setImageResource(R.drawable.yr);
        ConstraintLayout.C0547a aVar7 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            ((ViewGroup.MarginLayoutParams) aVar7).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar7)) {
            int i11 = Build.VERSION.SDK_INT;
            aVar7.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            i5 = 0;
            aVar7.f2273k = 0;
        } else {
            i5 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2279q = i5;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar7)) {
            aVar7.f2270h = i5;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout2.addView(appCompatImageView, aVar7);
        }
        C0174a.m578a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            frameLayout.addView(constraintLayout2, layoutParams4);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(4396);
        return frameLayout;
    }
}
