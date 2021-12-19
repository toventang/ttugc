package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalLocalAudioStats */
public class InternalLocalAudioStats {
    public float audioLossRate;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    static {
        Covode.recordClassIndex(100893);
    }

    public InternalLocalAudioStats() {
    }

    private static InternalLocalAudioStats create(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        return new InternalLocalAudioStats(f, i, i2, i3, i4, i5, i6);
    }

    public InternalLocalAudioStats(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        this.audioLossRate = f;
        this.sendKBitrate = i;
        this.recordSampleRate = i2;
        this.statsInterval = i3;
        this.rtt = i4;
        this.numChannels = i5;
        this.sentSampleRate = i6;
    }
}
