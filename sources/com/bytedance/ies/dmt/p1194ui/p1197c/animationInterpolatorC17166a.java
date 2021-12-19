package com.bytedance.ies.dmt.p1194ui.p1197c;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.c.a  reason: invalid class name */
public class animationInterpolatorC17166a implements Interpolator {

    /* renamed from: a */
    protected final PointF f40910a = new PointF();

    /* renamed from: b */
    protected final PointF f40911b = new PointF();

    /* renamed from: c */
    private int f40912c;

    static {
        Covode.recordClassIndex(19623);
    }

    /* renamed from: a */
    private static double m31700a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d6 * d4 * 0.0d) + (d6 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d * 1.0d);
    }

    public float getInterpolation(float f) {
        int i = this.f40912c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m31700a((double) f2, (double) this.f40910a.x, (double) this.f40911b.x) >= ((double) f)) {
                this.f40912c = i;
                break;
            }
            i++;
        }
        double a = m31700a((double) f2, (double) this.f40910a.y, (double) this.f40911b.y);
        if (a > 0.999d) {
            a = 1.0d;
            this.f40912c = 0;
        }
        return (float) a;
    }
}
