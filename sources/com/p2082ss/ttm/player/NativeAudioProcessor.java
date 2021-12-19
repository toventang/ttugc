package com.p2082ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.NativeAudioProcessor */
public class NativeAudioProcessor extends AudioProcessor {

    /* renamed from: a */
    protected long f192540a;

    static {
        Covode.recordClassIndex(101395);
    }

    private long getNativeWrapper() {
        return this.f192540a;
    }

    @Override // com.p2082ss.ttm.player.AudioProcessor
    public void audioClose() {
        throw new AndroidRuntimeException("Should not be here");
    }

    public static boolean isNativeAudioProcessor(AudioProcessor audioProcessor) {
        return audioProcessor instanceof NativeAudioProcessor;
    }

    public void setNativeWrapper(long j) {
        this.f192540a = j;
    }

    @Override // com.p2082ss.ttm.player.AudioProcessor
    public void audioRelease(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.p2082ss.ttm.player.AudioProcessor
    public void audioProcess(ByteBuffer[] byteBufferArr, int i, long j) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.p2082ss.ttm.player.AudioProcessor
    public void audioOpen(int i, int i2, int i3, int i4) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
