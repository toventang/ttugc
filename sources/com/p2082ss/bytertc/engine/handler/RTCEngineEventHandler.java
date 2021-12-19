package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.InternalAudioVolumeInfo;
import com.p2082ss.bytertc.engine.InternalLocalStreamStats;
import com.p2082ss.bytertc.engine.InternalRTCStats;
import com.p2082ss.bytertc.engine.InternalRTCUser;
import com.p2082ss.bytertc.engine.InternalRemoteStreamStats;
import com.p2082ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.p2082ss.bytertc.engine.InternalSourceWantedData;
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
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bytertc.engine.handler.RTCEngineEventHandler */
public class RTCEngineEventHandler {
    private long mJoinChannelTime;
    private String mRoom;
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;
    private String mSession;
    private State mState = State.IDLE;
    private String mUser;

    static {
        Covode.recordClassIndex(101059);
    }

    /* renamed from: com.ss.bytertc.engine.handler.RTCEngineEventHandler$State */
    enum State {
        IDLE,
        IN_ROOM;

        static {
            Covode.recordClassIndex(101060);
        }
    }

    public void onAudioMixingFinished() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingFinished();
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioMixingFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.m147885d("RtcEngineEventHandler", "onLeaveChannel...");
    }

    public RTCEngineEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onActiveSpeaker(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onActiveSpeaker...uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onActiveSpeaker callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioEffectFinished(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onAudioEffectFinished...soundId: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioEffectFinished(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioEffectFinished callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConnectionStateChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147888i("RtcEngineEventHandler", "onConnectionStateChanged, state: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i, -1);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onConnectionStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onError(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onError...errorNum: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onHttpProxyState(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147888i("RtcEngineEventHandler", "onHttpProxyState, state: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpProxyState(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onHttpProxyState callback catch exception.\n" + e.getMessage());
        }
    }

    public void onHttpsProxyState(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147888i("RtcEngineEventHandler", "onHttpsProxyState, state: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpsProxyState(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onHttpsProxyState callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onLocalStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalStreamStats(new IRTCEngineEventHandler.LocalStreamStats(internalLocalStreamStats));
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onLocalStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMirrorStateChanged(boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onMirrorStateChanged: ".concat(String.valueOf(z)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMirrorStateChanged(z);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onMirrorStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkTypeChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147888i("RtcEngineEventHandler", "onNetworkTypeChanged, type: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onNetworkTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onResponse(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onResponse, res: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onResponse(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onResponse callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRtcStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomStats(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRtcStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onStreamAdd...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamAdd(rTCStream);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onStreamAdd callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStartAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserStartAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartAudioCapture(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserStartAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStartVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserStartVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartVideoCapture(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserStartVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStopAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserStopAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopAudioCapture(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserStopAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserStopVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserStopVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopVideoCapture(str);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserStopVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    public void onWarning(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onWarning, warnNum: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onAudioPlaybackDeviceChanged...device: " + audioPlaybackDevice.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioPlaybackDeviceChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRemoteStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                int i = 0;
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
                rtcEngineHandler.onRemoteStreamStats(new IRTCEngineEventHandler.RemoteStreamStats(internalRemoteStreamStats));
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147886e("RtcEngineEventHandler", "onSysStats... " + sysStats.toString());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onSysStats callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", isScreen: " + internalRemoteStreamSwitch.isScreen + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSimulcastSubscribeFallback(new IRTCEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onLocalAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRoomMessageReceived: ".concat(String.valueOf(str2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageReceived(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRoomMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamPublishSuccess(str, z);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onStreamPublishSucceed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onAudioFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRTCEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i2 = 0; i2 < internalAudioVolumeInfoArr.length; i2++) {
                audioVolumeInfoArr[i2] = new IRTCEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i2]);
            }
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (!(rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null)) {
                rtcEngineHandler.onAudioVolumeIndication(audioVolumeInfoArr, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onFirstLocalVideoFrame...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLiveTranscodingResult(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
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
        LogUtil.m147885d("RtcEngineEventHandler", "OnTranscodingError error(" + i + ") url:" + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLiveTranscodingResult(str, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "OnTranscodingError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onLocalVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
                    if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                        rtcEngineHandler.onLogReport(str, jSONObject);
                    }
                } catch (JSONException e) {
                    LogUtil.m147885d("RtcEngineEventHandler", "onLogReport...parse json catch exception: " + e.getMessage());
                }
            } else {
                LogUtil.m147888i(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.m147886e("RtcEngineEventHandler", "onLogReport callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onMuteAllRemoteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteAudio(str, muteState);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onMuteAllRemoteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onMuteAllRemoteVideo... uid: " + str + ", muteState: " + muteState);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteVideo(str, muteState);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onMuteAllRemoteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteUserAudioRecvModeChange(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "remote user audio recv mode change: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioRecvModeChange(str, RTCEngine.RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteUserAudioRecvModeChange callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteUserAudioSendModeChange(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "remote user audio send mode change: ".concat(String.valueOf(i)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioSendModeChange(str, RTCEngine.RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteUserAudioSendModeChange callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRoomMessageSendResult: " + j + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onStreamRemove...uid: " + rTCStream.userId);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamRemove(rTCStream, IRTCEngineEventHandler.StreamRemoveReason.values()[i]);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onStreamRemove callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSubscribe(str, z);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onSubsribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUnSubscribe(str, z);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUnSubscribe callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserBinaryMessageReceived: " + str + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(UserInfo userInfo, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo() + ", elapsed: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserJoined(userInfo, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserLeave(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserLeave... uid: " + str + ", reason: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserLeave(str, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserLeave callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserMessageReceived: " + str + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceived(str, str2);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserMessageSendResult: " + j + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResult(j, i);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onUserMuteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteAudio(str, muteState);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserMuteAudio callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
        boolean z;
        IRTCEngineEventHandler rtcEngineHandler;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcEngineEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteVideo(str, muteState);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onUserMuteVideo callback catch exception.\n" + e.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.m147886e("RtcEngineEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onLocalVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRemoteAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onRemoteVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onStreamSubscribed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSubscribed(SubscribeState.values()[i], str, subscribeConfig);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onStreamSubscribed callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onMediaDeviceStateChanged, MediaDeviceType: " + i + ", device_state: " + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceStateChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onMediaDeviceStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onPerformanceAlarms(int i, String str, int i2, InternalSourceWantedData internalSourceWantedData) {
        IRTCEngineEventHandler.PerformanceAlarmReason performanceAlarmReason;
        IRTCEngineEventHandler.PerformanceAlarmMode performanceAlarmMode;
        LogUtil.m147885d("RtcEngineEventHandler", "onPerformanceAlarms, level: " + i2 + ", data: " + internalSourceWantedData);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null) {
                if (i2 == 0) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_BANDWIDTH_FALLBACKED;
                } else if (i2 == 1) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_BANDWIDTH_RESUMED;
                } else if (i2 == 2) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_FALLBACKED;
                } else if (i2 != 3) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;
                } else {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;
                }
                IRTCEngineEventHandler rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    if (i == 0) {
                        performanceAlarmMode = IRTCEngineEventHandler.PerformanceAlarmMode.PERFORMANCE_ALARM_MODE_NORMAL;
                    } else {
                        performanceAlarmMode = IRTCEngineEventHandler.PerformanceAlarmMode.PERFORMANCE_ALARM_MODE_SIMULCAST;
                    }
                    rtcEngineHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, new IRTCEngineEventHandler.SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onPerformanceAlarms callback catch exception.\n" + e.getMessage());
        }
    }

    public void onJoinRoomResult(String str, String str2, int i, int i2, int i3) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147885d("RtcEngineEventHandler", "onJoinRoomResult...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onJoinRoomResult(str, str2, i, i2, i3);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onJoinRoomResult callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSocks5ProxyState(int i, String str, String str2, String str3, String str4) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m147888i("RtcEngineEventHandler", "onSocks5ProxyState, state: " + i + ", cmd: " + str + ", proxy_address: " + str2 + ", local_address: " + str3 + ", remote_address: " + str4);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSocks5ProxyState(i, str, str2, str3, str4);
            }
        } catch (Exception e) {
            LogUtil.m147886e("RtcEngineEventHandler", "onSocks5ProxyState callback catch exception.\n" + e.getMessage());
        }
    }
}
