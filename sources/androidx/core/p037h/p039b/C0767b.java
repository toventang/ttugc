package androidx.core.p037h.p039b;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.b.b */
public final class C0767b {
    static {
        Covode.recordClassIndex(848);
    }

    /* renamed from: a */
    public static Interpolator m2680a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new animationInterpolatorC0766a(f, f2, f3, f4);
    }
}
