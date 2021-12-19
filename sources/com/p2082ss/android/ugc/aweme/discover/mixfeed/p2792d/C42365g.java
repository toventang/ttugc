package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.g */
public final class C42365g {
    @AbstractC27891c(mo46611a = "related_word")

    /* renamed from: a */
    public final String f98700a;
    @AbstractC27891c(mo46611a = "word_record")

    /* renamed from: b */
    public final Word f98701b;
    @AbstractC27891c(mo46611a = "related_word_bg_img")

    /* renamed from: c */
    public final String f98702c;

    static {
        Covode.recordClassIndex(50310);
    }

    public final String toString() {
        return "RelatedWord(text=" + this.f98700a + ", wordRecord=" + this.f98701b + ", backgroundImageUrl=" + this.f98702c + ")";
    }

    private /* synthetic */ C42365g() {
        this("", "");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    private C42365g(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f98700a = str;
        this.f98701b = null;
        this.f98702c = str2;
    }
}
