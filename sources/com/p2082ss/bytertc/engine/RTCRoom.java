package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p2082ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p2082ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.bytertc.engine.RTCRoom */
public class RTCRoom extends IRTCRoom {
    private boolean mEnableTranscode;
    private LiveTranscoding mLiveTranscoding;
    private long mNativeRtcRoom;
    private long mNativeRtcRoomEventHandler;
    private String mRoom;
    private WeakReference<RTCEngineImpl> mRtcEngine;
    private RTCRoomEventHandler mRtcRoomEventHandler;
    private IRTCRoomEventHandler mRtcRoomHandler;
    private String mUser;

    static {
        Covode.recordClassIndex(100937);
    }

    /* renamed from: com_ss_bytertc_engine_RTCRoom_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147866xaf23457a(String str, String str2) {
        return 0;
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void publishScreen() {
        MethodCollector.m26663i(306);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, publishScreen failed.");
            MethodCollector.m26664o(306);
            return;
        }
        NativeRTCRoomFunctions.nativePublishScreen(j);
        MethodCollector.m26664o(306);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void unpublishScreen() {
        MethodCollector.m26663i(308);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, unpublishScreen failed.");
            MethodCollector.m26664o(308);
            return;
        }
        NativeRTCRoomFunctions.nativeUnpublishScreen(j);
        MethodCollector.m26664o(308);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void destroy() {
        MethodCollector.m26663i(489);
        LogUtil.m147885d("RtcRoom", "Destroy ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, Destroy failed.");
            MethodCollector.m26664o(489);
            return;
        }
        NativeRTCRoomFunctions.nativeDestory(j);
        this.mNativeRtcRoom = 0;
        NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(this.mNativeRtcRoomEventHandler);
        this.mNativeRtcRoomEventHandler = 0;
        MethodCollector.m26664o(489);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void leaveRoom() {
        MethodCollector.m26663i(263);
        LogUtil.m147885d("RtcRoom", "leaveChannel");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
            MethodCollector.m26664o(263);
            return;
        }
        this.mRoom = "";
        this.mUser = "";
        NativeRTCRoomFunctions.nativeLeaveRoom(j);
        MethodCollector.m26664o(263);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void publish() {
        MethodCollector.m26663i(300);
        LogUtil.m147885d("RtcRoom", "Publish");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, Publish failed.");
            MethodCollector.m26664o(300);
            return;
        }
        NativeRTCRoomFunctions.nativePublish(j);
        MethodCollector.m26664o(300);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void stopLiveTranscoding() {
        MethodCollector.m26663i(356);
        LogUtil.m147885d("RtcRoom", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, disableLiveTranscoding failed.");
            MethodCollector.m26664o(356);
            return;
        }
        NativeRTCRoomFunctions.nativeStopLiveTranscoding(j);
        MethodCollector.m26664o(356);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void unpublish() {
        MethodCollector.m26663i(303);
        LogUtil.m147885d("RtcRoom", "Unpublish");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, Unpublish failed.");
            MethodCollector.m26664o(303);
            return;
        }
        NativeRTCRoomFunctions.nativeUnpublish(j);
        MethodCollector.m26664o(303);
    }

    /* renamed from: com.ss.bytertc.engine.RTCRoom$1 */
    static /* synthetic */ class C860811 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        static {
            /*
                r0 = 100938(0x18a4a, float:1.41444E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.RTCEngine$ClientRole[] r0 = com.p2082ss.bytertc.engine.RTCEngine.ClientRole.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole = r1
                r3 = 1
                com.ss.bytertc.engine.RTCEngine$ClientRole r0 = com.p2082ss.bytertc.engine.RTCEngine.ClientRole.CLIENT_ROLE_SILENT_AUDIENCE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r2 = 2
                int[] r1 = com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.RTCEngine$ClientRole r0 = com.p2082ss.bytertc.engine.RTCEngine.ClientRole.CLIENT_ROLE_BROADCASTER     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                com.ss.bytertc.engine.RTCEngine$ChannelProfile[] r0 = com.p2082ss.bytertc.engine.RTCEngine.ChannelProfile.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile = r1
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.p2082ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_GAME     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r1 = com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.p2082ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.p2082ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_COMMUNICATION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = com.p2082ss.bytertc.engine.RTCRoom.C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.p2082ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.RTCRoom.C860811.<clinit>():void");
        }
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void enableSubscribeLocalStream(boolean z) {
        MethodCollector.m26663i(317);
        LogUtil.m147885d("RtcRoom", "enableSubscribeLocalStream: ".concat(String.valueOf(z)));
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
            MethodCollector.m26664o(317);
            return;
        }
        NativeRTCRoomFunctions.nativeEnableSubscribeLocalStream(j, z);
        MethodCollector.m26664o(317);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void muteAllRemoteAudio(MuteState muteState) {
        MethodCollector.m26663i(337);
        LogUtil.m147885d("RtcRoom", "muteAllRemoteAudio...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteAudio failed.");
            MethodCollector.m26664o(337);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteAllRemoteAudio(j, muteState.value());
        MethodCollector.m26664o(337);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void muteAllRemoteVideo(MuteState muteState) {
        boolean z;
        MethodCollector.m26663i(471);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcRoom", "muteAllRemoteVideoStreams ,is muted:".concat(String.valueOf(z)));
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteVideoStreams failed.");
            MethodCollector.m26664o(471);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteAllRemoteVideo(j, muteState.value());
        MethodCollector.m26664o(471);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void sendRoomBinaryMessage(byte[] bArr) {
        MethodCollector.m26663i(296);
        LogUtil.m147885d("RtcRoom", "SendRoomBinaryMessage ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SendRoomBinaryMessage failed.");
            MethodCollector.m26664o(296);
            return;
        }
        NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j, bArr);
        MethodCollector.m26664o(296);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void sendRoomMessage(String str) {
        MethodCollector.m26663i(293);
        LogUtil.m147885d("RtcRoom", "SendRoomMessage ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SendRoomMessage failed.");
            MethodCollector.m26664o(293);
            return;
        }
        NativeRTCRoomFunctions.nativeSendRoomMessage(j, str);
        MethodCollector.m26664o(293);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setAudioVolumeIndicationInterval(int i) {
        MethodCollector.m26663i(333);
        LogUtil.m147885d("RtcRoom", "setAudioVolumeIndicationInterval voiderval: ".concat(String.valueOf(i)));
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, setAudioVolumeIndicationInterval failed.");
            MethodCollector.m26664o(333);
            return;
        }
        NativeRTCRoomFunctions.nativeSetAudioVolumeIndicationInterval(j, i);
        MethodCollector.m26664o(333);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setCustomUserRole(String str) {
        MethodCollector.m26663i(481);
        LogUtil.m147885d("RtcRoom", "SetCustomUserRole ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SetCustomUserRole failed.");
            MethodCollector.m26664o(481);
            return;
        }
        NativeRTCRoomFunctions.nativeSetCustomUserRole(j, str);
        MethodCollector.m26664o(481);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        MethodCollector.m26663i(262);
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native room is invalid, setRTCRoomEventHandler failed.");
            MethodCollector.m26664o(262);
            return;
        }
        this.mRtcRoomHandler = iRTCRoomEventHandler;
        RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this);
        this.mRtcRoomEventHandler = rTCRoomEventHandler;
        long j = this.mNativeRtcRoomEventHandler;
        this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
        if (j != 0) {
            NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
        }
        MethodCollector.m26664o(262);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setUserRole(RTCEngine.ClientRole clientRole) {
        MethodCollector.m26663i(268);
        LogUtil.m147885d("RtcRoom", "setClientRole. role : ".concat(String.valueOf(clientRole)));
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, setClientRole failed.");
            MethodCollector.m26664o(268);
            return;
        }
        int i = C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole[clientRole.ordinal()];
        int i2 = 1;
        if (i == 1 || i != 2) {
            i2 = 2;
        }
        NativeRTCRoomFunctions.nativeSetUserRole(this.mNativeRtcRoom, i2);
        MethodCollector.m26664o(268);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void updateToken(String str) {
        MethodCollector.m26663i(271);
        LogUtil.m147885d("RtcRoom", "updateToken. token : ".concat(String.valueOf(str)));
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, updateToken failed.");
            MethodCollector.m26664o(271);
            return;
        }
        NativeRTCRoomFunctions.nativeUpdateToken(j, str);
        MethodCollector.m26664o(271);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        MethodCollector.m26663i(362);
        LogUtil.m147885d("RtcRoom", "updateLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m147885d("RtcRoom", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
            MethodCollector.m26664o(362);
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, updateLiveTranscoding failed.");
            MethodCollector.m26664o(362);
        } else {
            liveTranscoding.setAction("layoutChanged");
            String jSONObject = liveTranscoding.getTranscodeMessage().toString();
            LogUtil.m147885d("RtcRoom", "updateLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeRTCRoomFunctions.nativeUpdateLiveTranscoding(this.mNativeRtcRoom, jSONObject);
            MethodCollector.m26664o(362);
        }
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void unsubscribe(String str, boolean z) {
        MethodCollector.m26663i(314);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, Unsubscribe failed.");
            MethodCollector.m26664o(314);
            return;
        }
        NativeRTCRoomFunctions.nativeUnsubscribe(j, str, z);
        MethodCollector.m26664o(314);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void muteRemoteAudio(String str, MuteState muteState) {
        MethodCollector.m26663i(339);
        LogUtil.m147885d("RtcRoom", "MuteRemoteAudio...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, MuteRemoteAudio failed.");
            MethodCollector.m26664o(339);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteRemoteAudio(j, str, muteState.value());
        MethodCollector.m26664o(339);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void sendUserBinaryMessage(String str, byte[] bArr) {
        MethodCollector.m26663i(292);
        LogUtil.m147885d("RtcRoom", "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SendUserBinaryMessage failed.");
            MethodCollector.m26664o(292);
            return;
        }
        NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j, str, bArr);
        MethodCollector.m26664o(292);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void sendUserMessage(String str, String str2) {
        MethodCollector.m26663i(280);
        LogUtil.m147885d("RtcRoom", "SendUserMessage. uid : " + str + ", message" + str2);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SendUserMessage failed.");
            MethodCollector.m26664o(280);
            return;
        }
        NativeRTCRoomFunctions.nativeSendUserMessage(j, str, str2);
        MethodCollector.m26664o(280);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setAutoSubscribe(RTCEngine.SubscribeMode subscribeMode, RTCEngine.SubscribeMode subscribeMode2) {
        MethodCollector.m26663i(484);
        LogUtil.m147885d("RtcRoom", "SetAutoSubscribe ");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SetAutoSubscribe failed.");
            MethodCollector.m26664o(484);
            return;
        }
        NativeRTCRoomFunctions.nativeSetAutoSubscribe(j, subscribeMode.value(), subscribeMode2.value());
        MethodCollector.m26664o(484);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void subscribe(String str, SubscribeConfig subscribeConfig) {
        MethodCollector.m26663i(312);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, Subscribe failed.");
            MethodCollector.m26664o(312);
            return;
        }
        NativeRTCRoomFunctions.nativeSubscribe(j, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
        MethodCollector.m26664o(312);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void muteRemoteVideo(String str, MuteState muteState) {
        boolean z;
        MethodCollector.m26663i(478);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.m147885d("RtcRoom", "muteRemoteVideoStream, uid: " + str + " ,is muted:" + z);
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, MuteRemoteVideoStream failed.");
            MethodCollector.m26664o(478);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteRemoteVideo(j, str, muteState.value());
        MethodCollector.m26664o(478);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        MethodCollector.m26663i(465);
        LogUtil.m147885d("RtcRoom", "SetupRemoteScreenRender...");
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SetupRemoteScreen failed.");
            MethodCollector.m26664o(465);
            return -1;
        }
        RTCEngineImpl rTCEngineImpl = this.mRtcEngine.get();
        if (rTCEngineImpl != null) {
            int nativeSetupRemoteVideoSink = NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, rTCEngineImpl.getVideoSinkTask()), str, true);
            MethodCollector.m26664o(465);
            return nativeSetupRemoteVideoSink;
        }
        int nativeSetupRemoteVideoSink2 = NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, null), str, true);
        MethodCollector.m26664o(465);
        return nativeSetupRemoteVideoSink2;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        MethodCollector.m26663i(455);
        LogUtil.m147885d("RtcRoom", "SetupRemoteScreen...");
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SetupRemoteVideoRender failed.");
            MethodCollector.m26664o(455);
            return -1;
        }
        RTCEngineImpl rTCEngineImpl = this.mRtcEngine.get();
        if (rTCEngineImpl != null) {
            int nativeSetupRemoteVideoSink = NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, rTCEngineImpl.getVideoSinkTask()), str, false);
            MethodCollector.m26664o(455);
            return nativeSetupRemoteVideoSink;
        }
        int nativeSetupRemoteVideoSink2 = NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeRtcRoom, new VideoSinkAdapter(iVideoSink, null), str, false);
        MethodCollector.m26664o(455);
        return nativeSetupRemoteVideoSink2;
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        MethodCollector.m26663i(353);
        LogUtil.m147885d("RtcRoom", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m147885d("RtcRoom", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
            MethodCollector.m26664o(353);
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, enableLiveTranscoding failed.");
            MethodCollector.m26664o(353);
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.m147885d("RtcRoom", "enableLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeRTCRoomFunctions.nativeStartLiveTranscoding(this.mNativeRtcRoom, jSONObject, iLiveTranscodingObserver);
            MethodCollector.m26664o(353);
        }
    }

    public RTCRoom(String str, long j, RTCEngineImpl rTCEngineImpl) {
        this.mNativeRtcRoom = j;
        this.mRoom = str;
        this.mRtcEngine = new WeakReference<>(rTCEngineImpl);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.m26663i(365);
        LogUtil.m147885d("RtcRoom", "SetupRemoteVideo...");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.m147886e("RtcRoom", "native rtcroom is invalid, SetupRemoteVideo failed.");
            MethodCollector.m26664o(365);
            return;
        }
        NativeFunctions.nativeSetRemoteVideoCanvas(j, str, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.m26664o(365);
    }

    @Override // com.p2082ss.bytertc.engine.IRTCRoom
    public void joinRoom(String str, UserInfo userInfo, RTCEngine.ChannelProfile channelProfile) {
        String uid;
        MethodCollector.m26663i(260);
        StringBuilder append = new StringBuilder("joinRoom with token: ").append(str).append(",room").append(this.mRoom).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.m147885d("RtcRoom", append.append(uid).toString());
        if (this.mNativeRtcRoom == 0) {
            LogUtil.m147886e("RtcRoom", "native room is invalid, joinRoom failed.");
            MethodCollector.m26664o(260);
        } else if (userInfo == null || userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.m147886e("RtcRoom", "userInfo is null");
            MethodCollector.m26664o(260);
        } else {
            this.mUser = userInfo.getUid();
            int i = C860811.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile[channelProfile.ordinal()];
            int i2 = 3;
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                if (i == 3 || i != 4) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            NativeRTCRoomFunctions.nativeJoinRoom(this.mNativeRtcRoom, str, userInfo, i2);
            m147866xaf23457a("RtcRoom", "joinroom is up");
            MethodCollector.m26664o(260);
        }
    }
}
