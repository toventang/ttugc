package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.api.g */
public final class C66010g {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f148606a;
    @AbstractC27891c(mo46611a = "msg")

    /* renamed from: b */
    public final String f148607b;
    @AbstractC27891c(mo46611a = "answers")

    /* renamed from: c */
    public final List<C66004a> f148608c;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: d */
    public final int f148609d;
    @AbstractC27891c(mo46611a = "boolean")

    /* renamed from: e */
    public final boolean f148610e;

    static {
        Covode.recordClassIndex(77516);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66010g)) {
            return false;
        }
        C66010g gVar = (C66010g) obj;
        return this.f148606a == gVar.f148606a && C89219l.m154714a(this.f148607b, gVar.f148607b) && C89219l.m154714a(this.f148608c, gVar.f148608c) && this.f148609d == gVar.f148609d && this.f148610e == gVar.f148610e;
    }

    public final int hashCode() {
        int i = this.f148606a * 31;
        String str = this.f148607b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<C66004a> list = this.f148608c;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (((hashCode + i2) * 31) + this.f148609d) * 31;
        boolean z = this.f148610e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TiktokV1ForumProfileAnswersResponse(statusCode=" + this.f148606a + ", msg=" + this.f148607b + ", answers=" + this.f148608c + ", cursor=" + this.f148609d + ", hasMore=" + this.f148610e + ")";
    }
}
