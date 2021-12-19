package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.InternalAudioVolumeInfo;
import com.p2082ss.bytertc.engine.InternalLocalStreamStats;
import com.p2082ss.bytertc.engine.InternalRTCStats;
import com.p2082ss.bytertc.engine.InternalRTCUser;
import com.p2082ss.bytertc.engine.InternalRemoteStreamStats;
import com.p2082ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.p2082ss.bytertc.engine.RTCRoom;
import com.p2082ss.bytertc.engine.RTCStream;
import com.p2082ss.bytertc.engine.SubscribeConfig;
import com.p2082ss.bytertc.engine.UserInfo;
import com.p2082ss.bytertc.engine.data.LocalAudioStreamError;
import com.p2082ss.bytertc.engine.data.LocalAudioStreamState;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.RemoteAudioState;
import com.p2082ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p2082ss.bytertc.engine.data.RemoteStreamKey;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.data.VideoFrameInfo;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* renamed from: com.ss.bytertc.engine.handler.RTCRoomEventHandler */
public class RTCRoomEventHandler {
    private RTCRoom mRtcRoom;

    static {
        Covode.recordClassIndex(101063);
    }

    public RTCRoomEventHandler(RTCRoom rTCRoom) {
        this.mRtcRoom = rTCRoom;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        LogUtil.m147885d("RtcRoomEventHandler", "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalAudioFrame(streamIndex);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.m147885d("RtcRoomEventHandler", "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onLeaveRoom callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.m147885d("RtcRoomEventHandler", "onLocalStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalStreamStats(new IRTCEngineEventHandler.LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onLocalStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomError(int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRoomError...errorNum: ".concat(String.valueOf(i)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomError(i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRoomError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRtcStats(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomWarning(int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRoomWarning, warnNum: ".concat(String.valueOf(i)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomWarning(i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRoomWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.m147885d("RtcRoomEventHandler", "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(rTCStream);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStartAudioCapture(String str) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserStartAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStartAudioCapture(str);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserStartAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStartVideoCapture(String str) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserStartVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStartVideoCapture(str);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserStartVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStopAudioCapture(String str) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserStopAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStopAudioCapture(str);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserStopAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStopVideoCapture(String str) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserStopVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStopVideoCapture(str);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserStopVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        LogUtil.m147885d("RtcRoomEventHandler", "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteAudioFrame(remoteStreamKey);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRemoteStreamStats...");
        int i = 0;
        try {
            int i2 = internalRemoteStreamStats.audioStats.quality;
            if (i2 == -1) {
                i = 6;
            } else if (i2 == 0) {
                i = 5;
            } else if (i2 == 1) {
                i = 4;
            } else if (i2 == 2) {
                i = 3;
            } else if (i2 == 3) {
                i = 2;
            } else if (i2 == 4) {
                i = 1;
            }
            internalRemoteStreamStats.audioStats.quality = i;
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamStats(new IRTCEngineEventHandler.RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRemoteStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        LogUtil.m147885d("RtcRoomEventHandler", "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSimulcastSubscribeFallback(new IRTCEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        LogUtil.m147885d("RtcRoomEventHandler", "onLocalAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        LogUtil.m147885d("RtcRoomEventHandler", "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onLocalVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRemoteVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRoomMessageReceived: ".concat(String.valueOf(str2)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        LogUtil.m147885d("RtcRoomEventHandler", "onStreamPublishSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSuccess(str, z);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onStreamPublishSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onStreamRemove...uid: " + rTCStream.userId);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(rTCStream, IRTCEngineEventHandler.StreamRemoveReason.values()[i]);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        LogUtil.m147885d("RtcRoomEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribe(str, z);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUnSubscribe(str, z);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUnSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserEnableLocalAudio(str, z);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserLeave(String str, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserLeave... uid: " + str + ", reason: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserLeave(str, i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserLeave callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j, i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onAudioFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        LogUtil.m147885d("RtcRoomEventHandler", "onFirstLocalVideoFrameCaptured...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        LogUtil.m147885d("RtcRoomEventHandler", "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLiveTranscodingResult(String str, int i) {
        if (i == 0) {
            i = 0;
        } else if (i == 1) {
            i = 1;
        } else if (i == 2) {
            i = 2;
        } else if (i == 3) {
            i = 3;
        } else if (i == 4) {
            i = 4;
        }
        LogUtil.m147885d("RtcRoomEventHandler", "onTranscodingError error(" + i + ") url:" + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onLiveTranscodingResult(str, i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onTranscodingError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(UserInfo userInfo, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo() + ", elapsed: " + i);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(userInfo, i);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
        LogUtil.m147885d("RtcRoomEventHandler", "onUserMuteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteAudio(str, muteState);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserMuteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
        boolean z;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcRoomEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteVideo(str, muteState);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onUserMuteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        LogUtil.m147885d("RtcRoomEventHandler", "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m147885d("RtcRoomEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i, int i2) {
        try {
            IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRTCEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i3 = 0; i3 < internalAudioVolumeInfoArr.length; i3++) {
                audioVolumeInfoArr[i3] = new IRTCEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i3]);
            }
            this.mRtcRoom.getRtcRoomHandler().onAudioVolumeIndication(audioVolumeInfoArr, i, i2);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
        LogUtil.m147885d("RtcRoomEventHandler", "onLocalVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRemoteAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        LogUtil.m147885d("RtcRoomEventHandler", "onRemoteVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        LogUtil.m147885d("RtcRoomEventHandler", "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i, str, subscribeConfig);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onJoinRoomResult(String str, String str2, int i, int i2, int i3) {
        LogUtil.m147885d("RtcRoomEventHandler", "onJoinRoomResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onJoinRoomResult(str, str2, i, i2, i3);
        } catch (Exception e) {
            LogUtil.m147885d("RtcRoomEventHandler", "onJoinRoomResult callback catch exception.\n" + e.getMessage());
        }
    }
}
