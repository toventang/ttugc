package com.p2082ss.avframework.livestreamv2.strategy;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.strategy.EncoderFpsAdjustStrategyAvg */
public class EncoderFpsAdjustStrategyAvg implements EncodeFpsAdjustStrategy {
    private int mChangeEncodeFpsThreshold;
    private int mChangeVideoFpsCount;
    private int mMaxChangeEncodeFpsTimes;
    private int mVideoEncodeFpsAdjustEventCount;
    private int mVideoEncodeFpsCount;

    static {
        Covode.recordClassIndex(100617);
    }

    @Override // com.p2082ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy
    public int getChangeVideoFpsCount() {
        return this.mChangeVideoFpsCount;
    }

    public EncoderFpsAdjustStrategyAvg(int i, int i2) {
        this.mChangeEncodeFpsThreshold = i;
        this.mMaxChangeEncodeFpsTimes = i2;
    }

    @Override // com.p2082ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy
    public int getAdjustFps(int i, int i2) {
        int i3;
        if (this.mChangeEncodeFpsThreshold > 0 && (i3 = this.mMaxChangeEncodeFpsTimes) > 0 && this.mChangeVideoFpsCount < i3) {
            int i4 = this.mVideoEncodeFpsAdjustEventCount;
            if (i4 < 4) {
                if (i2 > 0 && i2 <= 60) {
                    this.mVideoEncodeFpsCount += i2;
                    this.mVideoEncodeFpsAdjustEventCount = i4 + 1;
                }
            } else if (i4 == 4) {
                if (i2 > 0 && i2 <= 60) {
                    this.mVideoEncodeFpsCount += i2;
                    this.mVideoEncodeFpsAdjustEventCount = 5;
                }
                int i5 = this.mVideoEncodeFpsCount / 5;
                this.mVideoEncodeFpsCount = 0;
                this.mVideoEncodeFpsAdjustEventCount = 0;
                if (i5 > 0 && i5 <= 60 && Math.abs(i5 - i) >= this.mChangeEncodeFpsThreshold) {
                    this.mChangeVideoFpsCount++;
                    return i5;
                }
            }
        }
        return 0;
    }
}
