package com.p2082ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.security.b */
public final class C32938b {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public final String f78374a;
    @AbstractC27891c(mo46611a = "scheme")

    /* renamed from: b */
    public final String f78375b;

    static {
        Covode.recordClassIndex(39730);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32938b)) {
            return false;
        }
        C32938b bVar = (C32938b) obj;
        return C89219l.m154714a(this.f78374a, bVar.f78374a) && C89219l.m154714a(this.f78375b, bVar.f78375b);
    }

    public final int hashCode() {
        String str = this.f78374a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78375b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SafeInfoNoticeMsgHighlight(content=" + this.f78374a + ", scheme=" + this.f78375b + ")";
    }

    private /* synthetic */ C32938b() {
        this("", "");
    }

    private C32938b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f78374a = str;
        this.f78375b = str2;
    }
}
