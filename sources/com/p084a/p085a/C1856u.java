package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.u */
public final class C1856u implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2026);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(17);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) resources.getDimension(R.dimen.fj), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            int i = Build.VERSION.SDK_INT;
            a.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            int i2 = Build.VERSION.SDK_INT;
            a.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View a2 = C1862a.m6033a(context, R.layout.qd, linearLayout, false, R.layout.q3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2269g = 0;
        }
        if (a2.getParent() == null) {
            linearLayout.addView(a2, layoutParams);
        }
        View a3 = C1862a.m6033a(context, R.layout.qa, linearLayout, false, R.layout.q3);
        if (a3.getParent() == null) {
            linearLayout.addView(a3);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(17);
        return linearLayout;
    }
}
