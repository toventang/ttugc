package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState */
public final class PreMusicState implements AbstractC20368af {
    private final String preMusicFile;
    private final MusicModel preMusicModel;

    static {
        Covode.recordClassIndex(84713);
    }

    public PreMusicState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PreMusicState copy$default(PreMusicState preMusicState, MusicModel musicModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            musicModel = preMusicState.preMusicModel;
        }
        if ((i & 2) != 0) {
            str = preMusicState.preMusicFile;
        }
        return preMusicState.copy(musicModel, str);
    }

    public final MusicModel component1() {
        return this.preMusicModel;
    }

    public final String component2() {
        return this.preMusicFile;
    }

    public final PreMusicState copy(MusicModel musicModel, String str) {
        return new PreMusicState(musicModel, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreMusicState)) {
            return false;
        }
        PreMusicState preMusicState = (PreMusicState) obj;
        return C89219l.m154714a(this.preMusicModel, preMusicState.preMusicModel) && C89219l.m154714a(this.preMusicFile, preMusicState.preMusicFile);
    }

    public final int hashCode() {
        MusicModel musicModel = this.preMusicModel;
        int i = 0;
        int hashCode = (musicModel != null ? musicModel.hashCode() : 0) * 31;
        String str = this.preMusicFile;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PreMusicState(preMusicModel=" + this.preMusicModel + ", preMusicFile=" + this.preMusicFile + ")";
    }

    public final String getPreMusicFile() {
        return this.preMusicFile;
    }

    public final MusicModel getPreMusicModel() {
        return this.preMusicModel;
    }

    public PreMusicState(MusicModel musicModel, String str) {
        this.preMusicModel = musicModel;
        this.preMusicFile = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreMusicState(MusicModel musicModel, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : musicModel, (i & 2) != 0 ? null : str);
    }
}
