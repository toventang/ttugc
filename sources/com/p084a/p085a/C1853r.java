package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.a.a.r */
public final class C1853r implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2023);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1791);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ah1);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ah2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-2, -2);
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, aVar);
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2273k = 0;
        }
        C79467f.m138187a(tuxTextView, aVar);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.e6e);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755486", "raw"), tuxIconView, aVar2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099648", C19386b.f45894a), tuxIconView, aVar2);
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = R.id.deh;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2273k = R.id.deh;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2280r = R.id.deh;
        }
        C79466e.m138185a(tuxIconView, aVar2);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar2);
        }
        RatingNumber ratingNumber = new RatingNumber(context);
        ratingNumber.setId(R.id.deh);
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        C1863a.C1866c cVar = new C1863a.C1866c("medium");
        C89219l.m154721d("app:commerce_style", "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(ratingNumber, "");
        C89219l.m154721d(aVar3, "");
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2280r = R.id.po;
        }
        C89219l.m154721d(ratingNumber, "");
        C89219l.m154721d(aVar3, "");
        C0174a.m578a(ratingNumber);
        if (ratingNumber.getParent() == null) {
            constraintLayout.addView(ratingNumber, aVar3);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.po);
        ConstraintLayout.C0547a aVar4 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755200", "raw"), tuxIconView2, aVar4);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099753", C19386b.f45894a), tuxIconView2, aVar4);
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar4)) {
            aVar4.f2273k = 0;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        C79466e.m138185a(tuxIconView2, aVar4);
        C0174a.m578a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            constraintLayout.addView(tuxIconView2, aVar4);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(1791);
        return constraintLayout;
    }
}
