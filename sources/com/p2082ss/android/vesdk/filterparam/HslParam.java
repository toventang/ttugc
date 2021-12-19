package com.p2082ss.android.vesdk.filterparam;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.HslParam */
public class HslParam {
    public int colorType;
    public int[] hslValue = {0, 0, 0};

    static {
        Covode.recordClassIndex(99599);
    }

    public int getColorType() {
        return this.colorType;
    }

    public int[] getHslValue() {
        return this.hslValue;
    }

    public void setColorType(int i) {
        this.colorType = i;
    }

    public void setHsl(int[] iArr) {
        this.hslValue = iArr;
    }
}
