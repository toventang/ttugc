package com.p2082ss.avframework.player;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.player.IAVPlayer;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.player.AVPlayerBase */
public class AVPlayerBase implements IAVPlayer, IAVPlayer.ErrorListener, IAVPlayer.EventListener {
    public static final String TAG = AVPlayerBase.class.getName();
    private IAVPlayer.ErrorListener mErrorListener;
    private IAVPlayer.EventListener mListener;
    protected boolean mLoop;
    protected IAVPlayer.MetaData mMetaData = new IAVPlayer.MetaData();

    public long getCurrentPlaybackTimeMs() {
        return 0;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public float getVolume() {
        return 0.0f;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public boolean isPlaying() {
        return false;
    }

    public boolean isSystemMediaPlayer() {
        return false;
    }

    public boolean isTTPlayer() {
        return false;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void pause() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void prepare() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void prepareAsync() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void release() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void seekTo(long j) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setConnectTimeoutMs(long j) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setDataSource(Context context, String str) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setDisplay(Surface surface) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    public boolean setExternalNativeAudioRender(long j) {
        return false;
    }

    public int setOption(Object obj, Object obj2) {
        return -1;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setReconnectCounts(int i) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setReconnectDelayMaxMs(long j) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setVolume(float f) {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void start() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void stop() {
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public IAVPlayer.MetaData getMetaData() {
        return this.mMetaData;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public boolean isLoop() {
        return this.mLoop;
    }

    static {
        Covode.recordClassIndex(100681);
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setErrorListener(IAVPlayer.ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setEventListener(IAVPlayer.EventListener eventListener) {
        this.mListener = eventListener;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer
    public void setLoop(boolean z) {
        this.mLoop = z;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onCompletion(IAVPlayer iAVPlayer) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onCompletion(this);
        }
        AVLog.iod(TAG, "onCompletion this ".concat(String.valueOf(iAVPlayer)));
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onPause(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onPause(this, i);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onPrepared(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onPrepared(this, i);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onProgress(IAVPlayer iAVPlayer, long j) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onProgress(this, j);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onStarted(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onStarted(this, i);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onStop(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onStop(this, i);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.EventListener
    public void onSeeked(IAVPlayer iAVPlayer, long j, boolean z) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onSeeked(this, j, z);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer.ErrorListener
    public void onError(IAVPlayer iAVPlayer, int i, Exception exc) {
        IAVPlayer.ErrorListener errorListener = this.mErrorListener;
        if (errorListener != null) {
            errorListener.onError(iAVPlayer, i, exc);
        }
        AVLog.ioe(TAG, "onError this ".concat(String.valueOf(iAVPlayer)), exc);
    }
}
