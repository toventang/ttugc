package com.p2082ss.avframework.livestreamv2.ktv;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.player.IAVPlayer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.ktv.IKaraokeMovie */
public interface IKaraokeMovie {

    /* renamed from: com.ss.avframework.livestreamv2.ktv.IKaraokeMovie$Listener */
    public interface Listener {
        static {
            Covode.recordClassIndex(100565);
        }

        void onKaraokeError(int i, Exception exc);

        void onKaraokeInfo(int i, long j, String str);
    }

    static {
        Covode.recordClassIndex(100564);
    }

    void enableAGC(boolean z);

    void enableAudioMixer(boolean z);

    VideoSink getCameraVideoSink();

    long getCurrentPlaybackTimeMs();

    int getDurationMs();

    IAVPlayer.MetaData getMetadata();

    IAVPlayer getPlayer();

    VideoMixer.VideoMixerDescription getVideoMixerDescription(int i);

    VideoTrack getVideoTrack();

    boolean isEnableAGC();

    boolean isLoop();

    boolean isMirror();

    boolean isMute();

    void mute(boolean z);

    void pause();

    void prepare();

    boolean readAudioBufferByKaraoke(ByteBuffer byteBuffer, int i, int i2, int i3);

    void release();

    void seek(long j);

    void setAutoFillAspectRatioOnFit(boolean z);

    void setDataSource(String str);

    void setDisplay(View view);

    void setListener(Listener listener);

    void setLoop(boolean z);

    void setMirror(boolean z);

    void setRenderMode(boolean z);

    void setVideoMixerDescription(int i, VideoMixer.VideoMixerDescription videoMixerDescription);

    void setVolume(float f);

    void start();

    void stop();
}
