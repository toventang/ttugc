package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdk.widget.SafeFrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cn */
public final class C1834cn implements AbstractC1876e {
    static {
        Covode.recordClassIndex(2004);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2339);
        Resources resources = context.getResources();
        SafeFrameLayout safeFrameLayout = new SafeFrameLayout(context);
        safeFrameLayout.setId(R.id.acf);
        safeFrameLayout.setBackgroundColor(resources.getColor(R.color.a2));
        safeFrameLayout.setKeepScreenOn(true);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.setVisibility(8);
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(safeFrameLayout, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(surfaceView);
        if (surfaceView.getParent() == null) {
            safeFrameLayout.addView(surfaceView, a2);
        }
        LiveVerticalViewPager liveVerticalViewPager = new LiveVerticalViewPager(context);
        liveVerticalViewPager.setId(R.id.fgn);
        ViewGroup.MarginLayoutParams a3 = C0174a.m576a(safeFrameLayout, -1, -1);
        C0174a.m578a(liveVerticalViewPager);
        if (liveVerticalViewPager.getParent() == null) {
            safeFrameLayout.addView(liveVerticalViewPager, a3);
        }
        View a4 = C1862a.m6033a(context, R.layout.bd6, safeFrameLayout, false, R.layout.b8t);
        a4.setId(R.id.pq);
        a4.setVisibility(8);
        ViewGroup.MarginLayoutParams a5 = C0174a.m576a(safeFrameLayout, -2, (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 8388691;
        }
        if (DrawerLayout.C0844d.class.isInstance(a5)) {
            ((DrawerLayout.C0844d) a5).f3113a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        if (a4.getParent() == null) {
            safeFrameLayout.addView(a4, a5);
        }
        C0174a.m578a(safeFrameLayout);
        safeFrameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(safeFrameLayout);
        }
        MethodCollector.m26664o(2339);
        return safeFrameLayout;
    }
}
