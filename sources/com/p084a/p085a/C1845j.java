package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79463b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.j */
public final class C1845j implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2015);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        MethodCollector.m26663i(928);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        View view = new View(context);
        view.setId(R.id.be4);
        view.setAlpha(0.0f);
        view.setBackgroundColor(resources.getColor(R.color.l));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.be5);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.a73);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
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
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755549", "raw"), tuxIconView, aVar);
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView, aVar);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, aVar);
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
            int i6 = Build.VERSION.SDK_INT;
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
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755473", "raw"), tuxIconView2, aVar2);
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView2, aVar2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView2, aVar2);
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
            int i7 = Build.VERSION.SDK_INT;
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
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755176", "raw"), tuxIconView3, aVar5);
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView3, aVar5);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView3, aVar5);
        C79466e.m138185a(tuxIconView3, aVar5);
        C0174a.m578a(tuxIconView3);
        if (tuxIconView3.getParent() == null) {
            constraintLayout.addView(tuxIconView3, aVar5);
        }
        TuxIconView tuxIconView4 = new TuxIconView(context);
        tuxIconView4.setId(R.id.clv);
        ConstraintLayout.C0547a aVar6 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar6.setMarginStart((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).leftMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            int i9 = Build.VERSION.SDK_INT;
            i3 = R.dimen.fj;
            aVar6.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        } else {
            i3 = R.dimen.fj;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).rightMargin = (int) resources.getDimension(i3);
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            i4 = 0;
            aVar6.f2273k = 0;
        } else {
            i4 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2281s = i4;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2270h = i4;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755294", "raw"), tuxIconView4, aVar6);
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView4, aVar6);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView4, aVar6);
        C79466e.m138185a(tuxIconView4, aVar6);
        C0174a.m578a(tuxIconView4);
        if (tuxIconView4.getParent() == null) {
            constraintLayout.addView(tuxIconView4, aVar6);
        }
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(928);
        return frameLayout;
    }
}
