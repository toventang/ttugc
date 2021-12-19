package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.a */
public final class C79707a {
    @AbstractC27891c(mo46611a = "src_content")

    /* renamed from: a */
    public final String f178842a;

    static {
        Covode.recordClassIndex(92928);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C79707a) && C89219l.m154714a(this.f178842a, ((C79707a) obj).f178842a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f178842a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TranslationContent(srcContent=" + this.f178842a + ")";
    }

    public C79707a(String str) {
        C89219l.m154721d(str, "");
        this.f178842a = str;
    }
}
