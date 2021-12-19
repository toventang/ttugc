package com.bytedance.android.live.core.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.widget.c  reason: invalid class name */
public class animationInterpolatorC4046c implements Interpolator {

    /* renamed from: a */
    protected final PointF f11184a;

    /* renamed from: b */
    protected final PointF f11185b;

    /* renamed from: c */
    private int f11186c;

    static {
        Covode.recordClassIndex(4587);
    }

    /* renamed from: a */
    private static double m9851a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d6 * d4 * 0.0d) + (d6 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d * 1.0d);
    }

    public animationInterpolatorC4046c() {
        this.f11184a = new PointF();
        this.f11185b = new PointF();
    }

    public animationInterpolatorC4046c(byte b) {
        PointF pointF = new PointF();
        this.f11184a = pointF;
        PointF pointF2 = new PointF();
        this.f11185b = pointF2;
        pointF.x = 0.32f;
        pointF.y = 0.94f;
        pointF2.x = 0.6f;
        pointF2.y = 1.0f;
    }

    public float getInterpolation(float f) {
        int i = this.f11186c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m9851a((double) f2, (double) this.f11184a.x, (double) this.f11185b.x) >= ((double) f)) {
                this.f11186c = i;
                break;
            }
            i++;
        }
        double a = m9851a((double) f2, (double) this.f11184a.y, (double) this.f11185b.y);
        if (a > 0.999d) {
            a = 1.0d;
            this.f11186c = 0;
        }
        return (float) a;
    }
}
