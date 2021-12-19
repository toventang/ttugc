package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.data.AudioChannel;
import com.p2082ss.bytertc.engine.data.AudioSampleRate;

/* renamed from: com.ss.bytertc.engine.utils.AudioFrame */
public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samples;

    static {
        Covode.recordClassIndex(101142);
    }

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
