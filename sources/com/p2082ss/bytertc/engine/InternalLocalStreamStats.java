package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalLocalStreamStats */
public class InternalLocalStreamStats {
    public InternalLocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public InternalLocalVideoStats videoStats;

    static {
        Covode.recordClassIndex(100894);
    }

    public InternalLocalStreamStats() {
    }

    public static InternalLocalStreamStats create(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        return new InternalLocalStreamStats(internalLocalAudioStats, internalLocalVideoStats, z, i, i2);
    }

    public InternalLocalStreamStats(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i, int i2) {
        this.audioStats = internalLocalAudioStats;
        this.videoStats = internalLocalVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }
}
