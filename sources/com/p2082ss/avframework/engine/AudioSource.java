package com.p2082ss.avframework.engine;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.p2082ss.avframework.statics.StaticsReport;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.engine.AudioSource */
public abstract class AudioSource extends MediaSource {
    public AudioDeviceModule mADM;
    private PowerObserver mObserver;

    /* renamed from: com.ss.avframework.engine.AudioSource$PowerObserver */
    public interface PowerObserver {
        static {
            Covode.recordClassIndex(99965);
        }

        void onCalculatePcmPowerEvent(int i);
    }

    static {
        Covode.recordClassIndex(99964);
    }

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    public native void nativeOnData(Buffer buffer, int i, int i2, int i3, long j);

    /* access modifiers changed from: protected */
    public native void nativeSetAudioQuantizeGapPeriod(long j);

    /* access modifiers changed from: protected */
    public native void nativeSetMute(boolean z);

    /* access modifiers changed from: protected */
    public native void nativeSetVolume(double d);

    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(PowerObserver powerObserver) {
        this.mObserver = powerObserver;
    }

    private void onEvent(int i) {
        PowerObserver powerObserver = this.mObserver;
        if (powerObserver != null) {
            powerObserver.onCalculatePcmPowerEvent(i);
        }
    }

    /* access modifiers changed from: protected */
    public void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}
