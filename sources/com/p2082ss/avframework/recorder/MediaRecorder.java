package com.p2082ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.recorder.MediaRecorder */
public interface MediaRecorder {
    static {
        Covode.recordClassIndex(100695);
    }

    int addTrack(MediaFormat mediaFormat);

    void release();

    int start();

    int stop();

    int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
