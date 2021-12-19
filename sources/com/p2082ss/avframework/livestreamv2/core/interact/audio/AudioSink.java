package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.AudioSink */
public interface AudioSink {
    static {
        Covode.recordClassIndex(100386);
    }

    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void setRenderAble(boolean z);
}
