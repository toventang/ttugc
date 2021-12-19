package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic */
public final class SimpleMusic {
    @AbstractC27891c(mo46611a = "music_info")
    private Music musicModel;

    static {
        Covode.recordClassIndex(97510);
    }

    public SimpleMusic() {
        this(null, 1, null);
    }

    public static /* synthetic */ SimpleMusic copy$default(SimpleMusic simpleMusic, Music music, int i, Object obj) {
        if ((i & 1) != 0) {
            music = simpleMusic.musicModel;
        }
        return simpleMusic.copy(music);
    }

    public final Music component1() {
        return this.musicModel;
    }

    public final SimpleMusic copy(Music music) {
        return new SimpleMusic(music);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SimpleMusic) && C89219l.m154714a(this.musicModel, ((SimpleMusic) obj).musicModel);
        }
        return true;
    }

    public final int hashCode() {
        Music music = this.musicModel;
        if (music != null) {
            return music.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SimpleMusic(musicModel=" + this.musicModel + ")";
    }

    public final Music getMusicModel() {
        return this.musicModel;
    }

    public final void setMusicModel(Music music) {
        this.musicModel = music;
    }

    public SimpleMusic(Music music) {
        this.musicModel = music;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleMusic(Music music, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : music);
    }
}
