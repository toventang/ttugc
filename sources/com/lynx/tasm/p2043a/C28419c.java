package com.lynx.tasm.p2043a;

import android.os.Build;
import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.p037h.p039b.C0767b;
import androidx.core.p037h.p039b.animationInterpolatorC0766a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.lynx.tasm.a.c */
public class C28419c {

    /* renamed from: a */
    private static final SparseArray<BaseInterpolator> f66825a = new SparseArray<BaseInterpolator>() {
        /* class com.lynx.tasm.p2043a.C28419c.C284201 */

        static {
            Covode.recordClassIndex(34410);
        }

        {
            put(0, new LinearInterpolator());
            put(1, new AccelerateInterpolator());
            put(2, new DecelerateInterpolator());
            put(3, new AccelerateDecelerateInterpolator());
        }
    };

    static {
        Covode.recordClassIndex(34409);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.c$a  reason: invalid class name */
    public static class animationInterpolatorC28421a implements Interpolator {

        /* renamed from: a */
        private int f66826a;

        /* renamed from: b */
        private int f66827b;

        static {
            Covode.recordClassIndex(34411);
        }

        public final float getInterpolation(float f) {
            float f2;
            int i;
            int i2;
            int i3 = this.f66827b;
            if (i3 == 1) {
                i = this.f66826a;
                i2 = ((int) (f * ((float) i))) + 1;
                if (i2 > i) {
                    i2 = i;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int i4 = this.f66826a;
                    int i5 = (int) (f * ((float) i4));
                    if (i5 == i4) {
                        i5--;
                    }
                    f2 = (float) i5;
                    i = i4 - 1;
                } else if (i3 != 4) {
                    return 0.0f;
                } else {
                    int i6 = this.f66826a;
                    int i7 = ((int) (f * ((float) i6))) + 1;
                    if (i7 > i6) {
                        i7 = i6;
                    }
                    f2 = (float) i7;
                    i = i6 + 1;
                }
                return f2 / ((float) i);
            } else {
                i = this.f66826a;
                i2 = (int) (f * ((float) i));
                if (i2 == i) {
                    i2--;
                }
            }
            f2 = (float) i2;
            return f2 / ((float) i);
        }

        animationInterpolatorC28421a(int i, int i2) {
            this.f66826a = i;
            this.f66827b = i2;
        }
    }

    /* renamed from: a */
    public static Interpolator m56829a(C28407b bVar) {
        int i = bVar.f66760e;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return f66825a.get(i);
            case 4:
                float f = bVar.f66761f;
                float f2 = bVar.f66762g;
                if (Build.VERSION.SDK_INT >= 21) {
                    return new PathInterpolator(f, f2);
                }
                return new animationInterpolatorC0766a(f, f2);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return C0767b.m2680a(bVar.f66761f, bVar.f66762g, bVar.f66763h, bVar.f66764i);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new animationInterpolatorC28421a((int) bVar.f66761f, bVar.f66765j);
            default:
                new RuntimeException("layout animation don't support interpolator:".concat(String.valueOf(i)));
                return f66825a.get(0);
        }
    }
}
