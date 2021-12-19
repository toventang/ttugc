package com.p2082ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.c */
public final class C59397c extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: a */
    private List<? extends Aweme> f135680a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    private boolean f135681b;
    @AbstractC27891c(mo46611a = "min_cursor")

    /* renamed from: c */
    private long f135682c;
    @AbstractC27891c(mo46611a = "max_cursor")

    /* renamed from: d */
    private long f135683d;

    static {
        Covode.recordClassIndex(69789);
    }

    public final boolean getHasMore() {
        return this.f135681b;
    }

    public final long getMaxCursor() {
        return this.f135683d;
    }

    public final long getMinCursor() {
        return this.f135682c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getMixVideos() {
        return this.f135680a;
    }

    public final void setHasMore(boolean z) {
        this.f135681b = z;
    }

    public final void setMaxCursor(long j) {
        this.f135683d = j;
    }

    public final void setMinCursor(long j) {
        this.f135682c = j;
    }

    public final void setMixVideos(List<? extends Aweme> list) {
        this.f135680a = list;
    }
}
