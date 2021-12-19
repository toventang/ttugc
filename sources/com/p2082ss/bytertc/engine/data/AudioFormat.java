package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.AudioFormat */
public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;

    static {
        Covode.recordClassIndex(100965);
    }

    public String toString() {
        return "AudioFormat{sampleRate='" + this.sampleRate + '\'' + ", channel='" + this.channel + '\'' + '}';
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
