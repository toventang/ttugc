package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ce */
public final class C1825ce implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1995);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2929);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.d_5);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(a)) {
            ((DrawerLayout.C0844d) a).f3113a = 17;
        }
        DoubleColorBallAnimationView doubleColorBallAnimationView = new DoubleColorBallAnimationView(context);
        doubleColorBallAnimationView.setId(R.id.anz);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams)) {
            ((DrawerLayout.C0844d) layoutParams).f3113a = 17;
        }
        C0174a.m578a(doubleColorBallAnimationView);
        if (doubleColorBallAnimationView.getParent() == null) {
            frameLayout.addView(doubleColorBallAnimationView, layoutParams);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(2929);
        return frameLayout;
    }
}
