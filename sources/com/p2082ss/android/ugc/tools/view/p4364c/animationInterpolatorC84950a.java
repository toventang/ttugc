package com.p2082ss.android.ugc.tools.view.p4364c;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.c.a  reason: invalid class name */
public class animationInterpolatorC84950a implements Interpolator {

    /* renamed from: a */
    protected final PointF f189821a = new PointF();

    /* renamed from: b */
    protected final PointF f189822b = new PointF();

    /* renamed from: c */
    private int f189823c;

    static {
        Covode.recordClassIndex(98945);
    }

    /* renamed from: a */
    private static double m146013a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d6 * d4 * 0.0d) + (d6 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d * 1.0d);
    }

    public float getInterpolation(float f) {
        int i = this.f189823c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m146013a((double) f2, (double) this.f189821a.x, (double) this.f189822b.x) >= ((double) f)) {
                this.f189823c = i;
                break;
            }
            i++;
        }
        double a = m146013a((double) f2, (double) this.f189821a.y, (double) this.f189822b.y);
        if (a > 0.999d) {
            a = 1.0d;
            this.f189823c = 0;
        }
        return (float) a;
    }
}
