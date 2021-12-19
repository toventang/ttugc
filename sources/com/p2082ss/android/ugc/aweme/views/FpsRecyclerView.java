package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.FpsRecyclerView */
public class FpsRecyclerView extends RecyclerView {

    /* renamed from: Q */
    long f181872Q = -1;

    /* renamed from: R */
    long f181873R = Long.MIN_VALUE;

    /* renamed from: S */
    String f181874S = "unKnown";

    static {
        Covode.recordClassIndex(94755);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setLabel(String str) {
        this.f181874S = str;
    }

    public FpsRecyclerView(Context context) {
        super(context);
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
