package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d */
public final class C70625d implements Serializable {
    @AbstractC27891c(mo46611a = "music_wave_ary")

    /* renamed from: a */
    private float[] f158062a = new float[0];
    @AbstractC27891c(mo46611a = "music_path")

    /* renamed from: b */
    private String f158063b = "";
    @AbstractC27891c(mo46611a = "music_length")

    /* renamed from: c */
    private long f158064c;
    @AbstractC27891c(mo46611a = "video_length")

    /* renamed from: d */
    private long f158065d;

    static {
        Covode.recordClassIndex(83091);
    }

    public final long getMusicLength() {
        return this.f158064c;
    }

    public final String getMusicPath() {
        return this.f158063b;
    }

    public final float[] getMusicWavePointArray() {
        return this.f158062a;
    }

    public final long getVideoLenght() {
        return this.f158065d;
    }

    public final void setMusicLength(long j) {
        this.f158064c = j;
    }

    public final void setVideoLenght(long j) {
        this.f158065d = j;
    }

    public final void setMusicPath(String str) {
        C89219l.m154721d(str, "");
        this.f158063b = str;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        C89219l.m154721d(fArr, "");
        this.f158062a = fArr;
    }
}
