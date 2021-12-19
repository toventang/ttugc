package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c */
public final class C42321c {
    @AbstractC27891c(mo46611a = "lives")

    /* renamed from: a */
    public final List<Aweme> f98566a;
    @AbstractC27891c(mo46611a = "doc_id")

    /* renamed from: b */
    public final String f98567b;
    @AbstractC27891c(mo46611a = "is_more")

    /* renamed from: c */
    public final Boolean f98568c;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: d */
    public final Long f98569d;

    static {
        Covode.recordClassIndex(50264);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42321c)) {
            return false;
        }
        C42321c cVar = (C42321c) obj;
        return C89219l.m154714a(this.f98566a, cVar.f98566a) && C89219l.m154714a(this.f98567b, cVar.f98567b) && C89219l.m154714a(this.f98568c, cVar.f98568c) && C89219l.m154714a(this.f98569d, cVar.f98569d);
    }

    public final int hashCode() {
        List<Aweme> list = this.f98566a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f98567b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f98568c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l = this.f98569d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CollectionLive(lives=" + this.f98566a + ", docId=" + this.f98567b + ", isMore=" + this.f98568c + ", cursor=" + this.f98569d + ")";
    }

    private /* synthetic */ C42321c() {
        this("", true);
    }

    private C42321c(String str, Boolean bool) {
        this.f98566a = null;
        this.f98567b = str;
        this.f98568c = bool;
        this.f98569d = null;
    }
}
