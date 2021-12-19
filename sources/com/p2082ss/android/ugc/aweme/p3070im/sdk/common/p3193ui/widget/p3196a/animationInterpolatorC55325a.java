package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.a  reason: invalid class name */
public final class animationInterpolatorC55325a implements Interpolator {
    static {
        Covode.recordClassIndex(65090);
    }

    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) (f - 0.1f);
        Double.isNaN(d);
        return (float) ((pow * Math.sin((d * 6.283185307179586d) / 0.4000000059604645d)) + 1.0d);
    }
}
