package com.p2082ss.android.ugc.aweme.p3043g;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.g.a  reason: invalid class name */
public final class animationInterpolatorC52819a implements Interpolator {

    /* renamed from: a */
    public static final C52820a f121523a = new C52820a((byte) 0);

    /* renamed from: b */
    private final float f121524b;

    static {
        Covode.recordClassIndex(62219);
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a$a */
    public static final class C52820a {
        static {
            Covode.recordClassIndex(62220);
        }

        private C52820a() {
        }

        public /* synthetic */ C52820a(byte b) {
            this();
        }
    }

    public animationInterpolatorC52819a() {
        this((byte) 0);
    }

    private animationInterpolatorC52819a(byte b) {
        this.f121524b = 2.3f;
    }

    public final float getInterpolation(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.f121524b;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (float) ((pow * Math.sin((d * 6.283185307179586d) / d2)) + 1.0d);
    }
}
