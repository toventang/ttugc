package androidx.p048g.p049a.p050a;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.g.a.a.d  reason: invalid class name */
abstract class AbstractanimationInterpolatorC0997d implements Interpolator {

    /* renamed from: a */
    private final float[] f3536a;

    /* renamed from: b */
    private final float f3537b;

    static {
        Covode.recordClassIndex(1090);
    }

    protected AbstractanimationInterpolatorC0997d(float[] fArr) {
        this.f3536a = fArr;
        this.f3537b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3536a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f3537b;
        float[] fArr2 = this.f3536a;
        return fArr2[min] + (((f - (((float) min) * f2)) / f2) * (fArr2[min + 1] - fArr2[min]));
    }
}
