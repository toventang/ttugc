package com.p2082ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.vealgorithm.params.VEBorderDetectResult */
public class VEBorderDetectResult extends VEAlgorithmResult {
    public int frameHeight;
    public int frameWidth;

    /* renamed from: x1 */
    public int f73604x1;

    /* renamed from: x2 */
    public int f73605x2;

    /* renamed from: y1 */
    public int f73606y1;

    /* renamed from: y2 */
    public int f73607y2;

    static {
        Covode.recordClassIndex(37364);
    }

    public String toString() {
        return "VEBorderDetectResult{x1=" + this.f73604x1 + ", y1=" + this.f73606y1 + ", x2=" + this.f73605x2 + ", y2=" + this.f73607y2 + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + '}';
    }

    public VEBorderDetectResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
        this.f73604x1 = i;
        this.f73606y1 = i2;
        this.f73605x2 = i3;
        this.f73607y2 = i4;
        this.frameWidth = i5;
        this.frameHeight = i6;
    }
}
