package com.p2024he.lynx.player;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2024he.lynx.player.IHeliumPlayer;

/* renamed from: com.he.lynx.player.HeliumPlayerImpl */
public class HeliumPlayerImpl implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, IHeliumPlayer {
    private IHeliumPlayer.IHeliumPlayerListener listener = null;
    private MediaPlayer player = new MediaPlayer();

    static {
        Covode.recordClassIndex(33794);
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public int getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public int getDuration() {
        return this.player.getDuration();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public int getVideoHeight() {
        return this.player.getVideoHeight();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public int getVideoWidth() {
        return this.player.getVideoWidth();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void pause() {
        this.player.pause();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void play() {
        this.player.start();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void prepare() {
        this.player.prepareAsync();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void release() {
        this.player.release();
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void stop() {
        this.player.stop();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onCompletion(this);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onPrepared(this);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onSeekComplete(this);
        }
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void setDataSource(String str) {
        this.player.setDataSource(str);
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void setLooping(boolean z) {
        this.player.setLooping(z);
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void setSurface(Surface surface) {
        this.player.setSurface(surface);
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void seekTo(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.player.seekTo((long) i, 3);
        } else {
            this.player.seekTo(i);
        }
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void setListener(IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener) {
        if (iHeliumPlayerListener == null) {
            this.player.setOnPreparedListener(null);
            this.player.setOnCompletionListener(null);
            this.player.setOnErrorListener(null);
            this.player.setOnInfoListener(null);
            this.player.setOnSeekCompleteListener(null);
        } else {
            this.player.setOnPreparedListener(this);
            this.player.setOnCompletionListener(this);
            this.player.setOnErrorListener(this);
            this.player.setOnInfoListener(this);
            this.player.setOnSeekCompleteListener(this);
        }
        this.listener = iHeliumPlayerListener;
    }

    @Override // com.p2024he.lynx.player.IHeliumPlayer
    public void setVolume(float f, float f2) {
        this.player.setVolume(f, f2);
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener == null) {
            return true;
        }
        iHeliumPlayerListener.onRenderStart(this);
        return true;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            return iHeliumPlayerListener.onError(this, new Error("what: " + i + ", extra: " + i2));
        }
        return false;
    }
}
