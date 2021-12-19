package com.p2082ss.android.ugc.aweme.shortvideo;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aj  reason: invalid class name */
public final class animationInterpolatorC69832aj implements Interpolator {

    /* renamed from: a */
    protected PointF f156052a;

    /* renamed from: b */
    protected PointF f156053b;

    /* renamed from: c */
    protected PointF f156054c;

    /* renamed from: d */
    protected PointF f156055d;

    /* renamed from: e */
    protected PointF f156056e;

    static {
        Covode.recordClassIndex(82238);
    }

    public animationInterpolatorC69832aj() {
        this(0.28f, 0.59f, 0.0f);
    }

    public final float getInterpolation(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            this.f156056e.x = this.f156052a.x * 3.0f;
            this.f156055d.x = ((this.f156053b.x - this.f156052a.x) * 3.0f) - this.f156056e.x;
            this.f156054c.x = (1.0f - this.f156056e.x) - this.f156055d.x;
            float f3 = ((this.f156056e.x + ((this.f156055d.x + (this.f156054c.x * f2)) * f2)) * f2) - f;
            if (((double) Math.abs(f3)) < 0.001d) {
                break;
            }
            f2 -= f3 / (this.f156056e.x + (((this.f156055d.x * 2.0f) + ((this.f156054c.x * 3.0f) * f2)) * f2));
        }
        this.f156056e.y = this.f156052a.y * 3.0f;
        this.f156055d.y = ((this.f156053b.y - this.f156052a.y) * 3.0f) - this.f156056e.y;
        this.f156054c.y = (1.0f - this.f156056e.y) - this.f156055d.y;
        return f2 * (this.f156056e.y + ((this.f156055d.y + (this.f156054c.y * f2)) * f2));
    }

    private animationInterpolatorC69832aj(PointF pointF, PointF pointF2) {
        this.f156054c = new PointF();
        this.f156055d = new PointF();
        this.f156056e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f156052a = pointF;
            this.f156053b = pointF2;
        }
    }

    public animationInterpolatorC69832aj(float f, float f2, float f3) {
        this(new PointF(f, f2), new PointF(f3, 1.0f));
    }
}
