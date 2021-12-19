package com.p2082ss.android.ugc.aweme.homepage.story.p3053b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.b.a */
public final class C53029a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "user_ids")

    /* renamed from: a */
    private final List<Long> f121908a;
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: b */
    private final long f121909b;

    static {
        Covode.recordClassIndex(62569);
    }

    /* renamed from: com_ss_android_ugc_aweme_homepage_story_model_GetFeedResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m97954x550270b3(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.homepage.story.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C53029a copy$default(C53029a aVar, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f121908a;
        }
        if ((i & 2) != 0) {
            j = aVar.f121909b;
        }
        return aVar.copy(list, j);
    }

    public final List<Long> component1() {
        return this.f121908a;
    }

    public final long component2() {
        return this.f121909b;
    }

    public final C53029a copy(List<Long> list, long j) {
        return new C53029a(list, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53029a)) {
            return false;
        }
        C53029a aVar = (C53029a) obj;
        return C89219l.m154714a(this.f121908a, aVar.f121908a) && this.f121909b == aVar.f121909b;
    }

    public final int hashCode() {
        List<Long> list = this.f121908a;
        return ((list != null ? list.hashCode() : 0) * 31) + m97954x550270b3(this.f121909b);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GetFeedResponse(uidList=" + this.f121908a + ", version=" + this.f121909b + ")";
    }

    public final List<Long> getUidList() {
        return this.f121908a;
    }

    public final long getVersion() {
        return this.f121909b;
    }

    public C53029a(List<Long> list, long j) {
        this.f121908a = list;
        this.f121909b = j;
    }
}
