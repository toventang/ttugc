package com.bytedance.bae;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public final class ByteAudioNativeFunctions {
    static {
        Covode.recordClassIndex(14983);
    }

    public static native long nativeAddEventHandler(long j, ByteAudioEventHandlerProxy byteAudioEventHandlerProxy);

    public static native int nativeAddInputStreamNameForMix(long j, String str);

    public static native int nativeAdjustHeadsetMonitorVolume(long j, int i);

    public static native int nativeAdjustPlaybackVolume(long j, int i);

    public static native int nativeAdjustRecordVolume(long j, int i);

    public static native long nativeAuxStreamGetId(long j);

    public static native String nativeAuxStreamGetName(long j);

    public static native ByteAudioStreamOption nativeAuxStreamGetValue(long j, int i);

    public static native int nativeAuxStreamPause(long j);

    public static native int nativeAuxStreamResume(long j);

    public static native int nativeAuxStreamSetFormat(long j, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeAuxStreamSetGain(long j, int i);

    public static native int nativeAuxStreamSetPath(long j, String str);

    public static native long nativeAuxStreamSetSink(long j, ByteAudioAuxSinkProxy byteAudioAuxSinkProxy);

    public static native int nativeAuxStreamSetValue(long j, int i, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeAuxStreamStart(long j);

    public static native int nativeAuxStreamStop(long j);

    public static native int nativeClearInputStreamNameForMix(long j);

    public static native long nativeCreateAuxStream(long j, String str);

    public static native long nativeCreateInputStream(long j, String str);

    public static native long nativeCreateOutputStream(long j, String str);

    public static native void nativeDestroyAuxStream(long j, long j2);

    public static native void nativeDestroyInputStream(long j, long j2);

    public static native void nativeDestroyOutputStream(long j, long j2);

    public static native void nativeEnableAudioRoute(long j, boolean z);

    public static native void nativeEnableEarMonitor(long j, boolean z);

    public static native void nativeEnableLocalAudio(long j, boolean z);

    public static native long nativeGetInstance();

    public static native ByteAudioStreamOption nativeGetValue(long j, int i);

    public static native long nativeInputStreamGetId(long j);

    public static native String nativeInputStreamGetName(long j);

    public static native LinkedHashMap nativeInputStreamGetStatsReport(long j);

    public static native ByteAudioStreamOption nativeInputStreamGetValue(long j, int i);

    public static native int nativeInputStreamSetFormat(long j, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeInputStreamSetGain(long j, int i);

    public static native int nativeInputStreamSetMute(long j, boolean z);

    public static native long nativeInputStreamSetSink(long j, ByteAudioInputSinkProxy byteAudioInputSinkProxy);

    public static native int nativeInputStreamSetValue(long j, int i, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeInputStreamStart(long j);

    public static native int nativeInputStreamStop(long j);

    public static native int nativeInputStreamUpdateFormat(long j, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native boolean nativeIsExternalAudioSource(long j);

    public static native long nativeOutputStreamGetId(long j);

    public static native String nativeOutputStreamGetName(long j);

    public static native LinkedHashMap nativeOutputStreamGetStatsReport(long j);

    public static native ByteAudioStreamOption nativeOutputStreamGetValue(long j, int i);

    public static native int nativeOutputStreamSetFormat(long j, ByteAudioStreamFormat byteAudioStreamFormat);

    public static native int nativeOutputStreamSetGain(long j, int i);

    public static native int nativeOutputStreamSetGainWithFade(long j, int i, int i2);

    public static native int nativeOutputStreamSetMute(long j, boolean z);

    public static native long nativeOutputStreamSetSink(long j, ByteAudioOutputSinkProxy byteAudioOutputSinkProxy);

    public static native int nativeOutputStreamSetValue(long j, int i, ByteAudioStreamOption byteAudioStreamOption);

    public static native int nativeOutputStreamStart(long j);

    public static native int nativeOutputStreamStop(long j);

    public static native int nativePullExternalAudioBuffer(long j, ByteAudioStreamBuffer byteAudioStreamBuffer);

    public static native int nativePushExternalAudioBuffer(long j, ByteAudioStreamBuffer byteAudioStreamBuffer);

    public static native void nativeRemoveEventHandler(long j, long j2);

    public static native int nativeSetAudioScenario(long j, int i);

    public static native void nativeSetEnableSpeakerphone(long j, boolean z);

    public static native void nativeSetExternalAudioSource(long j, boolean z, int i, int i2, int i3, int i4);

    public static native long nativeSetFrontInputFilter(long j, ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public static native long nativeSetInputFilter(long j, ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public static native long nativeSetOutputFilter(long j, ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public static native int nativeSetServerConfigure(long j, String str);

    public static native int nativeSetValue(long j, int i, ByteAudioStreamOption byteAudioStreamOption);
}
