package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LayerControl;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationFactory */
class FrameAnimationFactory {
    static {
        Covode.recordClassIndex(100195);
    }

    FrameAnimationFactory() {
    }

    public static FrameAnimationBase create(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return new FrameAnimationRotation(1, layer, j, rectF, i2);
        }
        if (i == 2) {
            return new FrameAnimationGradualRect(2, layer, j, rectF, i2);
        }
        if (i != 3) {
            return new FrameAnimationBase(i, layer, j, rectF, i2);
        }
        return new FrameAnimationMove(3, layer, j, rectF, i2);
    }
}
