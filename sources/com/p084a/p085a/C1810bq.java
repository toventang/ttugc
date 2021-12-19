package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bq */
public final class C1810bq implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1980);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(532);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.b59);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = new BannerSwipeRefreshLayout(context);
        bannerSwipeRefreshLayout.setId(R.id.w9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(3, R.id.e7_);
        }
        DiscoveryRecyclerView discoveryRecyclerView = new DiscoveryRecyclerView(context);
        discoveryRecyclerView.setId(R.id.c_f);
        discoveryRecyclerView.setClipToPadding(false);
        discoveryRecyclerView.setPadding(discoveryRecyclerView.getPaddingLeft(), discoveryRecyclerView.getPaddingTop(), discoveryRecyclerView.getPaddingRight(), (int) resources.getDimension(R.dimen.j0));
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(bannerSwipeRefreshLayout, -1, -1);
        C0174a.m578a(discoveryRecyclerView);
        if (discoveryRecyclerView.getParent() == null) {
            bannerSwipeRefreshLayout.addView(discoveryRecyclerView, a2);
        }
        C0174a.m578a(bannerSwipeRefreshLayout);
        if (bannerSwipeRefreshLayout.getParent() == null) {
            relativeLayout.addView(bannerSwipeRefreshLayout, layoutParams);
        }
        View view = new View(context);
        view.setBackgroundColor(resources.getColor(R.color.l));
        view.setId(R.id.e7_);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams2);
        }
        View dmtStatusView = new DmtStatusView(context);
        dmtStatusView.setId(R.id.e7i);
        dmtStatusView.setBackgroundColor(resources.getColor(R.color.l));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(3, R.id.e7_);
        }
        C0174a.m578a(dmtStatusView);
        if (dmtStatusView.getParent() == null) {
            relativeLayout.addView(dmtStatusView, layoutParams3);
        }
        C0174a.m578a(relativeLayout);
        relativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.m26664o(532);
        return relativeLayout;
    }
}
