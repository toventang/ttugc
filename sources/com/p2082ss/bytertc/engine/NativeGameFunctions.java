package com.p2082ss.bytertc.engine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.handler.GameRTCEventHandler;
import org.webrtc.EglBase;

/* renamed from: com.ss.bytertc.engine.NativeGameFunctions */
public final class NativeGameFunctions {
    static {
        Covode.recordClassIndex(100911);
    }

    public static native long nativeCreateEngine(Context context, String str, String str2, int i, int i2, GameRTCEventHandler gameRTCEventHandler, String str3, EglBase.Context context2, long j);

    public static native void nativeDestroyEngine(long j);

    public static native void nativeDisableExternalAudioDevice(long j);

    public static native int nativeEnableAudioReceive(long j, String str, String str2, boolean z);

    public static native int nativeEnableAudioSend(long j, String str, boolean z);

    public static native void nativeEnableExternalAudioDevice(long j, int i, int i2, int i3, int i4);

    public static native int nativeEnableMicrophone(long j, String str, boolean z);

    public static native int nativeEnableSpeakerphone(long j, String str, boolean z);

    public static native String nativeGetSDKVersion();

    public static native int nativeJoinRoom(long j, String str, String str2, String str3, boolean z, int i, int i2);

    public static native int nativeLeaveRoom(long j, String str);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public static native void nativeSetAppState(long j, String str);

    public static native void nativeSetNetworkType(long j, int i);

    public static native int nativeSetPlaybackVolume(long j, int i);

    public static native int nativeSetRecordingVolume(long j, int i);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j, String str, String str2, int i);

    public static native int nativeUpdatePosition(long j, String str, int i, int i2, int i3);

    public static native int nativeUpdateReceiveRange(long j, String str, int i, int i2);

    public static native int nativeUpdateToken(long j, String str, String str2);
}
