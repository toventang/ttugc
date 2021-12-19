package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.PinnedMusicList */
public final class PinnedMusicList extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "avalible_capicity")
    private int avalibleCapicity = 3;
    @AbstractC27891c(mo46611a = "music")
    private List<Music> musicList;

    static {
        Covode.recordClassIndex(71415);
    }

    public final int getAvalibleCapicity() {
        return this.avalibleCapicity;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public final void setAvalibleCapicity(int i) {
        this.avalibleCapicity = i;
    }

    public final void setMusicList(List<Music> list) {
        this.musicList = list;
    }
}
