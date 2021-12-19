package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IAudioStream extends IStream {
    static {
        Covode.recordClassIndex(27591);
    }

    int getSampleRate();
}
