package com.bytedance.android.livesdk.p476c;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.c.d  reason: invalid class name */
public class animationInterpolatorC7253d implements Interpolator {

    /* renamed from: a */
    public AbstractC7252c f18052a;

    /* renamed from: b */
    public AbstractC7254e f18053b;

    /* renamed from: c */
    public float f18054c;

    static {
        Covode.recordClassIndex(8001);
    }

    public float getInterpolation(float f) {
        this.f18054c = f;
        AbstractC7254e eVar = this.f18053b;
        if (eVar != null) {
            return eVar.mo13456a(f);
        }
        return f;
    }
}
