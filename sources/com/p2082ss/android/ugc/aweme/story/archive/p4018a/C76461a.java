package com.p2082ss.android.ugc.aweme.story.archive.p4018a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.a.a */
public final class C76461a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "items")

    /* renamed from: a */
    private final List<Aweme> f171736a;
    @AbstractC27891c(mo46611a = "min_cursor")

    /* renamed from: b */
    private final long f171737b;
    @AbstractC27891c(mo46611a = "max_cursor")

    /* renamed from: c */
    private final long f171738c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    private final boolean f171739d;

    static {
        Covode.recordClassIndex(89441);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_archive_model_StoryArchiveList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134047x1b63b377(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.archive.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C76461a copy$default(C76461a aVar, List list, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f171736a;
        }
        if ((i & 2) != 0) {
            j = aVar.f171737b;
        }
        if ((i & 4) != 0) {
            j2 = aVar.f171738c;
        }
        if ((i & 8) != 0) {
            z = aVar.f171739d;
        }
        return aVar.copy(list, j, j2, z);
    }

    public final List<Aweme> component1() {
        return this.f171736a;
    }

    public final long component2() {
        return this.f171737b;
    }

    public final long component3() {
        return this.f171738c;
    }

    public final boolean component4() {
        return this.f171739d;
    }

    public final C76461a copy(List<Aweme> list, long j, long j2, boolean z) {
        return new C76461a(list, j, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76461a)) {
            return false;
        }
        C76461a aVar = (C76461a) obj;
        return C89219l.m154714a(this.f171736a, aVar.f171736a) && this.f171737b == aVar.f171737b && this.f171738c == aVar.f171738c && this.f171739d == aVar.f171739d;
    }

    public final int hashCode() {
        List<Aweme> list = this.f171736a;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + m134047x1b63b377(this.f171737b)) * 31) + m134047x1b63b377(this.f171738c)) * 31;
        boolean z = this.f171739d;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryArchiveList(items=" + this.f171736a + ", minCursor=" + this.f171737b + ", maxCursor=" + this.f171738c + ", hasMore=" + this.f171739d + ")";
    }

    public final boolean getHasMore() {
        return this.f171739d;
    }

    public final List<Aweme> getItems() {
        return this.f171736a;
    }

    public final long getMaxCursor() {
        return this.f171738c;
    }

    public final long getMinCursor() {
        return this.f171737b;
    }

    public C76461a(List<Aweme> list, long j, long j2, boolean z) {
        this.f171736a = list;
        this.f171737b = j;
        this.f171738c = j2;
        this.f171739d = z;
    }
}
