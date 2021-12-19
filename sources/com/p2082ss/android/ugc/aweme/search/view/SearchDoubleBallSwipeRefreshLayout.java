package com.p2082ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.search.view.SearchDoubleBallSwipeRefreshLayout */
public class SearchDoubleBallSwipeRefreshLayout extends DoubleBallSwipeRefreshLayout {
    static {
        Covode.recordClassIndex(79458);
    }

    public SearchDoubleBallSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout
    /* renamed from: a */
    public final void mo106902a(Scroller scroller, int i, int i2) {
        scroller.startScroll(0, i, 0, i2 - i);
    }
}
