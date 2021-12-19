package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.i */
public final class C66012i {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f148619a;
    @AbstractC27891c(mo46611a = "msg")

    /* renamed from: b */
    public final String f148620b;
    @AbstractC27891c(mo46611a = "questions")

    /* renamed from: c */
    public final List<C66504c> f148621c;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: d */
    public final int f148622d;
    @AbstractC27891c(mo46611a = "boolean")

    /* renamed from: e */
    public final boolean f148623e;

    static {
        Covode.recordClassIndex(77518);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66012i)) {
            return false;
        }
        C66012i iVar = (C66012i) obj;
        return this.f148619a == iVar.f148619a && C89219l.m154714a(this.f148620b, iVar.f148620b) && C89219l.m154714a(this.f148621c, iVar.f148621c) && this.f148622d == iVar.f148622d && this.f148623e == iVar.f148623e;
    }

    public final int hashCode() {
        int i = this.f148619a * 31;
        String str = this.f148620b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<C66504c> list = this.f148621c;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (((hashCode + i2) * 31) + this.f148622d) * 31;
        boolean z = this.f148623e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TiktokV1ForumProfileQuestionsResponse(statusCode=" + this.f148619a + ", msg=" + this.f148620b + ", questions=" + this.f148621c + ", cursor=" + this.f148622d + ", hasMore=" + this.f148623e + ")";
    }
}
