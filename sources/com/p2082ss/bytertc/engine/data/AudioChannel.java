package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.AudioChannel */
public enum AudioChannel {
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);
    
    private int value = 1;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == AUDIO_CHANNEL_MONO) {
            return "kAudioChannelMono";
        }
        return "kAudioChannelStereo";
    }

    static {
        Covode.recordClassIndex(100964);
    }

    public static AudioChannel fromId(int i) {
        AudioChannel[] values = values();
        for (AudioChannel audioChannel : values) {
            if (audioChannel.value() == i) {
                return audioChannel;
            }
        }
        return null;
    }

    private AudioChannel(int i) {
        this.value = i;
    }
}
