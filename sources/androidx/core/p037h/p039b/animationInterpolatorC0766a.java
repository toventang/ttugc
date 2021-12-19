package androidx.core.p037h.p039b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.b.a  reason: invalid class name */
public final class animationInterpolatorC0766a implements Interpolator {

    /* renamed from: a */
    private final float[] f2904a;

    /* renamed from: b */
    private final float[] f2905b;

    static {
        Covode.recordClassIndex(847);
    }

    private animationInterpolatorC0766a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f2904a = new float[i];
        this.f2905b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f2904a[i2] = fArr[0];
            this.f2905b[i2] = fArr[1];
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f2904a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f2904a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f2904a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f2905b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f2905b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public animationInterpolatorC0766a(float r3, float r4) {
        /*
            r2 = this;
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0 = 0
            r1.moveTo(r0, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.quadTo(r3, r4, r0, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p037h.p039b.animationInterpolatorC0766a.<init>(float, float):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    animationInterpolatorC0766a(float r9, float r10, float r11, float r12) {
        /*
            r8 = this;
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0 = 0
            r1.moveTo(r0, r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r8.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p037h.p039b.animationInterpolatorC0766a.<init>(float, float, float, float):void");
    }
}
