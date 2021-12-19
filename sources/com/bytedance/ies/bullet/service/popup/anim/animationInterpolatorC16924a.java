package com.bytedance.ies.bullet.service.popup.anim;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.service.popup.anim.a  reason: invalid class name */
public final class animationInterpolatorC16924a implements Interpolator {

    /* renamed from: a */
    protected PointF f40249a;

    /* renamed from: b */
    protected PointF f40250b;

    /* renamed from: c */
    protected PointF f40251c;

    /* renamed from: d */
    protected PointF f40252d;

    /* renamed from: e */
    protected PointF f40253e;

    static {
        Covode.recordClassIndex(19366);
    }

    /* renamed from: a */
    private static float m31188a(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float f4 = ((f2 - 0.0f) * f) + 0.0f;
        float f5 = f2 + ((f3 - f2) * f);
        float f6 = f4 + ((f5 - f4) * f);
        return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
    }

    public animationInterpolatorC16924a() {
        this(new PointF(0.42f, 0.0f), new PointF(1.0f, 1.0f));
    }

    /* renamed from: a */
    private float m31187a(float f) {
        return m31188a(f, this.f40249a.x, this.f40250b.x);
    }

    /* renamed from: a */
    private static boolean m31189a(PointF pointF) {
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            return false;
        }
        return true;
    }

    public animationInterpolatorC16924a(byte b) {
        this(new PointF(0.0f, 0.0f), new PointF(0.58f, 1.0f));
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
        r16 = m31187a(r4);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.animationInterpolatorC16924a.getInterpolation(float):float");
    }

    private animationInterpolatorC16924a(PointF pointF, PointF pointF2) {
        if (!m31189a(pointF)) {
            throw new RuntimeException("startX should be in [0, 1]");
        } else if (m31189a(pointF2)) {
            this.f40249a = pointF;
            this.f40250b = pointF2;
            this.f40251c = new PointF();
            this.f40252d = new PointF();
            this.f40253e = new PointF();
        } else {
            throw new RuntimeException("endX should be in [0, 1]");
        }
    }
}
