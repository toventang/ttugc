package com.p2082ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipAlgorithmParam */
public class VEClipAlgorithmParam {
    public static int BINGO_EFFECT_NULL;
    public static int BINGO_EFFECT_ZOOMIN = 1;
    public static int BINGO_EFFECT_ZOOMOUT = 2;
    public int bingoEffect;
    public int index;
    public int range;
    public int rotate;
    public int trimIn;
    public int trimOut;

    static {
        Covode.recordClassIndex(99523);
    }

    public String toString() {
        return "index: " + this.index + ", trimIn: " + this.trimIn + ", trimOut: " + this.trimOut + ", range: " + this.range + ", bingoEffect: " + this.bingoEffect + ", rotate: " + this.rotate;
    }
}
