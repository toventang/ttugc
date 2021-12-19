package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.aa */
public final class C1767aa implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1937);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(1520);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.d7f);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.nz);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2266d = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        C0174a.m578a(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            constraintLayout.addView(smartAvatarImageView, aVar);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fag);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2278p = R.id.nz;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = R.id.nz;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, aVar2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        C79467f.m138187a(tuxTextView, aVar2);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.e1x);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setTextAlignment(5);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2278p = R.id.nz;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2271i = R.id.fag;
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView2, aVar3);
        tuxTextView2.setGravity(8388611);
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            i = 0;
            aVar3.f2281s = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2269g = i;
        }
        C79467f.m138187a(tuxTextView2, aVar3);
        C0174a.m578a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            constraintLayout.addView(tuxTextView2, aVar3);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.faa);
        linearLayout.setOrientation(0);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            i2 = R.id.fag;
            aVar4.f2270h = R.id.fag;
        } else {
            i2 = R.id.fag;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2273k = i2;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2278p = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i6 = Build.VERSION.SDK_INT;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2280r = R.id.e6f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i7 = Build.VERSION.SDK_INT;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            constraintLayout.addView(linearLayout, aVar4);
        }
        RatingStar ratingStar = new RatingStar(context);
        ratingStar.setId(R.id.e6f);
        ConstraintLayout.C0547a aVar5 = new ConstraintLayout.C0547a(-2, -2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2273k = R.id.fag;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2288z = 1.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2270h = R.id.fag;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar5)) {
            aVar5.f2224A = 1.0f;
        }
        C0174a.m578a(ratingStar);
        if (ratingStar.getParent() == null) {
            constraintLayout.addView(ratingStar, aVar5);
        }
        RatingStar ratingStar2 = new RatingStar(context);
        ratingStar2.setId(R.id.e6_);
        ConstraintLayout.C0547a aVar6 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar6)) {
            ((ViewGroup.MarginLayoutParams) aVar6).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            i3 = R.id.e1x;
            aVar6.f2279q = R.id.e1x;
        } else {
            i3 = R.id.e1x;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar6)) {
            aVar6.f2271i = i3;
        }
        C0174a.m578a(ratingStar2);
        if (ratingStar2.getParent() == null) {
            constraintLayout.addView(ratingStar2, aVar6);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(1520);
        return constraintLayout;
    }
}
