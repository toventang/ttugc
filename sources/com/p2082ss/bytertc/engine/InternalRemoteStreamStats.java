package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalRemoteStreamStats */
public class InternalRemoteStreamStats {
    public InternalRemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public InternalRemoteVideoStats videoStats;

    static {
        Covode.recordClassIndex(100899);
    }

    public InternalRemoteStreamStats() {
    }

    public static InternalRemoteStreamStats create(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        return new InternalRemoteStreamStats(str, internalRemoteAudioStats, internalRemoteVideoStats, z, i, i2);
    }

    public InternalRemoteStreamStats(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i, int i2) {
        this.uid = str;
        this.audioStats = internalRemoteAudioStats;
        this.videoStats = internalRemoteVideoStats;
        this.isScreen = z;
        this.txQuality = i;
        this.rxQuality = i2;
    }
}
