package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.am */
public final class C1779am implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1949);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(544);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.h));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.ba4);
        appCompatImageView.setImageResource(2131232330);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2273k = 0;
        }
        C0174a.m578a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.bai);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setText(R.string.h8t);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2280r = R.id.ks;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2288z = 0.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2278p = R.id.ba4;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2287y = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P3_Semibold"), tuxTextView, aVar2);
        C79467f.m138187a(tuxTextView, aVar2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ks);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C79466e.m138186a("app:tux_iconWidth", new C1863a.C1867d("16", "dp"), tuxIconView, aVar3);
        C79466e.m138186a("app:tux_iconHeight", new C1863a.C1867d("16", "dp"), tuxIconView, aVar3);
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755198", "raw"), tuxIconView, aVar3);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099683", C19386b.f45894a), tuxIconView, aVar3);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = 0;
        }
        C79466e.m138185a(tuxIconView, aVar3);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar3);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(544);
        return constraintLayout;
    }
}
