package com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.g */
public final class C61164g extends BaseResponse {
    @AbstractC27891c(mo46611a = "next_cursor")

    /* renamed from: a */
    public final int f138867a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public final boolean f138868b;
    @AbstractC27891c(mo46611a = "music_list")

    /* renamed from: c */
    public final List<Music> f138869c;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f138870d;

    static {
        Covode.recordClassIndex(71769);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61164g)) {
            return false;
        }
        C61164g gVar = (C61164g) obj;
        return this.f138867a == gVar.f138867a && this.f138868b == gVar.f138868b && C89219l.m154714a(this.f138869c, gVar.f138869c) && C89219l.m154714a(this.f138870d, gVar.f138870d);
    }

    public final int hashCode() {
        int i = this.f138867a * 31;
        boolean z = this.f138868b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        List<Music> list = this.f138869c;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f138870d;
        if (logPbBean != null) {
            i6 = logPbBean.hashCode();
        }
        return hashCode + i6;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MusicListResponse(cursor=" + this.f138867a + ", hasMore=" + this.f138868b + ", musicList=" + this.f138869c + ", logPb=" + this.f138870d + ")";
    }
}
