package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;

/* renamed from: com.ss.bytertc.engine.RTCAudioDeviceManager */
public class RTCAudioDeviceManager implements IRTCAudioDeviceManager {
    private long mAudioDeviceManager = -1;

    static {
        Covode.recordClassIndex(100917);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioCaptureDeviceTest() {
        MethodCollector.m26663i(891);
        int nativeStopAudioCaptureDeviceTest = NativeFunctions.nativeStopAudioCaptureDeviceTest(this.mAudioDeviceManager);
        MethodCollector.m26664o(891);
        return nativeStopAudioCaptureDeviceTest;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioPlaybackDeviceTest() {
        MethodCollector.m26663i(884);
        int nativeStopAudioPlaybackDeviceTest = NativeFunctions.nativeStopAudioPlaybackDeviceTest(this.mAudioDeviceManager);
        MethodCollector.m26664o(884);
        return nativeStopAudioPlaybackDeviceTest;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCAudioDeviceManager
    public void setEnableSpeakerphone(boolean z) {
        MethodCollector.m26663i(894);
        NativeFunctions.nativeSetEnableSpeakerphoneForTest(this.mAudioDeviceManager, z);
        MethodCollector.m26664o(894);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioCaptureDeviceTest(int i) {
        MethodCollector.m26663i(888);
        int nativeStartAudioCaptureDeviceTest = NativeFunctions.nativeStartAudioCaptureDeviceTest(this.mAudioDeviceManager, i);
        MethodCollector.m26664o(888);
        return nativeStartAudioCaptureDeviceTest;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioPlaybackDeviceTest(String str) {
        MethodCollector.m26663i(879);
        int nativeStartAudioPlaybackDeviceTest = NativeFunctions.nativeStartAudioPlaybackDeviceTest(this.mAudioDeviceManager, str);
        MethodCollector.m26664o(879);
        return nativeStartAudioPlaybackDeviceTest;
    }

    public RTCAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler) {
        MethodCollector.m26663i(805);
        this.mAudioDeviceManager = NativeFunctions.nativeCreateAudioDeviceManager(rTCAudioDeviceEventHandler);
        MethodCollector.m26664o(805);
    }
}
