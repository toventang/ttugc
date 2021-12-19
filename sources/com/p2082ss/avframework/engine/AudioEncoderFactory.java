package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.engine.AudioEncoderFactory */
public abstract class AudioEncoderFactory extends NativeObject {
    static {
        Covode.recordClassIndex(99960);
    }

    public abstract AudioEncoder CreateAudioEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}
