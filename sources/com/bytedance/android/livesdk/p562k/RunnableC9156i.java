package com.bytedance.android.livesdk.p562k;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.k.i */
public final /* synthetic */ class RunnableC9156i implements Runnable {

    /* renamed from: a */
    private final View f22276a;

    /* renamed from: b */
    private final boolean f22277b;

    static {
        Covode.recordClassIndex(10060);
    }

    RunnableC9156i(View view, boolean z) {
        this.f22276a = view;
        this.f22277b = z;
    }

    public final void run() {
        View view = this.f22276a;
        boolean z = this.f22277b;
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
        ofFloat.addUpdateListener(new C9157j(height, view, z));
        ofFloat.setInterpolator(new C17168c());
        ofFloat.start();
    }
}
