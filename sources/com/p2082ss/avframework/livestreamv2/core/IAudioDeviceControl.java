package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioTrack;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.IAudioDeviceControl */
public interface IAudioDeviceControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.IAudioDeviceControl$IAudioTrack */
    public interface IAudioTrack {
        static {
            Covode.recordClassIndex(100202);
        }

        void dispose();

        void enableAGC(boolean z, boolean z2);

        int getChannel();

        double getOption(int i);

        long getQuirks();

        int getSampleHz();

        float getVolume();

        boolean isEnableAGC();

        boolean isMute();

        String name();

        void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onData(ByteBuffer byteBuffer, int i, long j);

        void setAudioTrack(AudioTrack audioTrack);

        boolean setMute(boolean z);

        void setQuirks(long j);

        void setVolume(float f);
    }

    static {
        Covode.recordClassIndex(100201);
    }

    IAudioTrack createTrack(String str, int i, int i2, int i3);

    boolean enableAEC(boolean z);

    boolean enableEcho(boolean z);

    IAudioTrack getTrack(String str);

    IAudioTrack[] getTracks();

    float getVolume();

    boolean isEnableAEC();

    boolean isEnableEcho();

    void setOriginTriggering(String str);

    void setVolume(float f);
}
