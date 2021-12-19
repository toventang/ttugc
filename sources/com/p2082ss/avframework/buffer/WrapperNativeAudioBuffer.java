package com.p2082ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.buffer.WrapperNativeAudioBuffer */
public class WrapperNativeAudioBuffer {
    public int mChannel;
    private long mNativeBuffer;
    public int mSampleRateHz;
    public int mSamplesPerChannel;
    public long timestampUs;

    static {
        Covode.recordClassIndex(99859);
    }

    public static ByteBuffer getDirectBuffer(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
        return null;
    }

    public synchronized long extract() {
        long j;
        MethodCollector.m26663i(1521);
        j = this.mNativeBuffer;
        this.mNativeBuffer = 0;
        MethodCollector.m26664o(1521);
        return j;
    }

    public WrapperNativeAudioBuffer(long j, int i, int i2, int i3, long j2) {
        this.mNativeBuffer = j;
        this.mSamplesPerChannel = i;
        this.mSampleRateHz = i2;
        this.mChannel = i3;
        this.timestampUs = j2;
    }
}
