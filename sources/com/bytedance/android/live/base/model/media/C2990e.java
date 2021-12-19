package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.base.model.media.e */
public class C2990e {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f8783a;
    @AbstractC27891c(mo46611a = "id_str")

    /* renamed from: b */
    public String f8784b;
    @AbstractC27891c(mo46611a = "album")

    /* renamed from: c */
    public String f8785c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public String f8786d;
    @AbstractC27891c(mo46611a = "cover_hd")

    /* renamed from: e */
    public ImageModel f8787e;
    @AbstractC27891c(mo46611a = "cover_large")

    /* renamed from: f */
    public ImageModel f8788f;
    @AbstractC27891c(mo46611a = "cover_medium")

    /* renamed from: g */
    public ImageModel f8789g;
    @AbstractC27891c(mo46611a = "cover_thumb")

    /* renamed from: h */
    public ImageModel f8790h;
    @AbstractC27891c(mo46611a = "play_url")

    /* renamed from: i */
    public C2962b f8791i;
    @AbstractC27891c(mo46611a = "author")

    /* renamed from: j */
    public String f8792j;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: k */
    public String f8793k;
    @AbstractC27891c(mo46611a = "source_platform")

    /* renamed from: l */
    public int f8794l;
    @AbstractC27891c(mo46611a = "start_time")

    /* renamed from: m */
    public int f8795m;
    @AbstractC27891c(mo46611a = "end_time")

    /* renamed from: n */
    public int f8796n;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: o */
    public int f8797o;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: p */
    public int f8798p;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: q */
    public String f8799q;
    @AbstractC27891c(mo46611a = "share_url")

    /* renamed from: r */
    public String f8800r;
    @AbstractC27891c(mo46611a = "share_title")

    /* renamed from: s */
    public String f8801s;
    @AbstractC27891c(mo46611a = "share_description")

    /* renamed from: t */
    public String f8802t;
    @AbstractC27891c(mo46611a = "original_user_id")

    /* renamed from: u */
    public long f8803u;
    @AbstractC27891c(mo46611a = "original_titel_tpl")

    /* renamed from: v */
    public String f8804v;
    @AbstractC27891c(mo46611a = "video_cnt")

    /* renamed from: w */
    public long f8805w;
    @AbstractC27891c(mo46611a = "is_user_favorite")

    /* renamed from: x */
    public boolean f8806x;
    @AbstractC27891c(mo46611a = "audio_track")

    /* renamed from: y */
    public ImageModel f8807y;

    /* renamed from: z */
    public String f8808z;

    static {
        Covode.recordClassIndex(3445);
    }

    public String toString() {
        return "Music{id=" + this.f8783a + ", mid='" + this.f8784b + '\'' + ", album='" + this.f8785c + '\'' + ", musicName='" + this.f8786d + '\'' + ", converHd=" + this.f8787e + ", coverLarge=" + this.f8788f + ", coverMedium=" + this.f8789g + ", coverThumb=" + this.f8790h + ", playUrl=" + this.f8791i + ", authorName='" + this.f8792j + '\'' + ", schema='" + this.f8793k + '\'' + ", source=" + this.f8794l + ", startTime=" + this.f8795m + ", endTime=" + this.f8796n + ", duration=" + this.f8797o + ", status=" + this.f8798p + ", extra='" + this.f8799q + '\'' + ", shareUrl='" + this.f8800r + '\'' + ", shareTitle='" + this.f8801s + '\'' + ", shareDescription='" + this.f8802t + '\'' + ", oroginalUserId=" + this.f8803u + ", originalTitelTpl='" + this.f8804v + '\'' + ", songId='" + this.f8808z + '\'' + '}';
    }
}
