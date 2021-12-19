package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.InternalGameAudioVolumeInfo;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import org.json.JSONObject;

/* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler */
public interface IGameRTCEventHandler {
    static {
        Covode.recordClassIndex(101009);
    }

    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();

    void onAudioSendEnabled(String str, String str2, boolean z);

    void onAudioVolumeIndication(String str, AudioVolumeInfoArray audioVolumeInfoArray, int i);

    void onConnectionStateChanged(ConnectionState connectionState);

    void onEngineWarning(EngineWarnCode engineWarnCode);

    void onJoinRoomResult(String str, String str2, JoinRoomErrorCode joinRoomErrorCode, boolean z, int i);

    void onLeaveRoom(String str);

    void onLogReport(String str, JSONObject jSONObject);

    void onLoggerMessage(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th);

    void onMicrophoneEnabled(String str, String str2, boolean z);

    void onNetworkQuality(String str, String str2, NetworkQuality networkQuality, NetworkQuality networkQuality2);

    void onRoomError(String str, RoomErrorCode roomErrorCode);

    void onRoomWarning(String str, RoomWarnCode roomWarnCode);

    void onSpeakerphoneEnabled(String str, String str2, boolean z);

    void onUserJoined(String str, String str2);

    void onUserLeave(String str, String str2, UserLeaveReasonType userLeaveReasonType);

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$AudioVolumeInfoArray */
    public static class AudioVolumeInfoArray {
        public String[] userNames;
        public int[] volumes;

        static {
            Covode.recordClassIndex(101011);
        }

        public String[] getUserNames() {
            return this.userNames;
        }

        public int[] getVolumes() {
            return this.volumes;
        }

        public AudioVolumeInfoArray(String[] strArr, int[] iArr) {
            this.userNames = strArr;
            this.volumes = iArr;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$ConnectionState */
    public enum ConnectionState {
        INVALID(-1),
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        RECONNECTING(3),
        RECONNECTED(4),
        LOST(5);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101012);
        }

        private ConnectionState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$EngineWarnCode */
    public enum EngineWarnCode {
        ENGINE_WARN_INVALID(-1),
        ENGINE_WARN_NO_MICROPHONE_PERMISSION(-5002),
        ENGINE_WARN_ADM_RECORDING_START_FAIL(-5003),
        ENGINE_WARN_ADM_PLAYOUT_START_FAIL(-5004),
        ENGINE_WARN_ADM_NO_RECORDING_DEVICE(-5005),
        ENGINE_WARN_ADM_NO_PLAYOUT_DEVICE(-5006);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101013);
        }

        private EngineWarnCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$JoinRoomErrorCode */
    public enum JoinRoomErrorCode {
        JOIN_ROOM_SUCCESS(0),
        JOIN_ROOM_INVALID_TOKEN(-1000),
        JOIN_ROOM_ERROR(-1001),
        JOIN_ROOM_FAILED(-2001);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101014);
        }

        private JoinRoomErrorCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$NetworkQuality */
    public enum NetworkQuality {
        QUALITY_INVALID(-1),
        QUALITY_UNKNOWN(0),
        QUALITY_EXCELLENT(1),
        QUALITY_GOOD(2),
        QUALITY_POOR(3),
        QUALITY_BAD(4),
        QUALITY_VBAD(5);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101015);
        }

        private NetworkQuality(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$RoomErrorCode */
    public enum RoomErrorCode {
        ROOM_ERROR_INVALID(-1),
        ROOM_ERROR_INVALID_TOKEN(-1000),
        ROOM_ERROR_JOIN_ROOM_ERROR(-1001),
        ROOM_ERROR_NO_PUBLISH_PERMISSION(-1002),
        ROOM_ERROR_NO_SUBSCRIBE_PERMISSION(-1003),
        ROOM_ERROR_DUPLICATE_LOGIN(-1004);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101016);
        }

        private RoomErrorCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$RoomWarnCode */
    public enum RoomWarnCode {
        ROOM_WARN_INVALID(-1),
        ROOM_WARN_JOIN_ROOM_FAILED(-2001),
        ROOM_WARN_PUBLISH_STREAM_FAILED(-2002),
        ROOM_WARN_SUBSCRIBE_STREAM_FAILED_404(-2003),
        ROOM_WARN_SUBSCRIBE_STREAM_FAILED_5XX(-2004),
        ROOM_WARN_INVALID_EXPECT_MS_ADDR(-2007);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101017);
        }

        private RoomWarnCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$UserLeaveReasonType */
    public enum UserLeaveReasonType {
        INVALID(-1),
        QUIT(0),
        DROPPED(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101018);
        }

        private UserLeaveReasonType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.handler.IGameRTCEventHandler$AudioVolumeInfo */
    public static class AudioVolumeInfo {
        public String userId;
        public int volume;

        static {
            Covode.recordClassIndex(101010);
        }

        public AudioVolumeInfo(InternalGameAudioVolumeInfo internalGameAudioVolumeInfo) {
            this.userId = internalGameAudioVolumeInfo.userId;
            this.volume = internalGameAudioVolumeInfo.volume;
        }

        public AudioVolumeInfo(String str, int i) {
            this.userId = str;
            this.volume = i;
        }
    }
}
