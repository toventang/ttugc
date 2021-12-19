package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.al */
public final class C1778al implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1948);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        MethodCollector.m26663i(4178);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.fd5);
        constraintLayout.setBackgroundResource(2131231716);
        constraintLayout.setClickable(true);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bh1);
        appCompatImageView.setImageResource(2131231742);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2272j = R.id.title;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2231H = 2;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setText("Thanks for reporting");
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2272j = R.id.acq;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2271i = R.id.bh1;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H3_Semibold"), tuxTextView, aVar2);
        C79467f.m138187a(tuxTextView, aVar2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.acq);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a_));
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2272j = R.id.button;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2271i = R.id.title;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Regular"), tuxTextView2, aVar3);
        C79467f.m138187a(tuxTextView2, aVar3);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.button);
        tuxTextView3.setBackgroundResource(R.drawable.a09);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        tuxTextView3.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2272j = R.id.zz;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2224A = 0.8f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2231H = 2;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView3, aVar4);
        C79467f.m138187a(tuxTextView3, aVar4);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, aVar4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.zz);
        tuxTextView4.setBackgroundResource(R.drawable.zx);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.C0547a aVar5 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            ((ViewGroup.MarginLayoutParams) aVar5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i8 = Build.VERSION.SDK_INT;
            aVar5.setMarginStart((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar5)) {
            int i9 = Build.VERSION.SDK_INT;
            aVar5.setMarginEnd((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
        }
        tuxTextView4.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            i = 0;
            aVar5.f2273k = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2281s = i;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2279q = i;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2271i = R.id.button;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2224A = 0.8f;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView4, aVar5);
        C79467f.m138187a(tuxTextView4, aVar5);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, aVar5);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(4178);
        return constraintLayout;
    }
}
