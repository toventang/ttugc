package com.amazing.media;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class AudioPlayer {

    /* renamed from: a */
    private MediaPlayer f6643a = new MediaPlayer();

    /* renamed from: b */
    private String f6644b;

    static {
        Covode.recordClassIndex(2414);
    }

    public boolean isPlaying() {
        return this.f6643a.isPlaying();
    }

    public void pause() {
        this.f6643a.pause();
    }

    public void resume() {
        this.f6643a.start();
    }

    public void stop() {
        this.f6643a.stop();
    }

    public void destroy() {
        MediaPlayer mediaPlayer = this.f6643a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f6643a.release();
            this.f6643a = null;
        }
    }

    public void play() {
        this.f6643a.reset();
        if (prepare()) {
            this.f6643a.start();
        }
    }

    public boolean prepare() {
        try {
            this.f6643a.setDataSource(this.f6644b);
            this.f6643a.setAudioStreamType(3);
            this.f6643a.prepare();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setLoop(boolean z) {
        this.f6643a.setLooping(z);
    }

    public AudioPlayer(String str) {
        this.f6644b = str;
    }
}
