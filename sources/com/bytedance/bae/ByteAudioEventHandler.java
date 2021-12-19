package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public interface ByteAudioEventHandler {
    static {
        Covode.recordClassIndex(14977);
    }

    void onByteAudioDefaultDeviceChange(int i, String str);

    void onByteAudioDeviceStateChange(String str, int i, int i2, String str2);

    void onByteAudioEvent(int i, int i2, String str);

    void onByteAudioLogMessage(String str);

    void onByteAudioVolumeChanged(int i, int i2, boolean z, boolean z2, String str);
}
