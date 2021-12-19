package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.widget.b */
public abstract class AbstractC39190b extends ViewGroup {
    static {
        Covode.recordClassIndex(46821);
    }

    /* renamed from: a */
    public abstract void mo67974a(ViewPager.AbstractC1579e eVar);

    public abstract PagerAdapter getAdapter();

    public abstract int getCurrentItem();

    public AbstractC39190b(Context context) {
        super(context);
    }

    public AbstractC39190b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
