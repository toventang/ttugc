package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public interface AudioDeviceObserver {
    static {
        Covode.recordClassIndex(14972);
    }

    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();
}
