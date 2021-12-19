package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback */
public interface AudioCallback {
    static {
        Covode.recordClassIndex(100383);
    }

    void onAudioWarning(String str);

    boolean updateAudioFrame(Buffer buffer, int i, long j);
}
