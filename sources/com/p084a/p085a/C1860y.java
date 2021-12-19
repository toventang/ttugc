package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.y */
public final class C1860y implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2030);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2248);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.leftMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            int i = Build.VERSION.SDK_INT;
            a.setMarginStart((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a)) {
            a.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        View a2 = C1862a.m6033a(context, R.layout.qb, linearLayout, false, R.layout.qa);
        if (a2.getParent() == null) {
            linearLayout.addView(a2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.dji);
        viewStub.setLayoutResource(R.layout.qb);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        viewStub.setInflatedId(-1);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams);
        }
        C0174a.m578a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.m26664o(2248);
        return linearLayout;
    }
}
