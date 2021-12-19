package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.IRTCAudioDeviceManager */
public interface IRTCAudioDeviceManager {

    /* renamed from: com.ss.bytertc.engine.IRTCAudioDeviceManager$IRTCAudioDeviceEventHandler */
    public interface IRTCAudioDeviceEventHandler {
        static {
            Covode.recordClassIndex(100889);
        }

        void onRecordingAudioVolumeIndication(int i);
    }

    static {
        Covode.recordClassIndex(100888);
    }

    void setEnableSpeakerphone(boolean z);

    int startAudioCaptureDeviceTest(int i);

    int startAudioPlaybackDeviceTest(String str);

    int stopAudioCaptureDeviceTest();

    int stopAudioPlaybackDeviceTest();
}
