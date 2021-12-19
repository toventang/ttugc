package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import com.p2082ss.bytertc.engine.IRTCRoom;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.Client */
public interface Client {

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$IAudioFrameObserver */
    public interface IAudioFrameObserver {
        static {
            Covode.recordClassIndex(100184);
        }

        void onMixedAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onRecordAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        boolean wantMixedAudioFrame();

        boolean wantPlaybackAudioFrame();

        boolean wantRecordAudioFrame();
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$ICatchedVideoFrameCallback */
    public interface ICatchedVideoFrameCallback {
        static {
            Covode.recordClassIndex(100185);
        }

        void onCatchedVideoFrameCallback(String str, ByteBuffer byteBuffer, int i, int i2);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$InteractEventListener */
    public interface InteractEventListener {
        static {
            Covode.recordClassIndex(100186);
        }

        void notifyLiveStreamAdjustResolution(Client client, boolean z, int i, int i2);

        void onInteractInfoReport(Client client, String str, int i, long j, Object... objArr);

        void onInteractStart(Client client);

        void onInteractStop(Client client);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$Listener */
    public interface Listener {
        static {
            Covode.recordClassIndex(100187);
        }

        void onError(Client client, int i, long j, Exception exc);

        void onInfo(Client client, int i, long j, Object... objArr);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$StreamMixer */
    public interface StreamMixer {
        static {
            Covode.recordClassIndex(100188);
        }

        String mixStream(int i, int i2, List<Region> list);
    }

    static {
        Covode.recordClassIndex(100182);
    }

    IRTCRoom createRtcRoom();

    void disableRtcPhoneListener();

    void dispose();

    void enableAllRemoteRender(boolean z);

    void enableAllRemoteRender(boolean z, boolean z2);

    void enableRtcPhoneListener();

    String getBusinessId();

    Config getConfig();

    boolean getLocalAudioStreamMuteState();

    LiveRTCEngine getRtcEngine();

    void initDualGameEngine(IDualGameEngine iDualGameEngine);

    void invalidateSei();

    boolean isDualStream();

    boolean isGuest();

    boolean isMultiRoomClient();

    void joinChannel();

    void muteAllRemoteAudioStreams(boolean z);

    void muteAllRemoteVideoStreams(boolean z);

    void muteLocalAudio(boolean z);

    void muteLocalVideo(boolean z);

    void muteRemoteAudioStream(String str, boolean z);

    void muteRemoteVideoStream(String str, boolean z);

    void pause();

    void resume();

    long sendRoomMessage(String str);

    void sendSdkControlMsg(String str);

    long sendUserMessage(String str, String str2);

    void setAudioFrameObserver(int i, int i2, IAudioFrameObserver iAudioFrameObserver);

    void setAudioScenario(int i);

    void setBusinessId(String str);

    void setCatchedVideoFrameCallback(String str, ICatchedVideoFrameCallback iCatchedVideoFrameCallback);

    void setDirectRtcEventCallback(IRTCEngineEventHandler iRTCEngineEventHandler);

    void setFitMode(String str, boolean z);

    void setInteractEventListener(InteractEventListener interactEventListener);

    void setListener(Listener listener);

    void setOnlyConsumeAllRemoteSei(boolean z);

    void setOnlyConsumeRemoteSei(String str, boolean z);

    void setRemoteAudioPlaybackVolume(String str, float f);

    void setSingleViewMode(boolean z);

    void start();

    void start(Object obj);

    void startInteract();

    void startInteract(Object obj);

    void startPushData();

    void stop();

    void stop(Object obj);

    void switchAudio(boolean z);

    void switchInteractMode(Config.InteractMode interactMode);

    void switchMixType(boolean z);

    void updateAuthInfo(JSONObject jSONObject, FrameType frameType);

    void updateRtcExtInfo(String str);

    void updateSdkParams(String str);

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$FrameType */
    public enum FrameType {
        DEFAULT_OCCUPY,
        METADATA,
        SEI,
        METADATA_SEI;

        static {
            Covode.recordClassIndex(100183);
        }
    }
}
