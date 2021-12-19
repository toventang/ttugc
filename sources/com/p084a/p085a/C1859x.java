package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p085a.p086a.p087a.C1766a;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79465d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.x */
public final class C1859x implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2029);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        MethodCollector.m26663i(851);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.dzy);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) resources.getDimension(R.dimen.fm), (int) resources.getDimension(R.dimen.fm));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i3 = Build.VERSION.SDK_INT;
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
        C1766a aVar2 = new C1766a();
        aVar2.mo5576a("app:placeholderImage", new C1863a.C1865b("2131232607", "drawable"), smartImageView, aVar);
        aVar2.mo5576a("app:placeholderImageScaleType", new C1863a.C1866c("centerCrop"), smartImageView, aVar);
        aVar2.mo5576a("app:roundedCornerRadius", new C1863a.C1867d("24", "dp"), smartImageView, aVar);
        aVar2.mo5575a(smartImageView, aVar);
        C0174a.m578a(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, aVar);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.d7s);
        linearLayout.setOrientation(1);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = R.id.dzy;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2280r = R.id.fgu;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2267e = R.id.dzy;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2268f = R.id.fgu;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2278p = R.id.dzy;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2270h = R.id.dzy;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.dzz);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
        tuxTextView.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        tuxTextView.setGravity(8388611);
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2272j = R.id.d73;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2280r = R.id.fgu;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2288z = 0.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2278p = R.id.dzy;
        }
        if (ConstraintLayout.C0547a.class.isInstance(layoutParams)) {
            ((ConstraintLayout.C0547a) layoutParams).f2270h = R.id.dzy;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("H4_Semibold"), tuxTextView, layoutParams);
        C79467f.m138187a(tuxTextView, layoutParams);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.d73);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView2.setTextSize(1, 13.0f);
        tuxTextView2.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("android:textFontWeight", new C1863a.C1866c("600"), tuxTextView2, layoutParams2);
        C79467f.m138187a(tuxTextView2, layoutParams2);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams2);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar3);
        }
        TuxButton tuxButton = new TuxButton(context);
        tuxButton.setId(R.id.fgu);
        if (TextView.class.isInstance(tuxButton)) {
            C0174a.m579a(tuxButton, (int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        } else {
            tuxButton.setMinimumWidth((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()));
        }
        tuxButton.setText(R.string.bfy);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i6 = Build.VERSION.SDK_INT;
            i = R.dimen.fj;
            aVar4.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        } else {
            i = R.dimen.fj;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) resources.getDimension(i);
        }
        tuxButton.setGravity(17);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            i2 = 0;
            aVar4.f2273k = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2281s = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2269g = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2270h = i2;
        }
        C79465d.m138184a("app:tux_buttonSize", new C1863a.C1866c("small"), tuxButton, aVar4);
        C79465d.m138184a("app:tux_buttonVariant", new C1863a.C1866c("secondary"), tuxButton, aVar4);
        C79465d.m138184a("app:tux_font", new C1863a.C1866c("P1_Semibold"), tuxButton, aVar4);
        C79465d.m138183a(tuxButton, aVar4);
        C0174a.m578a(tuxButton);
        if (tuxButton.getParent() == null) {
            constraintLayout.addView(tuxButton, aVar4);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(851);
        return constraintLayout;
    }
}
