package com.p2082ss.android.ugc.aweme.player.p3549ab.abs.buffer;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData */
public final class PlayeAbBufferConfigData {
    private int expType;
    private int interactionBlockDurationNonPreloaded = 1000;
    private int interactionBlockDurationPreloaded = 200;
    private int netBlockDurationInitial = 200;
    private int netBlockDurationMax = 5000;
    private float netBlockIncFactor = 9.0f;

    static {
        Covode.recordClassIndex(73760);
    }

    public final int getExpType() {
        return this.expType;
    }

    public final int getInteractionBlockDurationNonPreloaded() {
        return this.interactionBlockDurationNonPreloaded;
    }

    public final int getInteractionBlockDurationPreloaded() {
        return this.interactionBlockDurationPreloaded;
    }

    public final int getNetBlockDurationInitial() {
        return this.netBlockDurationInitial;
    }

    public final int getNetBlockDurationMax() {
        return this.netBlockDurationMax;
    }

    public final float getNetBlockIncFactor() {
        return this.netBlockIncFactor;
    }

    public final void setExpType(int i) {
        this.expType = i;
    }

    public final void setInteractionBlockDurationNonPreloaded(int i) {
        this.interactionBlockDurationNonPreloaded = i;
    }

    public final void setInteractionBlockDurationPreloaded(int i) {
        this.interactionBlockDurationPreloaded = i;
    }

    public final void setNetBlockDurationInitial(int i) {
        this.netBlockDurationInitial = i;
    }

    public final void setNetBlockDurationMax(int i) {
        this.netBlockDurationMax = i;
    }

    public final void setNetBlockIncFactor(float f) {
        this.netBlockIncFactor = f;
    }
}
