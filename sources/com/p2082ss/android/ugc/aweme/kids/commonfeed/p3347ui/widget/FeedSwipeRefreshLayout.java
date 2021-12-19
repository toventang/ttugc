package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.FeedSwipeRefreshLayout */
public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private VerticalViewPager f131169n;

    /* renamed from: o */
    private boolean f131170o = true;

    /* renamed from: p */
    private RecyclerView f131171p;

    static {
        Covode.recordClassIndex(67444);
    }

    public void setCanTouch(boolean z) {
        this.f131170o = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f131171p = recyclerView;
    }

    public void setViewPager(VerticalViewPager verticalViewPager) {
        this.f131169n = verticalViewPager;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f131170o || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f131170o) {
            return false;
        }
        VerticalViewPager verticalViewPager = this.f131169n;
        if (verticalViewPager != null && verticalViewPager.getAdapter() != null && this.f131169n.getAdapter().getCount() != 0 && this.f131169n.getCurrentItem() != 0) {
            return false;
        }
        RecyclerView recyclerView = this.f131171p;
        if ((recyclerView == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4372l() == 0) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
