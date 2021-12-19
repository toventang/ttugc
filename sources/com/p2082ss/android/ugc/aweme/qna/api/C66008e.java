package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.qna.api.e */
public final class C66008e {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public final int f148600a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public final int f148601b;
    @AbstractC27891c(mo46611a = "collection_category")

    /* renamed from: c */
    public final int f148602c;
    @AbstractC27891c(mo46611a = "forum_recommend_scene")

    /* renamed from: d */
    public final int f148603d;

    static {
        Covode.recordClassIndex(77514);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66008e)) {
            return false;
        }
        C66008e eVar = (C66008e) obj;
        return this.f148600a == eVar.f148600a && this.f148601b == eVar.f148601b && this.f148602c == eVar.f148602c && this.f148603d == eVar.f148603d;
    }

    public final int hashCode() {
        return (((((this.f148600a * 31) + this.f148601b) * 31) + this.f148602c) * 31) + this.f148603d;
    }

    public final String toString() {
        return "QuestionCollectionRequest(cursor=" + this.f148600a + ", count=" + this.f148601b + ", collectionCategory=" + this.f148602c + ", forumRecommendScene=" + this.f148603d + ")";
    }

    public C66008e(int i, int i2, int i3, int i4) {
        this.f148600a = i;
        this.f148601b = i2;
        this.f148602c = i3;
        this.f148603d = i4;
    }
}
