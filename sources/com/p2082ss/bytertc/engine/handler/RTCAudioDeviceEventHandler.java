package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.IRTCAudioDeviceManager;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;

/* renamed from: com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler */
public class RTCAudioDeviceEventHandler {
    static {
        Covode.recordClassIndex(101056);
    }

    /* access modifiers changed from: package-private */
    public void OnLoopbackAudioVolumeIndication(int i) {
    }

    /* access modifiers changed from: package-private */
    public void onRecordingAudioVolumeIndication(int i) {
        IRTCAudioDeviceManager.IRTCAudioDeviceEventHandler audioDeviceManagerEvent = RTCEngineImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i);
        }
    }
}
