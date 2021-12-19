package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoveryRecyclerView */
public final class DiscoveryRecyclerView extends RecyclerView {

    /* renamed from: O */
    private double f131463O;

    /* renamed from: P */
    private double f131464P;

    static {
        Covode.recordClassIndex(67547);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f131463O = (double) motionEvent.getX();
            this.f131464P = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d = this.f131463O;
            Double.isNaN(x);
            double abs = Math.abs(x - d);
            double y = (double) motionEvent.getY();
            double d2 = this.f131464P;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d2);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            C89219l.m154716b(viewConfiguration, "");
            if (abs > ((double) viewConfiguration.getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}
