package com.p2082ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.o */
public class C60836o implements Serializable {
    @AbstractC27891c(mo46611a = "digg_count")
    public int diggCount;
    @AbstractC27891c(mo46611a = "music_count")
    public int musicCount;
    @AbstractC27891c(mo46611a = "music_cover_url")
    public UrlModel musicCoverUrl;
    @AbstractC27891c(mo46611a = "music_qrcode_url")
    public UrlModel musicQrcodeUrl;
    @AbstractC27891c(mo46611a = "music_used_count")
    public int musicUseCount;

    static {
        Covode.recordClassIndex(71422);
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getMusicCount() {
        return this.musicCount;
    }

    public UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public int getMusicUseCount() {
        return this.musicUseCount;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setMusicCount(int i) {
        this.musicCount = i;
    }

    public void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public void setMusicUseCount(int i) {
        this.musicUseCount = i;
    }
}
