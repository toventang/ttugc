package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.RTCStream;
import com.p2082ss.bytertc.engine.SubscribeConfig;
import com.p2082ss.bytertc.engine.SubscribeState;
import com.p2082ss.bytertc.engine.SysStats;
import com.p2082ss.bytertc.engine.UserInfo;
import com.p2082ss.bytertc.engine.data.AudioPlaybackDevice;
import com.p2082ss.bytertc.engine.data.LocalAudioStreamError;
import com.p2082ss.bytertc.engine.data.LocalAudioStreamState;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.RemoteAudioState;
import com.p2082ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p2082ss.bytertc.engine.data.RemoteStreamKey;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.data.VideoFrameInfo;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.bytertc.engine.livertc.RTCHandlerProxy */
public class RTCHandlerProxy extends IRTCEngineEventHandler {
    public WeakReference<IRTCEngineEventHandler> mHandler;
    public WeakReference<ILiveRtcEventObserver> mObserver;

    static {
        Covode.recordClassIndex(101100);
    }

    public IRTCEngineEventHandler getHandler() {
        WeakReference<IRTCEngineEventHandler> weakReference = this.mHandler;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public ILiveRtcEventObserver getObserver() {
        WeakReference<ILiveRtcEventObserver> weakReference = this.mObserver;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioMixingFinished() {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioMixingFinished();
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onActiveSpeaker(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onActiveSpeaker(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioEffectFinished(int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioEffectFinished(i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onError(int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onError(i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstLocalAudioFrame(streamIndex);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstRemoteAudioFrame(remoteStreamKey);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLeaveRoom(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLeaveRoom(rTCRoomStats);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLocalStreamStats(IRTCEngineEventHandler.LocalStreamStats localStreamStats) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalStreamStats(localStreamStats);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onMirrorStateChanged(boolean z) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onMirrorStateChanged(z);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onNetworkTypeChanged(int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onNetworkTypeChanged(i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteStreamStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteStreamStats(remoteStreamStats);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onResponse(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onResponse(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRoomStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomStats(rTCRoomStats);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onSimulcastSubscribeFallback(IRTCEngineEventHandler.RemoteStreamSwitch remoteStreamSwitch) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onSimulcastSubscribeFallback(remoteStreamSwitch);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onSysStats(SysStats sysStats) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onSysStats(sysStats);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserStartAudioCapture(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStartAudioCapture(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserStartVideoCapture(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStartVideoCapture(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserStopAudioCapture(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStopAudioCapture(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserStopVideoCapture(String str) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStopVideoCapture(str);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onWarning(int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onWarning(i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onStreamAdd(RTCStream rTCStream) {
        ILiveRtcEventObserver observer = getObserver();
        if (observer != null) {
            observer.onStreamAdd(rTCStream);
        }
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamAdd(rTCStream);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioFramePlayStateChanged(rtcUser, firstFramePlayState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioFrameSendStateChanged(rtcUser, firstFrameSendState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioVolumeIndication(audioVolumeInfoArr, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onConnectionStateChanged(int i, int i2) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onConnectionStateChanged(i, i2);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLogReport(String str, JSONObject jSONObject) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLogReport(str, jSONObject);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onMuteAllRemoteAudio(str, muteState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onMuteAllRemoteVideo(str, muteState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteUserAudioRecvModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteUserAudioRecvModeChange(str, rangeAudioMode);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteUserAudioSendModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteUserAudioSendModeChange(str, rangeAudioMode);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomBinaryMessageReceived(str, byteBuffer);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRoomMessageReceived(String str, String str2) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomMessageReceived(str, str2);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRoomMessageSendResult(long j, int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomMessageSendResult(j, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onScreenVideoFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onScreenVideoFramePlayStateChanged(rtcUser, firstFramePlayState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onScreenVideoFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onScreenVideoFrameSendStateChanged(rtcUser, firstFrameSendState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onStreamPublishSuccess(String str, boolean z) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamPublishSuccess(str, z);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onSubscribe(String str, boolean z) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onSubscribe(str, z);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUnSubscribe(String str, boolean z) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUnSubscribe(str, z);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserBinaryMessageReceived(str, byteBuffer);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserEnableLocalAudio(String str, boolean z) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserEnableLocalAudio(str, z);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserJoined(UserInfo userInfo, int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserJoined(userInfo, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserLeave(String str, int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserLeave(str, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserMessageReceived(String str, String str2) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMessageReceived(str, str2);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserMessageSendResult(long j, int i) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMessageSendResult(j, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserMuteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMuteAudio(str, muteState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onUserMuteVideo(String str, MuteState muteState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMuteVideo(str, muteState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onVideoFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onVideoFramePlayStateChanged(rtcUser, firstFramePlayState);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onVideoFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onVideoFrameSendStateChanged(rtcUser, firstFrameSendState);
        }
    }

    public RTCHandlerProxy(IRTCEngineEventHandler iRTCEngineEventHandler, ILiveRtcEventObserver iLiveRtcEventObserver) {
        this.mHandler = new WeakReference<>(iRTCEngineEventHandler);
        this.mObserver = new WeakReference<>(iLiveRtcEventObserver);
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLiveTranscodingResult(String str, int i) {
        ILiveRtcEventObserver observer = getObserver();
        if (observer != null) {
            observer.onLiveTranscodingResult(str, i);
        }
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLiveTranscodingResult(str, i);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason) {
        ILiveRtcEventObserver observer = getObserver();
        if (observer != null) {
            observer.onStreamRemove(rTCStream, streamRemoveReason);
        }
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamRemove(rTCStream, streamRemoveReason);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onLoggerMessage(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLoggerMessage(logLevel, str, th);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamSubscribed(subscribeState, str, subscribeConfig);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onMediaDeviceStateChanged(str, i, i2, i3);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onPerformanceAlarms(IRTCEngineEventHandler.PerformanceAlarmMode performanceAlarmMode, String str, IRTCEngineEventHandler.PerformanceAlarmReason performanceAlarmReason, IRTCEngineEventHandler.SourceWantedData sourceWantedData) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
        }
    }

    @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
    public void onJoinRoomResult(String str, String str2, int i, int i2, int i3) {
        IRTCEngineEventHandler handler = getHandler();
        if (handler != null) {
            handler.onJoinRoomResult(str, str2, i, i2, i3);
        }
    }
}
