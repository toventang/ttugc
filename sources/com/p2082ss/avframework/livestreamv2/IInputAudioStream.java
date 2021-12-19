package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.mixer.AudioMixer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.IInputAudioStream */
public interface IInputAudioStream {
    static {
        Covode.recordClassIndex(100010);
    }

    AudioTrack getAudioTrack();

    int getChannel();

    AudioMixer.AudioMixerDescription getMixerDescription();

    int getSample();

    String name();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    void release();

    void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription);

    int start();

    int stop();
}
