package com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.a.a  reason: invalid class name */
public final class animationInterpolatorC74267a implements Interpolator {

    /* renamed from: a */
    protected PointF f167009a;

    /* renamed from: b */
    protected PointF f167010b;

    /* renamed from: c */
    protected PointF f167011c;

    /* renamed from: d */
    protected PointF f167012d;

    /* renamed from: e */
    protected PointF f167013e;

    static {
        Covode.recordClassIndex(87039);
    }

    /* renamed from: a */
    private static float m130672a(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float f4 = ((f2 - 0.0f) * f) + 0.0f;
        float f5 = f2 + ((f3 - f2) * f);
        float f6 = f4 + ((f5 - f4) * f);
        return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
    }

    /* renamed from: a */
    private float m130671a(float f) {
        return m130672a(f, this.f167009a.x, this.f167010b.x);
    }

    /* renamed from: a */
    private static boolean m130673a(PointF pointF) {
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (java.lang.Math.abs(r16 - r18) <= 1.0E-6f) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r9 >= 8) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r16 >= r18) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r1 = (r4 + r0) / 2.0f;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        r4 = r1;
        r16 = m130671a(r4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r1 = (r4 + r2) / 2.0f;
        r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float getInterpolation(float r18) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.animationInterpolatorC74267a.getInterpolation(float):float");
    }

    public animationInterpolatorC74267a(PointF pointF, PointF pointF2) {
        if (!m130673a(pointF)) {
            throw new RuntimeException("startX should be in [0, 1]");
        } else if (m130673a(pointF2)) {
            this.f167009a = pointF;
            this.f167010b = pointF2;
            this.f167011c = new PointF();
            this.f167012d = new PointF();
            this.f167013e = new PointF();
        } else {
            throw new RuntimeException("endX should be in [0, 1]");
        }
    }

    public animationInterpolatorC74267a(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }

    public animationInterpolatorC74267a(double d, double d2, double d3, double d4) {
        this(new PointF((float) d, (float) d2), new PointF((float) d3, (float) d4));
    }
}
