package com.p2024he.lynx.player;

import android.view.Surface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.he.lynx.player.IHeliumPlayer */
public interface IHeliumPlayer {

    /* renamed from: com.he.lynx.player.IHeliumPlayer$HeliumPlayerFactory */
    public interface HeliumPlayerFactory {
        static {
            Covode.recordClassIndex(33796);
        }

        IHeliumPlayer create();
    }

    /* renamed from: com.he.lynx.player.IHeliumPlayer$IHeliumPlayerListener */
    public interface IHeliumPlayerListener {
        static {
            Covode.recordClassIndex(33797);
        }

        void onCompletion(IHeliumPlayer iHeliumPlayer);

        boolean onError(IHeliumPlayer iHeliumPlayer, Object obj);

        void onPrepared(IHeliumPlayer iHeliumPlayer);

        void onRenderStart(IHeliumPlayer iHeliumPlayer);

        void onSeekComplete(IHeliumPlayer iHeliumPlayer);
    }

    static {
        Covode.recordClassIndex(33795);
    }

    int getCurrentPosition();

    int getDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    void pause();

    void play();

    void prepare();

    void release();

    void seekTo(int i);

    void setDataSource(String str);

    void setListener(IHeliumPlayerListener iHeliumPlayerListener);

    void setLooping(boolean z);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    void stop();
}
