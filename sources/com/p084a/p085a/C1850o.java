package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.o */
public final class C1850o implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2020);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(5824);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        View view = new View(context);
        ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(aVar)) {
            ((RelativeLayout.LayoutParams) aVar).addRule(13, -1);
        }
        aVar.f2225B = "h,375:210";
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar)) {
            aVar.f2270h = 0;
        }
        C0174a.m578a(view);
        if (view.getParent() == null) {
            constraintLayout.addView(view, aVar);
        }
        TuxPlayerView tuxPlayerView = new TuxPlayerView(context);
        tuxPlayerView.setId(R.id.er7);
        ConstraintLayout.C0547a aVar2 = new ConstraintLayout.C0547a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(aVar2)) {
            ((RelativeLayout.LayoutParams) aVar2).addRule(13, -1);
        }
        aVar2.f2225B = "h,375:210";
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2281s = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2279q = 0;
        }
        if (ConstraintLayout.C0547a.class.isInstance(aVar2)) {
            aVar2.f2270h = 0;
        }
        C0174a.m578a(tuxPlayerView);
        if (tuxPlayerView.getParent() == null) {
            constraintLayout.addView(tuxPlayerView, aVar2);
        }
        C0174a.m578a(constraintLayout);
        constraintLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.m26664o(5824);
        return constraintLayout;
    }
}
