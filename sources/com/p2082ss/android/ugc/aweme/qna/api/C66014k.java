package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.k */
public final class C66014k {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f148628a;
    @AbstractC27891c(mo46611a = "msg")

    /* renamed from: b */
    public final String f148629b;
    @AbstractC27891c(mo46611a = "question_collection")

    /* renamed from: c */
    public final List<C66007d> f148630c;

    static {
        Covode.recordClassIndex(77520);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66014k)) {
            return false;
        }
        C66014k kVar = (C66014k) obj;
        return this.f148628a == kVar.f148628a && C89219l.m154714a(this.f148629b, kVar.f148629b) && C89219l.m154714a(this.f148630c, kVar.f148630c);
    }

    public final int hashCode() {
        int i = this.f148628a * 31;
        String str = this.f148629b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<C66007d> list = this.f148630c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TiktokV1ForumQuestionSuggestResponse(statusCode=" + this.f148628a + ", msg=" + this.f148629b + ", questionCollection=" + this.f148630c + ")";
    }
}
