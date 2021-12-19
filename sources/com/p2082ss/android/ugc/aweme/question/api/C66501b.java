package com.p2082ss.android.ugc.aweme.question.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.question.api.b */
public final class C66501b extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "videos")

    /* renamed from: a */
    private List<? extends Aweme> f149494a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    private Integer f149495b = 0;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    private Integer f149496c = 0;

    static {
        Covode.recordClassIndex(78044);
    }

    public final Integer getCursor() {
        return this.f149495b;
    }

    public final Integer getHasMore() {
        return this.f149496c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getVideos() {
        return this.f149494a;
    }

    public final boolean isHasMore() {
        Integer num = this.f149496c;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void setCursor(Integer num) {
        this.f149495b = num;
    }

    public final void setHasMore(Integer num) {
        this.f149496c = num;
    }

    public final void setVideos(List<? extends Aweme> list) {
        this.f149494a = list;
    }

    public final void setHasMore(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.f149496c = Integer.valueOf(i);
    }
}
