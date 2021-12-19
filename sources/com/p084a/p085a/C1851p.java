package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.p */
public final class C1851p implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2021);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(1990);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -2);
        View a2 = C1862a.m6033a(context, R.layout.pn, frameLayout, false, R.layout.pu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (a2.getParent() == null) {
            frameLayout.addView(a2, layoutParams);
        }
        View a3 = C1862a.m6033a(context, R.layout.po, frameLayout, false, R.layout.pu);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.C0844d) layoutParams2).f3113a = 48;
        }
        if (a3.getParent() == null) {
            frameLayout.addView(a3, layoutParams2);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(1990);
        return frameLayout;
    }
}
