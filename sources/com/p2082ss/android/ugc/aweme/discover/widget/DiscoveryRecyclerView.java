package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView */
public class DiscoveryRecyclerView extends FpsRecyclerView {

    /* renamed from: O */
    double f100299O;

    /* renamed from: P */
    double f100300P;

    static {
        Covode.recordClassIndex(51173);
    }

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f100299O = (double) motionEvent.getX();
            this.f100300P = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d = this.f100299O;
            Double.isNaN(x);
            double abs = Math.abs(x - d);
            double y = (double) motionEvent.getY();
            double d2 = this.f100300P;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d2);
            if (abs > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
