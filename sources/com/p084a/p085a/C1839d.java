package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.d */
public final class C1839d implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2009);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        MethodCollector.m26663i(1163);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.j));
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.o0);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2273k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2266d = 0;
        }
        C0174a.m578a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            constraintLayout.addView(smartCircleImageView, aVar);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context);
        smartCircleImageView2.setId(R.id.o1);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2279q = R.id.o0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2266d = R.id.o0;
        }
        C0174a.m578a(smartCircleImageView2);
        if (smartCircleImageView2.getParent() == null) {
            constraintLayout.addView(smartCircleImageView2, aVar2);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setImageResource(R.drawable.mm);
        autoRTLImageView.setId(R.id.avv);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2269g = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            constraintLayout.addView(autoRTLImageView, aVar3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        tuxTextView.setId(R.id.ajd);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            i = R.id.o1;
            aVar4.f2267e = R.id.o1;
        } else {
            i = R.id.o1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2278p = i;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2268f = R.id.avv;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2280r = R.id.avv;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Semibold"), tuxTextView, aVar4);
        C79467f.m138187a(tuxTextView, aVar4);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar4);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(1163);
        return constraintLayout;
    }
}
