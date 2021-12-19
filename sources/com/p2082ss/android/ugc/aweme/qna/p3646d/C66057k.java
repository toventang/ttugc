package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.k */
public final class C66057k {
    @AbstractC27891c(mo46611a = "src_content")

    /* renamed from: a */
    public final String f148756a;

    static {
        Covode.recordClassIndex(77563);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66057k) && C89219l.m154714a(this.f148756a, ((C66057k) obj).f148756a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f148756a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TranslationContent(srcContent=" + this.f148756a + ")";
    }

    public C66057k(String str) {
        C89219l.m154721d(str, "");
        this.f148756a = str;
    }
}
