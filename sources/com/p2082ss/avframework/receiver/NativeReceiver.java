package com.p2082ss.avframework.receiver;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDecoderFactory;
import com.p2082ss.avframework.engine.Receiver;
import com.p2082ss.avframework.engine.VideoDecoderFactory;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: com.ss.avframework.receiver.NativeReceiver */
public class NativeReceiver extends Receiver {
    static {
        Covode.recordClassIndex(100694);
    }

    private native int nativeAudioBuffer(ByteBuffer byteBuffer, boolean z, long j);

    private native int nativeAudioBufferWithTimestampMs(ByteBuffer byteBuffer, boolean z, long j, IntBuffer intBuffer);

    private native long nativeCreate(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory);

    private native void nativeRelease();

    @Override // com.p2082ss.avframework.engine.Receiver
    public boolean isNativeReceiver() {
        return true;
    }

    @Override // com.p2082ss.avframework.engine.Receiver
    public int readVideoBuffer(ByteBuffer byteBuffer) {
        return 0;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1969);
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0;
        }
        MethodCollector.m26664o(1969);
    }

    @Override // com.p2082ss.avframework.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z) {
        return readAudioBuffer(byteBuffer, z, null);
    }

    public NativeReceiver(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory) {
        MethodCollector.m26663i(1858);
        nativeCreate(videoDecoderFactory, audioDecoderFactory);
        MethodCollector.m26664o(1858);
    }

    @Override // com.p2082ss.avframework.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z, IntBuffer intBuffer) {
        MethodCollector.m26663i(1963);
        if (byteBuffer == null) {
            AVLog.logToIODevice2(6, "NativeReceiver", "readAudioBuffer null", new Throwable(), "NativeReceiver.readAudioBuffer", 100000);
            MethodCollector.m26664o(1963);
            return -1;
        }
        int nativeAudioBufferWithTimestampMs = nativeAudioBufferWithTimestampMs(byteBuffer, z, this.mNativeObj, intBuffer);
        MethodCollector.m26664o(1963);
        return nativeAudioBufferWithTimestampMs;
    }
}
