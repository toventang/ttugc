package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.c */
public final class C33385c {
    @AbstractC27891c(mo46611a = "pattern")

    /* renamed from: a */
    public String f79332a;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: b */
    public int f79333b;

    static {
        Covode.recordClassIndex(40233);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33385c)) {
            return false;
        }
        C33385c cVar = (C33385c) obj;
        return C89219l.m154714a(this.f79332a, cVar.f79332a) && this.f79333b == cVar.f79333b;
    }

    public final int hashCode() {
        String str = this.f79332a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f79333b;
    }

    public final String toString() {
        return "IntentSchemeInterceptConfig(pattern=" + this.f79332a + ", type=" + this.f79333b + ")";
    }

    private /* synthetic */ C33385c() {
        this("");
    }

    private C33385c(String str) {
        C89219l.m154721d(str, "");
        this.f79332a = str;
        this.f79333b = -1;
    }
}
