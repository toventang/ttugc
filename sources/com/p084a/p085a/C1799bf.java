package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79467f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bf */
public final class C1799bf implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1969);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(3611);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.h));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.bh1);
        smartImageView.setImageResource(2131231738);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
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
        C0174a.m578a(smartImageView);
        if (smartImageView.getParent() == null) {
            constraintLayout.addView(smartImageView, aVar);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ks);
        tuxIconView.setVisibility(8);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(aVar2)) {
            ((RelativeLayout.LayoutParams) aVar2).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i2 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755198", "raw"), tuxIconView, aVar2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2130968613", "attr"), tuxIconView, aVar2);
        C79466e.m138185a(tuxIconView, aVar2);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            constraintLayout.addView(tuxIconView, aVar2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f2w);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        ConstraintLayout.C0547a aVar3 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2273k = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2280r = R.id.ks;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2288z = 0.0f;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2278p = R.id.bh1;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2270h = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar3)) {
            aVar3.f2287y = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        C79467f.m138188a("app:tux_font", new C1863a.C1866c("P2_Semibold"), tuxTextView, aVar3);
        C79467f.m138187a(tuxTextView, aVar3);
        C0174a.m578a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            constraintLayout.addView(tuxTextView, aVar3);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(3611);
        return constraintLayout;
    }
}
