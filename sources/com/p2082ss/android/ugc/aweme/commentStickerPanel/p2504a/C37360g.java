package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.g */
public final class C37360g {
    @AbstractC27891c(mo46611a = "collection_category")

    /* renamed from: a */
    public final int f88150a;
    @AbstractC27891c(mo46611a = "question_sticker_list")

    /* renamed from: b */
    public final List<QaStruct> f88151b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    public final int f88152c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public final int f88153d;

    static {
        Covode.recordClassIndex(44740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37360g)) {
            return false;
        }
        C37360g gVar = (C37360g) obj;
        return this.f88150a == gVar.f88150a && C89219l.m154714a(this.f88151b, gVar.f88151b) && this.f88152c == gVar.f88152c && this.f88153d == gVar.f88153d;
    }

    public final int hashCode() {
        int i = this.f88150a * 31;
        List<QaStruct> list = this.f88151b;
        return ((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f88152c) * 31) + this.f88153d;
    }

    public final String toString() {
        return "QuestionCollection(category=" + this.f88150a + ", questionStickerStruct=" + this.f88151b + ", cursor=" + this.f88152c + ", hasMore=" + this.f88153d + ")";
    }

    private /* synthetic */ C37360g() {
        this(EnumC37361h.QuestionCollectionUNKNOWN.ordinal(), C89086z.INSTANCE);
    }

    private C37360g(int i, List<QaStruct> list) {
        C89219l.m154721d(list, "");
        this.f88150a = i;
        this.f88151b = list;
        this.f88152c = 0;
        this.f88153d = 0;
    }
}
