package com.p2082ss.avframework.livestreamv2.strategy;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy */
public interface EncodeFpsAdjustStrategy {
    static {
        Covode.recordClassIndex(100616);
    }

    int getAdjustFps(int i, int i2);

    int getChangeVideoFpsCount();
}
