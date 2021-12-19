package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.GameRTCEngineImpl;
import com.p2082ss.bytertc.engine.InternalGameAudioVolumeInfo;
import com.p2082ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bytertc.engine.handler.GameRTCEventHandler */
public class GameRTCEventHandler {
    private WeakReference<GameRTCEngineImpl> mGameRTCEngineImpl;

    static {
        Covode.recordClassIndex(101008);
    }

    /* renamed from: com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m147872xe093e3b(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void onAudioDevicePlayoutStart() {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioDevicePlayoutStart...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioDevicePlayoutStart();
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioDevicePlayoutStart callback catch exception.\n" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void onAudioDevicePlayoutStop() {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioDevicePlayoutStop...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioDevicePlayoutStop();
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioDevicePlayoutStop callback catch exception.\n" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void onAudioDeviceRecordStart() {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioDeviceRecordStart...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioDeviceRecordStart();
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioDeviceRecordStart callback catch exception.\n" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void onAudioDeviceRecordStop() {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioDeviceRecordStop...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioDeviceRecordStop();
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioDeviceRecordStop callback catch exception.\n" + e.getMessage());
        }
    }

    public GameRTCEventHandler(GameRTCEngineImpl gameRTCEngineImpl) {
        this.mGameRTCEngineImpl = new WeakReference<>(gameRTCEngineImpl);
    }

    private IGameRTCEventHandler.UserLeaveReasonType ConvertIntToUserLeaveReasonType(int i) {
        if (i == 0) {
            return IGameRTCEventHandler.UserLeaveReasonType.QUIT;
        }
        if (i != 1) {
            return IGameRTCEventHandler.UserLeaveReasonType.INVALID;
        }
        return IGameRTCEventHandler.UserLeaveReasonType.DROPPED;
    }

    private IGameRTCEventHandler.JoinRoomErrorCode ConvertIntToJoinRoomErrorCode(int i) {
        if (i == -2001) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_FAILED;
        }
        if (i == -1001) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_ERROR;
        }
        if (i != -1000) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_SUCCESS;
        }
        return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_INVALID_TOKEN;
    }

    private IGameRTCEventHandler.ConnectionState ConvertIntToConnectionState(int i) {
        if (i == 0) {
            return IGameRTCEventHandler.ConnectionState.DISCONNECTED;
        }
        if (i == 1) {
            return IGameRTCEventHandler.ConnectionState.CONNECTING;
        }
        if (i == 2) {
            return IGameRTCEventHandler.ConnectionState.CONNECTED;
        }
        if (i == 3) {
            return IGameRTCEventHandler.ConnectionState.RECONNECTING;
        }
        if (i == 4) {
            return IGameRTCEventHandler.ConnectionState.RECONNECTED;
        }
        if (i != 5) {
            return IGameRTCEventHandler.ConnectionState.INVALID;
        }
        return IGameRTCEventHandler.ConnectionState.LOST;
    }

    private IGameRTCEventHandler.EngineWarnCode ConvertIntToEngineWarnCode(int i) {
        switch (i) {
            case -5006:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_NO_PLAYOUT_DEVICE;
            case -5005:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_NO_RECORDING_DEVICE;
            case -5004:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_PLAYOUT_START_FAIL;
            case -5003:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_RECORDING_START_FAIL;
            case -5002:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_NO_MICROPHONE_PERMISSION;
            default:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_INVALID;
        }
    }

    private IGameRTCEventHandler.NetworkQuality ConvertIntToNetworkQuality(int i) {
        if (i == 0) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_UNKNOWN;
        }
        if (i == 1) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_EXCELLENT;
        }
        if (i == 2) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_GOOD;
        }
        if (i == 3) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_POOR;
        }
        if (i == 4) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_BAD;
        }
        if (i != 5) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_INVALID;
        }
        return IGameRTCEventHandler.NetworkQuality.QUALITY_VBAD;
    }

    private IGameRTCEventHandler.RoomErrorCode ConvertIntToRoomErrorCode(int i) {
        switch (i) {
            case -1004:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_DUPLICATE_LOGIN;
            case -1003:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_NO_SUBSCRIBE_PERMISSION;
            case -1002:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_NO_PUBLISH_PERMISSION;
            case -1001:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_JOIN_ROOM_ERROR;
            case -1000:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_INVALID_TOKEN;
            default:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_INVALID;
        }
    }

    private IGameRTCEventHandler.RoomWarnCode ConvertIntToRoomWarnCode(int i) {
        if (i == -2007) {
            return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_INVALID_EXPECT_MS_ADDR;
        }
        switch (i) {
            case -2004:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_SUBSCRIBE_STREAM_FAILED_5XX;
            case -2003:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_SUBSCRIBE_STREAM_FAILED_404;
            case -2002:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_PUBLISH_STREAM_FAILED;
            case -2001:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_JOIN_ROOM_FAILED;
            default:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_INVALID;
        }
    }

    public void onConnectionStateChanged(int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onConnectionStateChanged...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onConnectionStateChanged(ConvertIntToConnectionState(i));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onConnectionStateChanged GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onConnectionStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onEngineWarning(int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onEngineWarning...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onEngineWarning(ConvertIntToEngineWarnCode(i));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onEngineWarning GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onEngineWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLeaveRoom(String str) {
        LogUtil.m147885d("GameRTCEventHandler", "onLeaveRoom...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onLeaveRoom(str);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onLeaveRoom GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onLeaveRoom callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomError(String str, int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onRoomError...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onRoomError(str, ConvertIntToRoomErrorCode(i));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onRoomError GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onRoomError callback catch exception.\n" + e.getMessage());
        }
    }

    public void onRoomWarning(String str, int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onRoomWarning...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onRoomWarning(str, ConvertIntToRoomWarnCode(i));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onRoomWarning GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onRoomWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserJoined(String str, String str2) {
        LogUtil.m147885d("GameRTCEventHandler", "onUserJoined...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onUserJoined(str, str2);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onUserJoined GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onUserJoined callback catch exception.\n" + e.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        LogUtil.m147885d("GameRTCEventHandler", "onLogReport...");
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                        GameRTCEngineImpl.getGameRTCEventHandler().onLogReport(str, jSONObject);
                    } else {
                        m147872xe093e3b("GameRTCEventHandler", "GameRTCEngineImpl.getGameRTCEventHandler() == null");
                    }
                    try {
                        if ("rtc_media_statistics".equals(jSONObject.getString("event_key")) || "rtc_transport_statistics".equals(jSONObject.getString("event_key")) || "rtc_statistics".equals(jSONObject.getString("event_key"))) {
                            return;
                        }
                    } catch (JSONException e) {
                        LogUtil.m147885d("GameRTCEventHandler", "onLogReport...get event_key catch exception: " + e.getMessage());
                        return;
                    }
                } catch (JSONException e2) {
                    LogUtil.m147885d("GameRTCEventHandler", "onLogReport...parse json catch exception: " + e2.getMessage());
                    return;
                }
            }
            LogUtil.m147888i(str, str2);
        } catch (Exception e3) {
            LogUtil.m147885d("GameRTCEventHandler", "onLogReport callback catch exception.\n" + e3.getMessage());
        }
    }

    public void onAudioSendEnabled(String str, String str2, boolean z) {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioSendEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioSendEnabled(str, str2, z);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onAudioSendEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioSendEnabled callback catch exception.\n" + e.getMessage());
        }
    }

    public void onMicrophoneEnabled(String str, String str2, boolean z) {
        LogUtil.m147885d("GameRTCEventHandler", "onMicrophoneEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onMicrophoneEnabled(str, str2, z);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onMicrophoneEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onMicrophoneEnabled callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSpeakerphoneEnabled(String str, String str2, boolean z) {
        LogUtil.m147885d("GameRTCEventHandler", "onSpeakerphoneEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onSpeakerphoneEnabled(str, str2, z);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onSpeakerphoneEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onSpeakerphoneEnabled callback catch exception.\n" + e.getMessage());
        }
    }

    public void onUserLeave(String str, String str2, int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onUserOffline...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onUserLeave(str, str2, ConvertIntToUserLeaveReasonType(i));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onUserLeave GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onUserOffline callback catch exception.\n" + e.getMessage());
        }
    }

    public void onAudioVolumeIndication(String str, InternalGameAudioVolumeInfo[] internalGameAudioVolumeInfoArr, int i) {
        LogUtil.m147885d("GameRTCEventHandler", "onAudioVolumeIndication...");
        try {
            IGameRTCEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IGameRTCEventHandler.AudioVolumeInfo[internalGameAudioVolumeInfoArr.length];
            String[] strArr = new String[internalGameAudioVolumeInfoArr.length];
            int[] iArr = new int[internalGameAudioVolumeInfoArr.length];
            for (int i2 = 0; i2 < internalGameAudioVolumeInfoArr.length; i2++) {
                audioVolumeInfoArr[i2] = new IGameRTCEventHandler.AudioVolumeInfo(internalGameAudioVolumeInfoArr[i2]);
                strArr[i2] = internalGameAudioVolumeInfoArr[i2].userId;
                iArr[i2] = internalGameAudioVolumeInfoArr[i2].volume;
            }
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioVolumeIndication(str, new IGameRTCEventHandler.AudioVolumeInfoArray(strArr, iArr), i);
                return;
            }
            m147872xe093e3b("GameRTCEventHandler", "onAudioVolumeIndication GameRTCEngineImpl.getGameRTCEventHandler() == null");
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e.getMessage());
        }
    }

    public void onNetworkQuality(String str, String str2, int i, int i2) {
        LogUtil.m147885d("GameRTCEventHandler", "onNetworkQuality...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onNetworkQuality(str, str2, ConvertIntToNetworkQuality(i), ConvertIntToNetworkQuality(i2));
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onNetworkQuality GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onNetworkQuality callback catch exception.\n" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void onJoinRoomResult(String str, String str2, int i, boolean z, int i2) {
        LogUtil.m147885d("GameRTCEventHandler", "onJoinRoomResult...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onJoinRoomResult(str, str2, ConvertIntToJoinRoomErrorCode(i), z, i2);
            } else {
                m147872xe093e3b("GameRTCEventHandler", "onJoinRoomResult GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e) {
            LogUtil.m147885d("GameRTCEventHandler", "onJoinRoomResult callback catch exception.\n" + e.getMessage());
        }
    }
}
