package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ak */
public final class C1777ak implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1947);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1121);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b11);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        View a2 = C1862a.m6033a(context, R.layout.s3, frameLayout, false, R.layout.s6);
        if (a2.getParent() == null) {
            frameLayout.addView(a2);
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.ako);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C0174a.m578a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout, layoutParams);
        }
        View a3 = C1862a.m6033a(context, R.layout.sm, frameLayout, false, R.layout.s6);
        if (a3.getParent() == null) {
            frameLayout.addView(a3);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(1121);
        return frameLayout;
    }
}
