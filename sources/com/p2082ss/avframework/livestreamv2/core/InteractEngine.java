package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.utils.MiscUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.InteractEngine */
public interface InteractEngine extends ILiveStream.IAudioFrameAvailableListener, LiveCore.ILiveCoreTextureFrameAvailableListener {
    public static final String AUDIO_LAYER_NAME = MiscUtils.getUUID("interact-audio");

    void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void addTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    void checkReleaseRtcEngine();

    Client create(LiveCore.InteractConfig interactConfig);

    void dealSeiInfo(int i, String str, int i2, int i3, int i4, long j, ByteBuffer byteBuffer);

    void enableGameMode(boolean z, boolean z2);

    InteractEngineBuilder getBuilder();

    String getInteractId();

    boolean isInteracting();

    int queryRtcId(String str);

    void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener);

    boolean removeClient(Client client);

    void removeTextureFrameAvailableListener(LiveCore.ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener);

    void start(Client client);

    void switchMixType(boolean z);

    void updateClientMixStreamDescription(VideoMixer.VideoMixerDescription videoMixerDescription);

    static {
        Covode.recordClassIndex(100220);
    }
}
