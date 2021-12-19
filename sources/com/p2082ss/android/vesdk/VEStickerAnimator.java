package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEStickerAnimator */
public interface VEStickerAnimator {
    static {
        Covode.recordClassIndex(99365);
    }

    float getDegree(int i);

    float getScaleX(int i);

    float getScaleY(int i);

    float getTransX(int i);

    float getTransY(int i);
}
