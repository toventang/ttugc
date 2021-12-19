package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalLocalVideoStats */
public class InternalLocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int targetFrameRate;
    public int targetKBitrate;
    public float videoLossRate;

    static {
        Covode.recordClassIndex(100895);
    }

    public InternalLocalVideoStats() {
    }

    private static InternalLocalVideoStats create(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10, int i11, int i12, int i13, boolean z) {
        return new InternalLocalVideoStats(f, i, i2, i3, i4, i5, i6, i7, f2, i8, i9, i10, i11, i12, i13, z);
    }

    public InternalLocalVideoStats(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10, int i11, int i12, int i13, boolean z) {
        this.sentKBitrate = f;
        this.inputFrameRate = i;
        this.sentFrameRate = i2;
        this.encoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.targetKBitrate = i5;
        this.targetFrameRate = i6;
        this.statsInterval = i7;
        this.videoLossRate = f2;
        this.rtt = i8;
        this.encodedBitrate = i9;
        this.encodedFrameWidth = i10;
        this.encodedFrameHeight = i11;
        this.encodedFrameCount = i12;
        this.codecType = i13;
        this.isScreen = z;
    }
}
