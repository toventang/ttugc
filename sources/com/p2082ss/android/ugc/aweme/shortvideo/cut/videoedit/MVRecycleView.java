package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView */
public class MVRecycleView extends RecyclerView {

    /* renamed from: O */
    private double f157580O;

    static {
        Covode.recordClassIndex(82960);
    }

    public void setflingScale(double d) {
        this.f157580O = d;
    }

    public MVRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: b */
    public final boolean mo4420b(int i, int i2) {
        double d = (double) i;
        double d2 = this.f157580O;
        Double.isNaN(d);
        return super.mo4420b((int) (d * d2), i2);
    }
}
