package com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.a.e.e */
public final class C57111e extends BaseResponse {
    @AbstractC27891c(mo46611a = "music_list")

    /* renamed from: a */
    public List<Music> f130030a;
    @AbstractC27891c(mo46611a = "mc_info")

    /* renamed from: b */
    public C57110d f130031b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    public int f130032c;
    @AbstractC27891c(mo46611a = "radio_cursor")

    /* renamed from: d */
    public int f130033d;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: e */
    public int f130034e;
    @AbstractC27891c(mo46611a = "music_type")

    /* renamed from: f */
    public int f130035f;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: g */
    public LogPbBean f130036g;
    @AbstractC27891c(mo46611a = "child_collections")

    /* renamed from: h */
    public List<C57110d> f130037h;

    static {
        Covode.recordClassIndex(67005);
    }

    /* renamed from: a */
    public final int mo94260a() {
        int i = this.f130033d;
        if (i > 0) {
            return i;
        }
        return this.f130032c;
    }
}
