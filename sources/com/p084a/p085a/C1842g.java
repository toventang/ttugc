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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79465d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.g */
public final class C1842g implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2012);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(2447);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.d04);
        linearLayout.setBackgroundResource(R.drawable.xi);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, (int) resources.getDimension(R.dimen.ff));
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.bho);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2270h = 0;
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.dv9);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(aVar)) {
            ((LinearLayout.LayoutParams) aVar).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar)) {
            ((FrameLayout.LayoutParams) aVar).gravity = 16;
        }
        if (DrawerLayout.C0844d.class.isInstance(aVar)) {
            ((DrawerLayout.C0844d) aVar).f3113a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i4 = Build.VERSION.SDK_INT;
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
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755489", "raw"), tuxIconView, aVar);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099745", C19386b.f45894a), tuxIconView, aVar);
        C79466e.m138185a(tuxIconView, aVar);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.bjw);
        tuxIconView2.setVisibility(8);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(aVar2)) {
            i = 16;
            ((LinearLayout.LayoutParams) aVar2).gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(aVar2)) {
            ((FrameLayout.LayoutParams) aVar2).gravity = i;
        }
        if (DrawerLayout.C0844d.class.isInstance(aVar2)) {
            ((DrawerLayout.C0844d) aVar2).f3113a = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 17.25f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 17.25f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2278p = R.id.dv9;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755332", "raw"), tuxIconView2, aVar2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099745", C19386b.f45894a), tuxIconView2, aVar2);
        C79466e.m138185a(tuxIconView2, aVar2);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar2);
        }
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            linearLayout.addView(constraintLayout, layoutParams);
        }
        TuxButton tuxButton = new TuxButton(context);
        tuxButton.setId(R.id.h5);
        tuxButton.setVisibility(8);
        tuxButton.setText(R.string.bin);
        tuxButton.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i6 = Build.VERSION.SDK_INT;
            i2 = 1;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 11.125f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(i2, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        tuxButton.setGravity(17);
        C79465d.m138184a("app:tux_buttonAutoSizing", new C1863a.C1866c("false"), tuxButton, layoutParams2);
        C79465d.m138184a("app:tux_buttonVariant", new C1863a.C1866c("secondary"), tuxButton, layoutParams2);
        C79465d.m138184a("app:tux_buttonSize", new C1863a.C1866c("large"), tuxButton, layoutParams2);
        C79465d.m138183a(tuxButton, layoutParams2);
        C0174a.m578a(tuxButton);
        if (tuxButton.getParent() == null) {
            linearLayout.addView(tuxButton, layoutParams2);
        }
        TuxButton tuxButton2 = new TuxButton(context);
        tuxButton2.setId(R.id.a0k);
        tuxButton2.setText(R.string.bf_);
        tuxButton2.setTextAlignment(4);
        tuxButton2.setAllCaps(false);
        tuxButton2.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i8 = Build.VERSION.SDK_INT;
            i3 = 1;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(i3, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        tuxButton2.setGravity(17);
        C79465d.m138184a("app:tux_buttonAutoSizing", new C1863a.C1866c("false"), tuxButton2, layoutParams3);
        C79465d.m138184a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxButton2, layoutParams3);
        C79465d.m138184a("app:tux_buttonVariant", new C1863a.C1866c("primary"), tuxButton2, layoutParams3);
        C79465d.m138184a("app:tux_buttonSize", new C1863a.C1866c("large"), tuxButton2, layoutParams3);
        C79465d.m138183a(tuxButton2, layoutParams3);
        C0174a.m578a(tuxButton2);
        if (tuxButton2.getParent() == null) {
            linearLayout.addView(tuxButton2, layoutParams3);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2447);
        return linearLayout;
    }
}
