package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;

/* renamed from: com.ss.bytertc.engine.NativeRTCRoomFunctions */
public class NativeRTCRoomFunctions {
    static {
        Covode.recordClassIndex(100912);
    }

    public static native void nativeDestory(long j);

    public static native void nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeJoinRoom(long j, String str, UserInfo userInfo, int i);

    public static native void nativeLeaveRoom(long j);

    public static native void nativeMuteAllRemoteAudio(long j, int i);

    public static native void nativeMuteAllRemoteVideo(long j, int i);

    public static native void nativeMuteRemoteAudio(long j, String str, int i);

    public static native void nativeMuteRemoteVideo(long j, String str, int i);

    public static native void nativePublish(long j);

    public static native void nativePublishScreen(long j);

    public static native void nativeReleaseRTCRoomEventHandler(long j);

    public static native void nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native void nativeSendRoomMessage(long j, String str);

    public static native void nativeSendUserBinaryMessage(long j, String str, byte[] bArr);

    public static native void nativeSendUserMessage(long j, String str, String str2);

    public static native void nativeSetAudioVolumeIndicationInterval(long j, int i);

    public static native void nativeSetAutoSubscribe(long j, int i, int i2);

    public static native void nativeSetCustomUserRole(long j, String str);

    public static native long nativeSetRTCRoomEventHandler(long j, RTCRoomEventHandler rTCRoomEventHandler);

    public static native void nativeSetUserRole(long j, int i);

    public static native void nativeStartLiveTranscoding(long j, String str, ILiveTranscodingObserver iLiveTranscodingObserver);

    public static native void nativeStopLiveTranscoding(long j);

    public static native void nativeSubscribe(long j, String str, boolean z, boolean z2, boolean z3, int i);

    public static native void nativeUnpublish(long j);

    public static native void nativeUnpublishScreen(long j);

    public static native void nativeUnsubscribe(long j, String str, boolean z);

    public static native void nativeUpdateLiveTranscoding(long j, String str);

    public static native void nativeUpdateToken(long j, String str);
}
