package com.p2082ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCAudioFrameObserver;
import com.p2082ss.bytertc.engine.handler.RTCEncryptHandler;
import com.p2082ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCMetadataObserver;
import com.p2082ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscodingObserver;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.utils.RTCRunnable;
import java.nio.ByteBuffer;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.NativeFunctions */
public final class NativeFunctions {
    static {
        Covode.recordClassIndex(100910);
    }

    public static native void nativeAddVideoEffectPath(long j, String[] strArr);

    public static native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    public static native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    public static native int nativeAdjustAudioMixingVolume(long j, int i);

    public static native int nativeCheckVideoEffectLicense(Context context, long j, String str);

    public static native long nativeCreateAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler);

    public static native long nativeCreateEngine(Context context, String str, RTCEngineEventHandler rTCEngineEventHandler, EglBase.Context context2, String str2);

    public static native long nativeCreateRtcRoom(long j, String str);

    public static native void nativeDestroyEngine(long j);

    public static native void nativeDisableExternalAudioDevice(long j);

    public static native int nativeEnableAutoSubscribe(long j, int i, int i2);

    public static native void nativeEnableExternalAudioDevice(long j, int i, int i2, int i3, int i4);

    public static native int nativeEnableRangeAudio(long j, boolean z);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeEnableVideoEffect(long j, boolean z);

    public static native int nativeGetAudioMixingCurrentPosition(long j);

    public static native int nativeGetAudioMixingDuration(long j);

    public static native int nativeGetAudioMixingStreamCachedFrameNum(long j);

    public static native int nativeGetEffectVolume(long j, int i);

    public static native String nativeGetErrorDescription(int i);

    public static native String nativeGetSDKVersion();

    public static native int nativeHttpClientCallback(int i, int i2, int i3, String str);

    public static native void nativeInitVideoEffect(long j, String str);

    public static native void nativeInvokeWorkerUninterruptibly(long j, RTCRunnable rTCRunnable);

    public static native boolean nativeIsMirror(long j);

    public static native int nativeJoinRoom(long j, String str, String str2, UserInfo userInfo, int i);

    public static native int nativeLeaveRoom(long j);

    public static native void nativeMuteAllRemoteAudio(long j, int i);

    public static native int nativeMuteAllRemoteVideo(long j, int i);

    public static native void nativeMuteLocalAudio(long j, int i);

    public static native int nativeMuteLocalVideo(long j, int i);

    public static native void nativeMuteRemoteAudio(long j, String str, int i);

    public static native int nativeMuteRemoteVideo(long j, String str, int i);

    public static native int nativePauseAllEffects(long j);

    public static native int nativePauseAudioMixing(long j);

    public static native int nativePauseEffect(long j, int i);

    public static native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    public static native int nativePreloadEffect(long j, int i, String str);

    public static native int nativePublishScreen(long j);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushAudioMixingStreamData(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalVideoFrame(long j, VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native boolean nativePushScreenFrame(long j, VideoFrame videoFrame);

    public static native void nativeRegisterInternalEventObserver(long j, RTCEngineInternalEventHandler rTCEngineInternalEventHandler);

    public static native void nativeRegisterVideoFrameObserver(long j, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native void nativeRemoveVideoEffectPath(long j, String[] strArr);

    public static native int nativeReportFeedback(String str);

    public static native int nativeResumeAllEffects(long j);

    public static native int nativeResumeAudioMixing(long j);

    public static native int nativeResumeEffect(long j, int i);

    public static native int nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native int nativeSendRoomMessage(long j, String str);

    public static native long nativeSendUserBinaryMessage(long j, String str, byte[] bArr);

    public static native long nativeSendUserMessage(long j, String str, String str2);

    public static native void nativeSetAppState(long j, String str);

    public static native void nativeSetAudioFrameObserver(long j, RTCAudioFrameObserver rTCAudioFrameObserver);

    public static native int nativeSetAudioMixingPosition(long j, int i);

    public static native void nativeSetAudioPerformanceProfile(long j, int i);

    public static native int nativeSetAudioPlaybackDevice(long j, int i);

    public static native void nativeSetAudioPlayoutMixStream(long j, boolean z, int i, int i2);

    public static native int nativeSetAudioRecvMode(long j, int i);

    public static native void nativeSetAudioScenario(long j, int i);

    public static native int nativeSetAudioSendMode(long j, int i);

    public static native void nativeSetAudioVolumeIndicationInterval(long j, int i);

    public static native int nativeSetBusinessId(long j, String str);

    public static native void nativeSetCustomizeEncryptHandler(long j, RTCEncryptHandler rTCEncryptHandler);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetEffectsVolume(long j, int i);

    public static native void nativeSetEnableSpeakerphoneForTest(long j, boolean z);

    public static native void nativeSetEncryptInfo(long j, int i, String str);

    public static native int nativeSetEnv(int i);

    public static native int nativeSetLocalVideoCanvas(long j, int i, View view, int i2);

    public static native int nativeSetLocalVideoMirrorMode(long j, int i);

    public static native void nativeSetMetadataObserver(long j, RTCMetadataObserver rTCMetadataObserver);

    public static native int nativeSetMirror(long j, boolean z);

    public static native void nativeSetMixedAudioFrameParameters(long j, int i, int i2);

    public static native void nativeSetNetworkType(long j, int i);

    public static native int nativeSetParameters(String str);

    public static native void nativeSetPlaybackAudioFrameParameters(long j, int i, int i2);

    public static native void nativeSetPlaybackVolume(long j, int i);

    public static native int nativeSetPublishFallbackOption(long j, int i);

    public static native void nativeSetRecordingAudioFrameParameters(long j, int i, int i2);

    public static native void nativeSetRecordingVolume(long j, int i);

    public static native void nativeSetRemoteAudioPlaybackVolume(long j, String str, int i);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, int i);

    public static native int nativeSetRemoteVideoCanvas(long j, String str, int i, View view, int i2);

    public static native int nativeSetRtcMode(long j, int i);

    public static native void nativeSetRuntimeParameters(long j, String str);

    public static native int nativeSetTeamId(long j, String str);

    public static native void nativeSetUpperHttpClient(boolean z);

    public static native int nativeSetUserRole(long j, int i);

    public static native void nativeSetVideoEffectColorFilter(long j, String str);

    public static native void nativeSetVideoEffectColorFilterIntensity(long j, float f);

    public static native void nativeSetVideoEffectPath(long j, String[] strArr);

    public static native void nativeSetVideoEncoderConfig(long j, List<InternalVideoStreamDescription> list);

    public static native void nativeSetVideoInputType(long j, int i);

    public static native int nativeSetVolumeOfEffect(long j, int i, int i2);

    public static native int nativeSetupLocalScreenSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupRemoteVideoSink(long j, IVideoSink iVideoSink, String str, boolean z);

    public static native void nativeStartAudioCapture(long j);

    public static native int nativeStartAudioCaptureDeviceTest(long j, int i);

    public static native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeStartAudioPlaybackDeviceTest(long j, String str);

    public static native void nativeStartLiveTranscoding(long j, String str, LiveTranscodingObserver liveTranscodingObserver);

    public static native int nativeStartScreenSharing(long j, Intent intent, InternalScreenSharingParams internalScreenSharingParams);

    public static native void nativeStartVideoCapture(long j);

    public static native int nativeStopAllEffects(long j);

    public static native void nativeStopAudioCapture(long j);

    public static native int nativeStopAudioCaptureDeviceTest(long j);

    public static native void nativeStopAudioMixing(long j);

    public static native int nativeStopAudioPlaybackDeviceTest(long j);

    public static native int nativeStopEffect(long j, int i);

    public static native void nativeStopLiveTranscoding(long j);

    public static native int nativeStopScreenSharing(long j);

    public static native void nativeStopVideoCapture(long j);

    public static native void nativeSubscribeStream(long j, String str, boolean z, boolean z2, boolean z3, int i);

    public static native int nativeSwitchCamera(long j, int i);

    public static native int nativeUnSubscribe(long j, String str, boolean z);

    public static native int nativeUnloadAllEffects(long j);

    public static native int nativeUnloadEffect(long j, int i);

    public static native int nativeUnpublishScreen(long j);

    public static native int nativeUpdateAudioRecvRange(long j, int i, int i2);

    public static native void nativeUpdateCloudRending(long j, String str);

    public static native void nativeUpdateLiveTranscoding(long j, String str);

    public static native int nativeUpdateScreenSharingParameters(long j, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeUpdateSelfPosition(long j, int i, int i2, int i3);

    public static native int nativeUpdateToken(long j, String str);

    public static native void nativeUpdateVideoEffect(long j, String str, String str2, float f);
}
