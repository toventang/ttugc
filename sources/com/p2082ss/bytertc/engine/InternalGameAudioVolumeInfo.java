package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalGameAudioVolumeInfo */
public class InternalGameAudioVolumeInfo {
    public String userId;
    public int volume;

    static {
        Covode.recordClassIndex(100892);
    }

    public InternalGameAudioVolumeInfo(String str, int i) {
        this.userId = str;
        this.volume = i;
    }

    private static InternalGameAudioVolumeInfo create(String str, int i) {
        return new InternalGameAudioVolumeInfo(str, i);
    }
}
