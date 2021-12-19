package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.bytertc.engine.InternalAudioVolumeInfo;
import com.p2082ss.bytertc.engine.InternalLocalAudioStats;
import com.p2082ss.bytertc.engine.InternalLocalStreamStats;
import com.p2082ss.bytertc.engine.InternalLocalVideoStats;
import com.p2082ss.bytertc.engine.InternalRTCStats;
import com.p2082ss.bytertc.engine.InternalRTCUser;
import com.p2082ss.bytertc.engine.InternalRemoteAudioStats;
import com.p2082ss.bytertc.engine.InternalRemoteStreamStats;
import com.p2082ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.p2082ss.bytertc.engine.InternalRemoteVideoStats;
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
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler */
public abstract class IRTCEngineEventHandler {

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$MediaDeviceError */
    public static class MediaDeviceError {
        static {
            Covode.recordClassIndex(101033);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RtcErrorCodeDescription */
    public static class RtcErrorCodeDescription {
        static {
            Covode.recordClassIndex(101047);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$WarningCode */
    public static class WarningCode {
        static {
            Covode.recordClassIndex(101053);
        }
    }

    static {
        Covode.recordClassIndex(101020);
    }

    public void onActiveSpeaker(String str) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onHttpProxyState(int i) {
    }

    public void onHttpsProxyState(int i) {
    }

    public void onJoinRoomResult(String str, String str2, int i, int i2, int i3) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLiveTranscodingResult(String str, int i) {
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(LogLevel logLevel, String str, Throwable th) {
    }

    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
    }

    public void onMirrorStateChanged(boolean z) {
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
    }

    public void onNetworkTypeChanged(int i) {
    }

    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRemoteUserAudioRecvModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteUserAudioSendModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public void onResponse(String str) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    public void onScreenVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onSocks5ProxyState(int i, String str, String str2, String str3, String str4) {
    }

    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onStreamPublishSuccess(String str, boolean z) {
    }

    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSubscribe(String str, boolean z) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onUnSubscribe(String str, boolean z) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserJoined(UserInfo userInfo, int i) {
    }

    public void onUserLeave(String str, int i) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
    }

    public void onUserStartAudioCapture(String str) {
    }

    public void onUserStartVideoCapture(String str) {
    }

    public void onUserStopAudioCapture(String str) {
    }

    public void onUserStopVideoCapture(String str) {
    }

    public void onVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onWarning(int i) {
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$ConnectionState */
    public enum ConnectionState {
        CONNECTION_STATE_DISCONNECTED(1),
        CONNECTION_STATE_CONNECTING(2),
        CONNECTION_STATE_CONNECTED(3),
        CONNECTION_STATE_RECONNECTING(4),
        CONNECTION_STATE_RECONNECTED(5),
        CONNECTION_STATE_LOST(6);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101022);
        }

        public static ConnectionState fromInt(int i) {
            if (i <= 0 || i > 6) {
                return null;
            }
            return values()[i - 1];
        }

        private ConnectionState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$FallbackOrRecoverReason */
    public enum FallbackOrRecoverReason {
        FALLBACK_OR_RECOVER_REASON_UNKNOWN(-1),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH(0),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE(1),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH(2),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE(3),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH(4),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE(5),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH(6),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE(7);
        
        int value = -1;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101024);
        }

        private FallbackOrRecoverReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$FirstFramePlayState */
    public enum FirstFramePlayState {
        FIRST_FRAME_PLAY_STATE_PLAYING(0),
        FIRST_FRAME_PLAY_STATE_PLAYED(1),
        FIRST_FRAME_PLAY_STATE_END(2);
        
        private int state;

        public final int value() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(101025);
        }

        private FirstFramePlayState(int i) {
            this.state = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$FirstFrameSendState */
    public enum FirstFrameSendState {
        FIRST_FRAME_SEND_STATE_SENDING(0),
        FIRST_FRAME_SEND_STATE_SENT(1),
        FIRST_FRAME_SEND_STAT_END(2);
        
        private int state;

        public final int value() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(101026);
        }

        private FirstFrameSendState(int i) {
            this.state = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LocalAudioStats */
    public static class LocalAudioStats {
        public float audioLossRate;
        public int numChannels;
        public int recordSampleRate;
        public int rtt;
        public float sendKBitrate;
        public int sentSampleRate;
        public int statsInterval;

        static {
            Covode.recordClassIndex(101027);
        }

        public LocalAudioStats() {
        }

        public String toString() {
            return "LocalAudioStats{audioLossRate='" + this.audioLossRate + '\'' + ", sendKBitrate='" + this.sendKBitrate + '\'' + ", recordSampleRate='" + this.recordSampleRate + '\'' + ", rtt='" + this.rtt + '\'' + ", numChannels='" + this.numChannels + '\'' + ", sentSampleRate='" + this.sentSampleRate + '\'' + '}';
        }

        public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
            this.audioLossRate = internalLocalAudioStats.audioLossRate;
            this.sendKBitrate = (float) internalLocalAudioStats.sendKBitrate;
            this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
            this.statsInterval = internalLocalAudioStats.statsInterval;
            this.rtt = internalLocalAudioStats.rtt;
            this.numChannels = internalLocalAudioStats.numChannels;
            this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LocalStreamStats */
    public static class LocalStreamStats {
        public LocalAudioStats audioStats;
        public boolean isScreen;
        public int rxQuality;
        public int txQuality;
        public LocalVideoStats videoStats;

        static {
            Covode.recordClassIndex(101028);
        }

        public LocalStreamStats() {
        }

        public String toString() {
            return "LocalStreamStats{audioStats=" + this.audioStats + ", videoStats=" + this.videoStats + ", isScreen=" + this.isScreen + ", txQuality=" + this.txQuality + ", rxQuality=" + this.rxQuality + '}';
        }

        public LocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
            LocalAudioStats localAudioStats = new LocalAudioStats(internalLocalStreamStats.audioStats);
            LocalVideoStats localVideoStats = new LocalVideoStats(internalLocalStreamStats.videoStats);
            this.audioStats = localAudioStats;
            this.videoStats = localVideoStats;
            this.isScreen = internalLocalStreamStats.isScreen;
            this.txQuality = internalLocalStreamStats.txQuality;
            this.rxQuality = internalLocalStreamStats.rxQuality;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LocalVideoStats */
    public static class LocalVideoStats {
        public int codecType;
        public int encodedBitrate;
        public int encodedFrameCount;
        public int encodedFrameHeight;
        public int encodedFrameWidth;
        public int encoderOutputFrameRate;
        public int inputFrameRate;
        public boolean isScreen;
        public int rendererOutputFrameRate;
        public int rtt;
        public int sentFrameRate;
        public float sentKBitrate;
        public int statsInterval;
        public int targetFrameRate;
        public int targetKBitrate;
        public float videoLossRate;

        static {
            Covode.recordClassIndex(101029);
        }

        public LocalVideoStats() {
        }

        public String toString() {
            return "LocalVideoStats{sentKBitrate='" + this.sentKBitrate + '\'' + ", inputFrameRate='" + this.inputFrameRate + '\'' + ", sentFrameRate='" + this.sentFrameRate + '\'' + ", encoderOutputFrameRate='" + this.encoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", targetKBitrate='" + this.targetKBitrate + '\'' + ", targetFrameRate='" + this.targetFrameRate + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", rtt='" + this.rtt + '\'' + ", encodedBitrate='" + this.encodedBitrate + '\'' + ", encodedFrameWidth='" + this.encodedFrameWidth + '\'' + ", encodedFrameHeight='" + this.encodedFrameHeight + '\'' + ", encodedFrameCount='" + this.encodedFrameCount + '\'' + ", codecType='" + this.codecType + '\'' + ", isScreen='" + this.isScreen + '\'' + '}';
        }

        public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
            this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
            this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
            this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
            this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
            this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
            this.targetKBitrate = internalLocalVideoStats.targetKBitrate;
            this.targetFrameRate = internalLocalVideoStats.targetFrameRate;
            this.statsInterval = internalLocalVideoStats.statsInterval;
            this.videoLossRate = internalLocalVideoStats.videoLossRate;
            this.rtt = internalLocalVideoStats.rtt;
            this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
            this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
            this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
            this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
            this.codecType = internalLocalVideoStats.codecType;
            this.isScreen = internalLocalVideoStats.isScreen;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LocalVideoStreamError */
    public enum LocalVideoStreamError {
        LOCAL_VIDEO_STREAM_ERROR_OK(0),
        LOCAL_VIDEO_STREAM_ERROR_FAILURE(1),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_BUSY(3),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_NOT_FOUND(4),
        LOCAL_VIDEO_STREAM_ERROR_CAPTURE_FAILURE(5),
        LOCAL_VIDEO_STREAM_ERROR_ENCODE_FAILURE(6);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101030);
        }

        public static LocalVideoStreamError fromId(int i) {
            LocalVideoStreamError[] values = values();
            for (LocalVideoStreamError localVideoStreamError : values) {
                if (localVideoStreamError.value() == i) {
                    return localVideoStreamError;
                }
            }
            return null;
        }

        private LocalVideoStreamError(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LocalVideoStreamState */
    public enum LocalVideoStreamState {
        LOCAL_VIDEO_STREAM_STATE_STOPPED(0),
        LOCAL_VIDEO_STREAM_STATE_RECORDING(1),
        LOCAL_VIDEO_STREAM_STATE_ENCODING(2),
        LOCAL_VIDEO_STREAM_STATE_FAILED(3);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101031);
        }

        public static LocalVideoStreamState fromId(int i) {
            LocalVideoStreamState[] values = values();
            for (LocalVideoStreamState localVideoStreamState : values) {
                if (localVideoStreamState.value() == i) {
                    return localVideoStreamState;
                }
            }
            return null;
        }

        private LocalVideoStreamState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$MediaDeviceState */
    public static class MediaDeviceState {
        static {
            Covode.recordClassIndex(101034);
        }

        MediaDeviceState() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$MediaDeviceType */
    public static class MediaDeviceType {
        static {
            Covode.recordClassIndex(101035);
        }

        MediaDeviceType() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RTCRoomStats */
    public static class RTCRoomStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rtt;
        public int rxAudioKBitRate;
        public long rxBytes;
        public int rxKBitRate;
        public double rxLostrate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public long txBytes;
        public int txKBitRate;
        public double txLostrate;
        public int txVideoKBitRate;
        public int users;

        static {
            Covode.recordClassIndex(101040);
        }

        public RTCRoomStats() {
        }

        public void reset() {
            this.totalDuration = 0;
            this.txBytes = 0;
            this.rxBytes = 0;
            this.txKBitRate = 0;
            this.rxKBitRate = 0;
            this.txAudioKBitRate = 0;
            this.rxAudioKBitRate = 0;
            this.txVideoKBitRate = 0;
            this.rxVideoKBitRate = 0;
            this.users = 0;
            this.cpuTotalUsage = 0.0d;
            this.cpuAppUsage = 0.0d;
        }

        public String toString() {
            return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + '}';
        }

        public RTCRoomStats(InternalRTCStats internalRTCStats) {
            this.totalDuration = internalRTCStats.totalDuration;
            this.txBytes = (long) internalRTCStats.txBytes;
            this.rxBytes = (long) internalRTCStats.rxBytes;
            this.txKBitRate = internalRTCStats.txKBitRate;
            this.rxKBitRate = internalRTCStats.rxKBitRate;
            this.txAudioKBitRate = internalRTCStats.txAudioKBitRate;
            this.rxAudioKBitRate = internalRTCStats.rxAudioKBitRate;
            this.txVideoKBitRate = internalRTCStats.txVideoKBitRate;
            this.rxVideoKBitRate = internalRTCStats.rxVideoKBitRate;
            this.users = internalRTCStats.users;
            this.cpuTotalUsage = internalRTCStats.cpuTotalUsage;
            this.cpuAppUsage = internalRTCStats.cpuAppUsage;
            this.txLostrate = internalRTCStats.txLostrate;
            this.rxLostrate = internalRTCStats.rxLostrate;
            this.rtt = internalRTCStats.rtt;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteAudioStats */
    public static class RemoteAudioStats {
        public float audioLossRate;
        public int concealedSamples;
        public int concealmentEvent;
        public int decDuration;
        public int decSampleRate;
        public long e2eDelay;
        public int frozenRate;
        public int jitterBufferDelay;
        public int numChannels;
        public int playoutSampleRate;
        public int quality;
        public float receivedKBitrate;
        public int receivedSampleRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public int total_rtt;

        static {
            Covode.recordClassIndex(101041);
        }

        public RemoteAudioStats() {
        }

        public String toString() {
            return "RemoteAudioStats{audioLossRate='" + this.audioLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", playoutSampleRate='" + this.playoutSampleRate + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", rtt='" + this.rtt + '\'' + ", quality='" + this.quality + '\'' + ", jitterBufferDelay='" + this.jitterBufferDelay + '\'' + ", numChannels='" + this.numChannels + '\'' + ", receivedSampleRate='" + this.receivedSampleRate + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", concealedSamples='" + this.concealedSamples + '\'' + ", concealmentEvent='" + this.concealmentEvent + '\'' + ", decSampleRate='" + this.decSampleRate + '\'' + ", decDuration='" + this.decDuration + '\'' + ", total_rtt='" + this.total_rtt + '\'' + '}';
        }

        public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
            this.audioLossRate = internalRemoteAudioStats.audioLossRate;
            this.receivedKBitrate = (float) internalRemoteAudioStats.receivedKBitrate;
            this.stallCount = internalRemoteAudioStats.stallCount;
            this.stallDuration = internalRemoteAudioStats.stallDuration;
            this.e2eDelay = internalRemoteAudioStats.e2eDelay;
            this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
            this.statsInterval = internalRemoteAudioStats.statsInterval;
            this.rtt = internalRemoteAudioStats.rtt;
            this.total_rtt = internalRemoteAudioStats.total_rtt;
            this.quality = internalRemoteAudioStats.quality;
            this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
            this.numChannels = internalRemoteAudioStats.numChannels;
            this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
            this.frozenRate = internalRemoteAudioStats.frozenRate;
            this.concealedSamples = internalRemoteAudioStats.concealedSamples;
            this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
            this.decSampleRate = internalRemoteAudioStats.decSampleRate;
            this.decDuration = internalRemoteAudioStats.decDuration;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteStreamStats */
    public static class RemoteStreamStats {
        public RemoteAudioStats audioStats;
        public boolean isScreen;
        public int rxQuality;
        public int txQuality;
        public String uid;
        public RemoteVideoStats videoStats;

        static {
            Covode.recordClassIndex(101042);
        }

        public RemoteStreamStats() {
        }

        public String toString() {
            return "RemoteStreamStats{uid='" + this.uid + '\'' + ", audioStats=" + this.audioStats + ", videoStats=" + this.videoStats + ", isScreen=" + this.isScreen + ", txQuality=" + this.txQuality + ", rxQuality=" + this.rxQuality + '}';
        }

        public RemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
            RemoteAudioStats remoteAudioStats = new RemoteAudioStats(internalRemoteStreamStats.audioStats);
            RemoteVideoStats remoteVideoStats = new RemoteVideoStats(internalRemoteStreamStats.videoStats);
            this.audioStats = remoteAudioStats;
            this.videoStats = remoteVideoStats;
            this.uid = internalRemoteStreamStats.uid;
            this.isScreen = internalRemoteStreamStats.isScreen;
            this.rxQuality = internalRemoteStreamStats.rxQuality;
            this.txQuality = internalRemoteStreamStats.txQuality;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteStreamSwitch */
    public static class RemoteStreamSwitch {
        public boolean after_enable;
        public int after_video_index;
        public boolean before_enable;
        public int before_video_index;
        public boolean isScreen;
        public FallbackOrRecoverReason reason;
        public String uid;

        static {
            Covode.recordClassIndex(101043);
        }

        public RemoteStreamSwitch() {
        }

        public String toString() {
            return "RemoteStreamSwitch{uid='" + this.uid + '\'' + ", isScreen='" + this.isScreen + '\'' + ", before_video_index='" + this.before_video_index + '\'' + ", after_video_index='" + this.after_video_index + '\'' + ", before_enable='" + this.before_enable + '\'' + ", after_enable='" + this.after_enable + '\'' + ", reason='" + this.reason + '\'' + '}';
        }

        public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
            this.uid = internalRemoteStreamSwitch.uid;
            this.before_video_index = internalRemoteStreamSwitch.before_video_index;
            this.after_video_index = internalRemoteStreamSwitch.after_video_index;
            this.before_enable = internalRemoteStreamSwitch.before_enable;
            this.after_enable = internalRemoteStreamSwitch.after_enable;
            this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
        }

        private FallbackOrRecoverReason getFallbackOrRecoverReason(int i) {
            switch (i) {
                case 0:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH;
                case 1:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE;
                case 2:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH;
                case 3:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE;
                case 4:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE;
                default:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_UNKNOWN;
            }
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteVideoState */
    public enum RemoteVideoState {
        REMOTE_VIDEO_STATE_STOPPED(0),
        REMOTE_VIDEO_STATE_STARTING(1),
        REMOTE_VIDEO_STATE_DECODING(2),
        REMOTE_VIDEO_STATE_FROZEN(3),
        REMOTE_VIDEO_STATE_FAILED(4);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101044);
        }

        public static RemoteVideoState fromId(int i) {
            RemoteVideoState[] values = values();
            for (RemoteVideoState remoteVideoState : values) {
                if (remoteVideoState.value() == i) {
                    return remoteVideoState;
                }
            }
            return null;
        }

        private RemoteVideoState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteVideoStateChangeReason */
    public enum RemoteVideoStateChangeReason {
        REMOTE_VIDEO_STATE_CHANGE_REASON_INTERNAL(0),
        REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
        REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
        REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
        REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101045);
        }

        public static RemoteVideoStateChangeReason fromId(int i) {
            RemoteVideoStateChangeReason[] values = values();
            for (RemoteVideoStateChangeReason remoteVideoStateChangeReason : values) {
                if (remoteVideoStateChangeReason.value() == i) {
                    return remoteVideoStateChangeReason;
                }
            }
            return null;
        }

        private RemoteVideoStateChangeReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RemoteVideoStats */
    public static class RemoteVideoStats {
        public int decoderOutputFrameRate;
        public long e2eDelay;
        public int frozenRate;
        public int height;
        public boolean isScreen;
        public float receivedKBitrate;
        public int rendererOutputFrameRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public int videoIndex;
        public float videoLossRate;
        public int width;

        static {
            Covode.recordClassIndex(101046);
        }

        public RemoteVideoStats() {
        }

        public String toString() {
            return "RemoteVideoStats{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", decoderOutputFrameRate='" + this.decoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", isScreen='" + this.isScreen + '\'' + ", rtt='" + this.rtt + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", videoIndex='" + this.videoIndex + '\'' + '}';
        }

        public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
            this.width = internalRemoteVideoStats.width;
            this.height = internalRemoteVideoStats.height;
            this.videoLossRate = internalRemoteVideoStats.videoLossRate;
            this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
            this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
            this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
            this.stallCount = internalRemoteVideoStats.stallCount;
            this.e2eDelay = internalRemoteVideoStats.e2eDelay;
            this.isScreen = internalRemoteVideoStats.isScreen;
            this.statsInterval = internalRemoteVideoStats.statsInterval;
            this.rtt = internalRemoteVideoStats.rtt;
            this.frozenRate = internalRemoteVideoStats.frozenRate;
            this.videoIndex = internalRemoteVideoStats.videoIndex;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$SourceWantedData */
    public static class SourceWantedData {
        public int frameRate;
        public int height;
        public int width;

        static {
            Covode.recordClassIndex(101049);
        }

        public SourceWantedData() {
        }

        public String toString() {
            return "SourceWantedData{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", frameRate='" + this.frameRate + '\'' + '}';
        }

        public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
            this.width = internalSourceWantedData.width;
            this.height = internalSourceWantedData.height;
            this.frameRate = internalSourceWantedData.frameRate;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$PerformanceAlarmMode */
    public enum PerformanceAlarmMode {
        PERFORMANCE_ALARM_MODE_NORMAL,
        PERFORMANCE_ALARM_MODE_SIMULCAST;

        static {
            Covode.recordClassIndex(101037);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$PerformanceAlarmReason */
    public enum PerformanceAlarmReason {
        PERFORMANCE_ALARM_REASON_BANDWIDTH_FALLBACKED,
        PERFORMANCE_ALARM_REASON_BANDWIDTH_RESUMED,
        PERFORMANCE_ALARM_REASON_PERFORMANCE_FALLBACKED,
        PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;

        static {
            Covode.recordClassIndex(101038);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$RtcUser */
    public static class RtcUser {
        public String metaData;
        public String userId;

        static {
            Covode.recordClassIndex(101048);
        }

        public String toString() {
            return "RtcUser{uid='" + this.userId + '\'' + ", metaData='" + this.metaData + '\'' + '}';
        }

        public RtcUser(InternalRTCUser internalRTCUser) {
            this.userId = internalRTCUser.userId;
            this.metaData = internalRTCUser.metaData;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$LogLevel */
    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR;

        static {
            Covode.recordClassIndex(101032);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$StreamRemoveReason */
    public enum StreamRemoveReason {
        STREAM_REMOVE_REASON_UNPUBLISH,
        STREAM_REMOVE_REASON_PUBLISH_FAILED,
        STREAM_REMOVE_REASON_KEEP_LIVE_FAILED,
        STREAM_REMOVE_REASON_CLIENT_DISCONNECTED,
        STREAM_REMOVE_REASON_REPUBLISH,
        STREAM_REMOVE_REASON_OTHER;

        static {
            Covode.recordClassIndex(101050);
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$ErrorCode */
    public class ErrorCode {
        static {
            Covode.recordClassIndex(101023);
        }

        ErrorCode() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$NetworkQuality */
    public class NetworkQuality {
        static {
            Covode.recordClassIndex(101036);
        }

        NetworkQuality() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$ProviderEvent */
    public class ProviderEvent {
        static {
            Covode.recordClassIndex(101039);
        }

        ProviderEvent() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$TranscodingError */
    public class TranscodingError {
        static {
            Covode.recordClassIndex(101051);
        }

        TranscodingError() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$UserMessageSendResult */
    public class UserMessageSendResult {
        static {
            Covode.recordClassIndex(101052);
        }

        public UserMessageSendResult() {
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IRTCEngineEventHandler$AudioVolumeInfo */
    public static class AudioVolumeInfo {
        public String uid;
        public int volume;

        static {
            Covode.recordClassIndex(101021);
        }

        public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
            this.uid = internalAudioVolumeInfo.uid;
            this.volume = internalAudioVolumeInfo.volume;
        }

        public AudioVolumeInfo(String str, int i) {
            this.uid = str;
            this.volume = i;
        }
    }
}
