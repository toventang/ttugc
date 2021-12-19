package com.bytedance.ies.dmt.p1194ui.dialog;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.l */
final /* synthetic */ class RunnableC17220l implements Runnable {

    /* renamed from: a */
    private final View f41130a;

    /* renamed from: b */
    private final boolean f41131b;

    static {
        Covode.recordClassIndex(19681);
    }

    RunnableC17220l(View view, boolean z) {
        this.f41130a = view;
        this.f41131b = z;
    }

    public final void run() {
        View view = this.f41130a;
        boolean z = this.f41131b;
        int height = (int) (((float) view.getHeight()) * 0.075f);
        long j = z ? 300 : 100;
        float[] fArr = new float[2];
        float f = 0.0f;
        fArr[0] = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C17221m(height, view, z));
        ofFloat.setInterpolator(new C17168c());
        ofFloat.start();
    }
}
