package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.i */
public final class C37362i {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public final Integer f88155a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public final Integer f88156b;
    @AbstractC27891c(mo46611a = "collection_category")

    /* renamed from: c */
    public final int f88157c;
    @AbstractC27891c(mo46611a = "forum_recommend_scene")

    /* renamed from: d */
    public final int f88158d;

    static {
        Covode.recordClassIndex(44742);
    }

    public C37362i() {
        this(null, null, 0, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37362i)) {
            return false;
        }
        C37362i iVar = (C37362i) obj;
        return C89219l.m154714a(this.f88155a, iVar.f88155a) && C89219l.m154714a(this.f88156b, iVar.f88156b) && this.f88157c == iVar.f88157c && this.f88158d == iVar.f88158d;
    }

    public final int hashCode() {
        Integer num = this.f88155a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f88156b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f88157c) * 31) + this.f88158d;
    }

    public final String toString() {
        return "QuestionStickerPanelRequestModel(cursor=" + this.f88155a + ", count=" + this.f88156b + ", type=" + this.f88157c + ", scene=" + this.f88158d + ")";
    }

    private C37362i(Integer num, Integer num2, int i, int i2) {
        this.f88155a = num;
        this.f88156b = num2;
        this.f88157c = i;
        this.f88158d = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37362i(Integer num, Integer num2, int i, int i2, int i3) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? EnumC37359f.ForumRecommendSceneCAMERA.ordinal() : i2);
    }
}
