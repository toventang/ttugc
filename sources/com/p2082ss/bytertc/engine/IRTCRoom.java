package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;

/* renamed from: com.ss.bytertc.engine.IRTCRoom */
public abstract class IRTCRoom {
    static {
        Covode.recordClassIndex(100890);
    }

    public abstract void destroy();

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract void joinRoom(String str, UserInfo userInfo, RTCEngine.ChannelProfile channelProfile);

    public abstract void leaveRoom();

    public abstract void muteAllRemoteAudio(MuteState muteState);

    public abstract void muteAllRemoteVideo(MuteState muteState);

    public abstract void muteRemoteAudio(String str, MuteState muteState);

    public abstract void muteRemoteVideo(String str, MuteState muteState);

    public abstract void publish();

    public abstract void publishScreen();

    public abstract void sendRoomBinaryMessage(byte[] bArr);

    public abstract void sendRoomMessage(String str);

    public abstract void sendUserBinaryMessage(String str, byte[] bArr);

    public abstract void sendUserMessage(String str, String str2);

    public abstract void setAudioVolumeIndicationInterval(int i);

    public abstract void setAutoSubscribe(RTCEngine.SubscribeMode subscribeMode, RTCEngine.SubscribeMode subscribeMode2);

    public abstract void setCustomUserRole(String str);

    public abstract void setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler);

    public abstract void setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract void setUserRole(RTCEngine.ClientRole clientRole);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str);

    public abstract void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver);

    public abstract void stopLiveTranscoding();

    public abstract void subscribe(String str, SubscribeConfig subscribeConfig);

    public abstract void unpublish();

    public abstract void unpublishScreen();

    public abstract void unsubscribe(String str, boolean z);

    public abstract void updateLiveTranscoding(LiveTranscoding liveTranscoding);

    public abstract void updateToken(String str);
}
