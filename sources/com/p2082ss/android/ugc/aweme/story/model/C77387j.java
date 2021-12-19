package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.j */
public final class C77387j extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "awemes")

    /* renamed from: a */
    private final List<Aweme> f173635a;

    static {
        Covode.recordClassIndex(90417);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.j */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C77387j copy$default(C77387j jVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = jVar.f173635a;
        }
        return jVar.copy(list);
    }

    public final List<Aweme> component1() {
        return this.f173635a;
    }

    public final C77387j copy(List<? extends Aweme> list) {
        return new C77387j(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C77387j) && C89219l.m154714a(this.f173635a, ((C77387j) obj).f173635a);
        }
        return true;
    }

    public final int hashCode() {
        List<Aweme> list = this.f173635a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserStoriesResponse(awemes=" + this.f173635a + ")";
    }

    public final List<Aweme> getAwemes() {
        return this.f173635a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C77387j(List<? extends Aweme> list) {
        this.f173635a = list;
    }
}
