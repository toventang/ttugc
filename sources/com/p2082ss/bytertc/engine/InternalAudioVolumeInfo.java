package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalAudioVolumeInfo */
public class InternalAudioVolumeInfo {
    public String uid;
    public int volume;

    static {
        Covode.recordClassIndex(100891);
    }

    public InternalAudioVolumeInfo(String str, int i) {
        this.uid = str;
        this.volume = i;
    }

    private static InternalAudioVolumeInfo create(String str, int i) {
        return new InternalAudioVolumeInfo(str, i);
    }
}
