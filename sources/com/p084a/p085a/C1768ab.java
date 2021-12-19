package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ab */
public final class C1768ab implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1938);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(923);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.df0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H2_Semibold"), tuxTextView, aVar);
        C79467f.m138187a(tuxTextView, aVar);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.cxt);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2271i = R.id.df0;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Regular"), tuxTextView2, aVar2);
        C79467f.m138187a(tuxTextView2, aVar2);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ajt);
        tuxTextView3.setTextAlignment(2);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bc});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        tuxTextView3.setGravity(8388611);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2271i = R.id.cxt;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Regular"), tuxTextView3, aVar3);
        C79467f.m138187a(tuxTextView3, aVar3);
        C0174a.m578a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            constraintLayout.addView(tuxTextView3, aVar3);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.e4e);
        TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.bj});
        tuxTextView4.setTextColor(obtainStyledAttributes4.getColor(0, 0));
        obtainStyledAttributes4.recycle();
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2271i = R.id.ajt;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P1_Regular"), tuxTextView4, aVar4);
        C79467f.m138187a(tuxTextView4, aVar4);
        C0174a.m578a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            constraintLayout.addView(tuxTextView4, aVar4);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(923);
        return constraintLayout;
    }
}
