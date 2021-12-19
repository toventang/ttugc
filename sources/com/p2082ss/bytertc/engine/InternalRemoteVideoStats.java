package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalRemoteVideoStats */
public class InternalRemoteVideoStats {
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    static {
        Covode.recordClassIndex(100901);
    }

    public InternalRemoteVideoStats() {
    }

    private static InternalRemoteVideoStats create(int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7, int i8, int i9) {
        return new InternalRemoteVideoStats(i, i2, f, f2, i3, i4, i5, j, z, i6, i7, i8, i9);
    }

    public InternalRemoteVideoStats(int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7, int i8, int i9) {
        this.width = i;
        this.height = i2;
        this.videoLossRate = f;
        this.receivedKBitrate = f2;
        this.decoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.stallCount = i5;
        this.e2eDelay = j;
        this.isScreen = z;
        this.statsInterval = i6;
        this.rtt = i7;
        this.frozenRate = i8;
        this.videoIndex = i9;
    }
}
