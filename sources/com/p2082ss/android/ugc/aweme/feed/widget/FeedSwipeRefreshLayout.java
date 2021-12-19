package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout */
public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private AbstractC39190b f116618n;

    /* renamed from: o */
    private boolean f116619o;

    /* renamed from: p */
    private RecyclerView f116620p;

    static {
        Covode.recordClassIndex(59626);
    }

    public void setCanTouch(boolean z) {
        this.f116619o = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f116620p = recyclerView;
    }

    public void setViewPager(AbstractC39190b bVar) {
        this.f116618n = bVar;
    }

    public FeedSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f116619o || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f116619o) {
            return false;
        }
        AbstractC39190b bVar = this.f116618n;
        if (bVar != null && bVar.getAdapter() != null && this.f116618n.getAdapter().getCount() != 0 && this.f116618n.getCurrentItem() != 0) {
            return false;
        }
        RecyclerView recyclerView = this.f116620p;
        if ((recyclerView == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4372l() == 0) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f116619o = true;
    }
}
