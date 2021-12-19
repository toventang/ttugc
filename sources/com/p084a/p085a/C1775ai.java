package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.ai */
public final class C1775ai implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1945);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(2914);
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context);
        feedSwipeRefreshLayout.setId(R.id.dhb);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        ViewGroup.LayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        LoadMoreFrameLayout loadMoreFrameLayout = new LoadMoreFrameLayout(context);
        loadMoreFrameLayout.setId(R.id.cg7);
        ViewGroup.LayoutParams a2 = C0174a.m576a(feedSwipeRefreshLayout, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a3 = C0174a.m576a(loadMoreFrameLayout, -1, -1);
        View view = new View(context);
        view.setId(R.id.em1);
        view.setBackgroundColor(resources.getColor(R.color.a2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        VerticalViewPager verticalViewPager = new VerticalViewPager(context);
        verticalViewPager.setId(R.id.fgn);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (DrawerLayout.C0844d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.C0844d) layoutParams2).f3113a = 48;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        C0174a.m578a(verticalViewPager);
        if (verticalViewPager.getParent() == null) {
            linearLayout.addView(verticalViewPager, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.ve);
        view2.setBackgroundColor(resources.getColor(R.color.a2));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        C0174a.m578a(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams3);
        }
        C0174a.m578a(linearLayout);
        if (linearLayout.getParent() == null) {
            loadMoreFrameLayout.addView(linearLayout, a3);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.cs5);
        viewStub.setInflatedId(R.id.cs4);
        viewStub.setLayoutResource(R.layout.s5);
        ViewGroup.LayoutParams a4 = C0174a.m576a(loadMoreFrameLayout, -1, -2);
        C0174a.m578a(viewStub);
        if (viewStub.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub, a4);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.aoe);
        viewStub2.setInflatedId(R.id.aod);
        viewStub2.setLayoutResource(R.layout.s7);
        ViewGroup.LayoutParams a5 = C0174a.m576a(loadMoreFrameLayout, -1, -2);
        C0174a.m578a(viewStub2);
        if (viewStub2.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub2, a5);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.i2);
        viewStub3.setInflatedId(R.id.i1);
        viewStub3.setLayoutResource(R.layout.rs);
        ViewGroup.LayoutParams a6 = C0174a.m576a(loadMoreFrameLayout, -1, -1);
        C0174a.m578a(viewStub3);
        if (viewStub3.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub3, a6);
        }
        C1862a.m6033a(context, R.layout.s4, loadMoreFrameLayout, true, 0);
        View diggLayout = new DiggLayout(context);
        diggLayout.setId(R.id.alb);
        ViewGroup.LayoutParams a7 = C0174a.m576a(loadMoreFrameLayout, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a7)) {
            ((RelativeLayout.LayoutParams) a7).addRule(13, -1);
        }
        C0174a.m578a(diggLayout);
        if (diggLayout.getParent() == null) {
            loadMoreFrameLayout.addView(diggLayout, a7);
        }
        C0174a.m578a(loadMoreFrameLayout);
        if (loadMoreFrameLayout.getParent() == null) {
            feedSwipeRefreshLayout.addView(loadMoreFrameLayout, a2);
        }
        C0174a.m578a(feedSwipeRefreshLayout);
        feedSwipeRefreshLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(feedSwipeRefreshLayout);
        }
        MethodCollector.m26664o(2914);
        return feedSwipeRefreshLayout;
    }
}
