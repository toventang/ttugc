package com.p2082ss.avframework.player;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.player.IAVPlayer */
public interface IAVPlayer {

    /* renamed from: com.ss.avframework.player.IAVPlayer$ErrorListener */
    public interface ErrorListener {
        static {
            Covode.recordClassIndex(100689);
        }

        void onError(IAVPlayer iAVPlayer, int i, Exception exc);
    }

    /* renamed from: com.ss.avframework.player.IAVPlayer$EventListener */
    public interface EventListener {
        static {
            Covode.recordClassIndex(100690);
        }

        void onCompletion(IAVPlayer iAVPlayer);

        void onPause(IAVPlayer iAVPlayer, int i);

        void onPrepared(IAVPlayer iAVPlayer, int i);

        void onProgress(IAVPlayer iAVPlayer, long j);

        void onSeeked(IAVPlayer iAVPlayer, long j, boolean z);

        void onStarted(IAVPlayer iAVPlayer, int i);

        void onStop(IAVPlayer iAVPlayer, int i);
    }

    /* renamed from: com.ss.avframework.player.IAVPlayer$MetaData */
    public static class MetaData extends TEBundle {
        static {
            Covode.recordClassIndex(100691);
        }
    }

    static {
        Covode.recordClassIndex(100688);
    }

    MetaData getMetaData();

    float getVolume();

    boolean isLoop();

    boolean isPlaying();

    void pause();

    void prepare();

    void prepareAsync();

    void release();

    void seekTo(long j);

    void setConnectTimeoutMs(long j);

    void setDataSource(Context context, String str);

    void setDisplay(Surface surface);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setErrorListener(ErrorListener errorListener);

    void setEventListener(EventListener eventListener);

    void setLoop(boolean z);

    void setReconnectCounts(int i);

    void setReconnectDelayMaxMs(long j);

    void setVolume(float f);

    void start();

    void stop();
}
