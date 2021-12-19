package com.p2082ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.transport.MP4Transport;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.recorder.NativeMp4Recorder */
public class NativeMp4Recorder extends MP4Transport implements MediaRecorder {
    static {
        Covode.recordClassIndex(100696);
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int start() {
        nativeStartRecord();
        return 0;
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int stop() {
        nativeStopRecord();
        return 0;
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.recorder.MediaRecorder, com.p2082ss.avframework.transport.MP4Transport
    public synchronized void release() {
        MethodCollector.m26663i(1954);
        super.release();
        MethodCollector.m26664o(1954);
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    public NativeMp4Recorder(boolean z, boolean z2) {
        super(z, z2);
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        throw new AndroidRuntimeException("Should not be here.");
    }
}
