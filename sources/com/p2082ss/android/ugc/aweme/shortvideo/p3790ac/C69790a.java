package com.p2082ss.android.ugc.aweme.shortvideo.p3790ac;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ac.a */
public final class C69790a implements Serializable {
    @AbstractC27891c(mo46611a = "video_id")

    /* renamed from: a */
    private String f155965a;
    @AbstractC27891c(mo46611a = "ai_cut_id")

    /* renamed from: b */
    private String f155966b;
    @AbstractC27891c(mo46611a = "video_count")

    /* renamed from: c */
    private Integer f155967c = 0;
    @AbstractC27891c(mo46611a = "video_src_len_list")

    /* renamed from: d */
    private String f155968d;
    @AbstractC27891c(mo46611a = "video_cut_len_list")

    /* renamed from: e */
    private String f155969e;
    @AbstractC27891c(mo46611a = "video_cut_start_time")

    /* renamed from: f */
    private String f155970f;

    static {
        Covode.recordClassIndex(82196);
    }

    public final String getAiCutId() {
        return this.f155966b;
    }

    public final Integer getVideoCount() {
        return this.f155967c;
    }

    public final String getVideoCutLenListStr() {
        return this.f155969e;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.f155970f;
    }

    public final String getVideoId() {
        return this.f155965a;
    }

    public final String getVideoSrcLenListStr() {
        return this.f155968d;
    }

    public final void setAiCutId(String str) {
        this.f155966b = str;
    }

    public final void setVideoCount(Integer num) {
        this.f155967c = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.f155969e = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.f155970f = str;
    }

    public final void setVideoId(String str) {
        this.f155965a = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.f155968d = str;
    }
}
