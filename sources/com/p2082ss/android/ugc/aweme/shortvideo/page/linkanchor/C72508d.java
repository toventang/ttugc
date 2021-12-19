package com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.d */
public final class C72508d {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f162519a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f162520b;

    static {
        Covode.recordClassIndex(85186);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72508d)) {
            return false;
        }
        C72508d dVar = (C72508d) obj;
        return this.f162519a == dVar.f162519a && C89219l.m154714a(this.f162520b, dVar.f162520b);
    }

    public final int hashCode() {
        int i = this.f162519a * 31;
        String str = this.f162520b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LinkValidateResult(statusCode=" + this.f162519a + ", statusMessage=" + this.f162520b + ")";
    }
}
