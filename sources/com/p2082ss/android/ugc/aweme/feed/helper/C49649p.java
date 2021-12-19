package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.p */
public final class C49649p {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public int f114279a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public String f114280b;

    static {
        Covode.recordClassIndex(58496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49649p)) {
            return false;
        }
        C49649p pVar = (C49649p) obj;
        return this.f114279a == pVar.f114279a && C89219l.m154714a(this.f114280b, pVar.f114280b);
    }

    public final int hashCode() {
        int i = this.f114279a * 31;
        String str = this.f114280b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Option(id=" + this.f114279a + ", name=" + this.f114280b + ")";
    }

    private /* synthetic */ C49649p() {
        this("");
    }

    private C49649p(String str) {
        C89219l.m154721d(str, "");
        this.f114279a = 0;
        this.f114280b = str;
    }
}
