package com.p2082ss.android.ugc.asve.recorder.camera.p2223b;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.c */
public final class C31179c implements TimeInterpolator {

    /* renamed from: a */
    private final int f74749a = 4096;

    /* renamed from: b */
    private int f74750b;

    /* renamed from: c */
    private final PointF f74751c = new PointF(0.75f, 0.0f);

    /* renamed from: d */
    private final PointF f74752d = new PointF(0.65f, 1.0f);

    static {
        Covode.recordClassIndex(37824);
    }

    /* renamed from: a */
    private static double m64593a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d6 * d4 * 0.0d) + (d6 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d * 1.0d);
    }

    public final float getInterpolation(float f) {
        float f2;
        double d = (double) f;
        if (d > 0.2d) {
            f2 = 1.0f;
        } else {
            Double.isNaN(d);
            f2 = (float) (d / 0.2d);
        }
        int i = this.f74750b;
        int i2 = this.f74749a;
        float f3 = f2;
        while (true) {
            if (i >= i2) {
                break;
            }
            f3 = (((float) i) * 1.0f) / ((float) this.f74749a);
            if (m64593a((double) f3, (double) this.f74751c.x, (double) this.f74752d.x) >= ((double) f2)) {
                this.f74750b = i;
                break;
            }
            i++;
        }
        double a = m64593a((double) f3, (double) this.f74751c.y, (double) this.f74752d.y);
        if (a > 0.999d) {
            a = 1.0d;
            this.f74750b = 0;
        }
        return (float) a;
    }
}
