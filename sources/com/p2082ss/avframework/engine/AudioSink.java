package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.WrapperNativeAudioBuffer;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.engine.AudioSink */
public abstract class AudioSink extends NativeObject {
    static {
        Covode.recordClassIndex(99963);
    }

    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
    }

    public abstract void onData(Buffer buffer, int i, int i2, int i3, long j);

    public abstract void onNoData();
}
