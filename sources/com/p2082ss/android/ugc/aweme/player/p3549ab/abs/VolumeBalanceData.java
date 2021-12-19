package com.p2082ss.android.ugc.aweme.player.p3549ab.abs;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.VolumeBalanceData */
public final class VolumeBalanceData {
    private float predelay = 0.007f;
    private float pregain = 0.25f;
    private float ratio = 8.0f;
    private float threshold = -18.0f;

    static {
        Covode.recordClassIndex(73743);
    }

    public final float getPredelay() {
        return this.predelay;
    }

    public final float getPregain() {
        return this.pregain;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final void setPredelay(float f) {
        this.predelay = f;
    }

    public final void setPregain(float f) {
        this.pregain = f;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setThreshold(float f) {
        this.threshold = f;
    }
}
