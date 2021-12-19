package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.AudioOriginFrameSink */
public class AudioOriginFrameSink extends AudioSink {
    private ILiveStream.IAudioFrameAvailableListener listener;

    static {
        Covode.recordClassIndex(99997);
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onNoData() {
    }

    public void setListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.listener = iAudioFrameAvailableListener;
    }

    @Override // com.p2082ss.avframework.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.listener != null) {
            buffer.position(0);
            this.listener.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }
}
