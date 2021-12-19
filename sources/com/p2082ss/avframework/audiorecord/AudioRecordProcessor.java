package com.p2082ss.avframework.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.audiorecord.AudioRecordProcessor */
public class AudioRecordProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99826);
    }

    private native int nativeAudioRecordInit(String str, int i, int i2, int i3);

    private native int nativeAudioRecordWritePcm(ByteBuffer byteBuffer);

    private native int nativeCreate();

    private native void nativeStopAudioRecord();

    public AudioRecordProcessor() {
        MethodCollector.m26663i(4611);
        nativeCreate();
        MethodCollector.m26664o(4611);
    }

    public void stopRecord() {
        MethodCollector.m26663i(4412);
        nativeStopAudioRecord();
        MethodCollector.m26664o(4412);
    }

    public void writePcm(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(4520);
        nativeAudioRecordWritePcm(byteBuffer);
        MethodCollector.m26664o(4520);
    }

    public int init(String str, int i, int i2, int i3) {
        MethodCollector.m26663i(4698);
        int nativeAudioRecordInit = nativeAudioRecordInit(str, i, i2, i3);
        MethodCollector.m26664o(4698);
        return nativeAudioRecordInit;
    }
}
