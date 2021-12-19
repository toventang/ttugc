package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public abstract class ByteAudioFilter {
    static {
        Covode.recordClassIndex(14979);
    }

    public abstract int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
}
