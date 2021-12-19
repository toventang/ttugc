package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetRatio {
    private int heightVal;
    private float ratio;
    private int widthVal;

    static {
        Covode.recordClassIndex(2703);
    }

    public int getHeightVal() {
        return this.heightVal;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getWidthVal() {
        return this.widthVal;
    }

    public RectDocDetRatio(float f, int i, int i2) {
        this.ratio = f;
        this.widthVal = i;
        this.heightVal = i2;
    }
}
