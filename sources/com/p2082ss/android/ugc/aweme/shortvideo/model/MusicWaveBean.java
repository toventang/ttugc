package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean */
public final class MusicWaveBean implements Serializable {
    @AbstractC27891c(mo46611a = "music_length")
    private long musicLength;
    @AbstractC27891c(mo46611a = "music_wave_ary")
    private float[] musicWavePointArray = new float[0];
    @AbstractC27891c(mo46611a = "video_length")
    private long videoLenght;

    static {
        Covode.recordClassIndex(84603);
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        C89219l.m154721d(fArr, "");
        this.musicWavePointArray = fArr;
    }
}
