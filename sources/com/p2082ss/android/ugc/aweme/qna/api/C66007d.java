package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.d */
public final class C66007d {
    @AbstractC27891c(mo46611a = "collection_category")

    /* renamed from: a */
    public final int f148595a;
    @AbstractC27891c(mo46611a = "question_list")

    /* renamed from: b */
    public final List<C66504c> f148596b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    public final int f148597c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public final int f148598d;
    @AbstractC27891c(mo46611a = "remaining_question_count")

    /* renamed from: e */
    public final Integer f148599e;

    static {
        Covode.recordClassIndex(77513);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66007d)) {
            return false;
        }
        C66007d dVar = (C66007d) obj;
        return this.f148595a == dVar.f148595a && C89219l.m154714a(this.f148596b, dVar.f148596b) && this.f148597c == dVar.f148597c && this.f148598d == dVar.f148598d && C89219l.m154714a(this.f148599e, dVar.f148599e);
    }

    public final int hashCode() {
        int i = this.f148595a * 31;
        List<C66504c> list = this.f148596b;
        int i2 = 0;
        int hashCode = (((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f148597c) * 31) + this.f148598d) * 31;
        Integer num = this.f148599e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "QuestionCollection(collectionCategory=" + this.f148595a + ", forumStruct=" + this.f148596b + ", cursor=" + this.f148597c + ", hasMore=" + this.f148598d + ", remainingQuestionCount=" + this.f148599e + ")";
    }
}
