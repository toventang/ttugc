package com.bytedance.hybrid.spark.p1111e;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.hybrid.spark.e.b */
final /* synthetic */ class RunnableC15572b implements Runnable {

    /* renamed from: a */
    private final View f37955a;

    static {
        Covode.recordClassIndex(17834);
    }

    RunnableC15572b(View view) {
        this.f37955a = view;
    }

    public final void run() {
        this.f37955a.requestLayout();
    }
}
