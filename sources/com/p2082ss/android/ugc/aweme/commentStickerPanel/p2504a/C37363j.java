package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.j */
public final class C37363j {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final Integer f88159a;
    @AbstractC27891c(mo46611a = "question_collection")

    /* renamed from: b */
    public final List<C37360g> f88160b;

    static {
        Covode.recordClassIndex(44743);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37363j)) {
            return false;
        }
        C37363j jVar = (C37363j) obj;
        return C89219l.m154714a(this.f88159a, jVar.f88159a) && C89219l.m154714a(this.f88160b, jVar.f88160b);
    }

    public final int hashCode() {
        Integer num = this.f88159a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<C37360g> list = this.f88160b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QuestionStickerPanelResponseModel(statusCode=" + this.f88159a + ", questionCollectionList=" + this.f88160b + ")";
    }

    private /* synthetic */ C37363j() {
        this(C89086z.INSTANCE);
    }

    private C37363j(List<C37360g> list) {
        C89219l.m154721d(list, "");
        this.f88159a = null;
        this.f88160b = list;
    }
}
