package com.bytedance.android.live.liveinteract.match.p294a;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.match.a.a  reason: invalid class name */
public final class animationInterpolatorC4937a implements Interpolator {

    /* renamed from: a */
    public static final C4938a f12896a = new C4938a((byte) 0);

    /* renamed from: b */
    private int f12897b;

    /* renamed from: c */
    private final PointF f12898c;

    /* renamed from: d */
    private final PointF f12899d;

    static {
        Covode.recordClassIndex(5520);
    }

    /* renamed from: a */
    private static double m11140a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d6 * d4 * 0.0d) + (d6 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d * 1.0d);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.a.a$a */
    public static final class C4938a {
        static {
            Covode.recordClassIndex(5521);
        }

        private C4938a() {
        }

        public /* synthetic */ C4938a(byte b) {
            this();
        }
    }

    public animationInterpolatorC4937a() {
        PointF pointF = new PointF();
        this.f12898c = pointF;
        PointF pointF2 = new PointF();
        this.f12899d = pointF2;
        pointF.x = 0.65f;
        pointF.y = 0.0f;
        pointF2.x = 0.35f;
        pointF2.y = 1.0f;
    }

    public final float getInterpolation(float f) {
        int i = this.f12897b;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m11140a((double) f2, (double) this.f12898c.x, (double) this.f12899d.x) >= ((double) f)) {
                this.f12897b = i;
                break;
            }
            i++;
        }
        double a = m11140a((double) f2, (double) this.f12898c.y, (double) this.f12899d.y);
        if (a > 0.999d) {
            a = 1.0d;
            this.f12897b = 0;
        }
        return (float) a;
    }
}
